/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.dto.customview;

import codedriver.framework.cmdb.dto.ci.CiVo;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.annotation.JSONField;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.collections4.MapUtils;

import java.util.List;
import java.util.Optional;

public class CustomViewCiVo {
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
    @EntityField(name = "属性列表", type = ApiParamType.JSONARRAY)
    private List<CustomViewAttrVo> attrList;
    @EntityField(name = "关系属性列表", type = ApiParamType.JSONARRAY)
    private List<CustomViewRelVo> relList;
    @JSONField(serialize = false)
    private transient CiVo ciVo;

    public CustomViewCiVo() {

    }

    public CustomViewCiVo(JSONObject jsonObj) {
        JSONObject conf = jsonObj.getJSONObject("config");
        if (MapUtils.isNotEmpty(conf)) {
            this.ciId = conf.getLong("ciId");
            this.sort = conf.getInteger("index");
            this.isHidden = conf.getIntValue("isHidden");
        }
        this.uuid = jsonObj.getString("uuid");
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
        return attrList;
    }

    public void setAttrList(List<CustomViewAttrVo> attrList) {
        this.attrList = attrList;
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
}
