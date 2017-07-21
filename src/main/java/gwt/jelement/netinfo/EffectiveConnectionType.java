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
package gwt.jelement.netinfo;

import java.util.Arrays;

public enum EffectiveConnectionType{
    SLOW_2G("slow-2g"),
    _2G("2g"),
    _3G("3g"),
    _4G("4g");

    private String internalValue;

    EffectiveConnectionType(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static EffectiveConnectionType of(String value){
        switch(value){
            case "slow-2g":
                return SLOW_2G;
            case "2g":
                return _2G;
            case "3g":
                return _3G;
            case "4g":
                return _4G;
            default:
                return null;
        }
    }

    public static EffectiveConnectionType[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(EffectiveConnectionType::of)
                .toArray(EffectiveConnectionType[]::new);
    }

}
