/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.dto.ci;

import codedriver.framework.asynchronization.threadlocal.TenantContext;
import codedriver.framework.cmdb.enums.InputType;
import codedriver.framework.cmdb.enums.RelRuleType;
import codedriver.framework.cmdb.enums.SearchExpression;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.common.dto.ValueTextVo;
import codedriver.framework.restful.annotation.EntityField;
import codedriver.framework.util.SnowflakeUtil;
import com.alibaba.fastjson.annotation.JSONField;
import com.alibaba.nacos.client.naming.utils.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class RelVo implements Serializable {
    private static final long serialVersionUID = 4262674515934863987L;
    @EntityField(name = "id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "关系类型", type = ApiParamType.LONG)
    private Long typeId;
    @EntityField(name = "关系类型名称", type = ApiParamType.STRING)
    private String typeText;
    @EntityField(name = "当前模型位置，from|to", type = ApiParamType.STRING)
    private String direction;
    @EntityField(name = "数据录入方式", type = ApiParamType.STRING)
    private String inputType = InputType.MT.getValue();
    @EntityField(name = "来源端模型id", type = ApiParamType.LONG)
    private Long fromCiId;
    @EntityField(name = "来源端模型图标", type = ApiParamType.STRING)
    private String fromCiIcon;
    @EntityField(name = "来源端模型唯一标识", type = ApiParamType.STRING)
    private String fromCiName;
    @EntityField(name = "来源端模型名称", type = ApiParamType.STRING)
    private String fromCiLabel;
    @EntityField(name = "来源端名称", type = ApiParamType.STRING)
    private String fromName;
    @EntityField(name = "来源端标签", type = ApiParamType.STRING)
    private String fromLabel;
    @EntityField(name = "来源端类型id", type = ApiParamType.LONG)
    private Long fromTypeId;
    @EntityField(name = "来源端规则", type = ApiParamType.STRING)
    private String fromRule;
    @EntityField(name = "来源端规则名称", type = ApiParamType.STRING)
    private String fromRuleText;
    @EntityField(name = "来源端分组id", type = ApiParamType.LONG)
    private String fromGroupId;
    @EntityField(name = "来源端分组名称", type = ApiParamType.STRING)
    private String fromGroupName;
    @EntityField(name = "来源端是否唯一", type = ApiParamType.INTEGER)
    private Integer fromIsUnique;
    @EntityField(name = "来源端是否必填", type = ApiParamType.INTEGER)
    private Integer fromIsRequired;
    @EntityField(name = "来源端是否允许添加新配置项", type = ApiParamType.BOOLEAN)
    private Boolean fromAllowInsert;
    @EntityField(name = "来源端是否虚拟模型", type = ApiParamType.INTEGER)
    private Integer fromIsVirtual;
    @EntityField(name = "目标端模型id", type = ApiParamType.LONG)
    private Long toCiId;
    @EntityField(name = "目标端模型图标", type = ApiParamType.STRING)
    private String toCiIcon;
    @EntityField(name = "来源端模型唯一标识", type = ApiParamType.STRING)
    private String toCiName;
    @EntityField(name = "来源端模型名称", type = ApiParamType.STRING)
    private String toCiLabel;
    @EntityField(name = "目标端名称", type = ApiParamType.STRING)
    private String toName;
    @EntityField(name = "目标端标签", type = ApiParamType.STRING)
    private String toLabel;
    @EntityField(name = "目标端类型id", type = ApiParamType.LONG)
    private Long toTypeId;
    @EntityField(name = "目标端规则", type = ApiParamType.STRING)
    private String toRule;
    @EntityField(name = "目标端规则名称", type = ApiParamType.STRING)
    private String toRuleText;
    @EntityField(name = "目标端分组id", type = ApiParamType.LONG)
    private String toGroupId;
    @EntityField(name = "目标端分组名称", type = ApiParamType.STRING)
    private String toGroupName;
    @EntityField(name = "目标端是否唯一", type = ApiParamType.INTEGER)
    private Integer toIsUnique;
    @EntityField(name = "目标端是否必填", type = ApiParamType.INTEGER)
    private Integer toIsRequired;
    @EntityField(name = "目标端是否允许添加新配置项", type = ApiParamType.BOOLEAN)
    private Boolean toAllowInsert;
    @EntityField(name = "是否继承属性", type = ApiParamType.INTEGER)
    private Integer isExtended;
    @EntityField(name = "目标端是否虚拟模型", type = ApiParamType.INTEGER)
    private Integer toIsVirtual;
    @EntityField(name = "支持的搜索表达式列表", type = ApiParamType.JSONARRAY)
    private List<ValueTextVo> expressionList;
    @EntityField(name = "级联关系", type = ApiParamType.JSONARRAY)
    private List<RelativeRelVo> relativeRelList;
    @EntityField(name = "是否允许编辑", type = ApiParamType.INTEGER)
    private Integer allowEdit;
    @EntityField(name = "是否在拓扑图中显示", type = ApiParamType.INTEGER)
    private Integer isShowInTopo;

    public RelVo() {

    }

    public RelVo(Long id, String direction) {
        this.id = id;
        this.direction = direction;
    }

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

    public Integer getAllowEdit() {
        return allowEdit;
    }

    public void setAllowEdit(Integer allowEdit) {
        this.allowEdit = allowEdit;
    }

    public List<RelativeRelVo> getRelativeRelList() {
        return relativeRelList;
    }

    public void setRelativeRelList(List<RelativeRelVo> relativeRelList) {
        this.relativeRelList = relativeRelList;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInputType() {
        return inputType;
    }

    public void setInputType(String inputType) {
        this.inputType = inputType;
    }

    public Long getFromCiId() {
        return fromCiId;
    }

    public void setFromCiId(Long fromCiId) {
        this.fromCiId = fromCiId;
    }

    public String getFromName() {
        return fromName;
    }

    public void setFromName(String fromName) {
        this.fromName = fromName;
    }

    public List<ValueTextVo> getExpressionList() {
        if (CollectionUtils.isEmpty(this.expressionList)) {
            expressionList = new ArrayList<>();
            for (SearchExpression expression : SearchExpression.values()) {
                if (expression != SearchExpression.EQ && expression != SearchExpression.NE) {//排除掉等于和不等于两种表达式
                    expressionList.add(new ValueTextVo(expression.getExpression(), expression.getText()));
                }
            }
        }
        return expressionList;
    }

    public String getFromLabel() {
        return fromLabel;
    }

    public void setFromLabel(String fromLabel) {
        this.fromLabel = fromLabel;
    }

    public Long getFromTypeId() {
        return fromTypeId;
    }

    public void setFromTypeId(Long fromTypeId) {
        this.fromTypeId = fromTypeId;
    }

    public String getFromRule() {
        return fromRule;
    }

    public void setFromRule(String fromRule) {
        this.fromRule = fromRule;
    }

    public String getFromGroupId() {
        return fromGroupId;
    }

    public void setFromGroupId(String fromGroupId) {
        this.fromGroupId = fromGroupId;
    }

    public Long getToCiId() {
        return toCiId;
    }

    public void setToCiId(Long toCiId) {
        this.toCiId = toCiId;
    }

    public String getToName() {
        return toName;
    }

    public void setToName(String toName) {
        this.toName = toName;
    }

    public String getToLabel() {
        return toLabel;
    }

    public void setToLabel(String toLabel) {
        this.toLabel = toLabel;
    }

    public Long getToTypeId() {
        return toTypeId;
    }

    public void setToTypeId(Long toTypeId) {
        this.toTypeId = toTypeId;
    }

    public String getToRule() {
        return toRule;
    }

    public void setToRule(String toRule) {
        this.toRule = toRule;
    }

    public String getToGroupId() {
        return toGroupId;
    }

    public void setToGroupId(String toGroupId) {
        this.toGroupId = toGroupId;
    }

    public String getFromCiIcon() {
        return fromCiIcon;
    }

    public void setFromCiIcon(String fromCiIcon) {
        this.fromCiIcon = fromCiIcon;
    }

    public String getToCiIcon() {
        return toCiIcon;
    }

    public void setToCiIcon(String toCiIcon) {
        this.toCiIcon = toCiIcon;
    }

    public String getFromCiName() {
        return fromCiName;
    }

    public void setFromCiName(String fromCiName) {
        this.fromCiName = fromCiName;
    }

    public String getFromCiLabel() {
        return fromCiLabel;
    }

    public void setFromCiLabel(String fromCiLabel) {
        this.fromCiLabel = fromCiLabel;
    }

    public String getToCiName() {
        return toCiName;
    }

    public void setToCiName(String toCiName) {
        this.toCiName = toCiName;
    }

    public String getToCiLabel() {
        return toCiLabel;
    }

    public void setToCiLabel(String toCiLabel) {
        this.toCiLabel = toCiLabel;
    }

    public String getFromGroupName() {
        return fromGroupName;
    }

    public void setFromGroupName(String fromGroupName) {
        this.fromGroupName = fromGroupName;
    }

    public String getToGroupName() {
        return toGroupName;
    }

    public void setToGroupName(String toGroupName) {
        this.toGroupName = toGroupName;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getFromRuleText() {
        if (StringUtils.isNotBlank(fromRule) && StringUtils.isBlank(fromRuleText)) {
            fromRuleText = RelRuleType.getText(fromRule);
        }
        return fromRuleText;
    }

    public String getToRuleText() {
        if (StringUtils.isNotBlank(toRule) && StringUtils.isBlank(toRuleText)) {
            toRuleText = RelRuleType.getText(toRule);
        }
        return toRuleText;
    }

    public Integer getFromIsUnique() {
        return fromIsUnique;
    }

    public void setFromIsUnique(Integer fromIsUnique) {
        this.fromIsUnique = fromIsUnique;
    }

    public Integer getToIsUnique() {
        return toIsUnique;
    }

    public void setToIsUnique(Integer toIsUnique) {
        this.toIsUnique = toIsUnique;
    }

    public Long getTypeId() {
        return typeId;
    }

    public void setTypeId(Long typeId) {
        this.typeId = typeId;
    }

    public String getTypeText() {
        return typeText;
    }

    public void setTypeText(String typeText) {
        this.typeText = typeText;
    }

    public Boolean getFromAllowInsert() {
        return fromAllowInsert;
    }

    public void setFromAllowInsert(Boolean fromAllowInsert) {
        this.fromAllowInsert = fromAllowInsert;
    }

    public Boolean getToAllowInsert() {
        return toAllowInsert;
    }

    public void setToAllowInsert(Boolean toAllowInsert) {
        this.toAllowInsert = toAllowInsert;
    }

    public Integer getIsExtended() {
        return isExtended;
    }

    public void setIsExtended(Integer isExtended) {
        this.isExtended = isExtended;
    }

    public Integer getFromIsRequired() {
        return fromIsRequired;
    }

    public void setFromIsRequired(Integer fromIsRequired) {
        this.fromIsRequired = fromIsRequired;
    }

    public Integer getToIsRequired() {
        return toIsRequired;
    }

    public void setToIsRequired(Integer toIsRequired) {
        this.toIsRequired = toIsRequired;
    }

    public Integer getFromIsVirtual() {
        return fromIsVirtual;
    }

    public void setFromIsVirtual(Integer fromIsVirtual) {
        this.fromIsVirtual = fromIsVirtual;
    }

    public Integer getToIsVirtual() {
        return toIsVirtual;
    }

    public void setToIsVirtual(Integer toIsVirtual) {
        this.toIsVirtual = toIsVirtual;
    }

    @JSONField(serialize = false)
    public String getToCiTableName() {
        return TenantContext.get().getDataDbName() + ".`cmdb_" + this.getToCiId() + "`";
    }

    @JSONField(serialize = false)
    public String getFromCiTableName() {
        return TenantContext.get().getDataDbName() + ".`cmdb_" + this.getFromCiId() + "`";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RelVo relVo = (RelVo) o;
        return id.equals(relVo.id) && direction.equals(relVo.direction);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, direction);
    }
}
