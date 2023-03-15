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

package neatlogic.framework.cmdb.utils;

import neatlogic.framework.cmdb.dto.ci.CiViewVo;
import neatlogic.framework.cmdb.dto.ci.RelVo;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.stream.Collectors;

public class RelUtil {
    /**
     * 如果出现子模型引用父模型的情况，会由于继承关系出现两条关系，所以需要去除
     *
     * @param relList 关系列表
     * @return 关系列表
     */
    public static List<RelVo> ClearRepeatRel(List<RelVo> relList) {
        List<RelVo> originalRelList = relList.stream().filter(rel -> rel.getIsExtended().equals(0)).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(originalRelList)) {
            relList.removeIf(rel -> rel.getIsExtended().equals(1) && originalRelList.stream().anyMatch(er -> er.getFromCiId().equals(rel.getFromCiId()) && er.getToCiId().equals(rel.getToCiId())));
        }
        return relList;
    }

    public static List<CiViewVo> ClearCiViewRepeatRel(List<CiViewVo> ciViewList) {
        List<CiViewVo> originalRelList = ciViewList.stream().filter(view -> view.getIsExtended().equals(0) && view.getType().startsWith("rel")).collect(Collectors.toList());
        if (CollectionUtils.isNotEmpty(originalRelList)) {
            ciViewList.removeIf(view -> view.getIsExtended().equals(1) && view.getType().startsWith("rel") && originalRelList.stream().anyMatch(er -> er.getUniqueKey().equals(view.getUniqueKey())));
        }
        return ciViewList;
    }
}