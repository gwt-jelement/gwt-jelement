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
package gwt.jelement.xml;

import gwt.jelement.core.IsObject;
import gwt.jelement.dom.Node;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, name="XPathEvaluator", isNative = true)
public class XPathEvaluator extends IsObject{
    @JsConstructor
    public XPathEvaluator(){
        super();
    }
    
    @JsMethod(name = "createExpression")
    public native XPathExpression createExpression(String expression);
    
    @JsMethod(name = "createExpression")
    public native XPathExpression createExpression(String expression, XPathNSResolver resolver);
    
    @JsMethod(name = "createNSResolver")
    public native XPathNSResolver createNSResolver(Node nodeResolver);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, short type);
    
    @JsMethod(name = "evaluate")
    public native XPathResult evaluate(String expression, Node contextNode, XPathNSResolver resolver, short type, Object inResult);
    
}
