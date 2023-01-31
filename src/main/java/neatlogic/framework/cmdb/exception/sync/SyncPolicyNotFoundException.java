/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package neatlogic.framework.cmdb.exception.sync;

import neatlogic.framework.exception.core.ApiRuntimeException;

public class SyncPolicyNotFoundException extends ApiRuntimeException {
    public SyncPolicyNotFoundException(Long id) {
        super("同步策略：'" + id + "'不存在");
    }
}
