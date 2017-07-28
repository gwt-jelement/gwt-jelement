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
package gwt.jelement.webgl;

import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.Float32Array;
import gwt.jelement.core.Int32Array;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import gwt.jelement.webgl.WebGL2RenderingContext;
import gwt.jelement.webgl.WebGLActiveInfo;
import gwt.jelement.webgl.WebGLBuffer;
import gwt.jelement.webgl.WebGLContextAttributes;
import gwt.jelement.webgl.WebGLFramebuffer;
import gwt.jelement.webgl.WebGLProgram;
import gwt.jelement.webgl.WebGLRenderbuffer;
import gwt.jelement.webgl.WebGLShader;
import gwt.jelement.webgl.WebGLShaderPrecisionFormat;
import gwt.jelement.webgl.WebGLTexture;
import gwt.jelement.webgl.WebGLUniformLocation;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, name="WebGLRenderingContext", isNative = true)
public class WebGLRenderingContext{
    public static double DEPTH_BUFFER_BIT;
    public static double STENCIL_BUFFER_BIT;
    public static double COLOR_BUFFER_BIT;
    public static double POINTS;
    public static double LINES;
    public static double LINE_LOOP;
    public static double LINE_STRIP;
    public static double TRIANGLES;
    public static double TRIANGLE_STRIP;
    public static double TRIANGLE_FAN;
    public static double ZERO;
    public static double ONE;
    public static double SRC_COLOR;
    public static double ONE_MINUS_SRC_COLOR;
    public static double SRC_ALPHA;
    public static double ONE_MINUS_SRC_ALPHA;
    public static double DST_ALPHA;
    public static double ONE_MINUS_DST_ALPHA;
    public static double DST_COLOR;
    public static double ONE_MINUS_DST_COLOR;
    public static double SRC_ALPHA_SATURATE;
    public static double FUNC_ADD;
    public static double BLEND_EQUATION;
    public static double BLEND_EQUATION_RGB;
    public static double BLEND_EQUATION_ALPHA;
    public static double FUNC_SUBTRACT;
    public static double FUNC_REVERSE_SUBTRACT;
    public static double BLEND_DST_RGB;
    public static double BLEND_SRC_RGB;
    public static double BLEND_DST_ALPHA;
    public static double BLEND_SRC_ALPHA;
    public static double CONSTANT_COLOR;
    public static double ONE_MINUS_CONSTANT_COLOR;
    public static double CONSTANT_ALPHA;
    public static double ONE_MINUS_CONSTANT_ALPHA;
    public static double BLEND_COLOR;
    public static double ARRAY_BUFFER;
    public static double ELEMENT_ARRAY_BUFFER;
    public static double ARRAY_BUFFER_BINDING;
    public static double ELEMENT_ARRAY_BUFFER_BINDING;
    public static double STREAM_DRAW;
    public static double STATIC_DRAW;
    public static double DYNAMIC_DRAW;
    public static double BUFFER_SIZE;
    public static double BUFFER_USAGE;
    public static double CURRENT_VERTEX_ATTRIB;
    public static double FRONT;
    public static double BACK;
    public static double FRONT_AND_BACK;
    public static double TEXTURE_2D;
    public static double CULL_FACE;
    public static double BLEND;
    public static double DITHER;
    public static double STENCIL_TEST;
    public static double DEPTH_TEST;
    public static double SCISSOR_TEST;
    public static double POLYGON_OFFSET_FILL;
    public static double SAMPLE_ALPHA_TO_COVERAGE;
    public static double SAMPLE_COVERAGE;
    public static double NO_ERROR;
    public static double INVALID_ENUM;
    public static double INVALID_VALUE;
    public static double INVALID_OPERATION;
    public static double OUT_OF_MEMORY;
    public static double CW;
    public static double CCW;
    public static double LINE_WIDTH;
    public static double ALIASED_POINT_SIZE_RANGE;
    public static double ALIASED_LINE_WIDTH_RANGE;
    public static double CULL_FACE_MODE;
    public static double FRONT_FACE;
    public static double DEPTH_RANGE;
    public static double DEPTH_WRITEMASK;
    public static double DEPTH_CLEAR_VALUE;
    public static double DEPTH_FUNC;
    public static double STENCIL_CLEAR_VALUE;
    public static double STENCIL_FUNC;
    public static double STENCIL_FAIL;
    public static double STENCIL_PASS_DEPTH_FAIL;
    public static double STENCIL_PASS_DEPTH_PASS;
    public static double STENCIL_REF;
    public static double STENCIL_VALUE_MASK;
    public static double STENCIL_WRITEMASK;
    public static double STENCIL_BACK_FUNC;
    public static double STENCIL_BACK_FAIL;
    public static double STENCIL_BACK_PASS_DEPTH_FAIL;
    public static double STENCIL_BACK_PASS_DEPTH_PASS;
    public static double STENCIL_BACK_REF;
    public static double STENCIL_BACK_VALUE_MASK;
    public static double STENCIL_BACK_WRITEMASK;
    public static double VIEWPORT;
    public static double SCISSOR_BOX;
    public static double COLOR_CLEAR_VALUE;
    public static double COLOR_WRITEMASK;
    public static double UNPACK_ALIGNMENT;
    public static double PACK_ALIGNMENT;
    public static double MAX_TEXTURE_SIZE;
    public static double MAX_VIEWPORT_DIMS;
    public static double SUBPIXEL_BITS;
    public static double RED_BITS;
    public static double GREEN_BITS;
    public static double BLUE_BITS;
    public static double ALPHA_BITS;
    public static double DEPTH_BITS;
    public static double STENCIL_BITS;
    public static double POLYGON_OFFSET_UNITS;
    public static double POLYGON_OFFSET_FACTOR;
    public static double TEXTURE_BINDING_2D;
    public static double SAMPLE_BUFFERS;
    public static double SAMPLES;
    public static double SAMPLE_COVERAGE_VALUE;
    public static double SAMPLE_COVERAGE_INVERT;
    public static double COMPRESSED_TEXTURE_FORMATS;
    public static double DONT_CARE;
    public static double FASTEST;
    public static double NICEST;
    public static double GENERATE_MIPMAP_HINT;
    public static double BYTE;
    public static double UNSIGNED_BYTE;
    public static double SHORT;
    public static double UNSIGNED_SHORT;
    public static double INT;
    public static double UNSIGNED_INT;
    public static double FLOAT;
    public static double DEPTH_COMPONENT;
    public static double ALPHA;
    public static double RGB;
    public static double RGBA;
    public static double LUMINANCE;
    public static double LUMINANCE_ALPHA;
    public static double UNSIGNED_SHORT_4_4_4_4;
    public static double UNSIGNED_SHORT_5_5_5_1;
    public static double UNSIGNED_SHORT_5_6_5;
    public static double FRAGMENT_SHADER;
    public static double VERTEX_SHADER;
    public static double MAX_VERTEX_ATTRIBS;
    public static double MAX_VERTEX_UNIFORM_VECTORS;
    public static double MAX_VARYING_VECTORS;
    public static double MAX_COMBINED_TEXTURE_IMAGE_UNITS;
    public static double MAX_VERTEX_TEXTURE_IMAGE_UNITS;
    public static double MAX_TEXTURE_IMAGE_UNITS;
    public static double MAX_FRAGMENT_UNIFORM_VECTORS;
    public static double SHADER_TYPE;
    public static double DELETE_STATUS;
    public static double LINK_STATUS;
    public static double VALIDATE_STATUS;
    public static double ATTACHED_SHADERS;
    public static double ACTIVE_UNIFORMS;
    public static double ACTIVE_ATTRIBUTES;
    public static double SHADING_LANGUAGE_VERSION;
    public static double CURRENT_PROGRAM;
    public static double NEVER;
    public static double LESS;
    public static double EQUAL;
    public static double LEQUAL;
    public static double GREATER;
    public static double NOTEQUAL;
    public static double GEQUAL;
    public static double ALWAYS;
    public static double KEEP;
    public static double REPLACE;
    public static double INCR;
    public static double DECR;
    public static double INVERT;
    public static double INCR_WRAP;
    public static double DECR_WRAP;
    public static double VENDOR;
    public static double RENDERER;
    public static double VERSION;
    public static double NEAREST;
    public static double LINEAR;
    public static double NEAREST_MIPMAP_NEAREST;
    public static double LINEAR_MIPMAP_NEAREST;
    public static double NEAREST_MIPMAP_LINEAR;
    public static double LINEAR_MIPMAP_LINEAR;
    public static double TEXTURE_MAG_FILTER;
    public static double TEXTURE_MIN_FILTER;
    public static double TEXTURE_WRAP_S;
    public static double TEXTURE_WRAP_T;
    public static double TEXTURE;
    public static double TEXTURE_CUBE_MAP;
    public static double TEXTURE_BINDING_CUBE_MAP;
    public static double TEXTURE_CUBE_MAP_POSITIVE_X;
    public static double TEXTURE_CUBE_MAP_NEGATIVE_X;
    public static double TEXTURE_CUBE_MAP_POSITIVE_Y;
    public static double TEXTURE_CUBE_MAP_NEGATIVE_Y;
    public static double TEXTURE_CUBE_MAP_POSITIVE_Z;
    public static double TEXTURE_CUBE_MAP_NEGATIVE_Z;
    public static double MAX_CUBE_MAP_TEXTURE_SIZE;
    public static double TEXTURE0;
    public static double TEXTURE1;
    public static double TEXTURE2;
    public static double TEXTURE3;
    public static double TEXTURE4;
    public static double TEXTURE5;
    public static double TEXTURE6;
    public static double TEXTURE7;
    public static double TEXTURE8;
    public static double TEXTURE9;
    public static double TEXTURE10;
    public static double TEXTURE11;
    public static double TEXTURE12;
    public static double TEXTURE13;
    public static double TEXTURE14;
    public static double TEXTURE15;
    public static double TEXTURE16;
    public static double TEXTURE17;
    public static double TEXTURE18;
    public static double TEXTURE19;
    public static double TEXTURE20;
    public static double TEXTURE21;
    public static double TEXTURE22;
    public static double TEXTURE23;
    public static double TEXTURE24;
    public static double TEXTURE25;
    public static double TEXTURE26;
    public static double TEXTURE27;
    public static double TEXTURE28;
    public static double TEXTURE29;
    public static double TEXTURE30;
    public static double TEXTURE31;
    public static double ACTIVE_TEXTURE;
    public static double REPEAT;
    public static double CLAMP_TO_EDGE;
    public static double MIRRORED_REPEAT;
    public static double FLOAT_VEC2;
    public static double FLOAT_VEC3;
    public static double FLOAT_VEC4;
    public static double INT_VEC2;
    public static double INT_VEC3;
    public static double INT_VEC4;
    public static double BOOL;
    public static double BOOL_VEC2;
    public static double BOOL_VEC3;
    public static double BOOL_VEC4;
    public static double FLOAT_MAT2;
    public static double FLOAT_MAT3;
    public static double FLOAT_MAT4;
    public static double SAMPLER_2D;
    public static double SAMPLER_CUBE;
    public static double VERTEX_ATTRIB_ARRAY_ENABLED;
    public static double VERTEX_ATTRIB_ARRAY_SIZE;
    public static double VERTEX_ATTRIB_ARRAY_STRIDE;
    public static double VERTEX_ATTRIB_ARRAY_TYPE;
    public static double VERTEX_ATTRIB_ARRAY_NORMALIZED;
    public static double VERTEX_ATTRIB_ARRAY_POINTER;
    public static double VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
    public static double IMPLEMENTATION_COLOR_READ_TYPE;
    public static double IMPLEMENTATION_COLOR_READ_FORMAT;
    public static double COMPILE_STATUS;
    public static double LOW_FLOAT;
    public static double MEDIUM_FLOAT;
    public static double HIGH_FLOAT;
    public static double LOW_INT;
    public static double MEDIUM_INT;
    public static double HIGH_INT;
    public static double FRAMEBUFFER;
    public static double RENDERBUFFER;
    public static double RGBA4;
    public static double RGB5_A1;
    public static double RGB565;
    public static double DEPTH_COMPONENT16;
    public static double STENCIL_INDEX8;
    public static double DEPTH_STENCIL;
    public static double RENDERBUFFER_WIDTH;
    public static double RENDERBUFFER_HEIGHT;
    public static double RENDERBUFFER_INTERNAL_FORMAT;
    public static double RENDERBUFFER_RED_SIZE;
    public static double RENDERBUFFER_GREEN_SIZE;
    public static double RENDERBUFFER_BLUE_SIZE;
    public static double RENDERBUFFER_ALPHA_SIZE;
    public static double RENDERBUFFER_DEPTH_SIZE;
    public static double RENDERBUFFER_STENCIL_SIZE;
    public static double FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE;
    public static double FRAMEBUFFER_ATTACHMENT_OBJECT_NAME;
    public static double FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL;
    public static double FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE;
    public static double COLOR_ATTACHMENT0;
    public static double DEPTH_ATTACHMENT;
    public static double STENCIL_ATTACHMENT;
    public static double DEPTH_STENCIL_ATTACHMENT;
    public static double NONE;
    public static double FRAMEBUFFER_COMPLETE;
    public static double FRAMEBUFFER_INCOMPLETE_ATTACHMENT;
    public static double FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT;
    public static double FRAMEBUFFER_INCOMPLETE_DIMENSIONS;
    public static double FRAMEBUFFER_UNSUPPORTED;
    public static double FRAMEBUFFER_BINDING;
    public static double RENDERBUFFER_BINDING;
    public static double MAX_RENDERBUFFER_SIZE;
    public static double INVALID_FRAMEBUFFER_OPERATION;
    public static double UNPACK_FLIP_Y_WEBGL;
    public static double UNPACK_PREMULTIPLY_ALPHA_WEBGL;
    public static double CONTEXT_LOST_WEBGL;
    public static double UNPACK_COLORSPACE_CONVERSION_WEBGL;
    public static double BROWSER_DEFAULT_WEBGL;
    
