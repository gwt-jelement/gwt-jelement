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
package gwt.jelement.screen_orientation;

import java.util.Arrays;

public enum OrientationType{
    PORTRAIT_PRIMARY("portrait-primary"),
    PORTRAIT_SECONDARY("portrait-secondary"),
    LANDSCAPE_PRIMARY("landscape-primary"),
    LANDSCAPE_SECONDARY("landscape-secondary");

    private String internalValue;

    OrientationType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static OrientationType of(String value){
        switch(value){
            case "portrait-primary":
                return PORTRAIT_PRIMARY;
            case "portrait-secondary":
                return PORTRAIT_SECONDARY;
            case "landscape-primary":
                return LANDSCAPE_PRIMARY;
            case "landscape-secondary":
                return LANDSCAPE_SECONDARY;
            default:
                return null;
        }
    }

    public static OrientationType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(OrientationType::of)
                .toArray(OrientationType[]::new);
    }

}
