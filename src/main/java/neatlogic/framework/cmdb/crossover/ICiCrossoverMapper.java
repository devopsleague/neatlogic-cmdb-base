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

package neatlogic.framework.cmdb.crossover;

import neatlogic.framework.cmdb.dto.ci.CiVo;
import neatlogic.framework.crossover.ICrossoverService;
import org.apache.ibatis.annotations.Param;


import java.util.List;

public interface ICiCrossoverMapper extends ICrossoverService {
    List<CiVo> searchCi(CiVo ciVo);

    CiVo getCiByName(String ciName);

    List<CiVo> getDownwardCiListByLR(@Param("lft") Integer lft, @Param("rht") Integer rht);

    CiVo getCiById(Long ciId);

    List<CiVo> getCiByIdList(@Param("ciIdList") List<Long> ciIds);

    /**
     * 查找所有父模型包括自己
     *
     * @param lft 子模型左编码
     * @param rht 子模型右编码
     * @return 模型列表
     */
    List<CiVo> getUpwardCiListByLR(@Param("lft") Integer lft, @Param("rht") Integer rht);

}
