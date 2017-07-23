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

import gwt.jelement.bluetooth.Bluetooth;
import gwt.jelement.budget.BudgetService;
import gwt.jelement.clipboard.Clipboard;
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
import elemental2.core.ArrayBufferView;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class Navigator{
    
    @JsProperty(name="vendorSub")
    public String vendorSub;
    
    @JsProperty(name="productSub")
    public String productSub;
    
    @JsProperty(name="vendor")
    public String vendor;
    
    @JsProperty(name="bluetooth")
    public Bluetooth bluetooth;
    
    @JsProperty(name="budget")
    public BudgetService budget;
    
    @JsProperty(name="credentials")
    public CredentialsContainer credentials;
    
    @JsProperty(name="doNotTrack")
    public String doNotTrack;
    
    @JsProperty(name="maxTouchPoints")
    public double maxTouchPoints;
    
    @JsProperty(name="clipboard")
    public Clipboard clipboard;
    
    @JsProperty(name="geolocation")
    public Geolocation geolocation;
    
    @JsProperty(name="mediaSession")
    public MediaSession mediaSession;
    
    @JsProperty(name="mediaDevices")
    public MediaDevices mediaDevices;
    
    @JsProperty(name="mediaCapabilities")
    public MediaCapabilities mediaCapabilities;
    
    @JsProperty(name="connection")
    public NetworkInformation connection;
    
    @JsProperty(name="nfc")
    public NFC nfc;
    
    @JsProperty(name="permissions")
    public Permissions permissions;
    
    @JsProperty(name="plugins")
    public PluginArray plugins;
    
    @JsProperty(name="mimeTypes")
    public MimeTypeArray mimeTypes;
    
    @JsProperty(name="presentation")
    public Presentation presentation;
    
    @JsProperty(name="webkitTemporaryStorage")
    public DeprecatedStorageQuota webkitTemporaryStorage;
    
    @JsProperty(name="webkitPersistentStorage")
    public DeprecatedStorageQuota webkitPersistentStorage;
    
    @JsProperty(name="storage")
    public StorageManager storage;
    
    @JsProperty(name="serviceWorker")
    public ServiceWorkerContainer serviceWorker;
    
    @JsProperty(name="usb")
    public USB usb;
    
    @JsMethod(name = "cancelKeyboardLock")
    public native void cancelKeyboardLock();
    
    @JsMethod(name = "getBattery")
    public native Promise getBattery();
    
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
    
    @JsMethod(name = "webkitGetUserMedia")
    public native void webkitGetUserMedia(MediaStreamConstraints constraints, NavigatorUserMediaSuccessCallback successCallback, NavigatorUserMediaErrorCallback errorCallback);
    
}
