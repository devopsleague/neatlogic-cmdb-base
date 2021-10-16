/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.exception.sync;

import codedriver.framework.exception.core.ApiRuntimeException;

public class InitiativeSyncCiCollectionIsExistsException extends ApiRuntimeException {
    public InitiativeSyncCiCollectionIsExistsException(String name) {
        super("集合“" + name + "”已配置了主动采集配置项模型，不能重复配置");
    }
}
