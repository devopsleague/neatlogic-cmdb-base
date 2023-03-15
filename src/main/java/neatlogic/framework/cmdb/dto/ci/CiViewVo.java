/*
 * Copyright(c) 2023 NeatLogic Co., Ltd. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package neatlogic.framework.cmdb.dto.ci;

import neatlogic.framework.cmdb.enums.ShowType;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class CiViewVo implements Serializable {
    @EntityField(name = "模型Id", type = ApiParamType.LONG)
    private Long ciId;
    @EntityField(name = "属性或关系id", type = ApiParamType.LONG)
    private Long itemId;
    @EntityField(name = "属性或关系唯一标识", type = ApiParamType.STRING)
    private String itemName;
    @EntityField(name = "属性或关系名称", type = ApiParamType.STRING)
    private String itemLabel;
    @EntityField(name = "类型，attr或rel", type = ApiParamType.STRING)
    private String type;
    @EntityField(name = "类型名称", type = ApiParamType.STRING)
    private String typeText;
    @EntityField(name = "排序", type = ApiParamType.INTEGER)
    private Integer sort;
    @EntityField(name = "显示方式，none:不显示，all:全部显示，list:仅列表显示，detail:仅明细显示", type = ApiParamType.STRING)
    private String showType = ShowType.ALL.getValue();
    @EntityField(name = "是否允许编辑，0不允许，1允许", type = ApiParamType.INTEGER)
    private Integer allowEdit = 1;
    @EntityField(name = "显示方式名称", type = ApiParamType.STRING)
    private String showTypeText;
    @JSONField(serialize = false)
    private List<String> showTypeList;
    @JSONField(serialize = false)
    private Integer isExtended;//是否继承
    @JSONField(serialize = false)
    private String uniqueKey;//用于去掉继承的关系，具体参考RelUtil

    public CiViewVo() {

    }

    public CiViewVo(Long ciId, String type) {
        this.ciId = ciId;
        this.type = type;
    }

    public Integer getAllowEdit() {
        return allowEdit;
    }

    public void setAllowEdit(Integer allowEdit) {
        this.allowEdit = allowEdit;
    }

    public String getUniqueKey() {
        return uniqueKey;
    }

    public void setUniqueKey(String uniqueKey) {
        this.uniqueKey = uniqueKey;
    }

    public Integer getIsExtended() {
        return isExtended;
    }

    public void setIsExtended(Integer isExtended) {
        this.isExtended = isExtended;
    }

    public void addShowType(String showType) {
        if (showTypeList == null) {
            showTypeList = new ArrayList<>();
        }
        if (!showTypeList.contains(showType)) {
            showTypeList.add(showType);
        }
    }

    public Long getCiId() {
        return ciId;
    }

    public void setCiId(Long ciId) {
        this.ciId = ciId;
    }

    public Long getItemId() {
        return itemId;
    }

    public void setItemId(Long itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getTypeText() {
        if (StringUtils.isBlank(typeText) && StringUtils.isNotBlank(type)) {
            if (type.equals("attr")) {
                typeText = "属性";
            } else if (type.equals("const")) {
                typeText = "内部属性";
            } else {
                typeText = "关系";
            }
        }
        return typeText;
    }

    public void setTypeText(String typeText) {
        this.typeText = typeText;
    }

    public String getShowTypeText() {
        if (StringUtils.isBlank(showTypeText) && StringUtils.isNotBlank(showType)) {
            showTypeText = ShowType.getText(showType);
        }
        return showTypeText;
    }

    public void setShowTypeText(String showTypeText) {
        this.showTypeText = showTypeText;
    }

    public List<String> getShowTypeList() {
        return showTypeList;
    }

    public void setShowTypeList(List<String> showTypeList) {
        this.showTypeList = showTypeList;
    }

    public String getItemLabel() {
        return itemLabel;
    }

    public void setItemLabel(String itemLabel) {
        this.itemLabel = itemLabel;
    }

}