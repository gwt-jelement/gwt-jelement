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
package gwt.jelement.html;

import java.util.Arrays;

public enum CanPlayTypeResult{
    NONE(""),
    MAYBE("maybe"),
    PROBABLY("probably");

    private String internalValue;

    CanPlayTypeResult(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static CanPlayTypeResult of(String value){
        switch(value){
            case "":
                return NONE;
            case "maybe":
                return MAYBE;
            case "probably":
                return PROBABLY;
            default:
                return null;
        }
    }

    public static CanPlayTypeResult[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(CanPlayTypeResult::of)
                .toArray(CanPlayTypeResult[]::new);
    }

}
