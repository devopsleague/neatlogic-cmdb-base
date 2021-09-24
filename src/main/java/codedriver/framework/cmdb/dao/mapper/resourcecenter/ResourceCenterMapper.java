/*
 * Copyright(c) 2021 TechSureCo.,Ltd.AllRightsReserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.dao.mapper.resourcecenter;

import codedriver.framework.cmdb.dto.resourcecenter.*;
import codedriver.framework.cmdb.dto.resourcecenter.AccountProtocolVo;
import codedriver.framework.cmdb.dto.resourcecenter.AccountComponentVo;
import codedriver.framework.cmdb.dto.resourcecenter.entity.AppEnviromentVo;
import codedriver.framework.cmdb.dto.resourcecenter.entity.StatusVo;
import codedriver.framework.cmdb.dto.tag.TagVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author linbq
 * @since 2021/5/27 16:34
 **/
public interface ResourceCenterMapper {

    int getResourceCount(ResourceSearchVo searchVo);

    List<Long> getResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getOsResourceCount(ResourceSearchVo searchVo);

    List<Long> getOsResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getOsResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getStorageResourceCount(ResourceSearchVo searchVo);

    List<Long> getStorageResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getStorageResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getNetDevResourceCount(ResourceSearchVo searchVo);

    List<Long> getNetDevResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getNetDevResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getAppInstanceResourceCount(ResourceSearchVo searchVo);

    List<Long> getAppInstanceResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getAppInstanceResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getDbInstanceResourceCount(ResourceSearchVo searchVo);

    List<Long> getDbInstanceResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getDbInstanceResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getAppInstanceClusterResourceCount(ResourceSearchVo searchVo);

    List<Long> getAppInstanceClusterResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getAppInstanceClusterResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getDbInstanceClusterResourceCount(ResourceSearchVo searchVo);

    List<Long> getDbInstanceClusterResourceIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getDbInstanceClusterResourceListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    Long getResourceIdByIpAndPortAndName(ResourceSearchVo searchVo);

    ResourceVo getResourceIpPortById(@Param("id") Long id, @Param("schemaName") String schemaName);

    int checkResourceIsExists(@Param("id") Long id, @Param("schemaName") String schemaName);

