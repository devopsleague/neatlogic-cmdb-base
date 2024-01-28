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

package neatlogic.framework.cmdb.exception.attr;

import neatlogic.framework.cmdb.dto.ci.AttrVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

public class AttrValueIrregularException extends ApiRuntimeException {

    public AttrValueIrregularException(AttrVo attrVo, String value) {
        super("模型“{0}({1})”属性“{2}({3})”的值“{4}”不是合法的{3}类型", attrVo.getCiLabel(), attrVo.getCiName(), attrVo.getLabel(), attrVo.getName(), value, attrVo.getTypeText());
    }

    public AttrValueIrregularException(AttrVo attrVo, String value, String configurationPath, String actualPath) {
        super("模型“{0}({1})”属性“{2}({3})”的值“{4}”不是合法的{3}类型，配置路径：{5}，实际路径：{6}", attrVo.getCiLabel(), attrVo.getCiName(), attrVo.getLabel(), attrVo.getName(), value, attrVo.getTypeText(), configurationPath, actualPath);
    }

}
