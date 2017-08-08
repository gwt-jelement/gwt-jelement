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
package gwt.jelement.quota;

import gwt.jelement.core.IsObject;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Object", isNative = true)
public class DeprecatedStorageInfo implements IsObject {
    public static short TEMPORARY; /* 0 */
    public static short PERSISTENT; /* 1 */
    
    @JsMethod(name = "queryUsageAndQuota")
    public native void queryUsageAndQuota(short storageType);
    
    @JsMethod(name = "queryUsageAndQuota")
    public native void queryUsageAndQuota(short storageType, StorageUsageCallback usageCallback);
    
    @JsMethod(name = "queryUsageAndQuota")
    public native void queryUsageAndQuota(short storageType, StorageUsageCallback usageCallback, StorageErrorCallback errorCallback);
    
    @JsMethod(name = "requestQuota")
    public native void requestQuota(short storageType, double newQuotaInBytes);
    
    @JsMethod(name = "requestQuota")
    public native void requestQuota(short storageType, double newQuotaInBytes, StorageQuotaCallback quotaCallback);
    
    @JsMethod(name = "requestQuota")
    public native void requestQuota(short storageType, double newQuotaInBytes, StorageQuotaCallback quotaCallback, StorageErrorCallback errorCallback);
    
}
