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

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;
import neatlogic.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.List;

public class CiTypeVo implements Serializable {
    @JSONField(serialize = false)
    private String keyword;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "名称", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "排序", type = ApiParamType.INTEGER)
    private Integer sort;
    @EntityField(name = "是否在菜单中显示", type = ApiParamType.INTEGER)
    private Integer isMenu = 0;
    @EntityField(name = "图标", type = ApiParamType.STRING)
    private String icon;
    @EntityField(name = "模型列表", type = ApiParamType.JSONARRAY)
    private List<CiVo> ciList;
    @EntityField(name = "模型数量", type = ApiParamType.INTEGER)
    private int ciCount;
    @EntityField(name = "是否在拓扑图中显示", type = ApiParamType.INTEGER)
    private Integer isShowInTopo;

    public Long getId() {
        if (id == null) {
            id = SnowflakeUtil.uniqueLong();
        }
        return id;
    }

    public Integer getIsShowInTopo() {
        return isShowInTopo;
    }

    public void setIsShowInTopo(Integer isShowInTopo) {
        this.isShowInTopo = isShowInTopo;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getIsMenu() {
        return isMenu;
    }

    public void setIsMenu(Integer isMenu) {
        this.isMenu = isMenu;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public List<CiVo> getCiList() {
        return ciList;
    }

    public void setCiList(List<CiVo> ciList) {
        this.ciList = ciList;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }

    public int getCiCount() {
        return ciCount;
    }

    public void setCiCount(int ciCount) {
        this.ciCount = ciCount;
    }

}
