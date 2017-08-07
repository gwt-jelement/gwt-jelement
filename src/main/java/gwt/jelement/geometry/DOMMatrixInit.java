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
package gwt.jelement.geometry;

import gwt.jelement.core.JsObject;
import jsinterop.annotations.*;

@JsType(name="Object", namespace = JsPackage.GLOBAL, isNative = true)
public class DOMMatrixInit extends JsObject{

    @JsProperty(name="a")
    private double a;

    @JsProperty(name="b")
    private double b;

    @JsProperty(name="c")
    private double c;

    @JsProperty(name="d")
    private double d;

    @JsProperty(name="e")
    private double e;

    @JsProperty(name="f")
    private double f;

    @JsProperty(name="m11")
    private double m11;

    @JsProperty(name="m12")
    private double m12;

    @JsProperty(name="m13")
    private double m13;

    @JsProperty(name="m14")
    private double m14;

    @JsProperty(name="m21")
    private double m21;

    @JsProperty(name="m22")
    private double m22;

    @JsProperty(name="m23")
    private double m23;

    @JsProperty(name="m24")
    private double m24;

    @JsProperty(name="m31")
    private double m31;

    @JsProperty(name="m32")
    private double m32;

    @JsProperty(name="m33")
    private double m33;

    @JsProperty(name="m34")
    private double m34;

    @JsProperty(name="m41")
    private double m41;

    @JsProperty(name="m42")
    private double m42;

    @JsProperty(name="m43")
    private double m43;

    @JsProperty(name="m44")
    private double m44;

    @JsProperty(name="is2D")
    private boolean is2D;

    public DOMMatrixInit(){
    }

    @JsOverlay
    public final double getA(){
        return this.a;
    }

    @JsOverlay
    public final void setA(double a){
        this.a = a;
    }

    @JsOverlay
    public final double getB(){
        return this.b;
    }

    @JsOverlay
    public final void setB(double b){
        this.b = b;
    }

    @JsOverlay
    public final double getC(){
        return this.c;
    }

    @JsOverlay
    public final void setC(double c){
        this.c = c;
    }

    @JsOverlay
    public final double getD(){
        return this.d;
    }

    @JsOverlay
    public final void setD(double d){
        this.d = d;
    }

    @JsOverlay
    public final double getE(){
        return this.e;
    }

    @JsOverlay
    public final void setE(double e){
        this.e = e;
    }

    @JsOverlay
    public final double getF(){
        return this.f;
    }

    @JsOverlay
    public final void setF(double f){
        this.f = f;
    }

    @JsOverlay
    public final double getM11(){
        return this.m11;
    }

    @JsOverlay
    public final void setM11(double m11){
        this.m11 = m11;
    }

    @JsOverlay
    public final double getM12(){
        return this.m12;
    }

    @JsOverlay
    public final void setM12(double m12){
        this.m12 = m12;
    }

    @JsOverlay
    public final double getM13(){
        return this.m13;
    }

    @JsOverlay
    public final void setM13(double m13){
        this.m13 = m13;
    }

    @JsOverlay
    public final double getM14(){
        return this.m14;
    }

    @JsOverlay
    public final void setM14(double m14){
        this.m14 = m14;
    }

    @JsOverlay
    public final double getM21(){
        return this.m21;
    }

    @JsOverlay
    public final void setM21(double m21){
        this.m21 = m21;
    }

    @JsOverlay
    public final double getM22(){
        return this.m22;
    }

    @JsOverlay
    public final void setM22(double m22){
        this.m22 = m22;
    }

    @JsOverlay
    public final double getM23(){
        return this.m23;
    }

    @JsOverlay
    public final void setM23(double m23){
        this.m23 = m23;
    }

    @JsOverlay
    public final double getM24(){
        return this.m24;
    }

    @JsOverlay
    public final void setM24(double m24){
        this.m24 = m24;
    }

    @JsOverlay
    public final double getM31(){
        return this.m31;
    }

    @JsOverlay
    public final void setM31(double m31){
        this.m31 = m31;
    }

    @JsOverlay
    public final double getM32(){
        return this.m32;
    }

    @JsOverlay
    public final void setM32(double m32){
        this.m32 = m32;
    }

    @JsOverlay
    public final double getM33(){
        return this.m33;
    }

    @JsOverlay
    public final void setM33(double m33){
        this.m33 = m33;
    }

    @JsOverlay
    public final double getM34(){
        return this.m34;
    }

    @JsOverlay
    public final void setM34(double m34){
        this.m34 = m34;
    }

    @JsOverlay
    public final double getM41(){
        return this.m41;
    }

    @JsOverlay
    public final void setM41(double m41){
        this.m41 = m41;
    }

    @JsOverlay
    public final double getM42(){
        return this.m42;
    }

    @JsOverlay
    public final void setM42(double m42){
        this.m42 = m42;
    }

    @JsOverlay
    public final double getM43(){
        return this.m43;
    }

    @JsOverlay
    public final void setM43(double m43){
        this.m43 = m43;
    }

    @JsOverlay
    public final double getM44(){
        return this.m44;
    }

    @JsOverlay
    public final void setM44(double m44){
        this.m44 = m44;
    }

    @JsOverlay
    public final boolean isIs2D(){
        return this.is2D;
    }

    @JsOverlay
    public final void setIs2D(boolean is2D){
        this.is2D = is2D;
    }


}
