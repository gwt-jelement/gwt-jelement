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
package gwt.jelement.events;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class ErrorEventInit extends EventInit{

    @JsProperty(name="message")
    private String message;

    @JsProperty(name="filename")
    private String filename;

    @JsProperty(name="lineno")
    private double lineno;

    @JsProperty(name="colno")
    private double colno;

    @JsProperty(name="error")
    private Any error;

    public ErrorEventInit(){
    }

    @JsOverlay
    public final String getMessage(){
        return this.message;
    }

    @JsOverlay
    public final void setMessage(String message){
        this.message = message;
    }

    @JsOverlay
    public final String getFilename(){
        return this.filename;
    }

    @JsOverlay
    public final void setFilename(String filename){
        this.filename = filename;
    }

    @JsOverlay
    public final double getLineno(){
        return this.lineno;
    }

    @JsOverlay
    public final void setLineno(double lineno){
        this.lineno = lineno;
    }

    @JsOverlay
    public final double getColno(){
        return this.colno;
    }

    @JsOverlay
    public final void setColno(double colno){
        this.colno = colno;
    }

    @JsOverlay
    public final Any getError(){
        return this.error;
    }

    @JsOverlay
    public final void setError(Any error){
        this.error = error;
    }


}
