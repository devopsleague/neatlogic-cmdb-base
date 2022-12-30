/*
 * Copyright (c)  2022 TechSure Co.,Ltd.  All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.resourcecenter.condition;

import codedriver.framework.common.constvalue.Expression;
import codedriver.framework.dto.condition.ConditionVo;
import com.alibaba.fastjson.JSON;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

public abstract class ResourcecenterConditionBase implements IResourcecenterCondition{

    protected void getSimpleSqlConditionWhere(ConditionVo condition, StringBuilder sqlSb, String tableShortName, String columnName) {
        Object value = StringUtils.EMPTY;
        if (condition.getValueList() instanceof String) {
            value = condition.getValueList();
        } else if (condition.getValueList() instanceof List) {
            List<String> values = JSON.parseArray(JSON.toJSONString(condition.getValueList()), String.class);
            value = String.join("','", values);
        }
        sqlSb.append(Expression.getExpressionSql(condition.getExpression(), tableShortName, columnName, value.toString()));
    }
}