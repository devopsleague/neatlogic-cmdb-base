/*
Copyright(c) $today.year NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package neatlogic.framework.cmdb.dto.resourcecenter.entity;

import neatlogic.framework.cmdb.annotation.ResourceField;
import neatlogic.framework.cmdb.annotation.ResourceType;
import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

/**
 * @author linbq
 * @since 2021/5/27 14:29
 **/
//@ResourceType(name = "resource_ipobject_env", label = "IP软硬件环境")
@ResourceType(name = "resource_softwareservice_env", label = "软件服务环境")
public class AppEnvironmentVo {
    @EntityField(name = "环境id", type = ApiParamType.LONG)
    @ResourceField(name = "env_id")
    private Long envId;
    @EntityField(name = "环境名称", type = ApiParamType.STRING)
    @ResourceField(name = "env_name")
    private String envName;
    @EntityField(name = "序号", type = ApiParamType.INTEGER)
    @ResourceField(name = "env_seq_no")
    private Integer envSeqNo;
    @EntityField(name = "资源id", type = ApiParamType.LONG)
    @ResourceField(name = "resource_id")
    private Long resourceId;

    public Long getEnvId() {
        return envId;
    }

    public void setEnvId(Long envId) {
        this.envId = envId;
    }

    public String getEnvName() {
        return envName;
    }

    public void setEnvName(String envName) {
        this.envName = envName;
    }

    public Integer getEnvSeqNo() {
        return envSeqNo;
    }

    public void setEnvSeqNo(Integer envSeqNo) {
        this.envSeqNo = envSeqNo;
    }

    public Long getResourceId() {
        return resourceId;
    }

    public void setResourceId(Long resourceId) {
        this.resourceId = resourceId;
    }
}
