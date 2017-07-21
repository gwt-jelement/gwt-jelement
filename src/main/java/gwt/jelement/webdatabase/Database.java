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
package gwt.jelement.webdatabase;

import gwt.jelement.html.VoidCallback;
import gwt.jelement.webdatabase.SQLTransactionCallback;
import gwt.jelement.webdatabase.SQLTransactionErrorCallback;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Database{
    
    @JsProperty(name="version")
    public native String getVersion();
    
    @JsMethod(name = "changeVersion")
    public native void changeVersion(String oldVersion, String newVersion);
    
    @JsMethod(name = "changeVersion")
    public native void changeVersion(String oldVersion, String newVersion, SQLTransactionCallback callback);
    
    @JsMethod(name = "changeVersion")
    public native void changeVersion(String oldVersion, String newVersion, SQLTransactionCallback callback, SQLTransactionErrorCallback errorCallback);
    
    @JsMethod(name = "changeVersion")
    public native void changeVersion(String oldVersion, String newVersion, SQLTransactionCallback callback, SQLTransactionErrorCallback errorCallback, VoidCallback successCallback);
    
    @JsMethod(name = "readTransaction")
    public native void readTransaction(SQLTransactionCallback callback);
    
    @JsMethod(name = "readTransaction")
    public native void readTransaction(SQLTransactionCallback callback, SQLTransactionErrorCallback errorCallback);
    
    @JsMethod(name = "readTransaction")
    public native void readTransaction(SQLTransactionCallback callback, SQLTransactionErrorCallback errorCallback, VoidCallback successCallback);
    
    @JsMethod(name = "transaction")
    public native void transaction(SQLTransactionCallback callback);
    
    @JsMethod(name = "transaction")
    public native void transaction(SQLTransactionCallback callback, SQLTransactionErrorCallback errorCallback);
    
    @JsMethod(name = "transaction")
    public native void transaction(SQLTransactionCallback callback, SQLTransactionErrorCallback errorCallback, VoidCallback successCallback);
    
}
