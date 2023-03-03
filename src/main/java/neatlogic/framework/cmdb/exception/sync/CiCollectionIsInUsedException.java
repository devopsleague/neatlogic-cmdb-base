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

package neatlogic.framework.cmdb.exception.sync;

import neatlogic.framework.cmdb.dto.sync.SyncPolicyVo;
import neatlogic.framework.exception.core.ApiRuntimeException;

import java.util.List;
import java.util.stream.Collectors;

public class CiCollectionIsInUsedException extends ApiRuntimeException {
    public CiCollectionIsInUsedException(List<SyncPolicyVo> policyList) {
        super("当前采集映射已被策略“" + policyList.stream().map(SyncPolicyVo::getName).collect(Collectors.joining("”,“")) + "”使用，请先删除");
    }
}
