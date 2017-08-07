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
package gwt.jelement.html;

import gwt.jelement.css.CSSStyleDeclaration;
import gwt.jelement.dom.DOMStringMap;
import gwt.jelement.dom.Element;
import gwt.jelement.events.EventHandlerNonNull;
import jsinterop.annotations.*;

@JsType(namespace = JsPackage.GLOBAL, name="HTMLElement", isNative = true)
public class HTMLElement extends Element {
    @JsProperty(name="onabort")
    private EventHandlerNonNull onabort;
    
    @JsProperty(name="onblur")
    private EventHandlerNonNull onblur;
    
    @JsProperty(name="oncancel")
    private EventHandlerNonNull oncancel;
    
    @JsProperty(name="oncanplay")
    private EventHandlerNonNull oncanplay;
    
    @JsProperty(name="oncanplaythrough")
    private EventHandlerNonNull oncanplaythrough;
    
    @JsProperty(name="onchange")
    private EventHandlerNonNull onchange;
    
    @JsProperty(name="onclick")
    private EventHandlerNonNull onclick;
    
    @JsProperty(name="onclose")
    private EventHandlerNonNull onclose;
    
    @JsProperty(name="oncontextmenu")
    private EventHandlerNonNull oncontextmenu;
    
    @JsProperty(name="oncuechange")
    private EventHandlerNonNull oncuechange;
    
    @JsProperty(name="ondblclick")
    private EventHandlerNonNull ondblclick;
    
    @JsProperty(name="ondrag")
    private EventHandlerNonNull ondrag;
    
    @JsProperty(name="ondragend")
    private EventHandlerNonNull ondragend;
    
    @JsProperty(name="ondragenter")
    private EventHandlerNonNull ondragenter;
    
    @JsProperty(name="ondragleave")
    private EventHandlerNonNull ondragleave;
    
    @JsProperty(name="ondragover")
    private EventHandlerNonNull ondragover;
    
    @JsProperty(name="ondragstart")
    private EventHandlerNonNull ondragstart;
    
    @JsProperty(name="ondrop")
    private EventHandlerNonNull ondrop;
    
    @JsProperty(name="ondurationchange")
    private EventHandlerNonNull ondurationchange;
    
    @JsProperty(name="onemptied")
    private EventHandlerNonNull onemptied;
    
    @JsProperty(name="onended")
    private EventHandlerNonNull onended;
    
    @JsProperty(name="onerror")
    private EventHandlerNonNull onerror;
    
    @JsProperty(name="onfocus")
    private EventHandlerNonNull onfocus;
    
    @JsProperty(name="oninput")
    private EventHandlerNonNull oninput;
    
    @JsProperty(name="oninvalid")
    private EventHandlerNonNull oninvalid;
    
    @JsProperty(name="onkeydown")
    private EventHandlerNonNull onkeydown;
    
    @JsProperty(name="onkeypress")
    private EventHandlerNonNull onkeypress;
    
    @JsProperty(name="onkeyup")
    private EventHandlerNonNull onkeyup;
    
    @JsProperty(name="onload")
    private EventHandlerNonNull onload;
    
    @JsProperty(name="onloadeddata")
    private EventHandlerNonNull onloadeddata;
    
    @JsProperty(name="onloadedmetadata")
    private EventHandlerNonNull onloadedmetadata;
    
    @JsProperty(name="onloadstart")
    private EventHandlerNonNull onloadstart;
    
    @JsProperty(name="onmousedown")
    private EventHandlerNonNull onmousedown;
    
    @JsProperty(name="onmouseenter")
    private EventHandlerNonNull onmouseenter;
    
    @JsProperty(name="onmouseleave")
    private EventHandlerNonNull onmouseleave;
    
    @JsProperty(name="onmousemove")
    private EventHandlerNonNull onmousemove;
    
    @JsProperty(name="onmouseout")
    private EventHandlerNonNull onmouseout;
    
    @JsProperty(name="onmouseover")
    private EventHandlerNonNull onmouseover;
    
    @JsProperty(name="onmouseup")
    private EventHandlerNonNull onmouseup;
    
