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
import gwt.jelement.core.Uint32Array;
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
import gwt.jelement.webgl.WebGLQuery;
import gwt.jelement.webgl.WebGLRenderbuffer;
import gwt.jelement.webgl.WebGLSampler;
import gwt.jelement.webgl.WebGLShader;
import gwt.jelement.webgl.WebGLShaderPrecisionFormat;
import gwt.jelement.webgl.WebGLSync;
import gwt.jelement.webgl.WebGLTexture;
import gwt.jelement.webgl.WebGLTransformFeedback;
import gwt.jelement.webgl.WebGLUniformLocation;
import gwt.jelement.webgl.WebGLVertexArrayObject;
import elemental2.promise.Promise;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, name="WebGL2RenderingContextBase", isNative = true)
public class WebGL2RenderingContextBase{
    public static double READ_BUFFER;
    public static double UNPACK_ROW_LENGTH;
    public static double UNPACK_SKIP_ROWS;
    public static double UNPACK_SKIP_PIXELS;
    public static double PACK_ROW_LENGTH;
    public static double PACK_SKIP_ROWS;
    public static double PACK_SKIP_PIXELS;
    public static double COLOR;
    public static double DEPTH;
    public static double STENCIL;
    public static double RED;
    public static double RGB8;
    public static double RGBA8;
    public static double RGB10_A2;
    public static double TEXTURE_BINDING_3D;
    public static double UNPACK_SKIP_IMAGES;
    public static double UNPACK_IMAGE_HEIGHT;
    public static double TEXTURE_3D;
    public static double TEXTURE_WRAP_R;
    public static double MAX_3D_TEXTURE_SIZE;
    public static double UNSIGNED_INT_2_10_10_10_REV;
    public static double MAX_ELEMENTS_VERTICES;
    public static double MAX_ELEMENTS_INDICES;
    public static double TEXTURE_MIN_LOD;
    public static double TEXTURE_MAX_LOD;
    public static double TEXTURE_BASE_LEVEL;
    public static double TEXTURE_MAX_LEVEL;
    public static double MIN;
    public static double MAX;
    public static double DEPTH_COMPONENT24;
    public static double MAX_TEXTURE_LOD_BIAS;
    public static double TEXTURE_COMPARE_MODE;
    public static double TEXTURE_COMPARE_FUNC;
    public static double CURRENT_QUERY;
    public static double QUERY_RESULT;
    public static double QUERY_RESULT_AVAILABLE;
    public static double STREAM_READ;
    public static double STREAM_COPY;
    public static double STATIC_READ;
    public static double STATIC_COPY;
    public static double DYNAMIC_READ;
    public static double DYNAMIC_COPY;
    public static double MAX_DRAW_BUFFERS;
    public static double DRAW_BUFFER0;
    public static double DRAW_BUFFER1;
    public static double DRAW_BUFFER2;
    public static double DRAW_BUFFER3;
    public static double DRAW_BUFFER4;
    public static double DRAW_BUFFER5;
    public static double DRAW_BUFFER6;
    public static double DRAW_BUFFER7;
    public static double DRAW_BUFFER8;
    public static double DRAW_BUFFER9;
    public static double DRAW_BUFFER10;
    public static double DRAW_BUFFER11;
    public static double DRAW_BUFFER12;
    public static double DRAW_BUFFER13;
    public static double DRAW_BUFFER14;
    public static double DRAW_BUFFER15;
    public static double MAX_FRAGMENT_UNIFORM_COMPONENTS;
    public static double MAX_VERTEX_UNIFORM_COMPONENTS;
    public static double SAMPLER_3D;
    public static double SAMPLER_2D_SHADOW;
    public static double FRAGMENT_SHADER_DERIVATIVE_HINT;
    public static double PIXEL_PACK_BUFFER;
    public static double PIXEL_UNPACK_BUFFER;
    public static double PIXEL_PACK_BUFFER_BINDING;
    public static double PIXEL_UNPACK_BUFFER_BINDING;
    public static double FLOAT_MAT2x3;
    public static double FLOAT_MAT2x4;
    public static double FLOAT_MAT3x2;
    public static double FLOAT_MAT3x4;
    public static double FLOAT_MAT4x2;
    public static double FLOAT_MAT4x3;
    public static double SRGB;
    public static double SRGB8;
    public static double SRGB8_ALPHA8;
    public static double COMPARE_REF_TO_TEXTURE;
    public static double RGBA32F;
    public static double RGB32F;
    public static double RGBA16F;
    public static double RGB16F;
    public static double VERTEX_ATTRIB_ARRAY_INTEGER;
    public static double MAX_ARRAY_TEXTURE_LAYERS;
    public static double MIN_PROGRAM_TEXEL_OFFSET;
    public static double MAX_PROGRAM_TEXEL_OFFSET;
    public static double MAX_VARYING_COMPONENTS;
    public static double TEXTURE_2D_ARRAY;
    public static double TEXTURE_BINDING_2D_ARRAY;
    public static double R11F_G11F_B10F;
    public static double UNSIGNED_INT_10F_11F_11F_REV;
    public static double RGB9_E5;
    public static double UNSIGNED_INT_5_9_9_9_REV;
    public static double TRANSFORM_FEEDBACK_BUFFER_MODE;
    public static double MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS;
    public static double TRANSFORM_FEEDBACK_VARYINGS;
    public static double TRANSFORM_FEEDBACK_BUFFER_START;
    public static double TRANSFORM_FEEDBACK_BUFFER_SIZE;
    public static double TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN;
    public static double RASTERIZER_DISCARD;
    public static double MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS;
    public static double MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS;
    public static double INTERLEAVED_ATTRIBS;
    public static double SEPARATE_ATTRIBS;
    public static double TRANSFORM_FEEDBACK_BUFFER;
    public static double TRANSFORM_FEEDBACK_BUFFER_BINDING;
    public static double RGBA32UI;
    public static double RGB32UI;
    public static double RGBA16UI;
    public static double RGB16UI;
    public static double RGBA8UI;
    public static double RGB8UI;
    public static double RGBA32I;
    public static double RGB32I;
    public static double RGBA16I;
    public static double RGB16I;
    public static double RGBA8I;
    public static double RGB8I;
    public static double RED_INTEGER;
    public static double RGB_INTEGER;
    public static double RGBA_INTEGER;
    public static double SAMPLER_2D_ARRAY;
    public static double SAMPLER_2D_ARRAY_SHADOW;
    public static double SAMPLER_CUBE_SHADOW;
    public static double UNSIGNED_INT_VEC2;
    public static double UNSIGNED_INT_VEC3;
    public static double UNSIGNED_INT_VEC4;
    public static double INT_SAMPLER_2D;
    public static double INT_SAMPLER_3D;
    public static double INT_SAMPLER_CUBE;
    public static double INT_SAMPLER_2D_ARRAY;
    public static double UNSIGNED_INT_SAMPLER_2D;
    public static double UNSIGNED_INT_SAMPLER_3D;
    public static double UNSIGNED_INT_SAMPLER_CUBE;
    public static double UNSIGNED_INT_SAMPLER_2D_ARRAY;
    public static double DEPTH_COMPONENT32F;
    public static double DEPTH32F_STENCIL8;
    public static double FLOAT_32_UNSIGNED_INT_24_8_REV;
    public static double FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING;
    public static double FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE;
    public static double FRAMEBUFFER_ATTACHMENT_RED_SIZE;
    public static double FRAMEBUFFER_ATTACHMENT_GREEN_SIZE;
    public static double FRAMEBUFFER_ATTACHMENT_BLUE_SIZE;
    public static double FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE;
    public static double FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE;
    public static double FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE;
    public static double FRAMEBUFFER_DEFAULT;
    public static double UNSIGNED_INT_24_8;
    public static double DEPTH24_STENCIL8;
    public static double UNSIGNED_NORMALIZED;
    public static double DRAW_FRAMEBUFFER_BINDING;
    public static double READ_FRAMEBUFFER;
    public static double DRAW_FRAMEBUFFER;
    public static double READ_FRAMEBUFFER_BINDING;
    public static double RENDERBUFFER_SAMPLES;
    public static double FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER;
    public static double MAX_COLOR_ATTACHMENTS;
    public static double COLOR_ATTACHMENT1;
    public static double COLOR_ATTACHMENT2;
    public static double COLOR_ATTACHMENT3;
    public static double COLOR_ATTACHMENT4;
    public static double COLOR_ATTACHMENT5;
    public static double COLOR_ATTACHMENT6;
    public static double COLOR_ATTACHMENT7;
    public static double COLOR_ATTACHMENT8;
    public static double COLOR_ATTACHMENT9;
    public static double COLOR_ATTACHMENT10;
    public static double COLOR_ATTACHMENT11;
    public static double COLOR_ATTACHMENT12;
    public static double COLOR_ATTACHMENT13;
    public static double COLOR_ATTACHMENT14;
    public static double COLOR_ATTACHMENT15;
    public static double FRAMEBUFFER_INCOMPLETE_MULTISAMPLE;
    public static double MAX_SAMPLES;
    public static double HALF_FLOAT;
    public static double RG;
    public static double RG_INTEGER;
    public static double R8;
    public static double RG8;
    public static double R16F;
    public static double R32F;
    public static double RG16F;
    public static double RG32F;
    public static double R8I;
    public static double R8UI;
    public static double R16I;
    public static double R16UI;
    public static double R32I;
    public static double R32UI;
    public static double RG8I;
    public static double RG8UI;
    public static double RG16I;
    public static double RG16UI;
    public static double RG32I;
    public static double RG32UI;
    public static double VERTEX_ARRAY_BINDING;
    public static double R8_SNORM;
    public static double RG8_SNORM;
    public static double RGB8_SNORM;
    public static double RGBA8_SNORM;
    public static double SIGNED_NORMALIZED;
    public static double COPY_READ_BUFFER;
    public static double COPY_WRITE_BUFFER;
    public static double COPY_READ_BUFFER_BINDING;
    public static double COPY_WRITE_BUFFER_BINDING;
    public static double UNIFORM_BUFFER;
    public static double UNIFORM_BUFFER_BINDING;
    public static double UNIFORM_BUFFER_START;
    public static double UNIFORM_BUFFER_SIZE;
    public static double MAX_VERTEX_UNIFORM_BLOCKS;
    public static double MAX_FRAGMENT_UNIFORM_BLOCKS;
    public static double MAX_COMBINED_UNIFORM_BLOCKS;
    public static double MAX_UNIFORM_BUFFER_BINDINGS;
    public static double MAX_UNIFORM_BLOCK_SIZE;
    public static double MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS;
    public static double MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS;
    public static double UNIFORM_BUFFER_OFFSET_ALIGNMENT;
    public static double ACTIVE_UNIFORM_BLOCKS;
    public static double UNIFORM_TYPE;
    public static double UNIFORM_SIZE;
    public static double UNIFORM_BLOCK_INDEX;
    public static double UNIFORM_OFFSET;
    public static double UNIFORM_ARRAY_STRIDE;
    public static double UNIFORM_MATRIX_STRIDE;
    public static double UNIFORM_IS_ROW_MAJOR;
    public static double UNIFORM_BLOCK_BINDING;
    public static double UNIFORM_BLOCK_DATA_SIZE;
    public static double UNIFORM_BLOCK_ACTIVE_UNIFORMS;
    public static double UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES;
    public static double UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER;
    public static double UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER;
    public static double INVALID_INDEX;
    public static double MAX_VERTEX_OUTPUT_COMPONENTS;
    public static double MAX_FRAGMENT_INPUT_COMPONENTS;
    public static double MAX_SERVER_WAIT_TIMEOUT;
    public static double OBJECT_TYPE;
    public static double SYNC_CONDITION;
    public static double SYNC_STATUS;
    public static double SYNC_FLAGS;
    public static double SYNC_FENCE;
    public static double SYNC_GPU_COMMANDS_COMPLETE;
    public static double UNSIGNALED;
    public static double SIGNALED;
    public static double ALREADY_SIGNALED;
    public static double TIMEOUT_EXPIRED;
    public static double CONDITION_SATISFIED;
    public static double WAIT_FAILED;
    public static double SYNC_FLUSH_COMMANDS_BIT;
    public static double VERTEX_ATTRIB_ARRAY_DIVISOR;
    public static double ANY_SAMPLES_PASSED;
    public static double ANY_SAMPLES_PASSED_CONSERVATIVE;
    public static double SAMPLER_BINDING;
    public static double RGB10_A2UI;
    public static double INT_2_10_10_10_REV;
    public static double TRANSFORM_FEEDBACK;
    public static double TRANSFORM_FEEDBACK_PAUSED;
    public static double TRANSFORM_FEEDBACK_ACTIVE;
    public static double TRANSFORM_FEEDBACK_BINDING;
    public static double TEXTURE_IMMUTABLE_FORMAT;
    public static double MAX_ELEMENT_INDEX;
    public static double TEXTURE_IMMUTABLE_LEVELS;
    public static double TIMEOUT_IGNORED;
    public static double MAX_CLIENT_WAIT_TIMEOUT_WEBGL;
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
    
