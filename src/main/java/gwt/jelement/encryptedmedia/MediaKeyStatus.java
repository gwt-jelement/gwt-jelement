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
package gwt.jelement.encryptedmedia;

import java.util.Arrays;

public enum MediaKeyStatus{
    USABLE("usable"),
    EXPIRED("expired"),
    RELEASED("released"),
    OUTPUT_RESTRICTED("output-restricted"),
    OUTPUT_DOWNSCALED("output-downscaled"),
    STATUS_PENDING("status-pending"),
    INTERNAL_ERROR("internal-error");

    private String internalValue;

    MediaKeyStatus(String internalValue){
        this.internalValue = internalValue;
    }

    public String getInternalValue(){
        return this.internalValue;
    }

    public static MediaKeyStatus of(String value){
        switch(value){
            case "usable":
                return USABLE;
            case "expired":
                return EXPIRED;
            case "released":
                return RELEASED;
            case "output-restricted":
                return OUTPUT_RESTRICTED;
            case "output-downscaled":
                return OUTPUT_DOWNSCALED;
            case "status-pending":
                return STATUS_PENDING;
            case "internal-error":
                return INTERNAL_ERROR;
            default:
                return null;
        }
    }

    public static MediaKeyStatus[] ofArray(String[] values) {
        return Arrays.<String>stream(values)
                .map(MediaKeyStatus::of)
                .toArray(MediaKeyStatus[]::new);
    }

}
