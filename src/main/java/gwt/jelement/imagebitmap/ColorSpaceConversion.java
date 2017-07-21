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
package gwt.jelement.imagebitmap;

import java.util.Arrays;

public enum ColorSpaceConversion{
    NONE("none"),
    DEFAULT("default"),
    SRGB("srgb"),
    LINEAR_RGB("linear-rgb"),
    REC2020("rec2020"),
    P3("p3");

    private String internalValue;

    ColorSpaceConversion(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static ColorSpaceConversion of(String value){
        switch(value){
            case "none":
                return NONE;
            case "default":
                return DEFAULT;
            case "srgb":
                return SRGB;
            case "linear-rgb":
                return LINEAR_RGB;
            case "rec2020":
                return REC2020;
            case "p3":
                return P3;
            default:
                return null;
        }
    }

    public static ColorSpaceConversion[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(ColorSpaceConversion::of)
                .toArray(ColorSpaceConversion[]::new);
    }

}
