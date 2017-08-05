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

import gwt.jelement.core.Array;
import gwt.jelement.core.ArrayBuffer;
import gwt.jelement.core.ArrayBufferView;
import gwt.jelement.core.Float32Array;
import gwt.jelement.core.Int32Array;
import gwt.jelement.core.IsObject;
import gwt.jelement.core.Js;
import gwt.jelement.core.Promise;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Any;

@JsType(namespace = JsPackage.GLOBAL, name="WebGLRenderingContext", isNative = true)
public class WebGLRenderingContext extends IsObject{
    public static double DEPTH_BUFFER_BIT; /* 0x00000100 */
    public static double STENCIL_BUFFER_BIT; /* 0x00000400 */
    public static double COLOR_BUFFER_BIT; /* 0x00004000 */
    public static double POINTS; /* 0x0000 */
    public static double LINES; /* 0x0001 */
    public static double LINE_LOOP; /* 0x0002 */
    public static double LINE_STRIP; /* 0x0003 */
    public static double TRIANGLES; /* 0x0004 */
    public static double TRIANGLE_STRIP; /* 0x0005 */
    public static double TRIANGLE_FAN; /* 0x0006 */
    public static double ZERO; /* 0 */
    public static double ONE; /* 1 */
    public static double SRC_COLOR; /* 0x0300 */
    public static double ONE_MINUS_SRC_COLOR; /* 0x0301 */
    public static double SRC_ALPHA; /* 0x0302 */
    public static double ONE_MINUS_SRC_ALPHA; /* 0x0303 */
    public static double DST_ALPHA; /* 0x0304 */
    public static double ONE_MINUS_DST_ALPHA; /* 0x0305 */
    public static double DST_COLOR; /* 0x0306 */
    public static double ONE_MINUS_DST_COLOR; /* 0x0307 */
    public static double SRC_ALPHA_SATURATE; /* 0x0308 */
    public static double FUNC_ADD; /* 0x8006 */
    public static double BLEND_EQUATION; /* 0x8009 */
    public static double BLEND_EQUATION_RGB; /* 0x8009 */
    public static double BLEND_EQUATION_ALPHA; /* 0x883D */
    public static double FUNC_SUBTRACT; /* 0x800A */
    public static double FUNC_REVERSE_SUBTRACT; /* 0x800B */
    public static double BLEND_DST_RGB; /* 0x80C8 */
    public static double BLEND_SRC_RGB; /* 0x80C9 */
    public static double BLEND_DST_ALPHA; /* 0x80CA */
    public static double BLEND_SRC_ALPHA; /* 0x80CB */
    public static double CONSTANT_COLOR; /* 0x8001 */
    public static double ONE_MINUS_CONSTANT_COLOR; /* 0x8002 */
    public static double CONSTANT_ALPHA; /* 0x8003 */
    public static double ONE_MINUS_CONSTANT_ALPHA; /* 0x8004 */
    public static double BLEND_COLOR; /* 0x8005 */
    public static double ARRAY_BUFFER; /* 0x8892 */
    public static double ELEMENT_ARRAY_BUFFER; /* 0x8893 */
    public static double ARRAY_BUFFER_BINDING; /* 0x8894 */
    public static double ELEMENT_ARRAY_BUFFER_BINDING; /* 0x8895 */
    public static double STREAM_DRAW; /* 0x88E0 */
    public static double STATIC_DRAW; /* 0x88E4 */
    public static double DYNAMIC_DRAW; /* 0x88E8 */
    public static double BUFFER_SIZE; /* 0x8764 */
    public static double BUFFER_USAGE; /* 0x8765 */
    public static double CURRENT_VERTEX_ATTRIB; /* 0x8626 */
    public static double FRONT; /* 0x0404 */
    public static double BACK; /* 0x0405 */
    public static double FRONT_AND_BACK; /* 0x0408 */
    public static double TEXTURE_2D; /* 0x0DE1 */
    public static double CULL_FACE; /* 0x0B44 */
    public static double BLEND; /* 0x0BE2 */
    public static double DITHER; /* 0x0BD0 */
    public static double STENCIL_TEST; /* 0x0B90 */
    public static double DEPTH_TEST; /* 0x0B71 */
    public static double SCISSOR_TEST; /* 0x0C11 */
    public static double POLYGON_OFFSET_FILL; /* 0x8037 */
    public static double SAMPLE_ALPHA_TO_COVERAGE; /* 0x809E */
    public static double SAMPLE_COVERAGE; /* 0x80A0 */
    public static double NO_ERROR; /* 0 */
    public static double INVALID_ENUM; /* 0x0500 */
    public static double INVALID_VALUE; /* 0x0501 */
    public static double INVALID_OPERATION; /* 0x0502 */
    public static double OUT_OF_MEMORY; /* 0x0505 */
    public static double CW; /* 0x0900 */
    public static double CCW; /* 0x0901 */
    public static double LINE_WIDTH; /* 0x0B21 */
    public static double ALIASED_POINT_SIZE_RANGE; /* 0x846D */
    public static double ALIASED_LINE_WIDTH_RANGE; /* 0x846E */
    public static double CULL_FACE_MODE; /* 0x0B45 */
    public static double FRONT_FACE; /* 0x0B46 */
    public static double DEPTH_RANGE; /* 0x0B70 */
    public static double DEPTH_WRITEMASK; /* 0x0B72 */
    public static double DEPTH_CLEAR_VALUE; /* 0x0B73 */
    public static double DEPTH_FUNC; /* 0x0B74 */
    public static double STENCIL_CLEAR_VALUE; /* 0x0B91 */
    public static double STENCIL_FUNC; /* 0x0B92 */
    public static double STENCIL_FAIL; /* 0x0B94 */
    public static double STENCIL_PASS_DEPTH_FAIL; /* 0x0B95 */
    public static double STENCIL_PASS_DEPTH_PASS; /* 0x0B96 */
    public static double STENCIL_REF; /* 0x0B97 */
    public static double STENCIL_VALUE_MASK; /* 0x0B93 */
    public static double STENCIL_WRITEMASK; /* 0x0B98 */
    public static double STENCIL_BACK_FUNC; /* 0x8800 */
    public static double STENCIL_BACK_FAIL; /* 0x8801 */
    public static double STENCIL_BACK_PASS_DEPTH_FAIL; /* 0x8802 */
    public static double STENCIL_BACK_PASS_DEPTH_PASS; /* 0x8803 */
    public static double STENCIL_BACK_REF; /* 0x8CA3 */
    public static double STENCIL_BACK_VALUE_MASK; /* 0x8CA4 */
    public static double STENCIL_BACK_WRITEMASK; /* 0x8CA5 */
    public static double VIEWPORT; /* 0x0BA2 */
    public static double SCISSOR_BOX; /* 0x0C10 */
    public static double COLOR_CLEAR_VALUE; /* 0x0C22 */
    public static double COLOR_WRITEMASK; /* 0x0C23 */
    public static double UNPACK_ALIGNMENT; /* 0x0CF5 */
    public static double PACK_ALIGNMENT; /* 0x0D05 */
    public static double MAX_TEXTURE_SIZE; /* 0x0D33 */
    public static double MAX_VIEWPORT_DIMS; /* 0x0D3A */
    public static double SUBPIXEL_BITS; /* 0x0D50 */
    public static double RED_BITS; /* 0x0D52 */
    public static double GREEN_BITS; /* 0x0D53 */
    public static double BLUE_BITS; /* 0x0D54 */
    public static double ALPHA_BITS; /* 0x0D55 */
    public static double DEPTH_BITS; /* 0x0D56 */
    public static double STENCIL_BITS; /* 0x0D57 */
    public static double POLYGON_OFFSET_UNITS; /* 0x2A00 */
    public static double POLYGON_OFFSET_FACTOR; /* 0x8038 */
    public static double TEXTURE_BINDING_2D; /* 0x8069 */
    public static double SAMPLE_BUFFERS; /* 0x80A8 */
    public static double SAMPLES; /* 0x80A9 */
    public static double SAMPLE_COVERAGE_VALUE; /* 0x80AA */
    public static double SAMPLE_COVERAGE_INVERT; /* 0x80AB */
    public static double COMPRESSED_TEXTURE_FORMATS; /* 0x86A3 */
    public static double DONT_CARE; /* 0x1100 */
    public static double FASTEST; /* 0x1101 */
    public static double NICEST; /* 0x1102 */
    public static double GENERATE_MIPMAP_HINT; /* 0x8192 */
    public static double BYTE; /* 0x1400 */
    public static double UNSIGNED_BYTE; /* 0x1401 */
    public static double SHORT; /* 0x1402 */
    public static double UNSIGNED_SHORT; /* 0x1403 */
    public static double INT; /* 0x1404 */
    public static double UNSIGNED_INT; /* 0x1405 */
    public static double FLOAT; /* 0x1406 */
    public static double DEPTH_COMPONENT; /* 0x1902 */
    public static double ALPHA; /* 0x1906 */
    public static double RGB; /* 0x1907 */
    public static double RGBA; /* 0x1908 */
    public static double LUMINANCE; /* 0x1909 */
    public static double LUMINANCE_ALPHA; /* 0x190A */
    public static double UNSIGNED_SHORT_4_4_4_4; /* 0x8033 */
    public static double UNSIGNED_SHORT_5_5_5_1; /* 0x8034 */
    public static double UNSIGNED_SHORT_5_6_5; /* 0x8363 */
    public static double FRAGMENT_SHADER; /* 0x8B30 */
    public static double VERTEX_SHADER; /* 0x8B31 */
    public static double MAX_VERTEX_ATTRIBS; /* 0x8869 */
    public static double MAX_VERTEX_UNIFORM_VECTORS; /* 0x8DFB */
    public static double MAX_VARYING_VECTORS; /* 0x8DFC */
    public static double MAX_COMBINED_TEXTURE_IMAGE_UNITS; /* 0x8B4D */
    public static double MAX_VERTEX_TEXTURE_IMAGE_UNITS; /* 0x8B4C */
    public static double MAX_TEXTURE_IMAGE_UNITS; /* 0x8872 */
    public static double MAX_FRAGMENT_UNIFORM_VECTORS; /* 0x8DFD */
    public static double SHADER_TYPE; /* 0x8B4F */
    public static double DELETE_STATUS; /* 0x8B80 */
    public static double LINK_STATUS; /* 0x8B82 */
    public static double VALIDATE_STATUS; /* 0x8B83 */
    public static double ATTACHED_SHADERS; /* 0x8B85 */
    public static double ACTIVE_UNIFORMS; /* 0x8B86 */
    public static double ACTIVE_ATTRIBUTES; /* 0x8B89 */
    public static double SHADING_LANGUAGE_VERSION; /* 0x8B8C */
    public static double CURRENT_PROGRAM; /* 0x8B8D */
    public static double NEVER; /* 0x0200 */
    public static double LESS; /* 0x0201 */
    public static double EQUAL; /* 0x0202 */
    public static double LEQUAL; /* 0x0203 */
    public static double GREATER; /* 0x0204 */
    public static double NOTEQUAL; /* 0x0205 */
    public static double GEQUAL; /* 0x0206 */
    public static double ALWAYS; /* 0x0207 */
    public static double KEEP; /* 0x1E00 */
    public static double REPLACE; /* 0x1E01 */
    public static double INCR; /* 0x1E02 */
    public static double DECR; /* 0x1E03 */
    public static double INVERT; /* 0x150A */
    public static double INCR_WRAP; /* 0x8507 */
    public static double DECR_WRAP; /* 0x8508 */
    public static double VENDOR; /* 0x1F00 */
    public static double RENDERER; /* 0x1F01 */
    public static double VERSION; /* 0x1F02 */
    public static double NEAREST; /* 0x2600 */
    public static double LINEAR; /* 0x2601 */
    public static double NEAREST_MIPMAP_NEAREST; /* 0x2700 */
    public static double LINEAR_MIPMAP_NEAREST; /* 0x2701 */
    public static double NEAREST_MIPMAP_LINEAR; /* 0x2702 */
    public static double LINEAR_MIPMAP_LINEAR; /* 0x2703 */
    public static double TEXTURE_MAG_FILTER; /* 0x2800 */
    public static double TEXTURE_MIN_FILTER; /* 0x2801 */
    public static double TEXTURE_WRAP_S; /* 0x2802 */
    public static double TEXTURE_WRAP_T; /* 0x2803 */
    public static double TEXTURE; /* 0x1702 */
    public static double TEXTURE_CUBE_MAP; /* 0x8513 */
    public static double TEXTURE_BINDING_CUBE_MAP; /* 0x8514 */
    public static double TEXTURE_CUBE_MAP_POSITIVE_X; /* 0x8515 */
    public static double TEXTURE_CUBE_MAP_NEGATIVE_X; /* 0x8516 */
    public static double TEXTURE_CUBE_MAP_POSITIVE_Y; /* 0x8517 */
    public static double TEXTURE_CUBE_MAP_NEGATIVE_Y; /* 0x8518 */
    public static double TEXTURE_CUBE_MAP_POSITIVE_Z; /* 0x8519 */
    public static double TEXTURE_CUBE_MAP_NEGATIVE_Z; /* 0x851A */
    public static double MAX_CUBE_MAP_TEXTURE_SIZE; /* 0x851C */
    public static double TEXTURE0; /* 0x84C0 */
    public static double TEXTURE1; /* 0x84C1 */
    public static double TEXTURE2; /* 0x84C2 */
    public static double TEXTURE3; /* 0x84C3 */
    public static double TEXTURE4; /* 0x84C4 */
    public static double TEXTURE5; /* 0x84C5 */
    public static double TEXTURE6; /* 0x84C6 */
    public static double TEXTURE7; /* 0x84C7 */
    public static double TEXTURE8; /* 0x84C8 */
    public static double TEXTURE9; /* 0x84C9 */
    public static double TEXTURE10; /* 0x84CA */
    public static double TEXTURE11; /* 0x84CB */
    public static double TEXTURE12; /* 0x84CC */
    public static double TEXTURE13; /* 0x84CD */
    public static double TEXTURE14; /* 0x84CE */
    public static double TEXTURE15; /* 0x84CF */
    public static double TEXTURE16; /* 0x84D0 */
    public static double TEXTURE17; /* 0x84D1 */
    public static double TEXTURE18; /* 0x84D2 */
    public static double TEXTURE19; /* 0x84D3 */
    public static double TEXTURE20; /* 0x84D4 */
    public static double TEXTURE21; /* 0x84D5 */
    public static double TEXTURE22; /* 0x84D6 */
    public static double TEXTURE23; /* 0x84D7 */
    public static double TEXTURE24; /* 0x84D8 */
    public static double TEXTURE25; /* 0x84D9 */
    public static double TEXTURE26; /* 0x84DA */
    public static double TEXTURE27; /* 0x84DB */
    public static double TEXTURE28; /* 0x84DC */
    public static double TEXTURE29; /* 0x84DD */
    public static double TEXTURE30; /* 0x84DE */
    public static double TEXTURE31; /* 0x84DF */
    public static double ACTIVE_TEXTURE; /* 0x84E0 */
    public static double REPEAT; /* 0x2901 */
    public static double CLAMP_TO_EDGE; /* 0x812F */
    public static double MIRRORED_REPEAT; /* 0x8370 */
    public static double FLOAT_VEC2; /* 0x8B50 */
    public static double FLOAT_VEC3; /* 0x8B51 */
    public static double FLOAT_VEC4; /* 0x8B52 */
    public static double INT_VEC2; /* 0x8B53 */
    public static double INT_VEC3; /* 0x8B54 */
    public static double INT_VEC4; /* 0x8B55 */
    public static double BOOL; /* 0x8B56 */
    public static double BOOL_VEC2; /* 0x8B57 */
    public static double BOOL_VEC3; /* 0x8B58 */
    public static double BOOL_VEC4; /* 0x8B59 */
    public static double FLOAT_MAT2; /* 0x8B5A */
    public static double FLOAT_MAT3; /* 0x8B5B */
    public static double FLOAT_MAT4; /* 0x8B5C */
    public static double SAMPLER_2D; /* 0x8B5E */
    public static double SAMPLER_CUBE; /* 0x8B60 */
    public static double VERTEX_ATTRIB_ARRAY_ENABLED; /* 0x8622 */
    public static double VERTEX_ATTRIB_ARRAY_SIZE; /* 0x8623 */
    public static double VERTEX_ATTRIB_ARRAY_STRIDE; /* 0x8624 */
    public static double VERTEX_ATTRIB_ARRAY_TYPE; /* 0x8625 */
    public static double VERTEX_ATTRIB_ARRAY_NORMALIZED; /* 0x886A */
    public static double VERTEX_ATTRIB_ARRAY_POINTER; /* 0x8645 */
    public static double VERTEX_ATTRIB_ARRAY_BUFFER_BINDING; /* 0x889F */
    public static double IMPLEMENTATION_COLOR_READ_TYPE; /* 0x8B9A */
    public static double IMPLEMENTATION_COLOR_READ_FORMAT; /* 0x8B9B */
    public static double COMPILE_STATUS; /* 0x8B81 */
    public static double LOW_FLOAT; /* 0x8DF0 */
    public static double MEDIUM_FLOAT; /* 0x8DF1 */
    public static double HIGH_FLOAT; /* 0x8DF2 */
    public static double LOW_INT; /* 0x8DF3 */
    public static double MEDIUM_INT; /* 0x8DF4 */
    public static double HIGH_INT; /* 0x8DF5 */
    public static double FRAMEBUFFER; /* 0x8D40 */
    public static double RENDERBUFFER; /* 0x8D41 */
    public static double RGBA4; /* 0x8056 */
    public static double RGB5_A1; /* 0x8057 */
    public static double RGB565; /* 0x8D62 */
    public static double DEPTH_COMPONENT16; /* 0x81A5 */
    public static double STENCIL_INDEX8; /* 0x8D48 */
    public static double DEPTH_STENCIL; /* 0x84F9 */
    public static double RENDERBUFFER_WIDTH; /* 0x8D42 */
    public static double RENDERBUFFER_HEIGHT; /* 0x8D43 */
    public static double RENDERBUFFER_INTERNAL_FORMAT; /* 0x8D44 */
    public static double RENDERBUFFER_RED_SIZE; /* 0x8D50 */
    public static double RENDERBUFFER_GREEN_SIZE; /* 0x8D51 */
    public static double RENDERBUFFER_BLUE_SIZE; /* 0x8D52 */
    public static double RENDERBUFFER_ALPHA_SIZE; /* 0x8D53 */
    public static double RENDERBUFFER_DEPTH_SIZE; /* 0x8D54 */
    public static double RENDERBUFFER_STENCIL_SIZE; /* 0x8D55 */
    public static double FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE; /* 0x8CD0 */
    public static double FRAMEBUFFER_ATTACHMENT_OBJECT_NAME; /* 0x8CD1 */
    public static double FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL; /* 0x8CD2 */
    public static double FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE; /* 0x8CD3 */
    public static double COLOR_ATTACHMENT0; /* 0x8CE0 */
    public static double DEPTH_ATTACHMENT; /* 0x8D00 */
    public static double STENCIL_ATTACHMENT; /* 0x8D20 */
    public static double DEPTH_STENCIL_ATTACHMENT; /* 0x821A */
    public static double NONE; /* 0 */
    public static double FRAMEBUFFER_COMPLETE; /* 0x8CD5 */
    public static double FRAMEBUFFER_INCOMPLETE_ATTACHMENT; /* 0x8CD6 */
    public static double FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT; /* 0x8CD7 */
    public static double FRAMEBUFFER_INCOMPLETE_DIMENSIONS; /* 0x8CD9 */
    public static double FRAMEBUFFER_UNSUPPORTED; /* 0x8CDD */
    public static double FRAMEBUFFER_BINDING; /* 0x8CA6 */
    public static double RENDERBUFFER_BINDING; /* 0x8CA7 */
    public static double MAX_RENDERBUFFER_SIZE; /* 0x84E8 */
    public static double INVALID_FRAMEBUFFER_OPERATION; /* 0x0506 */
    public static double UNPACK_FLIP_Y_WEBGL; /* 0x9240 */
    public static double UNPACK_PREMULTIPLY_ALPHA_WEBGL; /* 0x9241 */
    public static double CONTEXT_LOST_WEBGL; /* 0x9242 */
    public static double UNPACK_COLORSPACE_CONVERSION_WEBGL; /* 0x9243 */
    public static double BROWSER_DEFAULT_WEBGL; /* 0x9244 */
    
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
    public native void blendColor(double red, double green, double blue, double alpha);
    
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
    public native void clearColor(double red, double green, double blue, double alpha);
    
