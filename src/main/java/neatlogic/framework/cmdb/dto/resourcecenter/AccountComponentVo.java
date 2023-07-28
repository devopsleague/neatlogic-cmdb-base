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

package neatlogic.framework.cmdb.dto.resourcecenter;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.common.dto.BaseEditorVo;
import neatlogic.framework.restful.annotation.EntityField;

public class AccountComponentVo extends BaseEditorVo {
    @EntityField(name = "资产id", type = ApiParamType.LONG)
    private Long id;
    @EntityField(name = "资产名", type = ApiParamType.STRING)
    private String name;
    @EntityField(name = "资产IP", type = ApiParamType.STRING)
    private String ip;
    @EntityField(name = "用户名", type = ApiParamType.STRING)
    private String account;
    @EntityField(name = "账号id", type = ApiParamType.LONG)
    private Long accountId;
    @EntityField(name = "账号名称", type = ApiParamType.STRING)
    private String accountName;
    @EntityField(name = "协议Id", type = ApiParamType.LONG)
    private Long protocolId;
    @EntityField(name = "协议协议", type = ApiParamType.STRING)
    private String protocol;
    @EntityField(name = "=端口", type = ApiParamType.INTEGER)
    private String port;

    public Long getId() {
        return id;
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

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public Long getProtocolId() {
        return protocolId;
    }

    public void setProtocolId(Long protocolId) {
        this.protocolId = protocolId;
    }

    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }
}
