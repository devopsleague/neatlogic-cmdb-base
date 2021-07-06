/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.exception.ci;

import codedriver.framework.exception.core.ApiRuntimeException;

public class CiUniqueRuleException extends ApiRuntimeException {
    public CiUniqueRuleException() {
        super("存在拥有相同唯一规则属性的配置项");
    }
}