    @JsProperty(name="onmousewheel")
    private EventHandlerNonNull onmousewheel;
    
    @JsProperty(name="onpause")
    private EventHandlerNonNull onpause;
    
    @JsProperty(name="onplay")
    private EventHandlerNonNull onplay;
    
    @JsProperty(name="onplaying")
    private EventHandlerNonNull onplaying;
    
    @JsProperty(name="onprogress")
    private EventHandlerNonNull onprogress;
    
    @JsProperty(name="onratechange")
    private EventHandlerNonNull onratechange;
    
    @JsProperty(name="onreset")
    private EventHandlerNonNull onreset;
    
    @JsProperty(name="onresize")
    private EventHandlerNonNull onresize;
    
    @JsProperty(name="onscroll")
    private EventHandlerNonNull onscroll;
    
    @JsProperty(name="onseeked")
    private EventHandlerNonNull onseeked;
    
    @JsProperty(name="onseeking")
    private EventHandlerNonNull onseeking;
    
    @JsProperty(name="onselect")
    private EventHandlerNonNull onselect;
    
    @JsProperty(name="onstalled")
    private EventHandlerNonNull onstalled;
    
    @JsProperty(name="onsubmit")
    private EventHandlerNonNull onsubmit;
    
    @JsProperty(name="onsuspend")
    private EventHandlerNonNull onsuspend;
    
    @JsProperty(name="ontimeupdate")
    private EventHandlerNonNull ontimeupdate;
    
    @JsProperty(name="ontoggle")
    private EventHandlerNonNull ontoggle;
    
    @JsProperty(name="onvolumechange")
    private EventHandlerNonNull onvolumechange;
    
    @JsProperty(name="onwaiting")
    private EventHandlerNonNull onwaiting;
    
    @JsProperty(name="onauxclick")
    private EventHandlerNonNull onauxclick;
    
    @JsProperty(name="ongotpointercapture")
    private EventHandlerNonNull ongotpointercapture;
    
    @JsProperty(name="onlostpointercapture")
    private EventHandlerNonNull onlostpointercapture;
    
    @JsProperty(name="onpointerdown")
    private EventHandlerNonNull onpointerdown;
    
    @JsProperty(name="onpointermove")
    private EventHandlerNonNull onpointermove;
    
    @JsProperty(name="onpointerup")
    private EventHandlerNonNull onpointerup;
    
    @JsProperty(name="onpointercancel")
    private EventHandlerNonNull onpointercancel;
    
    @JsProperty(name="onpointerover")
    private EventHandlerNonNull onpointerover;
    
    @JsProperty(name="onpointerout")
    private EventHandlerNonNull onpointerout;
    
    @JsProperty(name="onpointerenter")
    private EventHandlerNonNull onpointerenter;
    
    @JsProperty(name="onpointerleave")
    private EventHandlerNonNull onpointerleave;
    
    @JsProperty(name="ontouchcancel")
    private EventHandlerNonNull ontouchcancel;
    
    @JsProperty(name="ontouchend")
    private EventHandlerNonNull ontouchend;
    
    @JsProperty(name="ontouchmove")
    private EventHandlerNonNull ontouchmove;
    
    @JsProperty(name="ontouchstart")
    private EventHandlerNonNull ontouchstart;
    
    @JsProperty(name="title")
    public native String getTitle();
    
    @JsProperty(name="title")
    public native void setTitle(String title);
    
    @JsProperty(name="lang")
    public native String getLang();
    
    @JsProperty(name="lang")
    public native void setLang(String lang);
    
    @JsProperty(name="translate")
    public native boolean getTranslate();
    
    @JsProperty(name="translate")
    public native void setTranslate(boolean translate);
    
    @JsProperty(name="dir")
    public native String getDir();
    
    @JsProperty(name="dir")
    public native void setDir(String dir);
    
    @JsProperty(name="dataset")
    public native DOMStringMap getDataset();
    
    @JsProperty(name="hidden")
    public native boolean getHidden();
    
    @JsProperty(name="hidden")
    public native void setHidden(boolean hidden);
    
    @JsProperty(name="tabIndex")
    public native double getTabIndex();
    
