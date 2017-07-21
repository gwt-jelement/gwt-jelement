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
package gwt.jelement.webmidi;

import java.util.Arrays;

public enum MIDIPortConnectionState{
    OPEN("open"),
    CLOSED("closed"),
    PENDING("pending");

    private String internalValue;

    MIDIPortConnectionState(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static MIDIPortConnectionState of(String value){
        switch(value){
            case "open":
                return OPEN;
            case "closed":
                return CLOSED;
            case "pending":
                return PENDING;
            default:
                return null;
        }
    }

    public static MIDIPortConnectionState[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(MIDIPortConnectionState::of)
                .toArray(MIDIPortConnectionState[]::new);
    }

}
