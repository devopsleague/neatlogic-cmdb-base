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

package neatlogic.framework.cmdb.dao.ognl;

import neatlogic.framework.cmdb.dto.ci.AttrVo;
import neatlogic.framework.cmdb.dto.cientity.AttrFilterVo;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

/**
 * 用于判断attr是否存在attrFilterList中，如果存在才进行join，提升查询配置项SQL性能
 */
public class IsAttrExistsInFilter {
    public static boolean isExists(AttrVo attrVo, List<AttrFilterVo> attrFilterList) {
        if (attrVo != null && CollectionUtils.isNotEmpty(attrFilterList)) {
            return attrFilterList.stream().anyMatch(d -> d != null && d.getAttrId().equals(attrVo.getId()));
        }
        return false;
    }
}