    @JsProperty(name="tabIndex")
    public native void setTabIndex(double tabIndex);
    
    @JsProperty(name="inert")
    public native boolean getInert();
    
    @JsProperty(name="inert")
    public native void setInert(boolean inert);
    
    @JsProperty(name="accessKey")
    public native String getAccessKey();
    
    @JsProperty(name="accessKey")
    public native void setAccessKey(String accessKey);
    
    @JsProperty(name="draggable")
    public native boolean getDraggable();
    
    @JsProperty(name="draggable")
    public native void setDraggable(boolean draggable);
    
    @JsProperty(name="spellcheck")
    public native boolean getSpellcheck();
    
    @JsProperty(name="spellcheck")
    public native void setSpellcheck(boolean spellcheck);
    
    @JsProperty(name="contentEditable")
    public native String getContentEditable();
    
    @JsProperty(name="contentEditable")
    public native void setContentEditable(String contentEditable);
    
    @JsProperty(name="isContentEditable")
    public native boolean getIsContentEditable();
    
    @JsProperty(name="inputMode")
    public native String getInputMode();
    
    @JsProperty(name="inputMode")
    public native void setInputMode(String inputMode);
    
    @JsProperty(name="offsetParent")
    public native Element getOffsetParent();
    
    @JsProperty(name="offsetTop")
    public native double getOffsetTop();
    
    @JsProperty(name="offsetLeft")
    public native double getOffsetLeft();
    
    @JsProperty(name="offsetWidth")
    public native double getOffsetWidth();
    
    @JsProperty(name="offsetHeight")
    public native double getOffsetHeight();
    
    @JsProperty(name="style")
    public native CSSStyleDeclaration getStyle();
    
    @JsProperty(name="innerText")
    public native String getInnerText();
    
    @JsProperty(name="innerText")
    public native void setInnerText(String innerText);
    
    @JsProperty(name="outerText")
    public native String getOuterText();
    
    @JsProperty(name="outerText")
    public native void setOuterText(String outerText);
    
    @JsOverlay
    public final EventHandlerNonNull getOnAbort(){
        return this.onabort;
    }
    
