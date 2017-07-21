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
package gwt.jelement.fetch;

import java.util.Arrays;

public enum RequestMode{
    NAVIGATE("navigate"),
    SAME_ORIGIN("same-origin"),
    NO_CORS("no-cors"),
    CORS("cors");

    private String internalValue;

    RequestMode(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static RequestMode of(String value){
        switch(value){
            case "navigate":
                return NAVIGATE;
            case "same-origin":
                return SAME_ORIGIN;
            case "no-cors":
                return NO_CORS;
            case "cors":
                return CORS;
            default:
                return null;
        }
    }

    public static RequestMode[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(RequestMode::of)
                .toArray(RequestMode[]::new);
    }

}
