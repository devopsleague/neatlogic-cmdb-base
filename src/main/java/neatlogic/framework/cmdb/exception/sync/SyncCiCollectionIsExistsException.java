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

import neatlogic.framework.cmdb.dto.sync.SyncCiCollectionVo;
import neatlogic.framework.exception.core.ApiRuntimeException;
import org.apache.commons.lang3.StringUtils;

public class SyncCiCollectionIsExistsException extends ApiRuntimeException {
    public SyncCiCollectionIsExistsException(SyncCiCollectionVo syncCiCollectionVo) {
        super("集合“" + syncCiCollectionVo.getCollectionName() + "”->模型“" + syncCiCollectionVo.getCiLabel() + "”"
                + (StringUtils.isNotBlank(syncCiCollectionVo.getParentKey()) ? "在父属性“" + syncCiCollectionVo.getParentKey() + "”" : "") +
                "的映射配置已存在");
    }
}
