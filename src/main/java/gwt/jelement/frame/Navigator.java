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
package gwt.jelement.frame;

import gwt.jelement.battery.BatteryManager;
import gwt.jelement.bluetooth.Bluetooth;
import gwt.jelement.budget.BudgetService;
import gwt.jelement.clipboard.Clipboard;
import gwt.jelement.core.Array;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Promise;
import gwt.jelement.credentialmanager.CredentialsContainer;
import gwt.jelement.encryptedmedia.MediaKeySystemAccess;
import gwt.jelement.encryptedmedia.MediaKeySystemConfiguration;
import gwt.jelement.fileapi.Blob;
import gwt.jelement.gamepad.GamepadList;
import gwt.jelement.geolocation.Geolocation;
import gwt.jelement.html.FormData;
import gwt.jelement.installedapp.RelatedApplication;
import gwt.jelement.media_capabilities.MediaCapabilities;
import gwt.jelement.mediasession.MediaSession;
import gwt.jelement.mediastream.MediaDevices;
import gwt.jelement.mediastream.MediaStreamConstraints;
import gwt.jelement.mediastream.NavigatorUserMediaErrorCallback;
import gwt.jelement.mediastream.NavigatorUserMediaSuccessCallback;
import gwt.jelement.netinfo.NetworkInformation;
import gwt.jelement.nfc.NFC;
import gwt.jelement.permissions.Permissions;
import gwt.jelement.plugins.MimeTypeArray;
import gwt.jelement.plugins.PluginArray;
import gwt.jelement.presentation.Presentation;
import gwt.jelement.quota.DeprecatedStorageQuota;
import gwt.jelement.quota.StorageManager;
import gwt.jelement.serviceworkers.ServiceWorkerContainer;
import gwt.jelement.webmidi.MIDIOptions;
import gwt.jelement.webshare.ShareData;
import gwt.jelement.webusb.USB;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="Navigator", isNative = true)
public class Navigator implements IsObject {
    @JsProperty(name="vendorSub")
    public native String getVendorSub();
    
    @JsProperty(name="productSub")
    public native String getProductSub();
    
    @JsProperty(name="vendor")
    public native String getVendor();
    
    @JsProperty(name="bluetooth")
    public native Bluetooth getBluetooth();
    
    @JsProperty(name="budget")
    public native BudgetService getBudget();
    
    @JsProperty(name="credentials")
    public native CredentialsContainer getCredentials();
    
    @JsProperty(name="doNotTrack")
    public native String getDoNotTrack();
    
    @JsProperty(name="maxTouchPoints")
    public native double getMaxTouchPoints();
    
    @JsProperty(name="clipboard")
    public native Clipboard getClipboard();
    
    @JsProperty(name="geolocation")
    public native Geolocation getGeolocation();
    
    @JsProperty(name="mediaSession")
    public native MediaSession getMediaSession();
    
    @JsProperty(name="mediaDevices")
    public native MediaDevices getMediaDevices();
    
    @JsProperty(name="mediaCapabilities")
    public native MediaCapabilities getMediaCapabilities();
    
    @JsProperty(name="connection")
    public native NetworkInformation getConnection();
    
    @JsProperty(name="nfc")
    public native NFC getNfc();
    
    @JsProperty(name="permissions")
    public native Permissions getPermissions();
    
    @JsProperty(name="plugins")
    public native PluginArray getPlugins();
    
    @JsProperty(name="mimeTypes")
    public native MimeTypeArray getMimeTypes();
    
    @JsProperty(name="presentation")
    public native Presentation getPresentation();
    
    @JsProperty(name="webkitTemporaryStorage")
    public native DeprecatedStorageQuota getWebkitTemporaryStorage();
    
    @JsProperty(name="webkitPersistentStorage")
    public native DeprecatedStorageQuota getWebkitPersistentStorage();
    
    @JsProperty(name="storage")
    public native StorageManager getStorage();
    
