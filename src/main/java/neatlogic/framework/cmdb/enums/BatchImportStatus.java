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

package neatlogic.framework.cmdb.enums;

import neatlogic.framework.util.I18nUtils;

public enum BatchImportStatus {
    RUNNING("running", "enum.cmdb.batchimportstatus.running"),
    SUCCEED("succeed", "enum.cmdb.batchimportstatus.succeed"),
    FAILED("failed", "enum.cmdb.batchimportstatus.failed"),
    STOPPED("stopped", "enum.cmdb.batchimportstatus.stopped");
    private final String type;
    private final String text;

    private BatchImportStatus(String _type, String _text) {
        this.type = _type;
        this.text = _text;
    }

    public String getValue() {
        return type;
    }

    public String getText() {
        return I18nUtils.getMessage(text);
    }

    public static String getValue(String name) {
        for (BatchImportStatus s : BatchImportStatus.values()) {
            if (s.getValue().equals(name)) {
                return s.getValue();
            }
        }
        return null;
    }

    public static String getText(String name) {
        for (BatchImportStatus s : BatchImportStatus.values()) {
            if (s.getValue().equals(name)) {
                return s.getText();
            }
        }
        return "";
    }
}
