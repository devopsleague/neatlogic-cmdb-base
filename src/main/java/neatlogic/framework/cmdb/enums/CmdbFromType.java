package neatlogic.framework.cmdb.enums;

import neatlogic.framework.dependency.core.IFromType;
import neatlogic.framework.util.I18nUtils;

/**
 * @author longrf
 * @date 2022/3/10 5:14 下午
 */
public enum CmdbFromType implements IFromType {
    RESOURCE_ACCOUNT("resourceaccount", "enum.cmdb.cmdbfromtype.resource_account");

    private String value;
    private String text;

    private CmdbFromType(String value, String text) {
        this.value = value;
        this.text = text;
    }

    /**
     * 被调用者类型值
     *
     * @return
     */
    @Override
    public String getValue() {
        return value;
    }

    /**
     * 被调用者类型名
     *
     * @return
     */
    @Override
    public String getText() {
        return I18nUtils.getMessage(text);
    }
}