    @JsMethod(name = "beginQuery")
    public native void beginQuery(double target, WebGLQuery query);
    
    @JsMethod(name = "beginTransformFeedback")
    public native void beginTransformFeedback(double primitiveMode);
    
    @JsMethod(name = "bindAttribLocation")
    public native void bindAttribLocation(WebGLProgram program, double index, String name);
    
    @JsMethod(name = "bindBuffer")
    public native void bindBuffer(double target, WebGLBuffer buffer);
    
    @JsMethod(name = "bindBufferBase")
    public native void bindBufferBase(double target, double index, WebGLBuffer buffer);
    
    @JsMethod(name = "bindBufferRange")
    public native void bindBufferRange(double target, double index, WebGLBuffer buffer, double offset, double size);
    
    @JsMethod(name = "bindFramebuffer")
    public native void bindFramebuffer(double target, WebGLFramebuffer framebuffer);
    
    @JsMethod(name = "bindRenderbuffer")
    public native void bindRenderbuffer(double target, WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "bindSampler")
    public native void bindSampler(double unit, WebGLSampler sampler);
    
    @JsMethod(name = "bindTexture")
    public native void bindTexture(double target, WebGLTexture texture);
    
    @JsMethod(name = "bindTransformFeedback")
    public native void bindTransformFeedback(double target, WebGLTransformFeedback feedback);
    
