/*
Copyright(c) $today.year NeatLogic Co., Ltd. All Rights Reserved.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package neatlogic.framework.cmdb.exception.resourcecenter;

import neatlogic.framework.exception.core.ApiRuntimeException;
import org.apache.commons.lang3.StringUtils;

import java.util.List;

/**
 * @author linbq
 * @since 2021/6/22 18:11
 **/
public class ResourceNotFoundException extends ApiRuntimeException {

    private static final long serialVersionUID = 8748508038438348100L;

    public ResourceNotFoundException(Long id) {
        super("exception.cmdb.resourcenotfoundexception.1", id);
    }

    public ResourceNotFoundException(String name) {
        super("exception.cmdb.resourcenotfoundexception.1", name);
    }

    public ResourceNotFoundException(List<String> nameList) {
        super("exception.cmdb.resourcenotfoundexception.2", String.join(",", nameList));

    }

    public ResourceNotFoundException() {
        super("exception.cmdb.resourcenotfoundexception.1", StringUtils.EMPTY);

    }
}
