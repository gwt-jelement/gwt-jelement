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
package gwt.jelement.workers;

import gwt.jelement.budget.BudgetService;
import gwt.jelement.netinfo.NetworkInformation;
import gwt.jelement.permissions.Permissions;
import gwt.jelement.quota.StorageManager;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WorkerNavigator{
    
    @JsProperty(name="budget")
    public BudgetService budget;
    
    @JsProperty(name="connection")
    public NetworkInformation connection;
    
    @JsProperty(name="permissions")
    public Permissions permissions;
    
    @JsProperty(name="storage")
    public StorageManager storage;
    
    @JsProperty(name="hardwareConcurrency")
    public double hardwareConcurrency;
    
    @JsProperty(name="appCodeName")
    public String appCodeName;
    
    @JsProperty(name="appName")
    public String appName;
    
    @JsProperty(name="appVersion")
    public String appVersion;
    
    @JsProperty(name="platform")
    public String platform;
    
    @JsProperty(name="product")
    public String product;
    
    @JsProperty(name="userAgent")
    public String userAgent;
    
    @JsProperty(name="onLine")
    public boolean onLine;
    
    
}
