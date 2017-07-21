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
package gwt.jelement.xmlhttprequest;

import java.util.Arrays;

public enum XMLHttpRequestResponseType{
    NONE(""),
    ARRAYBUFFER("arraybuffer"),
    BLOB("blob"),
    DOCUMENT("document"),
    JSON("json"),
    TEXT("text");

    private String internalValue;

    XMLHttpRequestResponseType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static XMLHttpRequestResponseType of(String value){
        switch(value){
            case "":
                return NONE;
            case "arraybuffer":
                return ARRAYBUFFER;
            case "blob":
                return BLOB;
            case "document":
                return DOCUMENT;
            case "json":
                return JSON;
            case "text":
                return TEXT;
            default:
                return null;
        }
    }

    public static XMLHttpRequestResponseType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(XMLHttpRequestResponseType::of)
                .toArray(XMLHttpRequestResponseType[]::new);
    }

}