    @JsMethod(name = "clearDepth")
    public native void clearDepth(double depth);
    
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
    public native void depthRange(double zNear, double zFar);
    
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
    public native Any getBufferParameter(double target, double pname);
    
    @JsMethod(name = "getContextAttributes")
    public native WebGLContextAttributes getContextAttributes();
    
    @JsMethod(name = "getError")
    public native double getError();
    
    @JsMethod(name = "getExtension")
    public native Object getExtension(String name);
    
    @JsMethod(name = "getFramebufferAttachmentParameter")
    public native Any getFramebufferAttachmentParameter(double target, double attachment, double pname);
    
    @JsMethod(name = "getParameter")
    public native Any getParameter(double pname);
    
    @JsMethod(name = "getProgramInfoLog")
    public native String getProgramInfoLog(WebGLProgram program);
    
    @JsMethod(name = "getProgramParameter")
    public native Any getProgramParameter(WebGLProgram program, double pname);
    
    @JsMethod(name = "getRenderbufferParameter")
    public native Any getRenderbufferParameter(double target, double pname);
    
    @JsMethod(name = "getShaderInfoLog")
    public native String getShaderInfoLog(WebGLShader shader);
    
    @JsMethod(name = "getShaderParameter")
    public native Any getShaderParameter(WebGLShader shader, double pname);
    
