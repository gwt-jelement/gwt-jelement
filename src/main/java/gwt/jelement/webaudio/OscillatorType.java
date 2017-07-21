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

public enum OscillatorType{
    SINE("sine"),
    SQUARE("square"),
    SAWTOOTH("sawtooth"),
    TRIANGLE("triangle"),
    CUSTOM("custom");

    private String internalValue;

    OscillatorType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static OscillatorType of(String value){
        switch(value){
            case "sine":
                return SINE;
            case "square":
                return SQUARE;
            case "sawtooth":
                return SAWTOOTH;
            case "triangle":
                return TRIANGLE;
            case "custom":
                return CUSTOM;
            default:
                return null;
        }
    }

    public static OscillatorType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(OscillatorType::of)
                .toArray(OscillatorType[]::new);
    }

}