    @JsProperty(name="canvas")
    private WebGL2RenderingContext.VRSource canvas;
    
    @JsOverlay
    public final WebGL2RenderingContext.VRSource getCanvas(){
        return this.canvas;
    }
    
    @JsProperty(name="drawingBufferWidth")
    public native double getDrawingBufferWidth();
    
    @JsProperty(name="drawingBufferHeight")
    public native double getDrawingBufferHeight();
    
    @JsMethod(name = "activeTexture")
    public native void activeTexture(double texture);
    
    @JsMethod(name = "attachShader")
    public native void attachShader(WebGLProgram program, WebGLShader shader);
    
    @JsMethod(name = "bindAttribLocation")
    public native void bindAttribLocation(WebGLProgram program, double index, String name);
    
    @JsMethod(name = "bindBuffer")
    public native void bindBuffer(double target, WebGLBuffer buffer);
    
    @JsMethod(name = "bindFramebuffer")
    public native void bindFramebuffer(double target, WebGLFramebuffer framebuffer);
    
    @JsMethod(name = "bindRenderbuffer")
    public native void bindRenderbuffer(double target, WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "bindTexture")
    public native void bindTexture(double target, WebGLTexture texture);
    
    @JsMethod(name = "blendColor")
    public native void blendColor(float red, float green, float blue, float alpha);
    
