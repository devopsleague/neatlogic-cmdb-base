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

package neatlogic.framework.cmdb.exception.ci;

import neatlogic.framework.cmdb.dto.ci.CiVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

public class CiUniqueRuleException extends ApiRuntimeException {
    public CiUniqueRuleException(CiVo ciVo) {
        super("模型“{0}({1})”存在拥有相同唯一规则属性的配置项", ciVo.getLabel(), ciVo.getName());
    }

    public CiUniqueRuleException(CiVo ciVo, String value) {
        super("模型“{0}({1})”存在拥有相同唯一规则属性的配置项“{2}”", ciVo.getLabel(), ciVo.getName(), value);
    }
}
