/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.crossover;

import codedriver.framework.cmdb.dto.resourcecenter.config.ResourceInfo;
import codedriver.framework.cmdb.utils.ResourceSearchGenerateSqlUtil;
import codedriver.framework.crossover.ICrossoverService;
import net.sf.jsqlparser.statement.select.PlainSelect;

import java.util.List;
import java.util.function.BiConsumer;

public interface IResourceCenterCustomGenerateSqlCrossoverService extends ICrossoverService {

    BiConsumer<ResourceSearchGenerateSqlUtil, PlainSelect> getBiConsumerByProtocolIdList(List<Long> protocolIdList, List<ResourceInfo> unavailableResourceInfoList);

    BiConsumer<ResourceSearchGenerateSqlUtil, PlainSelect> getBiConsumerByTagIdList(List<Long> tagIdList, List<ResourceInfo> unavailableResourceInfoList);

    BiConsumer<ResourceSearchGenerateSqlUtil, PlainSelect> getBiConsumerByKeyword(String keyword, List<ResourceInfo> unavailableResourceInfoList);

    List<ResourceInfo> getTheadList();
}
