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
package gwt.jelement.core;

import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="Date", isNative = true)
public class Date extends IsObject{
    @JsConstructor
    public Date(){
        super();
    }
    
    @JsConstructor
    public Date(double value){
        super();
    }
    
    @JsConstructor
    public Date(String dateString){
        super();
    }
    
    @JsConstructor
    public Date(Object year, Object month){
        super();
    }
    
    @JsConstructor
    public Date(Object year, Object month, Object date){
        super();
    }
    
    @JsConstructor
    public Date(Object year, Object month, Object date, Object hours){
        super();
    }
    
    @JsConstructor
    public Date(Object year, Object month, Object date, Object hours, Object minutes){
        super();
    }
    
    @JsConstructor
    public Date(Object year, Object month, Object date, Object hours, Object minutes, Object seconds){
        super();
    }
    
    @JsConstructor
    public Date(Object year, Object month, Object date, Object hours, Object minutes, Object seconds, Object milliseconds){
        super();
    }
    
    @JsMethod(name = "UTC")
    public static native double UTC(Object year, Object month);
    
    @JsMethod(name = "UTC")
    public static native double UTC(Object year, Object month, Object date);
    
    @JsMethod(name = "UTC")
    public static native double UTC(Object year, Object month, Object date, Object hours);
    
    @JsMethod(name = "UTC")
    public static native double UTC(Object year, Object month, Object date, Object hours, Object minutes);
    
    @JsMethod(name = "UTC")
    public static native double UTC(Object year, Object month, Object date, Object hours, Object minutes, Object seconds);
    
    @JsMethod(name = "UTC")
    public static native double UTC(Object year, Object month, Object date, Object hours, Object minutes, Object seconds, Object milliseconds);
    
    @JsMethod(name = "getDate")
    public native int getDate();
    
    @JsMethod(name = "getDay")
    public native int getDay();
    
    @JsMethod(name = "getFullYear")
    public native int getFullYear();
    
    @JsMethod(name = "getHours")
    public native int getHours();
    
    @JsMethod(name = "getMilliseconds")
    public native int getMilliseconds();
    
    @JsMethod(name = "getMinutes")
    public native int getMinutes();
    
    @JsMethod(name = "getMonth")
    public native int getMonth();
    
    @JsMethod(name = "getSeconds")
    public native int getSeconds();
    
    @JsMethod(name = "getTime")
    public native double getTime();
    
    @JsMethod(name = "getTimezoneOffset")
    public native int getTimezoneOffset();
    
    @JsMethod(name = "getUTCDate")
    public native int getUTCDate();
    
    @JsMethod(name = "getUTCDay")
    public native int getUTCDay();
    
    @JsMethod(name = "getUTCFullYear")
    public native int getUTCFullYear();
    
    @JsMethod(name = "getUTCHours")
    public native int getUTCHours();
    
    @JsMethod(name = "getUTCMilliseconds")
    public native int getUTCMilliseconds();
    
    @JsMethod(name = "getUTCMinutes")
    public native int getUTCMinutes();
    
    @JsMethod(name = "getUTCMonth")
    public native int getUTCMonth();
    
    @JsMethod(name = "getUTCSeconds")
    public native int getUTCSeconds();
    
    @Deprecated
    @JsMethod(name = "getYear")
    public native int getYear();
    
    @JsMethod(name = "now")
    public static native double now();
    
    @JsMethod(name = "parse")
    public static native Date parse(String dateString);
    
    @JsMethod(name = "setDate")
    public native double setDate(int day);
    
    @JsMethod(name = "setFullYear")
    public native double setFullYear(int year);
    
    @JsMethod(name = "setFullYear")
    public native double setFullYear(int year, int month);
    
    @JsMethod(name = "setFullYear")
    public native double setFullYear(int year, int month, int day);
    
    @JsMethod(name = "setHours")
    public native double setHours(int hours);
    
    @JsMethod(name = "setHours")
    public native double setHours(int hours, int minutes);
    
    @JsMethod(name = "setHours")
    public native double setHours(int hours, int minutes, int seconds);
    
    @JsMethod(name = "setHours")
    public native double setHours(int hours, int minutes, int seconds, int milliseconds);
    
    @JsMethod(name = "setMilliseconds")
    public native double setMilliseconds(int milliseconds);
    
    @JsMethod(name = "setMinutes")
    public native double setMinutes(int minutes);
    
    @JsMethod(name = "setMinutes")
    public native double setMinutes(int minutes, int seconds);
    
    @JsMethod(name = "setMinutes")
    public native double setMinutes(int minutes, int seconds, int milliseconds);
    
