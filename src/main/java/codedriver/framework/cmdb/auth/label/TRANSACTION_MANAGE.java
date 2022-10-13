/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.auth.label;

import codedriver.framework.auth.core.AuthBase;

public class TRANSACTION_MANAGE extends AuthBase {
    @Override
    public String getAuthDisplayName() {
        return "事务审计权限";
    }

    @Override
    public String getAuthIntroduction() {
        return "查看事务审计权限，可以查看所有配置项的修改记录";
    }

    @Override
    public String getAuthGroup() {
        return "cmdb";
    }

    @Override
    public Integer getSort() {
        return 12;
    }
}
