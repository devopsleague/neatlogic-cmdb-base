/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.exception.customview;

import codedriver.framework.cmdb.dto.customview.CustomViewVo;
import codedriver.framework.exception.core.ApiRuntimeException;

public class CustomViewIsPrivateException extends ApiRuntimeException {
    public CustomViewIsPrivateException(CustomViewVo customViewVo) {
        super("自定义视图：" + customViewVo.getName() + " 是私有视图");
    }

}
