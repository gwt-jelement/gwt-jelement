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
package gwt.jelement.shapedetection;

import gwt.jelement.fileapi.Blob;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.shapedetection.DetectedFace;
import gwt.jelement.shapedetection.FaceDetectorOptions;
import gwt.jelement.svg.SVGImageElement;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="FaceDetector", isNative = true)
public class FaceDetector{
    @JsConstructor
    public FaceDetector(){
    }
    
    @JsConstructor
    public FaceDetector(FaceDetectorOptions faceDetectorOptions){
    }
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(HTMLImageElement image);
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(SVGImageElement image);
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(HTMLVideoElement image);
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(HTMLCanvasElement image);
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(Blob image);
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(ImageData image);
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(ImageBitmap image);
    
    @JsMethod(name = "detect")
    public native Promise<DetectedFace[]> detect(OffscreenCanvas image);
    
}
