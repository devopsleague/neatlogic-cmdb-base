/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.dto.resourcecenter.entity;

import codedriver.framework.cmdb.annotation.ResourceField;
import codedriver.framework.cmdb.annotation.ResourceType;
import codedriver.framework.common.constvalue.ApiParamType;
import codedriver.framework.restful.annotation.EntityField;

@ResourceType(name = "resource_dbinstance_appmodule", label = "DB实例模块关系")
public class DbInstanceModuleVo extends ResourceEntityBaseVo {
    @EntityField(name = "DB实例id", type = ApiParamType.LONG)
    @ResourceField(name = "db_instance_id")
    private Long dbInstanceId;
    @EntityField(name = "模块id", type = ApiParamType.LONG)
    @ResourceField(name = "app_module_id")
    private Long appModuleId;
    @EntityField(name = "模块名", type = ApiParamType.STRING)
    @ResourceField(name = "app_module_name")
    private String appModuleName;

    public Long getDbInstanceId() {
        return dbInstanceId;
    }

    public void setDbInstanceId(Long dbInstanceId) {
        this.dbInstanceId = dbInstanceId;
    }

    public Long getAppModuleId() {
        return appModuleId;
    }

    public void setAppModuleId(Long appModuleId) {
        this.appModuleId = appModuleId;
    }

    public String getAppModuleName() {
        return appModuleName;
    }

    public void setAppModuleName(String appModuleName) {
        this.appModuleName = appModuleName;
    }
}