    @JsProperty(name="serviceWorker")
    public native ServiceWorkerContainer getServiceWorker();
    
    @JsProperty(name="usb")
    public native USB getUsb();
    
    @JsProperty(name="hardwareConcurrency")
    public native double getHardwareConcurrency();
    
    @JsProperty(name="cookieEnabled")
    public native boolean getCookieEnabled();
    
    @JsProperty(name="appCodeName")
    public native String getAppCodeName();
    
    @JsProperty(name="appName")
    public native String getAppName();
    
    @JsProperty(name="appVersion")
    public native String getAppVersion();
    
    @JsProperty(name="platform")
    public native String getPlatform();
    
    @JsProperty(name="product")
    public native String getProduct();
    
    @JsProperty(name="userAgent")
    public native String getUserAgent();
    
    @JsProperty(name="language")
    public native String getLanguage();
    
    @JsProperty(name="languages")
    public native String[] getLanguages();
    
    @JsProperty(name="onLine")
    public native boolean getOnLine();
    
    @JsMethod(name = "cancelKeyboardLock")
    public native void cancelKeyboardLock();
    
    @JsMethod(name = "getBattery")
    public native Promise<BatteryManager> getBattery();
    
    @JsMethod(name = "getGamepads")
    public native GamepadList getGamepads();
    
    @JsMethod(name = "getInstalledRelatedApps")
    public native Promise<RelatedApplication> getInstalledRelatedApps();
    
    @JsMethod(name = "getUserMedia")
    public native void getUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
    
    @JsMethod(name = "getVRDisplays")
    public native Promise getVRDisplays();
    
    @JsMethod(name = "isProtocolHandlerRegistered")
    public native String isProtocolHandlerRegistered(String scheme, String url);
    
    @JsMethod(name = "javaEnabled")
    public native boolean javaEnabled();
    
    @JsMethod(name = "registerProtocolHandler")
    public native void registerProtocolHandler(String scheme, String url, String title);
    
    @JsMethod(name = "requestKeyboardLock")
    public native Promise<Void> requestKeyboardLock();
    
    @JsMethod(name = "requestKeyboardLock")
    public native Promise<Void> requestKeyboardLock(String[] keyCodes);
    
    @JsMethod(name = "requestKeyboardLock")
    public native Promise<Void> requestKeyboardLock(Array keyCodes);
    
    @JsMethod(name = "requestMIDIAccess")
    public native Promise requestMIDIAccess();
    
    @JsMethod(name = "requestMIDIAccess")
    public native Promise requestMIDIAccess(MIDIOptions options);
    
    @JsMethod(name = "requestMediaKeySystemAccess")
    public native Promise<MediaKeySystemAccess> requestMediaKeySystemAccess(String keySystem, MediaKeySystemConfiguration[] supportedConfigurations);
    
    @JsMethod(name = "sendBeacon")
    public native boolean sendBeacon(String url);
    
    @JsMethod(name = "sendBeacon")
    public native boolean sendBeacon(String url, ArrayBufferView data);
    
    @JsMethod(name = "sendBeacon")
    public native boolean sendBeacon(String url, Blob data);
    
    @JsMethod(name = "sendBeacon")
    public native boolean sendBeacon(String url, String data);
    
    @JsMethod(name = "sendBeacon")
    public native boolean sendBeacon(String url, FormData data);
    
    @JsMethod(name = "share")
    public native Promise<Void> share(ShareData data);
    
    @JsMethod(name = "unregisterProtocolHandler")
    public native void unregisterProtocolHandler(String scheme, String url);
    
    @JsMethod(name = "vibrate")
    public native boolean vibrate(double pattern);
    
    @JsMethod(name = "vibrate")
    public native boolean vibrate(double[] pattern);
    
    @JsMethod(name = "vibrate")
    public native boolean vibrate(Array pattern);
    
    @JsMethod(name = "webkitGetUserMedia")
    public native void webkitGetUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
    
}
