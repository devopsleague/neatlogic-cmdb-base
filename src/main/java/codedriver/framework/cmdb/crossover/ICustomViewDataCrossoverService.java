/*
 * Copyright(c) 2023 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.crossover;

import codedriver.framework.cmdb.dto.customview.CustomViewConditionVo;
import codedriver.framework.crossover.ICrossoverService;

import java.util.List;
import java.util.Map;

public interface ICustomViewDataCrossoverService extends ICrossoverService {

    List<Map<String, Object>> searchCustomViewDataFlatten(CustomViewConditionVo customViewConditionVo);
}
