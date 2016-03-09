/*
 * Copyright 2004-2005 Germinus XXI
 *
 * Licensed under the Apache License, Version 2.0 (the "License")
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
package com.germinus.easyconf.taglib;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.jsp.tagext.TagExtraInfo;
import javax.servlet.jsp.tagext.VariableInfo;
import javax.servlet.jsp.tagext.TagData;

/**
 * Used to declare the property value as a JSP scripting variable
 * 
 * @author jferrer
 */
public class PropertyTei extends TagExtraInfo {

    /**
     * Return information about the scripting variables to be created.
     */
    public VariableInfo[] getVariableInfo(TagData data) {

        String type = (String)data.getAttribute("type");
        if (StringUtils.isEmpty(type)) {
            type = "java.lang.String";
        }

        return new VariableInfo[] {
            new VariableInfo(data.getAttributeString("id"),
                             type,
                             true,
                             VariableInfo.AT_END )
        };

    }
}