    @JsMethod(name = "blendEquation")
    public native void blendEquation(double mode);
    
    @JsMethod(name = "blendEquationSeparate")
    public native void blendEquationSeparate(double modeRGB, double modeAlpha);
    
    @JsMethod(name = "blendFunc")
    public native void blendFunc(double sfactor, double dfactor);
    
    @JsMethod(name = "blendFuncSeparate")
    public native void blendFuncSeparate(double srcRGB, double dstRGB, double srcAlpha, double dstAlpha);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, double size, double usage);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBufferView data, double usage);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBuffer data, double usage);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double offset, ArrayBufferView data);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double offset, ArrayBuffer data);
    
    @JsMethod(name = "checkFramebufferStatus")
    public native double checkFramebufferStatus(double target);
    
    @JsMethod(name = "clear")
    public native void clear(double mask);
    
    @JsMethod(name = "clearColor")
    public native void clearColor(float red, float green, float blue, float alpha);
    
    @JsMethod(name = "clearDepth")
    public native void clearDepth(float depth);
    
    @JsMethod(name = "clearStencil")
    public native void clearStencil(double s);
    
    @JsMethod(name = "colorMask")
    public native void colorMask(boolean red, boolean green, boolean blue, boolean alpha);
    
    @JsMethod(name = "commit")
    public native Promise commit();
    
    @JsMethod(name = "compileShader")
    public native void compileShader(WebGLShader shader);
    
    @JsMethod(name = "compressedTexImage2D")
    public native void compressedTexImage2D(double target, double level, double internalformat, double width, double height, double border, ArrayBufferView data);
    
    @JsMethod(name = "compressedTexSubImage2D")
    public native void compressedTexSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, ArrayBufferView data);
    
    @JsMethod(name = "copyTexImage2D")
    public native void copyTexImage2D(double target, double level, double internalformat, double x, double y, double width, double height, double border);
    
    @JsMethod(name = "copyTexSubImage2D")
    public native void copyTexSubImage2D(double target, double level, double xoffset, double yoffset, double x, double y, double width, double height);
    
    @JsMethod(name = "createBuffer")
    public native WebGLBuffer createBuffer();
    
    @JsMethod(name = "createFramebuffer")
    public native WebGLFramebuffer createFramebuffer();
    
    @JsMethod(name = "createProgram")
    public native WebGLProgram createProgram();
    
    @JsMethod(name = "createRenderbuffer")
    public native WebGLRenderbuffer createRenderbuffer();
    
    @JsMethod(name = "createShader")
    public native WebGLShader createShader(double type);
    
    @JsMethod(name = "createTexture")
    public native WebGLTexture createTexture();
    
    @JsMethod(name = "cullFace")
    public native void cullFace(double mode);
    
    @JsMethod(name = "deleteBuffer")
    public native void deleteBuffer(WebGLBuffer buffer);
    
    @JsMethod(name = "deleteFramebuffer")
    public native void deleteFramebuffer(WebGLFramebuffer framebuffer);
    
    @JsMethod(name = "deleteProgram")
    public native void deleteProgram(WebGLProgram program);
    
    @JsMethod(name = "deleteRenderbuffer")
    public native void deleteRenderbuffer(WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "deleteShader")
    public native void deleteShader(WebGLShader shader);
    
    @JsMethod(name = "deleteTexture")
    public native void deleteTexture(WebGLTexture texture);
    
    @JsMethod(name = "depthFunc")
    public native void depthFunc(double func);
    
    @JsMethod(name = "depthMask")
    public native void depthMask(boolean flag);
    
    @JsMethod(name = "depthRange")
    public native void depthRange(float zNear, float zFar);
    
    @JsMethod(name = "detachShader")
    public native void detachShader(WebGLProgram program, WebGLShader shader);
    
    @JsMethod(name = "disable")
    public native void disable(double cap);
    
    @JsMethod(name = "disableVertexAttribArray")
    public native void disableVertexAttribArray(double index);
    
    @JsMethod(name = "drawArrays")
    public native void drawArrays(double mode, double first, double count);
    
    @JsMethod(name = "drawElements")
    public native void drawElements(double mode, double count, double type, double offset);
    
    @JsMethod(name = "enable")
    public native void enable(double cap);
    
    @JsMethod(name = "enableVertexAttribArray")
    public native void enableVertexAttribArray(double index);
    
    @JsMethod(name = "finish")
    public native void finish();
    
    @JsMethod(name = "flush")
    public native void flush();
    
    @JsMethod(name = "framebufferRenderbuffer")
    public native void framebufferRenderbuffer(double target, double attachment, double renderbuffertarget, WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "framebufferTexture2D")
    public native void framebufferTexture2D(double target, double attachment, double textarget, WebGLTexture texture, double level);
    
    @JsMethod(name = "frontFace")
    public native void frontFace(double mode);
    
    @JsMethod(name = "generateMipmap")
    public native void generateMipmap(double target);
    
    @JsMethod(name = "getActiveAttrib")
    public native WebGLActiveInfo getActiveAttrib(WebGLProgram program, double index);
    
    @JsMethod(name = "getActiveUniform")
    public native WebGLActiveInfo getActiveUniform(WebGLProgram program, double index);
    
    @JsMethod(name = "getAttachedShaders")
    public native WebGLShader[] getAttachedShaders(WebGLProgram program);
    
    @JsMethod(name = "getAttribLocation")
    public native double getAttribLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getBufferParameter")
    public native Object getBufferParameter(double target, double pname);
    
    @JsMethod(name = "getContextAttributes")
    public native WebGLContextAttributes getContextAttributes();
    
    @JsMethod(name = "getError")
    public native double getError();
    
    @JsMethod(name = "getExtension")
    public native Object getExtension(String name);
    
    @JsMethod(name = "getFramebufferAttachmentParameter")
    public native Object getFramebufferAttachmentParameter(double target, double attachment, double pname);
    
    @JsMethod(name = "getParameter")
    public native Object getParameter(double pname);
    
    @JsMethod(name = "getProgramInfoLog")
    public native String getProgramInfoLog(WebGLProgram program);
    
    @JsMethod(name = "getProgramParameter")
    public native Object getProgramParameter(WebGLProgram program, double pname);
    
    @JsMethod(name = "getRenderbufferParameter")
    public native Object getRenderbufferParameter(double target, double pname);
    
    @JsMethod(name = "getShaderInfoLog")
    public native String getShaderInfoLog(WebGLShader shader);
    
    @JsMethod(name = "getShaderParameter")
    public native Object getShaderParameter(WebGLShader shader, double pname);
    
    @JsMethod(name = "getShaderPrecisionFormat")
    public native WebGLShaderPrecisionFormat getShaderPrecisionFormat(double shadertype, double precisiontype);
    
    @JsMethod(name = "getShaderSource")
    public native String getShaderSource(WebGLShader shader);
    
    @JsMethod(name = "getSupportedExtensions")
    public native String[] getSupportedExtensions();
    
    @JsMethod(name = "getTexParameter")
    public native Object getTexParameter(double target, double pname);
    
    @JsMethod(name = "getUniform")
    public native Object getUniform(WebGLProgram program, WebGLUniformLocation location);
    
    @JsMethod(name = "getUniformLocation")
    public native WebGLUniformLocation getUniformLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getVertexAttrib")
    public native Object getVertexAttrib(double index, double pname);
    
    @JsMethod(name = "getVertexAttribOffset")
    public native double getVertexAttribOffset(double index, double pname);
    
    @JsMethod(name = "hint")
    public native void hint(double target, double mode);
    
    @JsMethod(name = "isBuffer")
    public native boolean isBuffer(WebGLBuffer buffer);
    
    @JsMethod(name = "isContextLost")
    public native boolean isContextLost();
    
    @JsMethod(name = "isEnabled")
    public native boolean isEnabled(double cap);
    
    @JsMethod(name = "isFramebuffer")
    public native boolean isFramebuffer(WebGLFramebuffer framebuffer);
    
    @JsMethod(name = "isProgram")
    public native boolean isProgram(WebGLProgram program);
    
    @JsMethod(name = "isRenderbuffer")
    public native boolean isRenderbuffer(WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "isShader")
    public native boolean isShader(WebGLShader shader);
    
    @JsMethod(name = "isTexture")
    public native boolean isTexture(WebGLTexture texture);
    
    @JsMethod(name = "lineWidth")
    public native void lineWidth(float width);
    
    @JsMethod(name = "linkProgram")
    public native void linkProgram(WebGLProgram program);
    
    @JsMethod(name = "pixelStorei")
    public native void pixelStorei(double pname, double param);
    
    @JsMethod(name = "polygonOffset")
    public native void polygonOffset(float factor, float units);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(double x, double y, double width, double height, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "renderbufferStorage")
    public native void renderbufferStorage(double target, double internalformat, double width, double height);
    
    @JsMethod(name = "sampleCoverage")
    public native void sampleCoverage(float value, boolean invert);
    
    @JsMethod(name = "scissor")
    public native void scissor(double x, double y, double width, double height);
    
    @JsMethod(name = "shaderSource")
    public native void shaderSource(WebGLShader shader, String string);
    
    @JsMethod(name = "stencilFunc")
    public native void stencilFunc(double func, double ref, double mask);
    
    @JsMethod(name = "stencilFuncSeparate")
    public native void stencilFuncSeparate(double face, double func, double ref, double mask);
    
    @JsMethod(name = "stencilMask")
    public native void stencilMask(double mask);
    
    @JsMethod(name = "stencilMaskSeparate")
    public native void stencilMaskSeparate(double face, double mask);
    
    @JsMethod(name = "stencilOp")
    public native void stencilOp(double fail, double zfail, double zpass);
    
    @JsMethod(name = "stencilOpSeparate")
    public native void stencilOpSeparate(double face, double fail, double zfail, double zpass);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double format, double type, ImageData pixels);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double format, double type, HTMLImageElement image);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double format, double type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double format, double type, HTMLVideoElement video);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double format, double type, ImageBitmap bitmap);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "texParameterf")
    public native void texParameterf(double target, double pname, float param);
    
    @JsMethod(name = "texParameteri")
    public native void texParameteri(double target, double pname, double param);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, ImageData pixels);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, HTMLImageElement image);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, HTMLVideoElement video);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double format, double type, ImageBitmap bitmap);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "uniform1f")
    public native void uniform1f(WebGLUniformLocation location, float x);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform1i")
    public native void uniform1i(WebGLUniformLocation location, double x);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform2f")
    public native void uniform2f(WebGLUniformLocation location, float x, float y);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform2i")
    public native void uniform2i(WebGLUniformLocation location, double x, double y);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform3f")
    public native void uniform3f(WebGLUniformLocation location, float x, float y, float z);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform3i")
    public native void uniform3i(WebGLUniformLocation location, double x, double y, double z);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform4f")
    public native void uniform4f(WebGLUniformLocation location, float x, float y, float z, float w);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform4i")
    public native void uniform4i(WebGLUniformLocation location, double x, double y, double z, double w);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, float[] array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, float[] array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, float[] array);
    
    @JsMethod(name = "useProgram")
    public native void useProgram(WebGLProgram program);
    
    @JsMethod(name = "validateProgram")
    public native void validateProgram(WebGLProgram program);
    
    @JsMethod(name = "vertexAttrib1f")
    public native void vertexAttrib1f(double indx, float x);
    
    @JsMethod(name = "vertexAttrib1fv")
    public native void vertexAttrib1fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib1fv")
    public native void vertexAttrib1fv(double indx, float[] values);
    
    @JsMethod(name = "vertexAttrib2f")
    public native void vertexAttrib2f(double indx, float x, float y);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(double indx, float[] values);
    
    @JsMethod(name = "vertexAttrib3f")
    public native void vertexAttrib3f(double indx, float x, float y, float z);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(double indx, float[] values);
    
    @JsMethod(name = "vertexAttrib4f")
    public native void vertexAttrib4f(double indx, float x, float y, float z, float w);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(double indx, float[] values);
    
    @JsMethod(name = "vertexAttribPointer")
    public native void vertexAttribPointer(double indx, double size, double type, boolean normalized, double stride, double offset);
    
    @JsMethod(name = "viewport")
    public native void viewport(double x, double y, double width, double height);
    
}
