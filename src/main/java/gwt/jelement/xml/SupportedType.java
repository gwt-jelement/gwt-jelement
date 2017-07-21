/*
 * Copyright 2017 Abed Tony BenBrahim <tony.benrahim@10xdev.com>
 *     and Gwt-JElement project contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package gwt.jelement.xml;

import java.util.Arrays;

public enum SupportedType{
    TEXT_HTML("text/html"),
    TEXT_XML("text/xml"),
    APPLICATION_XML("application/xml"),
    APPLICATION_XHTML_XML("application/xhtml+xml"),
    IMAGE_SVG_XML("image/svg+xml");

    private String internalValue;

    SupportedType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static SupportedType of(String value){
        switch(value){
            case "text/html":
                return TEXT_HTML;
            case "text/xml":
                return TEXT_XML;
            case "application/xml":
                return APPLICATION_XML;
            case "application/xhtml+xml":
                return APPLICATION_XHTML_XML;
            case "image/svg+xml":
                return IMAGE_SVG_XML;
            default:
                return null;
        }
    }

    public static SupportedType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(SupportedType::of)
                .toArray(SupportedType[]::new);
    }

}