    @JsMethod(name = "bindVertexArray")
    public native void bindVertexArray(WebGLVertexArrayObject vertexArray);
    
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
    
    @JsMethod(name = "blitFramebuffer")
    public native void blitFramebuffer(double srcX0, double srcY0, double srcX1, double srcY1, double dstX0, double dstY0, double dstX1, double dstY1, double mask, double filter);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, double size, double usage);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBufferView data, double usage);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBuffer data, double usage);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBufferView srcData, double usage, double srcOffset);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBufferView srcData, double usage, double srcOffset, double length);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double offset, ArrayBufferView data);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double offset, ArrayBuffer data);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double dstByteOffset, ArrayBufferView srcData, double srcOffset);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double dstByteOffset, ArrayBufferView srcData, double srcOffset, double length);
    
    @JsMethod(name = "checkFramebufferStatus")
    public native double checkFramebufferStatus(double target);
    
    @JsMethod(name = "clear")
    public native void clear(double mask);
    
    @JsMethod(name = "clearBufferfi")
    public native void clearBufferfi(double buffer, double drawbuffer, float depth, double stencil);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, Float32Array value);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, float[] value);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, Float32Array value, double srcOffset);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, float[] value, double srcOffset);
    
    @JsMethod(name = "clearBufferiv")
    public native void clearBufferiv(double buffer, double drawbuffer, Int32Array value);
    
    @JsMethod(name = "clearBufferiv")
    public native void clearBufferiv(double buffer, double drawbuffer, double[] value);
    
    @JsMethod(name = "clearBufferiv")
    public native void clearBufferiv(double buffer, double drawbuffer, Int32Array value, double srcOffset);
    
    @JsMethod(name = "clearBufferiv")
    public native void clearBufferiv(double buffer, double drawbuffer, double[] value, double srcOffset);
    
    @JsMethod(name = "clearBufferuiv")
    public native void clearBufferuiv(double buffer, double drawbuffer, Uint32Array value);
    
    @JsMethod(name = "clearBufferuiv")
    public native void clearBufferuiv(double buffer, double drawbuffer, double[] value);
    
    @JsMethod(name = "clearBufferuiv")
    public native void clearBufferuiv(double buffer, double drawbuffer, Uint32Array value, double srcOffset);
    
    @JsMethod(name = "clearBufferuiv")
    public native void clearBufferuiv(double buffer, double drawbuffer, double[] value, double srcOffset);
    
    @JsMethod(name = "clearColor")
    public native void clearColor(float red, float green, float blue, float alpha);
    
    @JsMethod(name = "clearDepth")
    public native void clearDepth(float depth);
    
    @JsMethod(name = "clearStencil")
    public native void clearStencil(double s);
    
    @JsMethod(name = "clientWaitSync")
    public native double clientWaitSync(WebGLSync sync, double flags, double timeout);
    
    @JsMethod(name = "colorMask")
    public native void colorMask(boolean red, boolean green, boolean blue, boolean alpha);
    
    @JsMethod(name = "commit")
    public native Promise commit();
    
    @JsMethod(name = "compileShader")
    public native void compileShader(WebGLShader shader);
    
    @JsMethod(name = "compressedTexImage2D")
    public native void compressedTexImage2D(double target, double level, double internalformat, double width, double height, double border, ArrayBufferView data);
    
    @JsMethod(name = "compressedTexImage2D")
    public native void compressedTexImage2D(double target, double level, double internalformat, double width, double height, double border, ArrayBufferView data, double srcOffset);
    
    @JsMethod(name = "compressedTexImage2D")
    public native void compressedTexImage2D(double target, double level, double internalformat, double width, double height, double border, double imageSize, double offset);
    
    @JsMethod(name = "compressedTexImage2D")
    public native void compressedTexImage2D(double target, double level, double internalformat, double width, double height, double border, ArrayBufferView data, double srcOffset, double srcLengthOverride);
    
    @JsMethod(name = "compressedTexImage3D")
    public native void compressedTexImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, ArrayBufferView data);
    
    @JsMethod(name = "compressedTexImage3D")
    public native void compressedTexImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, ArrayBufferView data, double srcOffset);
    
    @JsMethod(name = "compressedTexImage3D")
    public native void compressedTexImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double imageSize, double offset);
    
    @JsMethod(name = "compressedTexImage3D")
    public native void compressedTexImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, ArrayBufferView data, double srcOffset, double srcLengthOverride);
    
    @JsMethod(name = "compressedTexSubImage2D")
    public native void compressedTexSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, ArrayBufferView data);
    
    @JsMethod(name = "compressedTexSubImage2D")
    public native void compressedTexSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, ArrayBufferView data, double srcOffset);
    
    @JsMethod(name = "compressedTexSubImage2D")
    public native void compressedTexSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double imageSize, double offset);
    
    @JsMethod(name = "compressedTexSubImage2D")
    public native void compressedTexSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, ArrayBufferView data, double srcOffset, double srcLengthOverride);
    
    @JsMethod(name = "compressedTexSubImage3D")
    public native void compressedTexSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, ArrayBufferView data);
    
    @JsMethod(name = "compressedTexSubImage3D")
    public native void compressedTexSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, ArrayBufferView data, double srcOffset);
    
    @JsMethod(name = "compressedTexSubImage3D")
    public native void compressedTexSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double imageSize, double offset);
    
    @JsMethod(name = "compressedTexSubImage3D")
    public native void compressedTexSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, ArrayBufferView data, double srcOffset, double srcLengthOverride);
    
    @JsMethod(name = "copyBufferSubData")
    public native void copyBufferSubData(double readTarget, double writeTarget, double readOffset, double writeOffset, double size);
    
    @JsMethod(name = "copyTexImage2D")
    public native void copyTexImage2D(double target, double level, double internalformat, double x, double y, double width, double height, double border);
    
    @JsMethod(name = "copyTexSubImage2D")
    public native void copyTexSubImage2D(double target, double level, double xoffset, double yoffset, double x, double y, double width, double height);
    
    @JsMethod(name = "copyTexSubImage3D")
    public native void copyTexSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double x, double y, double width, double height);
    
    @JsMethod(name = "createBuffer")
    public native WebGLBuffer createBuffer();
    
    @JsMethod(name = "createFramebuffer")
    public native WebGLFramebuffer createFramebuffer();
    
    @JsMethod(name = "createProgram")
    public native WebGLProgram createProgram();
    
    @JsMethod(name = "createQuery")
    public native WebGLQuery createQuery();
    
    @JsMethod(name = "createRenderbuffer")
    public native WebGLRenderbuffer createRenderbuffer();
    
    @JsMethod(name = "createSampler")
    public native WebGLSampler createSampler();
    
    @JsMethod(name = "createShader")
    public native WebGLShader createShader(double type);
    
    @JsMethod(name = "createTexture")
    public native WebGLTexture createTexture();
    
    @JsMethod(name = "createTransformFeedback")
    public native WebGLTransformFeedback createTransformFeedback();
    
    @JsMethod(name = "createVertexArray")
    public native WebGLVertexArrayObject createVertexArray();
    
    @JsMethod(name = "cullFace")
    public native void cullFace(double mode);
    
    @JsMethod(name = "deleteBuffer")
    public native void deleteBuffer(WebGLBuffer buffer);
    
    @JsMethod(name = "deleteFramebuffer")
    public native void deleteFramebuffer(WebGLFramebuffer framebuffer);
    
    @JsMethod(name = "deleteProgram")
    public native void deleteProgram(WebGLProgram program);
    
    @JsMethod(name = "deleteQuery")
    public native void deleteQuery(WebGLQuery query);
    
    @JsMethod(name = "deleteRenderbuffer")
    public native void deleteRenderbuffer(WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "deleteSampler")
    public native void deleteSampler(WebGLSampler sampler);
    
    @JsMethod(name = "deleteShader")
    public native void deleteShader(WebGLShader shader);
    
    @JsMethod(name = "deleteSync")
    public native void deleteSync(WebGLSync sync);
    
    @JsMethod(name = "deleteTexture")
    public native void deleteTexture(WebGLTexture texture);
    
    @JsMethod(name = "deleteTransformFeedback")
    public native void deleteTransformFeedback(WebGLTransformFeedback feedback);
    
    @JsMethod(name = "deleteVertexArray")
    public native void deleteVertexArray(WebGLVertexArrayObject vertexArray);
    
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
    
    @JsMethod(name = "drawArraysInstanced")
    public native void drawArraysInstanced(double mode, double first, double count, double instanceCount);
    
    @JsMethod(name = "drawBuffers")
    public native void drawBuffers(double[] buffers);
    
    @JsMethod(name = "drawElements")
    public native void drawElements(double mode, double count, double type, double offset);
    
    @JsMethod(name = "drawElementsInstanced")
    public native void drawElementsInstanced(double mode, double count, double type, double offset, double instanceCount);
    
    @JsMethod(name = "drawRangeElements")
    public native void drawRangeElements(double mode, double start, double end, double count, double type, double offset);
    
    @JsMethod(name = "enable")
    public native void enable(double cap);
    
    @JsMethod(name = "enableVertexAttribArray")
    public native void enableVertexAttribArray(double index);
    
    @JsMethod(name = "endQuery")
    public native void endQuery(double target);
    
    @JsMethod(name = "endTransformFeedback")
    public native void endTransformFeedback();
    
    @JsMethod(name = "fenceSync")
    public native WebGLSync fenceSync(double condition, double flags);
    
    @JsMethod(name = "finish")
    public native void finish();
    
    @JsMethod(name = "flush")
    public native void flush();
    
    @JsMethod(name = "framebufferRenderbuffer")
    public native void framebufferRenderbuffer(double target, double attachment, double renderbuffertarget, WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "framebufferTexture2D")
    public native void framebufferTexture2D(double target, double attachment, double textarget, WebGLTexture texture, double level);
    
    @JsMethod(name = "framebufferTextureLayer")
    public native void framebufferTextureLayer(double target, double attachment, WebGLTexture texture, double level, double layer);
    
    @JsMethod(name = "frontFace")
    public native void frontFace(double mode);
    
    @JsMethod(name = "generateMipmap")
    public native void generateMipmap(double target);
    
    @JsMethod(name = "getActiveAttrib")
    public native WebGLActiveInfo getActiveAttrib(WebGLProgram program, double index);
    
    @JsMethod(name = "getActiveUniform")
    public native WebGLActiveInfo getActiveUniform(WebGLProgram program, double index);
    
    @JsMethod(name = "getActiveUniformBlockName")
    public native String getActiveUniformBlockName(WebGLProgram program, double uniformBlockIndex);
    
    @JsMethod(name = "getActiveUniformBlockParameter")
    public native Object getActiveUniformBlockParameter(WebGLProgram program, double uniformBlockIndex, double pname);
    
    @JsMethod(name = "getActiveUniforms")
    public native Object getActiveUniforms(WebGLProgram program, double[] uniformIndices, double pname);
    
    @JsMethod(name = "getAttachedShaders")
    public native WebGLShader[] getAttachedShaders(WebGLProgram program);
    
    @JsMethod(name = "getAttribLocation")
    public native double getAttribLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getBufferParameter")
    public native Object getBufferParameter(double target, double pname);
    
    @JsMethod(name = "getBufferSubData")
    public native void getBufferSubData(double target, double srcByteOffset, ArrayBufferView dstData);
    
    @JsMethod(name = "getBufferSubData")
    public native void getBufferSubData(double target, double srcByteOffset, ArrayBufferView dstData, double dstOffset);
    
    @JsMethod(name = "getBufferSubData")
    public native void getBufferSubData(double target, double srcByteOffset, ArrayBufferView dstData, double dstOffset, double length);
    
    @JsMethod(name = "getContextAttributes")
    public native WebGLContextAttributes getContextAttributes();
    
    @JsMethod(name = "getError")
    public native double getError();
    
    @JsMethod(name = "getExtension")
    public native Object getExtension(String name);
    
    @JsMethod(name = "getFragDataLocation")
    public native double getFragDataLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getFramebufferAttachmentParameter")
    public native Object getFramebufferAttachmentParameter(double target, double attachment, double pname);
    
    @JsMethod(name = "getIndexedParameter")
    public native Object getIndexedParameter(double target, double index);
    
    @JsMethod(name = "getInternalformatParameter")
    public native Object getInternalformatParameter(double target, double internalformat, double pname);
    
    @JsMethod(name = "getParameter")
    public native Object getParameter(double pname);
    
    @JsMethod(name = "getProgramInfoLog")
    public native String getProgramInfoLog(WebGLProgram program);
    
    @JsMethod(name = "getProgramParameter")
    public native Object getProgramParameter(WebGLProgram program, double pname);
    
    @JsMethod(name = "getQuery")
    public native Object getQuery(double target, double pname);
    
    @JsMethod(name = "getQueryParameter")
    public native Object getQueryParameter(WebGLQuery query, double pname);
    
    @JsMethod(name = "getRenderbufferParameter")
    public native Object getRenderbufferParameter(double target, double pname);
    
    @JsMethod(name = "getSamplerParameter")
    public native Object getSamplerParameter(WebGLSampler sampler, double pname);
    
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
    
    @JsMethod(name = "getSyncParameter")
    public native Object getSyncParameter(WebGLSync sync, double pname);
    
    @JsMethod(name = "getTexParameter")
    public native Object getTexParameter(double target, double pname);
    
    @JsMethod(name = "getTransformFeedbackVarying")
    public native WebGLActiveInfo getTransformFeedbackVarying(WebGLProgram program, double index);
    
    @JsMethod(name = "getUniform")
    public native Object getUniform(WebGLProgram program, WebGLUniformLocation location);
    
    @JsMethod(name = "getUniformBlockIndex")
    public native double getUniformBlockIndex(WebGLProgram program, String uniformBlockName);
    
    @JsMethod(name = "getUniformIndices")
    public native double[] getUniformIndices(WebGLProgram program, String[] uniformNames);
    
    @JsMethod(name = "getUniformLocation")
    public native WebGLUniformLocation getUniformLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getVertexAttrib")
    public native Object getVertexAttrib(double index, double pname);
    
    @JsMethod(name = "getVertexAttribOffset")
    public native double getVertexAttribOffset(double index, double pname);
    
    @JsMethod(name = "hint")
    public native void hint(double target, double mode);
    
    @JsMethod(name = "invalidateFramebuffer")
    public native void invalidateFramebuffer(double target, double[] attachments);
    
    @JsMethod(name = "invalidateSubFramebuffer")
    public native void invalidateSubFramebuffer(double target, double[] attachments, double x, double y, double width, double height);
    
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
    
    @JsMethod(name = "isQuery")
    public native boolean isQuery(WebGLQuery query);
    
    @JsMethod(name = "isRenderbuffer")
    public native boolean isRenderbuffer(WebGLRenderbuffer renderbuffer);
    
    @JsMethod(name = "isSampler")
    public native boolean isSampler(WebGLSampler sampler);
    
    @JsMethod(name = "isShader")
    public native boolean isShader(WebGLShader shader);
    
    @JsMethod(name = "isSync")
    public native boolean isSync(WebGLSync sync);
    
    @JsMethod(name = "isTexture")
    public native boolean isTexture(WebGLTexture texture);
    
    @JsMethod(name = "isTransformFeedback")
    public native boolean isTransformFeedback(WebGLTransformFeedback feedback);
    
    @JsMethod(name = "isVertexArray")
    public native boolean isVertexArray(WebGLVertexArrayObject vertexArray);
    
    @JsMethod(name = "lineWidth")
    public native void lineWidth(float width);
    
    @JsMethod(name = "linkProgram")
    public native void linkProgram(WebGLProgram program);
    
    @JsMethod(name = "pauseTransformFeedback")
    public native void pauseTransformFeedback();
    
    @JsMethod(name = "pixelStorei")
    public native void pixelStorei(double pname, double param);
    
    @JsMethod(name = "polygonOffset")
    public native void polygonOffset(float factor, float units);
    
    @JsMethod(name = "readBuffer")
    public native void readBuffer(double mode);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(double x, double y, double width, double height, double format, double type, double offset);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(double x, double y, double width, double height, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(double x, double y, double width, double height, double format, double type, ArrayBufferView dstData, double offset);
    
    @JsMethod(name = "renderbufferStorage")
    public native void renderbufferStorage(double target, double internalformat, double width, double height);
    
    @JsMethod(name = "renderbufferStorageMultisample")
    public native void renderbufferStorageMultisample(double target, double samples, double internalformat, double width, double height);
    
    @JsMethod(name = "resumeTransformFeedback")
    public native void resumeTransformFeedback();
    
    @JsMethod(name = "sampleCoverage")
    public native void sampleCoverage(float value, boolean invert);
    
    @JsMethod(name = "samplerParameterf")
    public native void samplerParameterf(WebGLSampler sampler, double pname, float param);
    
    @JsMethod(name = "samplerParameteri")
    public native void samplerParameteri(WebGLSampler sampler, double pname, double param);
    
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
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, double offset);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, ImageData data);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, HTMLImageElement image);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, HTMLVideoElement video);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, ImageBitmap bitmap);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "texImage2D")
    public native void texImage2D(double target, double level, double internalformat, double width, double height, double border, double format, double type, ArrayBufferView srcData, double srcOffset);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, double offset);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, ImageData data);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, HTMLImageElement image);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, HTMLVideoElement video);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, ImageBitmap bitmap);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "texImage3D")
    public native void texImage3D(double target, double level, double internalformat, double width, double height, double depth, double border, double format, double type, ArrayBufferView pixels, double srcOffset);
    
    @JsMethod(name = "texParameterf")
    public native void texParameterf(double target, double pname, float param);
    
    @JsMethod(name = "texParameteri")
    public native void texParameteri(double target, double pname, double param);
    
    @JsMethod(name = "texStorage2D")
    public native void texStorage2D(double target, double levels, double internalformat, double width, double height);
    
    @JsMethod(name = "texStorage3D")
    public native void texStorage3D(double target, double levels, double internalformat, double width, double height, double depth);
    
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
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, double offset);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, ImageData data);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, HTMLImageElement image);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, HTMLVideoElement video);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, ImageBitmap bitmap);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "texSubImage2D")
    public native void texSubImage2D(double target, double level, double xoffset, double yoffset, double width, double height, double format, double type, ArrayBufferView srcData, double srcOffset);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, double offset);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, ImageData data);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, HTMLImageElement image);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, HTMLCanvasElement canvas);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, HTMLVideoElement video);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, ImageBitmap bitmap);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, ArrayBufferView pixels);
    
    @JsMethod(name = "texSubImage3D")
    public native void texSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double width, double height, double depth, double format, double type, ArrayBufferView pixels, double srcOffset);
    
    @JsMethod(name = "transformFeedbackVaryings")
    public native void transformFeedbackVaryings(WebGLProgram program, String[] varyings, double bufferMode);
    
    @JsMethod(name = "uniform1f")
    public native void uniform1f(WebGLUniformLocation location, float x);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform1i")
    public native void uniform1i(WebGLUniformLocation location, double x);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, Int32Array v, double srcOffset);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, Int32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform1iv")
    public native void uniform1iv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform1ui")
    public native void uniform1ui(WebGLUniformLocation location, double v0);
    
    @JsMethod(name = "uniform1uiv")
    public native void uniform1uiv(WebGLUniformLocation location, Uint32Array v);
    
    @JsMethod(name = "uniform1uiv")
    public native void uniform1uiv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform1uiv")
    public native void uniform1uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset);
    
    @JsMethod(name = "uniform1uiv")
    public native void uniform1uiv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform1uiv")
    public native void uniform1uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform1uiv")
    public native void uniform1uiv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2f")
    public native void uniform2f(WebGLUniformLocation location, float x, float y);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2i")
    public native void uniform2i(WebGLUniformLocation location, double x, double y);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, Int32Array v, double srcOffset);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, Int32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2iv")
    public native void uniform2iv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2ui")
    public native void uniform2ui(WebGLUniformLocation location, double v0, double v1);
    
    @JsMethod(name = "uniform2uiv")
    public native void uniform2uiv(WebGLUniformLocation location, Uint32Array v);
    
    @JsMethod(name = "uniform2uiv")
    public native void uniform2uiv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform2uiv")
    public native void uniform2uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset);
    
    @JsMethod(name = "uniform2uiv")
    public native void uniform2uiv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform2uiv")
    public native void uniform2uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2uiv")
    public native void uniform2uiv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3f")
    public native void uniform3f(WebGLUniformLocation location, float x, float y, float z);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3i")
    public native void uniform3i(WebGLUniformLocation location, double x, double y, double z);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, Int32Array v, double srcOffset);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, Int32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3iv")
    public native void uniform3iv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3ui")
    public native void uniform3ui(WebGLUniformLocation location, double v0, double v1, double v2);
    
    @JsMethod(name = "uniform3uiv")
    public native void uniform3uiv(WebGLUniformLocation location, Uint32Array v);
    
    @JsMethod(name = "uniform3uiv")
    public native void uniform3uiv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform3uiv")
    public native void uniform3uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset);
    
    @JsMethod(name = "uniform3uiv")
    public native void uniform3uiv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform3uiv")
    public native void uniform3uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3uiv")
    public native void uniform3uiv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4f")
    public native void uniform4f(WebGLUniformLocation location, float x, float y, float z, float w);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, float[] v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4i")
    public native void uniform4i(WebGLUniformLocation location, double x, double y, double z, double w);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, Int32Array v);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, Int32Array v, double srcOffset);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, Int32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4iv")
    public native void uniform4iv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4ui")
    public native void uniform4ui(WebGLUniformLocation location, double v0, double v1, double v2, double v3);
    
    @JsMethod(name = "uniform4uiv")
    public native void uniform4uiv(WebGLUniformLocation location, Uint32Array v);
    
    @JsMethod(name = "uniform4uiv")
    public native void uniform4uiv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform4uiv")
    public native void uniform4uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset);
    
    @JsMethod(name = "uniform4uiv")
    public native void uniform4uiv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform4uiv")
    public native void uniform4uiv(WebGLUniformLocation location, Uint32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4uiv")
    public native void uniform4uiv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformBlockBinding")
    public native void uniformBlockBinding(WebGLProgram program, double uniformBlockIndex, double uniformBlockBinding);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, float[] array);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, float[] array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, float[] array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, float[] value);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, float[] value);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, float[] array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, float[] array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, float[] array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, float[] value);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, float[] value);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, float[] array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, float[] array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, float[] array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, float[] value);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, float[] value);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, float[] value, double srcOffset, double srcLength);
    
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
    
    @JsMethod(name = "vertexAttribDivisor")
    public native void vertexAttribDivisor(double index, double divisor);
    
    @JsMethod(name = "vertexAttribI4i")
    public native void vertexAttribI4i(double index, double x, double y, double z, double w);
    
    @JsMethod(name = "vertexAttribI4iv")
    public native void vertexAttribI4iv(double index, Int32Array v);
    
    @JsMethod(name = "vertexAttribI4iv")
    public native void vertexAttribI4iv(double index, double[] v);
    
    @JsMethod(name = "vertexAttribI4ui")
    public native void vertexAttribI4ui(double index, double x, double y, double z, double w);
    
    @JsMethod(name = "vertexAttribI4uiv")
    public native void vertexAttribI4uiv(double index, Uint32Array v);
    
    @JsMethod(name = "vertexAttribI4uiv")
    public native void vertexAttribI4uiv(double index, double[] v);
    
    @JsMethod(name = "vertexAttribIPointer")
    public native void vertexAttribIPointer(double index, double size, double type, double stride, double offset);
    
    @JsMethod(name = "vertexAttribPointer")
    public native void vertexAttribPointer(double indx, double size, double type, boolean normalized, double stride, double offset);
    
    @JsMethod(name = "viewport")
    public native void viewport(double x, double y, double width, double height);
    
    @JsMethod(name = "waitSync")
    public native void waitSync(WebGLSync sync, double flags, double timeout);
    
}
