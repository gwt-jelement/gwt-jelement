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
package gwt.jelement.indexeddb;

import java.util.Arrays;

public enum IDBCursorDirection{
    NEXT("next"),
    NEXTUNIQUE("nextunique"),
    PREV("prev"),
    PREVUNIQUE("prevunique");

    private String internalValue;

    IDBCursorDirection(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static IDBCursorDirection of(String value){
        switch(value){
            case "next":
                return NEXT;
            case "nextunique":
                return NEXTUNIQUE;
            case "prev":
                return PREV;
            case "prevunique":
                return PREVUNIQUE;
            default:
                return null;
        }
    }

    public static IDBCursorDirection[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(IDBCursorDirection::of)
                .toArray(IDBCursorDirection[]::new);
    }

}
