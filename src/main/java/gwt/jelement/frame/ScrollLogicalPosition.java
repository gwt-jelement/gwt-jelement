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
package gwt.jelement.frame;

import java.util.Arrays;

public enum ScrollLogicalPosition{
    START("start"),
    CENTER("center"),
    END("end"),
    NEAREST("nearest");

    private String internalValue;

    ScrollLogicalPosition(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static ScrollLogicalPosition of(String value){
        switch(value){
            case "start":
                return START;
            case "center":
                return CENTER;
            case "end":
                return END;
            case "nearest":
                return NEAREST;
            default:
                return null;
        }
    }

    public static ScrollLogicalPosition[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(ScrollLogicalPosition::of)
                .toArray(ScrollLogicalPosition[]::new);
    }

}
