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
package gwt.jelement.offscreencanvas;

import java.util.Arrays;

public enum OffscreenRenderingContextType{
    _2D("2d"),
    WEBGL("webgl"),
    WEBGL2("webgl2");

    private String internalValue;

    OffscreenRenderingContextType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static OffscreenRenderingContextType of(String value){
        switch(value){
            case "2d":
                return _2D;
            case "webgl":
                return WEBGL;
            case "webgl2":
                return WEBGL2;
            default:
                return null;
        }
    }

    public static OffscreenRenderingContextType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(OffscreenRenderingContextType::of)
                .toArray(OffscreenRenderingContextType[]::new);
    }

}
