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
package gwt.jelement.webaudio;

import java.util.Arrays;

public enum OverSampleType{
    NONE("none"),
    _2X("2x"),
    _4X("4x");

    private String internalValue;

    OverSampleType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static OverSampleType of(String value){
        switch(value){
            case "none":
                return NONE;
            case "2x":
                return _2X;
            case "4x":
                return _4X;
            default:
                return null;
        }
    }

    public static OverSampleType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(OverSampleType::of)
                .toArray(OverSampleType[]::new);
    }

}
