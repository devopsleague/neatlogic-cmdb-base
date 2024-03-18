/*Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published by
the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <http://www.gnu.org/licenses/>.*/

package neatlogic.framework.cmdb.dto.resourcecenter.sceneviewfielddeclare;

import neatlogic.framework.cmdb.annotation.ResourceField;
import neatlogic.framework.cmdb.annotation.ResourceType;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

@ResourceType(name = "scence_ipobject_env_appmodule", label = "IP软硬件环境和模块场景")
public class IpObjectEnvAppModuleVo {
    @EntityField(name = "ID", type = ApiParamType.LONG)
    @ResourceField(name = "id")
    private Long id;

    @EntityField(name = "名称", type = ApiParamType.STRING)
    @ResourceField(name = "name")
    private String name;

    @EntityField(name = "类型ID", type = ApiParamType.LONG)
    @ResourceField(name = "type_id")
    private Long typeId;
    @EntityField(name = "类型名称", type = ApiParamType.STRING)
    @ResourceField(name = "type_name")
    private String typeName;
    @EntityField(name = "类型Label", type = ApiParamType.STRING)
    @ResourceField(name = "type_label")
    private String typeLabel;

    @EntityField(name = "巡检状态", type = ApiParamType.STRING)
    @ResourceField(name = "inspect_status")
    private String inspectStatus;

    @EntityField(name = "环境ID", type = ApiParamType.LONG)
    @ResourceField(name = "env_id")
    private Long envId;
    @EntityField(name = "环境名称", type = ApiParamType.STRING)
    @ResourceField(name = "env_name")
    private String envName;
    @EntityField(name = "环境序号", type = ApiParamType.INTEGER)
    @ResourceField(name = "env_seq_no")
    private Integer envSeqNo;

    @EntityField(name = "应用模块ID", type = ApiParamType.LONG)
    @ResourceField(name = "app_module_id")
    private Long appModuleId;
    @EntityField(name = "应用模块名", type = ApiParamType.STRING)
    @ResourceField(name = "app_module_name")
    private String appModuleName;
    @EntityField(name = "应用模块简称", type = ApiParamType.STRING)
    @ResourceField(name = "app_module_abbr_name")
    private String appModuleAbbrName;
}
