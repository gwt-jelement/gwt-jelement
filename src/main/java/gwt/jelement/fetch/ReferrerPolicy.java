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

public enum ReferrerPolicy{
    NONE(""),
    NO_REFERRER("no-referrer"),
    NO_REFERRER_WHEN_DOWNGRADE("no-referrer-when-downgrade"),
    ORIGIN("origin"),
    ORIGIN_WHEN_CROSS_ORIGIN("origin-when-cross-origin"),
    UNSAFE_URL("unsafe-url");

    private String internalValue;

    ReferrerPolicy(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static ReferrerPolicy of(String value){
        switch(value){
            case "":
                return NONE;
            case "no-referrer":
                return NO_REFERRER;
            case "no-referrer-when-downgrade":
                return NO_REFERRER_WHEN_DOWNGRADE;
            case "origin":
                return ORIGIN;
            case "origin-when-cross-origin":
                return ORIGIN_WHEN_CROSS_ORIGIN;
            case "unsafe-url":
                return UNSAFE_URL;
            default:
                return null;
        }
    }

    public static ReferrerPolicy[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(ReferrerPolicy::of)
                .toArray(ReferrerPolicy[]::new);
    }

}
