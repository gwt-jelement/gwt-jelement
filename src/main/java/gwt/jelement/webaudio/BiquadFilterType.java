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

public enum BiquadFilterType{
    LOWPASS("lowpass"),
    HIGHPASS("highpass"),
    BANDPASS("bandpass"),
    LOWSHELF("lowshelf"),
    HIGHSHELF("highshelf"),
    PEAKING("peaking"),
    NOTCH("notch"),
    ALLPASS("allpass");

    private String internalValue;

    BiquadFilterType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static BiquadFilterType of(String value){
        switch(value){
            case "lowpass":
                return LOWPASS;
            case "highpass":
                return HIGHPASS;
            case "bandpass":
                return BANDPASS;
            case "lowshelf":
                return LOWSHELF;
            case "highshelf":
                return HIGHSHELF;
            case "peaking":
                return PEAKING;
            case "notch":
                return NOTCH;
            case "allpass":
                return ALLPASS;
            default:
                return null;
        }
    }

    public static BiquadFilterType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(BiquadFilterType::of)
                .toArray(BiquadFilterType[]::new);
    }

}
