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

import gwt.jelement.dom.ArrayBuffer;
import gwt.jelement.dom.ArrayBufferView;
import gwt.jelement.dom.Float32Array;
import gwt.jelement.dom.Int32Array;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
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
import jsinterop.base.Any;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WebGLRenderingContextBase{
    public static final int DEPTH_BUFFER_BIT = 0x00000100;
    public static final int STENCIL_BUFFER_BIT = 0x00000400;
    public static final int COLOR_BUFFER_BIT = 0x00004000;
    public static final int POINTS = 0x0000;
    public static final int LINES = 0x0001;
    public static final int LINE_LOOP = 0x0002;
    public static final int LINE_STRIP = 0x0003;
    public static final int TRIANGLES = 0x0004;
    public static final int TRIANGLE_STRIP = 0x0005;
    public static final int TRIANGLE_FAN = 0x0006;
    public static final int ZERO = 0;
    public static final int ONE = 1;
    public static final int SRC_COLOR = 0x0300;
    public static final int ONE_MINUS_SRC_COLOR = 0x0301;
    public static final int SRC_ALPHA = 0x0302;
    public static final int ONE_MINUS_SRC_ALPHA = 0x0303;
    public static final int DST_ALPHA = 0x0304;
    public static final int ONE_MINUS_DST_ALPHA = 0x0305;
    public static final int DST_COLOR = 0x0306;
    public static final int ONE_MINUS_DST_COLOR = 0x0307;
    public static final int SRC_ALPHA_SATURATE = 0x0308;
    public static final int FUNC_ADD = 0x8006;
    public static final int BLEND_EQUATION = 0x8009;
    public static final int BLEND_EQUATION_RGB = 0x8009;
    public static final int BLEND_EQUATION_ALPHA = 0x883D;
    public static final int FUNC_SUBTRACT = 0x800A;
    public static final int FUNC_REVERSE_SUBTRACT = 0x800B;
    public static final int BLEND_DST_RGB = 0x80C8;
    public static final int BLEND_SRC_RGB = 0x80C9;
    public static final int BLEND_DST_ALPHA = 0x80CA;
    public static final int BLEND_SRC_ALPHA = 0x80CB;
    public static final int CONSTANT_COLOR = 0x8001;
    public static final int ONE_MINUS_CONSTANT_COLOR = 0x8002;
    public static final int CONSTANT_ALPHA = 0x8003;
    public static final int ONE_MINUS_CONSTANT_ALPHA = 0x8004;
    public static final int BLEND_COLOR = 0x8005;
    public static final int ARRAY_BUFFER = 0x8892;
    public static final int ELEMENT_ARRAY_BUFFER = 0x8893;
    public static final int ARRAY_BUFFER_BINDING = 0x8894;
    public static final int ELEMENT_ARRAY_BUFFER_BINDING = 0x8895;
    public static final int STREAM_DRAW = 0x88E0;
    public static final int STATIC_DRAW = 0x88E4;
    public static final int DYNAMIC_DRAW = 0x88E8;
    public static final int BUFFER_SIZE = 0x8764;
    public static final int BUFFER_USAGE = 0x8765;
    public static final int CURRENT_VERTEX_ATTRIB = 0x8626;
    public static final int FRONT = 0x0404;
    public static final int BACK = 0x0405;
    public static final int FRONT_AND_BACK = 0x0408;
    public static final int TEXTURE_2D = 0x0DE1;
    public static final int CULL_FACE = 0x0B44;
    public static final int BLEND = 0x0BE2;
    public static final int DITHER = 0x0BD0;
    public static final int STENCIL_TEST = 0x0B90;
    public static final int DEPTH_TEST = 0x0B71;
    public static final int SCISSOR_TEST = 0x0C11;
    public static final int POLYGON_OFFSET_FILL = 0x8037;
    public static final int SAMPLE_ALPHA_TO_COVERAGE = 0x809E;
    public static final int SAMPLE_COVERAGE = 0x80A0;
    public static final int NO_ERROR = 0;
    public static final int INVALID_ENUM = 0x0500;
    public static final int INVALID_VALUE = 0x0501;
    public static final int INVALID_OPERATION = 0x0502;
    public static final int OUT_OF_MEMORY = 0x0505;
    public static final int CW = 0x0900;
    public static final int CCW = 0x0901;
    public static final int LINE_WIDTH = 0x0B21;
    public static final int ALIASED_POINT_SIZE_RANGE = 0x846D;
    public static final int ALIASED_LINE_WIDTH_RANGE = 0x846E;
    public static final int CULL_FACE_MODE = 0x0B45;
    public static final int FRONT_FACE = 0x0B46;
    public static final int DEPTH_RANGE = 0x0B70;
    public static final int DEPTH_WRITEMASK = 0x0B72;
    public static final int DEPTH_CLEAR_VALUE = 0x0B73;
    public static final int DEPTH_FUNC = 0x0B74;
    public static final int STENCIL_CLEAR_VALUE = 0x0B91;
    public static final int STENCIL_FUNC = 0x0B92;
    public static final int STENCIL_FAIL = 0x0B94;
    public static final int STENCIL_PASS_DEPTH_FAIL = 0x0B95;
    public static final int STENCIL_PASS_DEPTH_PASS = 0x0B96;
    public static final int STENCIL_REF = 0x0B97;
    public static final int STENCIL_VALUE_MASK = 0x0B93;
    public static final int STENCIL_WRITEMASK = 0x0B98;
    public static final int STENCIL_BACK_FUNC = 0x8800;
    public static final int STENCIL_BACK_FAIL = 0x8801;
    public static final int STENCIL_BACK_PASS_DEPTH_FAIL = 0x8802;
    public static final int STENCIL_BACK_PASS_DEPTH_PASS = 0x8803;
    public static final int STENCIL_BACK_REF = 0x8CA3;
    public static final int STENCIL_BACK_VALUE_MASK = 0x8CA4;
    public static final int STENCIL_BACK_WRITEMASK = 0x8CA5;
    public static final int VIEWPORT = 0x0BA2;
    public static final int SCISSOR_BOX = 0x0C10;
    public static final int COLOR_CLEAR_VALUE = 0x0C22;
    public static final int COLOR_WRITEMASK = 0x0C23;
    public static final int UNPACK_ALIGNMENT = 0x0CF5;
    public static final int PACK_ALIGNMENT = 0x0D05;
    public static final int MAX_TEXTURE_SIZE = 0x0D33;
    public static final int MAX_VIEWPORT_DIMS = 0x0D3A;
    public static final int SUBPIXEL_BITS = 0x0D50;
    public static final int RED_BITS = 0x0D52;
    public static final int GREEN_BITS = 0x0D53;
    public static final int BLUE_BITS = 0x0D54;
    public static final int ALPHA_BITS = 0x0D55;
    public static final int DEPTH_BITS = 0x0D56;
    public static final int STENCIL_BITS = 0x0D57;
    public static final int POLYGON_OFFSET_UNITS = 0x2A00;
    public static final int POLYGON_OFFSET_FACTOR = 0x8038;
    public static final int TEXTURE_BINDING_2D = 0x8069;
    public static final int SAMPLE_BUFFERS = 0x80A8;
    public static final int SAMPLES = 0x80A9;
    public static final int SAMPLE_COVERAGE_VALUE = 0x80AA;
    public static final int SAMPLE_COVERAGE_INVERT = 0x80AB;
    public static final int COMPRESSED_TEXTURE_FORMATS = 0x86A3;
    public static final int DONT_CARE = 0x1100;
    public static final int FASTEST = 0x1101;
    public static final int NICEST = 0x1102;
    public static final int GENERATE_MIPMAP_HINT = 0x8192;
    public static final int BYTE = 0x1400;
    public static final int UNSIGNED_BYTE = 0x1401;
    public static final int SHORT = 0x1402;
    public static final int UNSIGNED_SHORT = 0x1403;
    public static final int INT = 0x1404;
    public static final int UNSIGNED_INT = 0x1405;
    public static final int FLOAT = 0x1406;
    public static final int DEPTH_COMPONENT = 0x1902;
    public static final int ALPHA = 0x1906;
    public static final int RGB = 0x1907;
    public static final int RGBA = 0x1908;
    public static final int LUMINANCE = 0x1909;
    public static final int LUMINANCE_ALPHA = 0x190A;
    public static final int UNSIGNED_SHORT_4_4_4_4 = 0x8033;
    public static final int UNSIGNED_SHORT_5_5_5_1 = 0x8034;
    public static final int UNSIGNED_SHORT_5_6_5 = 0x8363;
    public static final int FRAGMENT_SHADER = 0x8B30;
    public static final int VERTEX_SHADER = 0x8B31;
    public static final int MAX_VERTEX_ATTRIBS = 0x8869;
    public static final int MAX_VERTEX_UNIFORM_VECTORS = 0x8DFB;
    public static final int MAX_VARYING_VECTORS = 0x8DFC;
    public static final int MAX_COMBINED_TEXTURE_IMAGE_UNITS = 0x8B4D;
    public static final int MAX_VERTEX_TEXTURE_IMAGE_UNITS = 0x8B4C;
    public static final int MAX_TEXTURE_IMAGE_UNITS = 0x8872;
    public static final int MAX_FRAGMENT_UNIFORM_VECTORS = 0x8DFD;
    public static final int SHADER_TYPE = 0x8B4F;
    public static final int DELETE_STATUS = 0x8B80;
    public static final int LINK_STATUS = 0x8B82;
    public static final int VALIDATE_STATUS = 0x8B83;
    public static final int ATTACHED_SHADERS = 0x8B85;
    public static final int ACTIVE_UNIFORMS = 0x8B86;
    public static final int ACTIVE_ATTRIBUTES = 0x8B89;
    public static final int SHADING_LANGUAGE_VERSION = 0x8B8C;
    public static final int CURRENT_PROGRAM = 0x8B8D;
    public static final int NEVER = 0x0200;
    public static final int LESS = 0x0201;
    public static final int EQUAL = 0x0202;
    public static final int LEQUAL = 0x0203;
    public static final int GREATER = 0x0204;
    public static final int NOTEQUAL = 0x0205;
    public static final int GEQUAL = 0x0206;
    public static final int ALWAYS = 0x0207;
    public static final int KEEP = 0x1E00;
    public static final int REPLACE = 0x1E01;
    public static final int INCR = 0x1E02;
    public static final int DECR = 0x1E03;
    public static final int INVERT = 0x150A;
    public static final int INCR_WRAP = 0x8507;
    public static final int DECR_WRAP = 0x8508;
    public static final int VENDOR = 0x1F00;
    public static final int RENDERER = 0x1F01;
    public static final int VERSION = 0x1F02;
    public static final int NEAREST = 0x2600;
    public static final int LINEAR = 0x2601;
    public static final int NEAREST_MIPMAP_NEAREST = 0x2700;
    public static final int LINEAR_MIPMAP_NEAREST = 0x2701;
    public static final int NEAREST_MIPMAP_LINEAR = 0x2702;
    public static final int LINEAR_MIPMAP_LINEAR = 0x2703;
    public static final int TEXTURE_MAG_FILTER = 0x2800;
    public static final int TEXTURE_MIN_FILTER = 0x2801;
    public static final int TEXTURE_WRAP_S = 0x2802;
    public static final int TEXTURE_WRAP_T = 0x2803;
    public static final int TEXTURE = 0x1702;
    public static final int TEXTURE_CUBE_MAP = 0x8513;
    public static final int TEXTURE_BINDING_CUBE_MAP = 0x8514;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_X = 0x8516;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_Y = 0x8517;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_Y = 0x8518;
    public static final int TEXTURE_CUBE_MAP_POSITIVE_Z = 0x8519;
    public static final int TEXTURE_CUBE_MAP_NEGATIVE_Z = 0x851A;
    public static final int MAX_CUBE_MAP_TEXTURE_SIZE = 0x851C;
    public static final int TEXTURE0 = 0x84C0;
    public static final int TEXTURE1 = 0x84C1;
    public static final int TEXTURE2 = 0x84C2;
    public static final int TEXTURE3 = 0x84C3;
    public static final int TEXTURE4 = 0x84C4;
    public static final int TEXTURE5 = 0x84C5;
    public static final int TEXTURE6 = 0x84C6;
    public static final int TEXTURE7 = 0x84C7;
    public static final int TEXTURE8 = 0x84C8;
    public static final int TEXTURE9 = 0x84C9;
    public static final int TEXTURE10 = 0x84CA;
    public static final int TEXTURE11 = 0x84CB;
    public static final int TEXTURE12 = 0x84CC;
    public static final int TEXTURE13 = 0x84CD;
    public static final int TEXTURE14 = 0x84CE;
    public static final int TEXTURE15 = 0x84CF;
    public static final int TEXTURE16 = 0x84D0;
    public static final int TEXTURE17 = 0x84D1;
    public static final int TEXTURE18 = 0x84D2;
    public static final int TEXTURE19 = 0x84D3;
    public static final int TEXTURE20 = 0x84D4;
    public static final int TEXTURE21 = 0x84D5;
    public static final int TEXTURE22 = 0x84D6;
    public static final int TEXTURE23 = 0x84D7;
    public static final int TEXTURE24 = 0x84D8;
    public static final int TEXTURE25 = 0x84D9;
    public static final int TEXTURE26 = 0x84DA;
    public static final int TEXTURE27 = 0x84DB;
    public static final int TEXTURE28 = 0x84DC;
    public static final int TEXTURE29 = 0x84DD;
    public static final int TEXTURE30 = 0x84DE;
    public static final int TEXTURE31 = 0x84DF;
    public static final int ACTIVE_TEXTURE = 0x84E0;
    public static final int REPEAT = 0x2901;
    public static final int CLAMP_TO_EDGE = 0x812F;
    public static final int MIRRORED_REPEAT = 0x8370;
    public static final int FLOAT_VEC2 = 0x8B50;
    public static final int FLOAT_VEC3 = 0x8B51;
    public static final int FLOAT_VEC4 = 0x8B52;
    public static final int INT_VEC2 = 0x8B53;
    public static final int INT_VEC3 = 0x8B54;
    public static final int INT_VEC4 = 0x8B55;
    public static final int BOOL = 0x8B56;
    public static final int BOOL_VEC2 = 0x8B57;
    public static final int BOOL_VEC3 = 0x8B58;
    public static final int BOOL_VEC4 = 0x8B59;
    public static final int FLOAT_MAT2 = 0x8B5A;
    public static final int FLOAT_MAT3 = 0x8B5B;
    public static final int FLOAT_MAT4 = 0x8B5C;
    public static final int SAMPLER_2D = 0x8B5E;
    public static final int SAMPLER_CUBE = 0x8B60;
    public static final int VERTEX_ATTRIB_ARRAY_ENABLED = 0x8622;
    public static final int VERTEX_ATTRIB_ARRAY_SIZE = 0x8623;
    public static final int VERTEX_ATTRIB_ARRAY_STRIDE = 0x8624;
    public static final int VERTEX_ATTRIB_ARRAY_TYPE = 0x8625;
    public static final int VERTEX_ATTRIB_ARRAY_NORMALIZED = 0x886A;
    public static final int VERTEX_ATTRIB_ARRAY_POINTER = 0x8645;
    public static final int VERTEX_ATTRIB_ARRAY_BUFFER_BINDING = 0x889F;
    public static final int IMPLEMENTATION_COLOR_READ_TYPE = 0x8B9A;
    public static final int IMPLEMENTATION_COLOR_READ_FORMAT = 0x8B9B;
    public static final int COMPILE_STATUS = 0x8B81;
    public static final int LOW_FLOAT = 0x8DF0;
    public static final int MEDIUM_FLOAT = 0x8DF1;
    public static final int HIGH_FLOAT = 0x8DF2;
    public static final int LOW_INT = 0x8DF3;
    public static final int MEDIUM_INT = 0x8DF4;
    public static final int HIGH_INT = 0x8DF5;
    public static final int FRAMEBUFFER = 0x8D40;
    public static final int RENDERBUFFER = 0x8D41;
    public static final int RGBA4 = 0x8056;
    public static final int RGB5_A1 = 0x8057;
    public static final int RGB565 = 0x8D62;
    public static final int DEPTH_COMPONENT16 = 0x81A5;
    public static final int STENCIL_INDEX8 = 0x8D48;
    public static final int DEPTH_STENCIL = 0x84F9;
    public static final int RENDERBUFFER_WIDTH = 0x8D42;
    public static final int RENDERBUFFER_HEIGHT = 0x8D43;
    public static final int RENDERBUFFER_INTERNAL_FORMAT = 0x8D44;
    public static final int RENDERBUFFER_RED_SIZE = 0x8D50;
    public static final int RENDERBUFFER_GREEN_SIZE = 0x8D51;
    public static final int RENDERBUFFER_BLUE_SIZE = 0x8D52;
    public static final int RENDERBUFFER_ALPHA_SIZE = 0x8D53;
    public static final int RENDERBUFFER_DEPTH_SIZE = 0x8D54;
    public static final int RENDERBUFFER_STENCIL_SIZE = 0x8D55;
    public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE = 0x8CD0;
    public static final int FRAMEBUFFER_ATTACHMENT_OBJECT_NAME = 0x8CD1;
    public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL = 0x8CD2;
    public static final int FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE = 0x8CD3;
    public static final int COLOR_ATTACHMENT0 = 0x8CE0;
    public static final int DEPTH_ATTACHMENT = 0x8D00;
    public static final int STENCIL_ATTACHMENT = 0x8D20;
    public static final int DEPTH_STENCIL_ATTACHMENT = 0x821A;
    public static final int NONE = 0;
    public static final int FRAMEBUFFER_COMPLETE = 0x8CD5;
    public static final int FRAMEBUFFER_INCOMPLETE_ATTACHMENT = 0x8CD6;
    public static final int FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT = 0x8CD7;
    public static final int FRAMEBUFFER_INCOMPLETE_DIMENSIONS = 0x8CD9;
    public static final int FRAMEBUFFER_UNSUPPORTED = 0x8CDD;
    public static final int FRAMEBUFFER_BINDING = 0x8CA6;
    public static final int RENDERBUFFER_BINDING = 0x8CA7;
    public static final int MAX_RENDERBUFFER_SIZE = 0x84E8;
    public static final int INVALID_FRAMEBUFFER_OPERATION = 0x0506;
    public static final int UNPACK_FLIP_Y_WEBGL = 0x9240;
    public static final int UNPACK_PREMULTIPLY_ALPHA_WEBGL = 0x9241;
    public static final int CONTEXT_LOST_WEBGL = 0x9242;
    public static final int UNPACK_COLORSPACE_CONVERSION_WEBGL = 0x9243;
    public static final int BROWSER_DEFAULT_WEBGL = 0x9244;
    
    
    @JsProperty(name="canvas")
    public native WebGL2RenderingContext.HTMLCanvasElementOrOffscreenCanvasUnionType getCanvas();
    
    @JsProperty(name="drawingBufferWidth")
    public native long getDrawingBufferWidth();
    
    @JsProperty(name="drawingBufferHeight")
    public native long getDrawingBufferHeight();
    
    @JsMethod(name = "activeTexture")
    public native void activeTexture(long texture);
    
    @JsMethod(name = "attachShader")
    public native void attachShader(WebGLProgram program, WebGLShader shader);
    
    @JsMethod(name = "bindAttribLocation")
    public native void bindAttribLocation(WebGLProgram program, long index, String name);
    
    @JsMethod(name = "bindBuffer")
    public native void bindBuffer(long target, WebGLBuffer buffer);
    
    @JsMethod(name = "bindFramebuffer")
    public native void bindFramebuffer(long target, WebGLFramebuffer framebuffer);
    
    @JsMethod(name = "bindRenderbuffer")
    public native void bindRenderbuffer(long target, WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "bindTexture")
    public native void bindTexture(long target, WebGLTexture texture);
    
    @JsMethod(name = "blendColor")
    public native void blendColor(float red, float green, float blue, float alpha);
    
    @JsMethod(name = "blendEquation")
    public native void blendEquation(long mode);
    
    @JsMethod(name = "blendEquationSeparate")
    public native void blendEquationSeparate(long modeRGB, long modeAlpha);
    
    @JsMethod(name = "blendFunc")
    public native void blendFunc(long sfactor, long dfactor);
    
    @JsMethod(name = "blendFuncSeparate")
    public native void blendFuncSeparate(long srcRGB, long dstRGB, long srcAlpha, long dstAlpha);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(long target, long size, long usage);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(long target, ArrayBufferView data, long usage);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(long target, ArrayBuffer data, long usage);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(long target, long offset, ArrayBufferView data);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(long target, long offset, ArrayBuffer data);
    
    @JsMethod(name = "checkFramebufferStatus")
    public native long checkFramebufferStatus(long target);
    
    @JsMethod(name = "clear")
    public native void clear(long mask);
    
    @JsMethod(name = "clearColor")
    public native void clearColor(float red, float green, float blue, float alpha);
    
    @JsMethod(name = "clearDepth")
    public native void clearDepth(float depth);
    
    @JsMethod(name = "clearStencil")
    public native void clearStencil(long s);
    
    @JsMethod(name = "colorMask")
    public native void colorMask(boolean red, boolean green, boolean blue, boolean alpha);
    
    @JsMethod(name = "commit")
    public native Promise commit();
    
    @JsMethod(name = "compileShader")
    public native void compileShader(WebGLShader shader);
    
    @JsMethod(name = "compressedTexImage2D")
    public native void compressedTexImage2D(long target, long level, long internalformat, long width, long height, long border, ArrayBufferView data);
    
    @JsMethod(name = "compressedTexSubImage2D")
    public native void compressedTexSubImage2D(long target, long level, long xoffset, long yoffset, long width, long height, long format, ArrayBufferView data);
    
    @JsMethod(name = "copyTexImage2D")
    public native void copyTexImage2D(long target, long level, long internalformat, long x, long y, long width, long height, long border);
    
    @JsMethod(name = "copyTexSubImage2D")
    public native void copyTexSubImage2D(long target, long level, long xoffset, long yoffset, long x, long y, long width, long height);
    
    @JsMethod(name = "createBuffer")
    public native WebGLBuffer createBuffer();
    
    @JsMethod(name = "createFramebuffer")
    public native WebGLFramebuffer createFramebuffer();
    
    @JsMethod(name = "createProgram")
    public native WebGLProgram createProgram();
    
    @JsMethod(name = "createRenderbuffer")
    public native WebGLRenderbuffer createRenderbuffer();
    
    @JsMethod(name = "createShader")
    public native WebGLShader createShader(long type);
    
    @JsMethod(name = "createTexture")
    public native WebGLTexture createTexture();
    
    @JsMethod(name = "cullFace")
    public native void cullFace(long mode);
    
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
    public native void depthFunc(long func);
    
    @JsMethod(name = "depthMask")
    public native void depthMask(boolean flag);
    
    @JsMethod(name = "depthRange")
    public native void depthRange(float zNear, float zFar);
    
    @JsMethod(name = "detachShader")
    public native void detachShader(WebGLProgram program, WebGLShader shader);
    
    @JsMethod(name = "disable")
    public native void disable(long cap);
    
    @JsMethod(name = "disableVertexAttribArray")
    public native void disableVertexAttribArray(long index);
    
    @JsMethod(name = "drawArrays")
    public native void drawArrays(long mode, long first, long count);
    
    @JsMethod(name = "drawElements")
    public native void drawElements(long mode, long count, long type, long offset);
    
    @JsMethod(name = "enable")
    public native void enable(long cap);
    
    @JsMethod(name = "enableVertexAttribArray")
    public native void enableVertexAttribArray(long index);
    
    @JsMethod(name = "finish")
    public native void finish();
    
    @JsMethod(name = "flush")
    public native void flush();
    
    @JsMethod(name = "framebufferRenderbuffer")
    public native void framebufferRenderbuffer(long target, long attachment, long renderbuffertarget, WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "framebufferTexture2D")
    public native void framebufferTexture2D(long target, long attachment, long textarget, WebGLTexture texture, long level);
    
    @JsMethod(name = "frontFace")
    public native void frontFace(long mode);
    
    @JsMethod(name = "generateMipmap")
    public native void generateMipmap(long target);
    
    @JsMethod(name = "getActiveAttrib")
    public native WebGLActiveInfo getActiveAttrib(WebGLProgram program, long index);
    
    @JsMethod(name = "getActiveUniform")
    public native WebGLActiveInfo getActiveUniform(WebGLProgram program, long index);
    
    @JsMethod(name = "getAttachedShaders")
    public native WebGLShader[] getAttachedShaders(WebGLProgram program);
    
    @JsMethod(name = "getAttribLocation")
    public native long getAttribLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getBufferParameter")
    public native Any getBufferParameter(long target, long pname);
    
    @JsMethod(name = "getContextAttributes")
    public native WebGLContextAttributes getContextAttributes();
    
    @JsMethod(name = "getError")
    public native long getError();
    
    @JsMethod(name = "getExtension")
    public native Object getExtension(String name);
    
    @JsMethod(name = "getFramebufferAttachmentParameter")
    public native Any getFramebufferAttachmentParameter(long target, long attachment, long pname);
    
    @JsMethod(name = "getParameter")
    public native Any getParameter(long pname);
    
    @JsMethod(name = "getProgramInfoLog")
    public native String getProgramInfoLog(WebGLProgram program);
    
    @JsMethod(name = "getProgramParameter")
    public native Any getProgramParameter(WebGLProgram program, long pname);
    
    @JsMethod(name = "getRenderbufferParameter")
    public native Any getRenderbufferParameter(long target, long pname);
    
    @JsMethod(name = "getShaderInfoLog")
    public native String getShaderInfoLog(WebGLShader shader);
    
    @JsMethod(name = "getShaderParameter")
    public native Any getShaderParameter(WebGLShader shader, long pname);
    
    @JsMethod(name = "getShaderPrecisionFormat")
    public native WebGLShaderPrecisionFormat getShaderPrecisionFormat(long shadertype, long precisiontype);
    
    @JsMethod(name = "getShaderSource")
    public native String getShaderSource(WebGLShader shader);
    
    @JsMethod(name = "getSupportedExtensions")
    public native String[] getSupportedExtensions();
    
    @JsMethod(name = "getTexParameter")
    public native Any getTexParameter(long target, long pname);
    
    @JsMethod(name = "getUniform")
    public native Any getUniform(WebGLProgram program, WebGLUniformLocation location);
    
    @JsMethod(name = "getUniformLocation")
    public native WebGLUniformLocation getUniformLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getVertexAttrib")
    public native Any getVertexAttrib(long index, long pname);
    
    @JsMethod(name = "getVertexAttribOffset")
    public native long getVertexAttribOffset(long index, long pname);
    
    @JsMethod(name = "hint")
    public native void hint(long target, long mode);
    
    @JsMethod(name = "isBuffer")
    public native boolean isBuffer(WebGLBuffer buffer);
    
    @JsMethod(name = "isContextLost")
    public native boolean isContextLost();
    
    @JsMethod(name = "isEnabled")
    public native boolean isEnabled(long cap);
    
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
    public native void pixelStorei(long pname, long param);
    
    @JsMethod(name = "polygonOffset")
    public native void polygonOffset(float factor, float units);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(long x, long y, long width, long height, long format, long type, ArrayBufferView pixels);
    
    @JsMethod(name = "renderbufferStorage")
    public native void renderbufferStorage(long target, long internalformat, long width, long height);
    
    @JsMethod(name = "sampleCoverage")
    public native void sampleCoverage(float value, boolean invert);
    
    @JsMethod(name = "scissor")
    public native void scissor(long x, long y, long width, long height);
    
    @JsMethod(name = "shaderSource")
    public native void shaderSource(WebGLShader shader, String string);
    
    @JsMethod(name = "stencilFunc")
    public native void stencilFunc(long func, long ref, long mask);
    
    @JsMethod(name = "stencilFuncSeparate")
    public native void stencilFuncSeparate(long face, long func, long ref, long mask);
    
    @JsMethod(name = "stencilMask")
    public native void stencilMask(long mask);
    
    @JsMethod(name = "stencilMaskSeparate")
    public native void stencilMaskSeparate(long face, long mask);
    
    @JsMethod(name = "stencilOp")
    public native void stencilOp(long fail, long zfail, long zpass);
    
    @JsMethod(name = "stencilOpSeparate")
    public native void stencilOpSeparate(long face, long fail, long zfail, long zpass);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(long target, long level, long internalformat, long format, long type, ImageData pixels);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(long target, long level, long internalformat, long format, long type, HTMLImageElement image);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(long target, long level, long internalformat, long format, long type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(long target, long level, long internalformat, long format, long type, HTMLVideoElement video);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(long target, long level, long internalformat, long format, long type, ImageBitmap bitmap);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(long target, long level, long internalformat, long width, long height, long border, long format, long type, ArrayBufferView pixels);
    
    @JsMethod(name = "texParameterf")
    public native void texParameterf(long target, long pname, float param);
    
    @JsMethod(name = "texParameteri")
    public native void texParameteri(long target, long pname, long param);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(long target, long level, long xoffset, long yoffset, long format, long type, ImageData pixels);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(long target, long level, long xoffset, long yoffset, long format, long type, HTMLImageElement image);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(long target, long level, long xoffset, long yoffset, long format, long type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(long target, long level, long xoffset, long yoffset, long format, long type, HTMLVideoElement video);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(long target, long level, long xoffset, long yoffset, long format, long type, ImageBitmap bitmap);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(long target, long level, long xoffset, long yoffset, long width, long height, long format, long type, ArrayBufferView pixels);
    
    @JsMethod(name = "uniform1f")
    public native void uniform1f(WebGLUniformLocation location, float x);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform1i")
    public native void uniform1i(WebGLUniformLocation location, long x);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, long[] v);
    
    @JsMethod(name = "uniform2f")
    public native void uniform2f(WebGLUniformLocation location, float x, float y);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform2i")
    public native void uniform2i(WebGLUniformLocation location, long x, long y);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, long[] v);
    
    @JsMethod(name = "uniform3f")
    public native void uniform3f(WebGLUniformLocation location, float x, float y, float z);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform3i")
    public native void uniform3i(WebGLUniformLocation location, long x, long y, long z);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, long[] v);
    
    @JsMethod(name = "uniform4f")
    public native void uniform4f(WebGLUniformLocation location, float x, float y, float z, float w);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform4i")
    public native void uniform4i(WebGLUniformLocation location, long x, long y, long z, long w);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, long[] v);
    
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
    public native void vertexAttrib1f(long indx, float x);
    
    @JsMethod(name = "vertexAttrib1fv")
    public native void vertexAttrib1fv(long indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib1fv")
    public native void vertexAttrib1fv(long indx, float[] values);
    
    @JsMethod(name = "vertexAttrib2f")
    public native void vertexAttrib2f(long indx, float x, float y);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(long indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(long indx, float[] values);
    
    @JsMethod(name = "vertexAttrib3f")
    public native void vertexAttrib3f(long indx, float x, float y, float z);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(long indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(long indx, float[] values);
    
    @JsMethod(name = "vertexAttrib4f")
    public native void vertexAttrib4f(long indx, float x, float y, float z, float w);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(long indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(long indx, float[] values);
    
    @JsMethod(name = "vertexAttribPointer")
    public native void vertexAttribPointer(long indx, long size, long type, boolean normalized, long stride, long offset);
    
    @JsMethod(name = "viewport")
    public native void viewport(long x, long y, long width, long height);
    
}
