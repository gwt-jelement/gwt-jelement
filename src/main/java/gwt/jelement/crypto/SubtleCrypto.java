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
package gwt.jelement.crypto;

import gwt.jelement.crypto.CryptoKey;
import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.dom.ArrayBufferView;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class SubtleCrypto{
    
    @JsMethod(name = "decrypt")
    public native Promise decrypt(Object algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "decrypt")
    public native Promise decrypt(Object algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "decrypt")
    public native Promise decrypt(String algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "decrypt")
    public native Promise decrypt(String algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "deriveBits")
    public native Promise deriveBits(Object algorithm, CryptoKey baseKey, long length);
    
    @JsMethod(name = "deriveBits")
    public native Promise deriveBits(String algorithm, CryptoKey baseKey, long length);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(Object algorithm, CryptoKey baseKey, Object derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(Object algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(String algorithm, CryptoKey baseKey, Object derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "deriveKey")
    public native Promise deriveKey(String algorithm, CryptoKey baseKey, String derivedKeyType, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "digest")
    public native Promise digest(Object algorithm, ArrayBuffer data);
    
    @JsMethod(name = "digest")
    public native Promise digest(Object algorithm, ArrayBufferView data);
    
    @JsMethod(name = "digest")
    public native Promise digest(String algorithm, ArrayBuffer data);
    
    @JsMethod(name = "digest")
    public native Promise digest(String algorithm, ArrayBufferView data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(Object algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(Object algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(String algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "encrypt")
    public native Promise encrypt(String algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "exportKey")
    public native Promise exportKey(String format, CryptoKey key);
    
    @JsMethod(name = "generateKey")
    public native Promise generateKey(Object algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "generateKey")
    public native Promise generateKey(String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBuffer keyData, Object algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBuffer keyData, String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBufferView keyData, Object algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, ArrayBufferView keyData, String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, Object keyData, Object algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "importKey")
    public native Promise importKey(String format, Object keyData, String algorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "sign")
    public native Promise sign(Object algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "sign")
    public native Promise sign(Object algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "sign")
    public native Promise sign(String algorithm, CryptoKey key, ArrayBuffer data);
    
    @JsMethod(name = "sign")
    public native Promise sign(String algorithm, CryptoKey key, ArrayBufferView data);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, Object unwrapAlgorithm, Object unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, Object unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Object unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBuffer wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, Object unwrapAlgorithm, Object unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, Object unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, Object unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "unwrapKey")
    public native Promise unwrapKey(String format, ArrayBufferView wrappedKey, CryptoKey unwrappingKey, String unwrapAlgorithm, String unwrappedKeyAlgorithm, boolean extractable, String[] keyUsages);
    
    @JsMethod(name = "verify")
    public native Promise verify(Object algorithm, CryptoKey key, ArrayBuffer signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(Object algorithm, CryptoKey key, ArrayBuffer signature, ArrayBufferView data);
    
    @JsMethod(name = "verify")
    public native Promise verify(Object algorithm, CryptoKey key, ArrayBufferView signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(Object algorithm, CryptoKey key, ArrayBufferView signature, ArrayBufferView data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBuffer signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBuffer signature, ArrayBufferView data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBufferView signature, ArrayBuffer data);
    
    @JsMethod(name = "verify")
    public native Promise verify(String algorithm, CryptoKey key, ArrayBufferView signature, ArrayBufferView data);
    
    @JsMethod(name = "wrapKey")
    public native Promise wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, Object wrapAlgorithm);
    
    @JsMethod(name = "wrapKey")
    public native Promise wrapKey(String format, CryptoKey key, CryptoKey wrappingKey, String wrapAlgorithm);
    
}
