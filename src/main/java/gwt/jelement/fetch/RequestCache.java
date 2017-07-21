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

public enum RequestCache{
    DEFAULT("default"),
    NO_STORE("no-store"),
    RELOAD("reload"),
    NO_CACHE("no-cache"),
    FORCE_CACHE("force-cache"),
    ONLY_IF_CACHED("only-if-cached");

    private String internalValue;

    RequestCache(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static RequestCache of(String value){
        switch(value){
            case "default":
                return DEFAULT;
            case "no-store":
                return NO_STORE;
            case "reload":
                return RELOAD;
            case "no-cache":
                return NO_CACHE;
            case "force-cache":
                return FORCE_CACHE;
            case "only-if-cached":
                return ONLY_IF_CACHED;
            default:
                return null;
        }
    }

    public static RequestCache[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(RequestCache::of)
                .toArray(RequestCache[]::new);
    }

}