    @JsMethod(name = "getShaderPrecisionFormat")
    public native WebGLShaderPrecisionFormat getShaderPrecisionFormat(double shadertype, double precisiontype);
    
    @JsMethod(name = "getShaderSource")
    public native String getShaderSource(WebGLShader shader);
    
    @JsMethod(name = "getSupportedExtensions")
    public native String[] getSupportedExtensions();
    
    @JsMethod(name = "getTexParameter")
    public native Any getTexParameter(double target, double pname);
    
    @JsMethod(name = "getUniform")
    public native Any getUniform(WebGLProgram program, WebGLUniformLocation location);
    
    @JsMethod(name = "getUniformLocation")
    public native WebGLUniformLocation getUniformLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getVertexAttrib")
    public native Any getVertexAttrib(double index, double pname);
    
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
    public native void lineWidth(double width);
    
    @JsMethod(name = "linkProgram")
    public native void linkProgram(WebGLProgram program);
    
    @JsMethod(name = "pixelStorei")
    public native void pixelStorei(double pname, double param);
    
    @JsMethod(name = "polygonOffset")
    public native void polygonOffset(double factor, double units);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(double x, double y, double width, double height, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "renderbufferStorage")
    public native void renderbufferStorage(double target, double internalformat, double width, double height);
    
