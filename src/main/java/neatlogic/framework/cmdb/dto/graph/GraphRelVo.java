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

package neatlogic.framework.cmdb.dto.graph;

import neatlogic.framework.common.constvalue.ApiParamType;
import neatlogic.framework.restful.annotation.EntityField;

public class GraphRelVo {
    @EntityField(name = "上游视图id", type = ApiParamType.LONG)
    private Long fromGraphId;
    @EntityField(name = "下游视图id", type = ApiParamType.STRING)
    private Long toGraphId;

    public Long getFromGraphId() {
        return fromGraphId;
    }

    public void setFromGraphId(Long fromGraphId) {
        this.fromGraphId = fromGraphId;
    }

    public Long getToGraphId() {
        return toGraphId;
    }

    public void setToGraphId(Long toGraphId) {
        this.toGraphId = toGraphId;
    }
}
