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

package neatlogic.framework.cmdb.exception.resourcecenter;

import neatlogic.framework.cmdb.enums.resourcecenter.JoinType;
import neatlogic.framework.exception.core.ApiRuntimeException;

public class ResourceCenterConfigIrregularException extends ApiRuntimeException {
    private static final long serialVersionUID = 7793373552474922744L;

    public ResourceCenterConfigIrregularException(Exception ex) {
        super("exception.cmdb.resourcecenterconfigirregularexception.1", ex.getMessage());
    }

    public ResourceCenterConfigIrregularException(String resourceEntityName, String nodeName, String attrName) {
        super("exception.cmdb.resourcecenterconfigirregularexception.2", resourceEntityName, nodeName, attrName);
    }

    public ResourceCenterConfigIrregularException(String resourceEntityName, JoinType joinType, String attrName) {
        super("exception.cmdb.resourcecenterconfigirregularexception.3", resourceEntityName, joinType.getValue(), attrName);
    }

    public ResourceCenterConfigIrregularException(String resourceEntityName, String nodeName, String fieldName, String attrName) {
        super("exception.cmdb.resourcecenterconfigirregularexception.4", resourceEntityName, nodeName, fieldName, attrName);
    }

    public ResourceCenterConfigIrregularException(String nodeName, String attrName) {
        super("exception.cmdb.resourcecenterconfigirregularexception.5", nodeName, attrName);
    }
}