    @JsMethod(name = "sampleCoverage")
    public native void sampleCoverage(double value, boolean invert);
    
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
    public native void texParameterf(double target, double pname, double param);
    
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
    public native void uniform1f(WebGLUniformLocation location, double x);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniform1i")
    public native void uniform1i(WebGLUniformLocation location, double x);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniform2f")
    public native void uniform2f(WebGLUniformLocation location, double x, double y);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniform2i")
    public native void uniform2i(WebGLUniformLocation location, double x, double y);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniform3f")
    public native void uniform3f(WebGLUniformLocation location, double x, double y, double z);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniform3i")
    public native void uniform3i(WebGLUniformLocation location, double x, double y, double z);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniform4f")
    public native void uniform4f(WebGLUniformLocation location, double x, double y, double z, double w);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniform4i")
    public native void uniform4i(WebGLUniformLocation location, double x, double y, double z, double w);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, Array v);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, double[] array);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Array array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, double[] array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Array array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, double[] array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Array array);
    
    @JsMethod(name = "useProgram")
    public native void useProgram(WebGLProgram program);
    
    @JsMethod(name = "validateProgram")
    public native void validateProgram(WebGLProgram program);
    
    @JsMethod(name = "vertexAttrib1f")
    public native void vertexAttrib1f(double indx, double x);
    
    @JsMethod(name = "vertexAttrib1fv")
    public native void vertexAttrib1fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib1fv")
    public native void vertexAttrib1fv(double indx, double[] values);
    
    @JsMethod(name = "vertexAttrib1fv")
    public native void vertexAttrib1fv(double indx, Array values);
    
    @JsMethod(name = "vertexAttrib2f")
    public native void vertexAttrib2f(double indx, double x, double y);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(double indx, double[] values);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(double indx, Array values);
    
    @JsMethod(name = "vertexAttrib3f")
    public native void vertexAttrib3f(double indx, double x, double y, double z);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(double indx, double[] values);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(double indx, Array values);
    
    @JsMethod(name = "vertexAttrib4f")
    public native void vertexAttrib4f(double indx, double x, double y, double z, double w);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(double indx, double[] values);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(double indx, Array values);
    
    @JsMethod(name = "vertexAttribPointer")
    public native void vertexAttribPointer(double indx, double size, double type, boolean normalized, double stride, double offset);
    
    @JsMethod(name = "viewport")
    public native void viewport(double x, double y, double width, double height);
    
}
