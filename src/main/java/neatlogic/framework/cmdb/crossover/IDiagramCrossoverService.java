/*
 * Copyright (C) 2024  深圳极向量科技有限公司 All Rights Reserved.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package neatlogic.framework.cmdb.crossover;

import com.alibaba.fastjson.JSONArray;
import neatlogic.framework.crossover.ICrossoverService;
import org.springframework.transaction.annotation.Transactional;

public interface IDiagramCrossoverService extends ICrossoverService {
    /**
     * 必要属性：id
     * 选填属性：statusId,statusName,statusText三选一
     */
    @Transactional
    void updateDiagramVersionStatus(JSONArray diagramVersionList);
}