    @JsMethod(name = "setMonth")
    public native double setMonth(int month);
    
    @JsMethod(name = "setMonth")
    public native double setMonth(int month, int day);
    
    @JsMethod(name = "setSeconds")
    public native double setSeconds(int seconds);
    
    @JsMethod(name = "setSeconds")
    public native double setSeconds(int seconds, int milliseconds);
    
    @JsMethod(name = "setTime")
    public native double setTime(double time);
    
    @JsMethod(name = "setUTCDate")
    public native double setUTCDate(int day);
    
    @JsMethod(name = "setUTCFullYear")
    public native double setUTCFullYear(int year);
    
    @JsMethod(name = "setUTCFullYear")
    public native double setUTCFullYear(int year, int month);
    
    @JsMethod(name = "setUTCFullYear")
    public native double setUTCFullYear(int year, int month, int day);
    
    @JsMethod(name = "setUTCHours")
    public native double setUTCHours(int hours);
    
    @JsMethod(name = "setUTCHours")
    public native double setUTCHours(int hours, int minutes);
    
    @JsMethod(name = "setUTCHours")
    public native double setUTCHours(int hours, int minutes, int seconds);
    
    @JsMethod(name = "setUTCHours")
    public native double setUTCHours(int hours, int minutes, int seconds, int milliseconds);
    
    @JsMethod(name = "setUTCMilliseconds")
    public native double setUTCMilliseconds(int milliseconds);
    
    @JsMethod(name = "setUTCMinutes")
    public native double setUTCMinutes(int minutes);
    
    @JsMethod(name = "setUTCMinutes")
    public native double setUTCMinutes(int minutes, int seconds);
    
    @JsMethod(name = "setUTCMinutes")
    public native double setUTCMinutes(int minutes, int seconds, int milliseconds);
    
    @JsMethod(name = "setUTCMonth")
    public native double setUTCMonth(int month);
    
    @JsMethod(name = "setUTCMonth")
    public native double setUTCMonth(int month, int day);
    
    @JsMethod(name = "setUTCSeconds")
    public native double setUTCSeconds(int seconds);
    
    @JsMethod(name = "setUTCSeconds")
    public native double setUTCSeconds(int seconds, int milliseconds);
    
    @Deprecated
    @JsMethod(name = "setYear")
    public native double setYear(int year);
    
    @JsMethod(name = "toDateString")
    public native String toDateString();
    
    @Deprecated
    @JsMethod(name = "toGMTString")
    public native String toGMTString();
    
    @JsMethod(name = "toISOString")
    public native String toISOString();
    
    @JsMethod(name = "toJSON")
    public native String toJSON();
    
    @JsMethod(name = "toLocaleDateString")
    public native String toLocaleDateString();
    
    @JsMethod(name = "toLocaleDateString")
    public native String toLocaleDateString(String locales);
    
    @JsMethod(name = "toLocaleDateString")
    public native String toLocaleDateString(String[] locales);
    
    @JsMethod(name = "toLocaleDateString")
    public native String toLocaleDateString(Array locales);
    
    @JsMethod(name = "toLocaleDateString")
    public native String toLocaleDateString(String locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleDateString")
    public native String toLocaleDateString(String[] locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleDateString")
    public native String toLocaleDateString(Array locales, LocaleOptions options);
    
    @Deprecated
    @JsMethod(name = "toLocaleFormat")
    public native String toLocaleFormat(String formatString);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString();
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String locales);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String[] locales);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(Array locales);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(String[] locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleString")
    public native String toLocaleString(Array locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleTimeString")
    public native String toLocaleTimeString();
    
    @JsMethod(name = "toLocaleTimeString")
    public native String toLocaleTimeString(String locales);
    
    @JsMethod(name = "toLocaleTimeString")
    public native String toLocaleTimeString(String[] locales);
    
    @JsMethod(name = "toLocaleTimeString")
    public native String toLocaleTimeString(Array locales);
    
    @JsMethod(name = "toLocaleTimeString")
    public native String toLocaleTimeString(String locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleTimeString")
    public native String toLocaleTimeString(String[] locales, LocaleOptions options);
    
    @JsMethod(name = "toLocaleTimeString")
    public native String toLocaleTimeString(Array locales, LocaleOptions options);
    
    @Deprecated
    @JsMethod(name = "toSource")
    public native String toSource();
    
    @JsMethod(name = "toString")
    public native String toString();
    
    @JsMethod(name = "toTimeString")
    public native String toTimeString();
    
    @JsMethod(name = "toUTCString")
    public native String toUTCString();
    
    @JsMethod(name = "valueOf")
    public native Double valueOf();
    
}
