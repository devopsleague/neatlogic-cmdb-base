/*
 * Copyright(c) 2021 TechSure Co., Ltd. All Rights Reserved.
 * 本内容仅限于深圳市赞悦科技有限公司内部传阅，禁止外泄以及用于其他的商业项目。
 */

package codedriver.framework.cmdb.dto.schema;

import codedriver.framework.common.config.Config;
import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.Date;

/**
 * @Title: SchemaAuditVo
 * @Package codedriver.framework.cmdb.dto.schema
 * @Description: TODO
 * @Author: chenqiwei
 * @Date: 2021/1/4 4:18 下午
 **/
public class SchemaAuditVo implements Serializable {
    private Long id;
    private Long targetId;
    private String targetType;
    private String action;
    private Date lcd;
    private Integer serverId;
    private JSONObject data;
    private String dataStr;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTargetId() {
        return targetId;
    }

    public void setTargetId(Long targetId) {
        this.targetId = targetId;
    }

    public String getTargetType() {
        return targetType;
    }

    public void setTargetType(String targetType) {
        this.targetType = targetType;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Date getLcd() {
        return lcd;
    }

    public void setLcd(Date lcd) {
        this.lcd = lcd;
    }

    public Integer getServerId() {
        return Config.SCHEDULE_SERVER_ID;
    }

    public JSONObject getData() {
        if (data == null && StringUtils.isNotBlank(dataStr)) {
            try {
                data = JSONObject.parseObject(dataStr);
            } catch (Exception ignored) {

            }
        }
        return data;
    }

    public void setData(JSONObject data) {
        this.data = data;
    }

    public String getDataStr() {
        if (StringUtils.isBlank(dataStr) && data != null) {
            dataStr = data.toJSONString();
        }
        return dataStr;
    }

    public void setDataStr(String dataStr) {
        this.dataStr = dataStr;
    }
}
