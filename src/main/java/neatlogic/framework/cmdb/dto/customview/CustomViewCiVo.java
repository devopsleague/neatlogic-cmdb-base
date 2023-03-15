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

package neatlogic.framework.cmdb.dto.customview;

import neatlogic.framework.cmdb.dto.ci.CiVo;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class CustomViewCiVo implements Serializable {
    @EntityField(name = "uuid", type = ApiParamType.STRING)
    private String uuid;
    @EntityField(name = "视图id", type = ApiParamType.LONG)
    private Long customViewId;
    @EntityField(name = "模型id", type = ApiParamType.LONG)
    private Long ciId;
    @EntityField(name = "排序", type = ApiParamType.INTEGER)
    private Integer sort;
    @EntityField(name = "是否隐藏", type = ApiParamType.INTEGER)
    private Integer isHidden = 0;
    @EntityField(name = "是否起始模型", type = ApiParamType.INTEGER)
    private Integer isStart = 0;
    @EntityField(name = "属性列表", type = ApiParamType.JSONARRAY)
    private List<CustomViewAttrVo> attrList;
    @EntityField(name = "关系属性列表", type = ApiParamType.JSONARRAY)
    private List<CustomViewRelVo> relList;
    @EntityField(name = "内部属性列表", type = ApiParamType.JSONARRAY)
    private List<CustomViewConstAttrVo> constAttrList;
    @JSONField(serialize = false)
    private CiVo ciVo;
    @EntityField(name = "配置项列表", type = ApiParamType.JSONARRAY)
    private List<JSONObject> ciEntityList;
    @EntityField(name = "别名", type = ApiParamType.STRING)
    private String alias;
    @EntityField(name = "唯一标识", type = ApiParamType.STRING)
    private String name;

    public CustomViewCiVo() {

    }

    public CustomViewCiVo(JSONObject jsonObj) {
        JSONObject conf = jsonObj.getJSONObject("config");
        if (MapUtils.isNotEmpty(conf)) {
            this.ciId = conf.getLong("ciId");
            this.sort = conf.getInteger("index");
            this.isHidden = conf.getIntValue("isHidden");
            this.alias = conf.getString("alias");
            this.name = conf.getString("name");
            this.isStart = conf.getIntValue("isStart");
        }
        this.uuid = jsonObj.getString("uuid");
    }

    public List<JSONObject> getCiEntityList() {
        return ciEntityList;
    }

    public Integer getIsStart() {
        return isStart;
    }

    public void setIsStart(Integer isStart) {
        this.isStart = isStart;
    }

    public void addCiEntity(Long ciEntityId, String ciEntityName) {
        if (ciEntityId != null) {
            if (this.ciEntityList == null) {
                this.ciEntityList = new ArrayList<>();
            }
            if (this.ciEntityList.stream().noneMatch(cientity -> cientity.getLong("id").equals(ciEntityId))) {
                this.ciEntityList.add(new JSONObject() {{
                    this.put("id", ciEntityId);
                    this.put("name", ciEntityName);
                }});
            }
        }
    }

    public CustomViewRelVo getRelByUuid(String uuid) {
        if (CollectionUtils.isNotEmpty(relList)) {
            Optional<CustomViewRelVo> op = relList.stream().filter(rel -> rel.getUuid().equalsIgnoreCase(uuid)).findFirst();
            if (op.isPresent()) {
                return op.get();
            }
        }
        return null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public Long getCustomViewId() {
        return customViewId;
    }

    public void setCustomViewId(Long customViewId) {
        this.customViewId = customViewId;
    }

    public Long getCiId() {
        return ciId;
    }

    public void setCiId(Long ciId) {
        this.ciId = ciId;
    }

    public Integer getIsHidden() {
        return isHidden;
    }

    public void setIsHidden(Integer isHidden) {
        this.isHidden = isHidden;
    }

    public List<CustomViewAttrVo> getAttrList() {
        if (CollectionUtils.isNotEmpty(attrList)) {
            attrList.sort(Comparator.comparing(CustomViewAttrVo::getSort));
        }
        return attrList;
    }

    public void setAttrList(List<CustomViewAttrVo> attrList) {
        this.attrList = attrList;
    }

    public List<CustomViewConstAttrVo> getConstAttrList() {
        return constAttrList;
    }

    public void setConstAttrList(List<CustomViewConstAttrVo> constAttrList) {
        this.constAttrList = constAttrList;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public CiVo getCiVo() {
        return ciVo;
    }

    public void setCiVo(CiVo ciVo) {
        this.ciVo = ciVo;
    }

    public List<CustomViewRelVo> getRelList() {
        return relList;
    }

    public void setRelList(List<CustomViewRelVo> relList) {
        this.relList = relList;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }
}