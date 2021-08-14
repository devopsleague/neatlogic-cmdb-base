/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.exception.sync;

import codedriver.framework.exception.core.ApiRuntimeException;

public class CiEntityDuplicateException extends ApiRuntimeException {
    public CiEntityDuplicateException() {
        super("找到多个配置项，无法更新或添加");
    }

}