    List<Long> checkResourceIdListIsExists(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    List<TagVo> getTagListByResourceId(Long resourceId);

    int getAccountCount(AccountVo searchVo);

    AccountVo getAccountById(Long id);

    List<AccountVo> getAccountListByIdList(List<Long> accountIdList);

    int checkAccountNameIsRepeats(AccountVo vo);

    int checkAccountHasBeenReferredById(Long id);

    int searchAccountCount(AccountVo searchVo);

    List<AccountVo> searchAccount(AccountVo searchVo);

    List<AccountVo> getAccountListForSelect(AccountVo searchVo);

    int getTagCount(TagVo searchVo);

    List<TagVo> getTagListForSelect(TagVo searchVo);

    List<String> getTagNameListForSelect(TagVo searchVo);

    List<TagVo> searchTag(TagVo vo);

    int searchTagCount(TagVo vo);

    int checkTagNameIsRepeats(TagVo vo);

    int checkTagIsExistsById(Long id);

    TagVo getTagById(Long id);

    int checkTagHasBeenReferredById(Long id);

    List<Long> getAccountIdListByAccountAndProtocol(@Param("account") String account, @Param("protocol") String protocol);

    List<Long> getNoCorrespondingAccountResourceIdListByTagListAndAccountIdAndProtocol(@Param("tagList") List<Long> tagList, @Param("account") String account, @Param("protocol") String protocol);

    Long checkResourceIsExistsCorrespondingAccountByResourceIdAndAccountIdAndProtocol(@Param("resourceId") Long resourceId, @Param("account") String account, @Param("protocol") String protocol);

    int getAppModuleCount(ResourceSearchVo searchVo);

    List<Long> getAppModuleIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getAppModuleListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int getAppSystemCount(ResourceSearchVo searchVo);

    List<Long> getAppSystemIdList(ResourceSearchVo searchVo);

    List<ResourceVo> getAppSystemListByIdList(@Param("idList") List<Long> idList, @Param("schemaName") String schemaName);

    int checkAppModuleIsExists(@Param("id") Long id, @Param("schemaName") String schemaName);

    List<AppEnviromentVo> getEnvironmentListByAppModuleId(@Param("appModuleId") Long appModuleId, @Param("schemaName") String schemaName);

    List<ResourceTypeVo> getResourceTypeListByAppModuleIdAndEnvId(@Param("appModuleId") Long appModuleId, @Param("envId") Long envId, @Param("schemaName") String schemaName);

    List<ResourceTypeVo> getResourceTypeList(@Param("schemaName") String schemaName);

    List<StatusVo> getStatusList(@Param("schemaName") String schemaName);

    List<Long> getResourceIdListByProtocolList(ResourceSearchVo searchVo);

    List<Long> getResourceIdListByTagIdList(ResourceSearchVo searchVo);

    List<Long> checkAccountIdListIsExists(List<Long> idList);

    List<TagVo> getTagListByTagNameList(List<String> tagNameList);

    List<TagVo> getTagListByIdList(List<Long> idList);

    List<Long> checkTagIdExistsByTagIdList(List<Long> tagIdList);

    List<ResourceAccountVo> getResourceAccountListByResourceIdList(List<Long> resourceIdList);

    List<ResourceTagVo> getResourceTagListByResourceIdList(List<Long> resourceIdList);

    List<ResourceVo> getResourceListByResourceVoList(@Param("resourceList") List<ResourceVo> resourceList,@Param("schemaName") String schemaName);

    List<AccountVo> getResourceAccountListByResourceIdAndProtocolAndAccount(@Param("resourceIdList") List<Long> resourceIdList, @Param("protocol") String protocol, @Param("userName") String userName);

    int updateAccount(AccountVo vo);

    int updateTag(TagVo vo);

    int replaceAccount(AccountVo vo);

    int insertTag(TagVo vo);

    int insertIgnoreResourceAccount(List<ResourceAccountVo> resourceAccountVoList);

    int insertIgnoreResourceTag(List<ResourceTagVo> resourceTagVoList);

    int deleteTagById(Long id);

    int deleteAccountById(Long id);

    int deleteResourceAccountByResourceId(Long resourceId);

    int deleteResourceAccountByResourceIdListAndAccountIdList(@Param("resourceIdList") List<Long> resourceIdList, @Param("accountIdList") List<Long> accountIdList);

    int deleteResourceTagByResourceId(Long resourceId);

    int deleteResourceTagByResourceIdAndTagIdList(@Param("resourceIdList") List<Long> resourceIdList, @Param("tagIdList") List<Long> tagIdList);

    List<Long> getAccountIdList(AccountVo searchVo);

    List<AccountTagVo> getAccountTagListByAccountIdList(List<Long> AccountIdList);

    int checkAccountIsExists(Long accountId);

    int deleteAccountTagByAccountId(Long accountId);

    int insertIgnoreAccountTag(List<AccountTagVo> accountTagVoList);

    List<AccountProtocolVo> searchAccountProtocolListByProtocolName(AccountProtocolVo searchVo);

    int checkAccountProtocolIsRepeats(AccountProtocolVo searchVo);

    int insertAccountProtocol(AccountProtocolVo searchVo);

    int updateAccountProtocol(AccountProtocolVo searchVo);

    int checkAccountProtocolHasBeenReferredByProtocol(String protocol);

    int checkAccountProtocolIsExistsById(Long id);

    int deleteResourceAccountProtocolById(Long id);

    AccountProtocolVo getAccountProtocolVoByProtocolId(Long protocolId);

    List<TagVo> searchTagListByIdList(List<Long> tagIdList);

    List<AccountComponentVo> searchAccountComponent(@Param("accountComponentVo") AccountComponentVo accountComponentVo, @Param("schemaName") String schemaName);

    Integer searchAccountComponentCount(@Param("accountComponentVo") AccountComponentVo accountComponentVo, @Param("schemaName") String schemaName);

    int checkAccountProtocolIsExists(AccountProtocolVo protocolVo);

    AccountVo getAccountByTagentId(Long id);

    AccountProtocolVo getAccountProtocolVoByProtocolName(String name);

    AccountVo getAccountByName(String name);

    void updateAccountByName(AccountVo account);

}