    @JsOverlay
    public final void setOnAbort(EventHandlerNonNull onabort){
        this.onabort = onabort;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnBlur(){
        return this.onblur;
    }
    
    @JsOverlay
    public final void setOnBlur(EventHandlerNonNull onblur){
        this.onblur = onblur;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCancel(){
        return this.oncancel;
    }
    
    @JsOverlay
    public final void setOnCancel(EventHandlerNonNull oncancel){
        this.oncancel = oncancel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCanplay(){
        return this.oncanplay;
    }
    
    @JsOverlay
    public final void setOnCanplay(EventHandlerNonNull oncanplay){
        this.oncanplay = oncanplay;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCanplaythrough(){
        return this.oncanplaythrough;
    }
    
    @JsOverlay
    public final void setOnCanplaythrough(EventHandlerNonNull oncanplaythrough){
        this.oncanplaythrough = oncanplaythrough;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnChange(){
        return this.onchange;
    }
    
    @JsOverlay
    public final void setOnChange(EventHandlerNonNull onchange){
        this.onchange = onchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnClick(){
        return this.onclick;
    }
    
    @JsOverlay
    public final void setOnClick(EventHandlerNonNull onclick){
        this.onclick = onclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnClose(){
        return this.onclose;
    }
    
    @JsOverlay
    public final void setOnClose(EventHandlerNonNull onclose){
        this.onclose = onclose;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnContextmenu(){
        return this.oncontextmenu;
    }
    
    @JsOverlay
    public final void setOnContextmenu(EventHandlerNonNull oncontextmenu){
        this.oncontextmenu = oncontextmenu;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnCuechange(){
        return this.oncuechange;
    }
    
    @JsOverlay
    public final void setOnCuechange(EventHandlerNonNull oncuechange){
        this.oncuechange = oncuechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDblclick(){
        return this.ondblclick;
    }
    
    @JsOverlay
    public final void setOnDblclick(EventHandlerNonNull ondblclick){
        this.ondblclick = ondblclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDrag(){
        return this.ondrag;
    }
    
    @JsOverlay
    public final void setOnDrag(EventHandlerNonNull ondrag){
        this.ondrag = ondrag;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragend(){
        return this.ondragend;
    }
    
    @JsOverlay
    public final void setOnDragend(EventHandlerNonNull ondragend){
        this.ondragend = ondragend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragenter(){
        return this.ondragenter;
    }
    
    @JsOverlay
    public final void setOnDragenter(EventHandlerNonNull ondragenter){
        this.ondragenter = ondragenter;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragleave(){
        return this.ondragleave;
    }
    
    @JsOverlay
    public final void setOnDragleave(EventHandlerNonNull ondragleave){
        this.ondragleave = ondragleave;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragover(){
        return this.ondragover;
    }
    
    @JsOverlay
    public final void setOnDragover(EventHandlerNonNull ondragover){
        this.ondragover = ondragover;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDragstart(){
        return this.ondragstart;
    }
    
    @JsOverlay
    public final void setOnDragstart(EventHandlerNonNull ondragstart){
        this.ondragstart = ondragstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDrop(){
        return this.ondrop;
    }
    
    @JsOverlay
    public final void setOnDrop(EventHandlerNonNull ondrop){
        this.ondrop = ondrop;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnDurationchange(){
        return this.ondurationchange;
    }
    
    @JsOverlay
    public final void setOnDurationchange(EventHandlerNonNull ondurationchange){
        this.ondurationchange = ondurationchange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnEmptied(){
        return this.onemptied;
    }
    
    @JsOverlay
    public final void setOnEmptied(EventHandlerNonNull onemptied){
        this.onemptied = onemptied;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnEnded(){
        return this.onended;
    }
    
    @JsOverlay
    public final void setOnEnded(EventHandlerNonNull onended){
        this.onended = onended;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnError(){
        return this.onerror;
    }
    
    @JsOverlay
    public final void setOnError(EventHandlerNonNull onerror){
        this.onerror = onerror;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnFocus(){
        return this.onfocus;
    }
    
    @JsOverlay
    public final void setOnFocus(EventHandlerNonNull onfocus){
        this.onfocus = onfocus;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnInput(){
        return this.oninput;
    }
    
    @JsOverlay
    public final void setOnInput(EventHandlerNonNull oninput){
        this.oninput = oninput;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnInvalid(){
        return this.oninvalid;
    }
    
    @JsOverlay
    public final void setOnInvalid(EventHandlerNonNull oninvalid){
        this.oninvalid = oninvalid;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnKeydown(){
        return this.onkeydown;
    }
    
    @JsOverlay
    public final void setOnKeydown(EventHandlerNonNull onkeydown){
        this.onkeydown = onkeydown;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnKeypress(){
        return this.onkeypress;
    }
    
    @JsOverlay
    public final void setOnKeypress(EventHandlerNonNull onkeypress){
        this.onkeypress = onkeypress;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnKeyup(){
        return this.onkeyup;
    }
    
    @JsOverlay
    public final void setOnKeyup(EventHandlerNonNull onkeyup){
        this.onkeyup = onkeyup;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoad(){
        return this.onload;
    }
    
    @JsOverlay
    public final void setOnLoad(EventHandlerNonNull onload){
        this.onload = onload;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadeddata(){
        return this.onloadeddata;
    }
    
    @JsOverlay
    public final void setOnLoadeddata(EventHandlerNonNull onloadeddata){
        this.onloadeddata = onloadeddata;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadedmetadata(){
        return this.onloadedmetadata;
    }
    
    @JsOverlay
    public final void setOnLoadedmetadata(EventHandlerNonNull onloadedmetadata){
        this.onloadedmetadata = onloadedmetadata;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLoadstart(){
        return this.onloadstart;
    }
    
    @JsOverlay
    public final void setOnLoadstart(EventHandlerNonNull onloadstart){
        this.onloadstart = onloadstart;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMousedown(){
        return this.onmousedown;
    }
    
    @JsOverlay
    public final void setOnMousedown(EventHandlerNonNull onmousedown){
        this.onmousedown = onmousedown;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseenter(){
        return this.onmouseenter;
    }
    
    @JsOverlay
    public final void setOnMouseenter(EventHandlerNonNull onmouseenter){
        this.onmouseenter = onmouseenter;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseleave(){
        return this.onmouseleave;
    }
    
    @JsOverlay
    public final void setOnMouseleave(EventHandlerNonNull onmouseleave){
        this.onmouseleave = onmouseleave;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMousemove(){
        return this.onmousemove;
    }
    
    @JsOverlay
    public final void setOnMousemove(EventHandlerNonNull onmousemove){
        this.onmousemove = onmousemove;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseout(){
        return this.onmouseout;
    }
    
    @JsOverlay
    public final void setOnMouseout(EventHandlerNonNull onmouseout){
        this.onmouseout = onmouseout;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseover(){
        return this.onmouseover;
    }
    
    @JsOverlay
    public final void setOnMouseover(EventHandlerNonNull onmouseover){
        this.onmouseover = onmouseover;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMouseup(){
        return this.onmouseup;
    }
    
    @JsOverlay
    public final void setOnMouseup(EventHandlerNonNull onmouseup){
        this.onmouseup = onmouseup;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnMousewheel(){
        return this.onmousewheel;
    }
    
    @JsOverlay
    public final void setOnMousewheel(EventHandlerNonNull onmousewheel){
        this.onmousewheel = onmousewheel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPause(){
        return this.onpause;
    }
    
    @JsOverlay
    public final void setOnPause(EventHandlerNonNull onpause){
        this.onpause = onpause;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPlay(){
        return this.onplay;
    }
    
    @JsOverlay
    public final void setOnPlay(EventHandlerNonNull onplay){
        this.onplay = onplay;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPlaying(){
        return this.onplaying;
    }
    
    @JsOverlay
    public final void setOnPlaying(EventHandlerNonNull onplaying){
        this.onplaying = onplaying;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnProgress(){
        return this.onprogress;
    }
    
    @JsOverlay
    public final void setOnProgress(EventHandlerNonNull onprogress){
        this.onprogress = onprogress;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnRatechange(){
        return this.onratechange;
    }
    
    @JsOverlay
    public final void setOnRatechange(EventHandlerNonNull onratechange){
        this.onratechange = onratechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnReset(){
        return this.onreset;
    }
    
    @JsOverlay
    public final void setOnReset(EventHandlerNonNull onreset){
        this.onreset = onreset;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnResize(){
        return this.onresize;
    }
    
    @JsOverlay
    public final void setOnResize(EventHandlerNonNull onresize){
        this.onresize = onresize;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnScroll(){
        return this.onscroll;
    }
    
    @JsOverlay
    public final void setOnScroll(EventHandlerNonNull onscroll){
        this.onscroll = onscroll;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSeeked(){
        return this.onseeked;
    }
    
    @JsOverlay
    public final void setOnSeeked(EventHandlerNonNull onseeked){
        this.onseeked = onseeked;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSeeking(){
        return this.onseeking;
    }
    
    @JsOverlay
    public final void setOnSeeking(EventHandlerNonNull onseeking){
        this.onseeking = onseeking;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSelect(){
        return this.onselect;
    }
    
    @JsOverlay
    public final void setOnSelect(EventHandlerNonNull onselect){
        this.onselect = onselect;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnStalled(){
        return this.onstalled;
    }
    
    @JsOverlay
    public final void setOnStalled(EventHandlerNonNull onstalled){
        this.onstalled = onstalled;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSubmit(){
        return this.onsubmit;
    }
    
    @JsOverlay
    public final void setOnSubmit(EventHandlerNonNull onsubmit){
        this.onsubmit = onsubmit;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnSuspend(){
        return this.onsuspend;
    }
    
    @JsOverlay
    public final void setOnSuspend(EventHandlerNonNull onsuspend){
        this.onsuspend = onsuspend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTimeupdate(){
        return this.ontimeupdate;
    }
    
    @JsOverlay
    public final void setOnTimeupdate(EventHandlerNonNull ontimeupdate){
        this.ontimeupdate = ontimeupdate;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnToggle(){
        return this.ontoggle;
    }
    
    @JsOverlay
    public final void setOnToggle(EventHandlerNonNull ontoggle){
        this.ontoggle = ontoggle;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnVolumechange(){
        return this.onvolumechange;
    }
    
    @JsOverlay
    public final void setOnVolumechange(EventHandlerNonNull onvolumechange){
        this.onvolumechange = onvolumechange;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnWaiting(){
        return this.onwaiting;
    }
    
    @JsOverlay
    public final void setOnWaiting(EventHandlerNonNull onwaiting){
        this.onwaiting = onwaiting;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnAuxclick(){
        return this.onauxclick;
    }
    
    @JsOverlay
    public final void setOnAuxclick(EventHandlerNonNull onauxclick){
        this.onauxclick = onauxclick;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnGotpointercapture(){
        return this.ongotpointercapture;
    }
    
    @JsOverlay
    public final void setOnGotpointercapture(EventHandlerNonNull ongotpointercapture){
        this.ongotpointercapture = ongotpointercapture;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnLostpointercapture(){
        return this.onlostpointercapture;
    }
    
    @JsOverlay
    public final void setOnLostpointercapture(EventHandlerNonNull onlostpointercapture){
        this.onlostpointercapture = onlostpointercapture;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerdown(){
        return this.onpointerdown;
    }
    
    @JsOverlay
    public final void setOnPointerdown(EventHandlerNonNull onpointerdown){
        this.onpointerdown = onpointerdown;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointermove(){
        return this.onpointermove;
    }
    
    @JsOverlay
    public final void setOnPointermove(EventHandlerNonNull onpointermove){
        this.onpointermove = onpointermove;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerup(){
        return this.onpointerup;
    }
    
    @JsOverlay
    public final void setOnPointerup(EventHandlerNonNull onpointerup){
        this.onpointerup = onpointerup;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointercancel(){
        return this.onpointercancel;
    }
    
    @JsOverlay
    public final void setOnPointercancel(EventHandlerNonNull onpointercancel){
        this.onpointercancel = onpointercancel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerover(){
        return this.onpointerover;
    }
    
    @JsOverlay
    public final void setOnPointerover(EventHandlerNonNull onpointerover){
        this.onpointerover = onpointerover;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerout(){
        return this.onpointerout;
    }
    
    @JsOverlay
    public final void setOnPointerout(EventHandlerNonNull onpointerout){
        this.onpointerout = onpointerout;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerenter(){
        return this.onpointerenter;
    }
    
    @JsOverlay
    public final void setOnPointerenter(EventHandlerNonNull onpointerenter){
        this.onpointerenter = onpointerenter;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnPointerleave(){
        return this.onpointerleave;
    }
    
    @JsOverlay
    public final void setOnPointerleave(EventHandlerNonNull onpointerleave){
        this.onpointerleave = onpointerleave;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchcancel(){
        return this.ontouchcancel;
    }
    
    @JsOverlay
    public final void setOnTouchcancel(EventHandlerNonNull ontouchcancel){
        this.ontouchcancel = ontouchcancel;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchend(){
        return this.ontouchend;
    }
    
    @JsOverlay
    public final void setOnTouchend(EventHandlerNonNull ontouchend){
        this.ontouchend = ontouchend;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchmove(){
        return this.ontouchmove;
    }
    
    @JsOverlay
    public final void setOnTouchmove(EventHandlerNonNull ontouchmove){
        this.ontouchmove = ontouchmove;
    }
    
    @JsOverlay
    public final EventHandlerNonNull getOnTouchstart(){
        return this.ontouchstart;
    }
    
    @JsOverlay
    public final void setOnTouchstart(EventHandlerNonNull ontouchstart){
        this.ontouchstart = ontouchstart;
    }
    
    @JsProperty(name="nonce")
    public native String getNonce();
    
    @JsProperty(name="nonce")
    public native void setNonce(String nonce);
    
    @JsMethod(name = "blur")
    public native void blur();
    
    @JsMethod(name = "click")
    public native void click();
    
    @JsMethod(name = "focus")
    public native void focus();
    
}
