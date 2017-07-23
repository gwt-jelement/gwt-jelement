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

import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.webgl.WebGLActiveInfo;
import gwt.jelement.webgl.WebGLBuffer;
import gwt.jelement.webgl.WebGLProgram;
import gwt.jelement.webgl.WebGLQuery;
import gwt.jelement.webgl.WebGLSampler;
import gwt.jelement.webgl.WebGLSync;
import gwt.jelement.webgl.WebGLTexture;
import gwt.jelement.webgl.WebGLTransformFeedback;
import gwt.jelement.webgl.WebGLUniformLocation;
import gwt.jelement.webgl.WebGLVertexArrayObject;
import elemental2.core.ArrayBufferView;
import elemental2.core.Float32Array;
import elemental2.core.Int32Array;
import elemental2.core.Uint32Array;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsType;

@JsType(namespace = JsPackage.GLOBAL, isNative = true)
public class WebGL2RenderingContextBase{
    public static int READ_BUFFER;
    public static int UNPACK_ROW_LENGTH;
    public static int UNPACK_SKIP_ROWS;
    public static int UNPACK_SKIP_PIXELS;
    public static int PACK_ROW_LENGTH;
    public static int PACK_SKIP_ROWS;
    public static int PACK_SKIP_PIXELS;
    public static int COLOR;
    public static int DEPTH;
    public static int STENCIL;
    public static int RED;
    public static int RGB8;
    public static int RGBA8;
    public static int RGB10_A2;
    public static int TEXTURE_BINDING_3D;
    public static int UNPACK_SKIP_IMAGES;
    public static int UNPACK_IMAGE_HEIGHT;
    public static int TEXTURE_3D;
    public static int TEXTURE_WRAP_R;
    public static int MAX_3D_TEXTURE_SIZE;
    public static int UNSIGNED_INT_2_10_10_10_REV;
    public static int MAX_ELEMENTS_VERTICES;
    public static int MAX_ELEMENTS_INDICES;
    public static int TEXTURE_MIN_LOD;
    public static int TEXTURE_MAX_LOD;
    public static int TEXTURE_BASE_LEVEL;
    public static int TEXTURE_MAX_LEVEL;
    public static int MIN;
    public static int MAX;
    public static int DEPTH_COMPONENT24;
    public static int MAX_TEXTURE_LOD_BIAS;
    public static int TEXTURE_COMPARE_MODE;
    public static int TEXTURE_COMPARE_FUNC;
    public static int CURRENT_QUERY;
    public static int QUERY_RESULT;
    public static int QUERY_RESULT_AVAILABLE;
    public static int STREAM_READ;
    public static int STREAM_COPY;
    public static int STATIC_READ;
    public static int STATIC_COPY;
    public static int DYNAMIC_READ;
    public static int DYNAMIC_COPY;
    public static int MAX_DRAW_BUFFERS;
    public static int DRAW_BUFFER0;
    public static int DRAW_BUFFER1;
    public static int DRAW_BUFFER2;
    public static int DRAW_BUFFER3;
    public static int DRAW_BUFFER4;
    public static int DRAW_BUFFER5;
    public static int DRAW_BUFFER6;
    public static int DRAW_BUFFER7;
    public static int DRAW_BUFFER8;
    public static int DRAW_BUFFER9;
    public static int DRAW_BUFFER10;
    public static int DRAW_BUFFER11;
    public static int DRAW_BUFFER12;
    public static int DRAW_BUFFER13;
    public static int DRAW_BUFFER14;
    public static int DRAW_BUFFER15;
    public static int MAX_FRAGMENT_UNIFORM_COMPONENTS;
    public static int MAX_VERTEX_UNIFORM_COMPONENTS;
    public static int SAMPLER_3D;
    public static int SAMPLER_2D_SHADOW;
    public static int FRAGMENT_SHADER_DERIVATIVE_HINT;
    public static int PIXEL_PACK_BUFFER;
    public static int PIXEL_UNPACK_BUFFER;
    public static int PIXEL_PACK_BUFFER_BINDING;
    public static int PIXEL_UNPACK_BUFFER_BINDING;
    public static int FLOAT_MAT2x3;
    public static int FLOAT_MAT2x4;
    public static int FLOAT_MAT3x2;
    public static int FLOAT_MAT3x4;
    public static int FLOAT_MAT4x2;
    public static int FLOAT_MAT4x3;
    public static int SRGB;
    public static int SRGB8;
    public static int SRGB8_ALPHA8;
    public static int COMPARE_REF_TO_TEXTURE;
    public static int RGBA32F;
    public static int RGB32F;
    public static int RGBA16F;
    public static int RGB16F;
    public static int VERTEX_ATTRIB_ARRAY_INTEGER;
    public static int MAX_ARRAY_TEXTURE_LAYERS;
    public static int MIN_PROGRAM_TEXEL_OFFSET;
    public static int MAX_PROGRAM_TEXEL_OFFSET;
    public static int MAX_VARYING_COMPONENTS;
    public static int TEXTURE_2D_ARRAY;
    public static int TEXTURE_BINDING_2D_ARRAY;
    public static int R11F_G11F_B10F;
    public static int UNSIGNED_INT_10F_11F_11F_REV;
    public static int RGB9_E5;
    public static int UNSIGNED_INT_5_9_9_9_REV;
    public static int TRANSFORM_FEEDBACK_BUFFER_MODE;
    public static int MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS;
    public static int TRANSFORM_FEEDBACK_VARYINGS;
    public static int TRANSFORM_FEEDBACK_BUFFER_START;
    public static int TRANSFORM_FEEDBACK_BUFFER_SIZE;
    public static int TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN;
    public static int RASTERIZER_DISCARD;
    public static int MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS;
    public static int MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS;
    public static int INTERLEAVED_ATTRIBS;
    public static int SEPARATE_ATTRIBS;
    public static int TRANSFORM_FEEDBACK_BUFFER;
    public static int TRANSFORM_FEEDBACK_BUFFER_BINDING;
    public static int RGBA32UI;
    public static int RGB32UI;
    public static int RGBA16UI;
    public static int RGB16UI;
    public static int RGBA8UI;
    public static int RGB8UI;
    public static int RGBA32I;
    public static int RGB32I;
    public static int RGBA16I;
    public static int RGB16I;
    public static int RGBA8I;
    public static int RGB8I;
    public static int RED_INTEGER;
    public static int RGB_INTEGER;
    public static int RGBA_INTEGER;
    public static int SAMPLER_2D_ARRAY;
    public static int SAMPLER_2D_ARRAY_SHADOW;
    public static int SAMPLER_CUBE_SHADOW;
    public static int UNSIGNED_INT_VEC2;
    public static int UNSIGNED_INT_VEC3;
    public static int UNSIGNED_INT_VEC4;
    public static int INT_SAMPLER_2D;
    public static int INT_SAMPLER_3D;
    public static int INT_SAMPLER_CUBE;
    public static int INT_SAMPLER_2D_ARRAY;
    public static int UNSIGNED_INT_SAMPLER_2D;
    public static int UNSIGNED_INT_SAMPLER_3D;
    public static int UNSIGNED_INT_SAMPLER_CUBE;
    public static int UNSIGNED_INT_SAMPLER_2D_ARRAY;
    public static int DEPTH_COMPONENT32F;
    public static int DEPTH32F_STENCIL8;
    public static int FLOAT_32_UNSIGNED_INT_24_8_REV;
    public static int FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING;
    public static int FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE;
    public static int FRAMEBUFFER_ATTACHMENT_RED_SIZE;
    public static int FRAMEBUFFER_ATTACHMENT_GREEN_SIZE;
    public static int FRAMEBUFFER_ATTACHMENT_BLUE_SIZE;
    public static int FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE;
    public static int FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE;
    public static int FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE;
    public static int FRAMEBUFFER_DEFAULT;
    public static int UNSIGNED_INT_24_8;
    public static int DEPTH24_STENCIL8;
    public static int UNSIGNED_NORMALIZED;
    public static int DRAW_FRAMEBUFFER_BINDING;
    public static int READ_FRAMEBUFFER;
    public static int DRAW_FRAMEBUFFER;
    public static int READ_FRAMEBUFFER_BINDING;
    public static int RENDERBUFFER_SAMPLES;
    public static int FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER;
    public static int MAX_COLOR_ATTACHMENTS;
    public static int COLOR_ATTACHMENT1;
    public static int COLOR_ATTACHMENT2;
    public static int COLOR_ATTACHMENT3;
    public static int COLOR_ATTACHMENT4;
    public static int COLOR_ATTACHMENT5;
    public static int COLOR_ATTACHMENT6;
    public static int COLOR_ATTACHMENT7;
    public static int COLOR_ATTACHMENT8;
    public static int COLOR_ATTACHMENT9;
    public static int COLOR_ATTACHMENT10;
    public static int COLOR_ATTACHMENT11;
    public static int COLOR_ATTACHMENT12;
    public static int COLOR_ATTACHMENT13;
    public static int COLOR_ATTACHMENT14;
    public static int COLOR_ATTACHMENT15;
    public static int FRAMEBUFFER_INCOMPLETE_MULTISAMPLE;
    public static int MAX_SAMPLES;
    public static int HALF_FLOAT;
    public static int RG;
    public static int RG_INTEGER;
    public static int R8;
    public static int RG8;
    public static int R16F;
    public static int R32F;
    public static int RG16F;
    public static int RG32F;
    public static int R8I;
    public static int R8UI;
    public static int R16I;
    public static int R16UI;
    public static int R32I;
    public static int R32UI;
    public static int RG8I;
    public static int RG8UI;
    public static int RG16I;
    public static int RG16UI;
    public static int RG32I;
    public static int RG32UI;
    public static int VERTEX_ARRAY_BINDING;
    public static int R8_SNORM;
    public static int RG8_SNORM;
    public static int RGB8_SNORM;
    public static int RGBA8_SNORM;
    public static int SIGNED_NORMALIZED;
    public static int COPY_READ_BUFFER;
    public static int COPY_WRITE_BUFFER;
    public static int COPY_READ_BUFFER_BINDING;
    public static int COPY_WRITE_BUFFER_BINDING;
    public static int UNIFORM_BUFFER;
    public static int UNIFORM_BUFFER_BINDING;
    public static int UNIFORM_BUFFER_START;
    public static int UNIFORM_BUFFER_SIZE;
    public static int MAX_VERTEX_UNIFORM_BLOCKS;
    public static int MAX_FRAGMENT_UNIFORM_BLOCKS;
    public static int MAX_COMBINED_UNIFORM_BLOCKS;
    public static int MAX_UNIFORM_BUFFER_BINDINGS;
    public static int MAX_UNIFORM_BLOCK_SIZE;
    public static int MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS;
    public static int MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS;
    public static int UNIFORM_BUFFER_OFFSET_ALIGNMENT;
    public static int ACTIVE_UNIFORM_BLOCKS;
    public static int UNIFORM_TYPE;
    public static int UNIFORM_SIZE;
    public static int UNIFORM_BLOCK_INDEX;
    public static int UNIFORM_OFFSET;
    public static int UNIFORM_ARRAY_STRIDE;
    public static int UNIFORM_MATRIX_STRIDE;
    public static int UNIFORM_IS_ROW_MAJOR;
    public static int UNIFORM_BLOCK_BINDING;
    public static int UNIFORM_BLOCK_DATA_SIZE;
    public static int UNIFORM_BLOCK_ACTIVE_UNIFORMS;
    public static int UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES;
    public static int UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER;
    public static int UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER;
    public static int INVALID_INDEX;
    public static int MAX_VERTEX_OUTPUT_COMPONENTS;
    public static int MAX_FRAGMENT_INPUT_COMPONENTS;
    public static int MAX_SERVER_WAIT_TIMEOUT;
    public static int OBJECT_TYPE;
    public static int SYNC_CONDITION;
    public static int SYNC_STATUS;
    public static int SYNC_FLAGS;
    public static int SYNC_FENCE;
    public static int SYNC_GPU_COMMANDS_COMPLETE;
    public static int UNSIGNALED;
    public static int SIGNALED;
    public static int ALREADY_SIGNALED;
    public static int TIMEOUT_EXPIRED;
    public static int CONDITION_SATISFIED;
    public static int WAIT_FAILED;
    public static int SYNC_FLUSH_COMMANDS_BIT;
    public static int VERTEX_ATTRIB_ARRAY_DIVISOR;
    public static int ANY_SAMPLES_PASSED;
    public static int ANY_SAMPLES_PASSED_CONSERVATIVE;
    public static int SAMPLER_BINDING;
    public static int RGB10_A2UI;
    public static int INT_2_10_10_10_REV;
    public static int TRANSFORM_FEEDBACK;
    public static int TRANSFORM_FEEDBACK_PAUSED;
    public static int TRANSFORM_FEEDBACK_ACTIVE;
    public static int TRANSFORM_FEEDBACK_BINDING;
    public static int TEXTURE_IMMUTABLE_FORMAT;
    public static int MAX_ELEMENT_INDEX;
    public static int TEXTURE_IMMUTABLE_LEVELS;
    public static int TIMEOUT_IGNORED;
    public static int MAX_CLIENT_WAIT_TIMEOUT_WEBGL;
    
    
    @JsMethod(name = "beginQuery")
    public native void beginQuery(double target, WebGLQuery query);
    
    @JsMethod(name = "beginTransformFeedback")
    public native void beginTransformFeedback(double primitiveMode);
    
    @JsMethod(name = "bindBufferBase")
    public native void bindBufferBase(double target, double index, WebGLBuffer buffer);
    
    @JsMethod(name = "bindBufferRange")
    public native void bindBufferRange(double target, double index, WebGLBuffer buffer, double offset, double size);
    
    @JsMethod(name = "bindSampler")
    public native void bindSampler(double unit, WebGLSampler sampler);
    
    @JsMethod(name = "bindTransformFeedback")
    public native void bindTransformFeedback(double target, WebGLTransformFeedback feedback);
    
    @JsMethod(name = "bindVertexArray")
    public native void bindVertexArray(WebGLVertexArrayObject vertexArray);
    
    @JsMethod(name = "blitFramebuffer")
    public native void blitFramebuffer(double srcX0, double srcY0, double srcX1, double srcY1, double dstX0, double dstY0, double dstX1, double dstY1, double mask, double filter);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBufferView srcData, double usage, double srcOffset);
    
    @JsMethod(name = "bufferData")
    public native void bufferData(double target, ArrayBufferView srcData, double usage, double srcOffset, double length);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double dstByteOffset, ArrayBufferView srcData, double srcOffset);
    
    @JsMethod(name = "bufferSubData")
    public native void bufferSubData(double target, double dstByteOffset, ArrayBufferView srcData, double srcOffset, double length);
    
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
    
    @JsMethod(name = "clientWaitSync")
    public native double clientWaitSync(WebGLSync sync, double flags, double timeout);
    
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
    
    @JsMethod(name = "copyTexSubImage3D")
    public native void copyTexSubImage3D(double target, double level, double xoffset, double yoffset, double zoffset, double x, double y, double width, double height);
    
    @JsMethod(name = "createQuery")
    public native WebGLQuery createQuery();
    
    @JsMethod(name = "createSampler")
    public native WebGLSampler createSampler();
    
    @JsMethod(name = "createTransformFeedback")
    public native WebGLTransformFeedback createTransformFeedback();
    
    @JsMethod(name = "createVertexArray")
    public native WebGLVertexArrayObject createVertexArray();
    
    @JsMethod(name = "deleteQuery")
    public native void deleteQuery(WebGLQuery query);
    
    @JsMethod(name = "deleteSampler")
    public native void deleteSampler(WebGLSampler sampler);
    
    @JsMethod(name = "deleteSync")
    public native void deleteSync(WebGLSync sync);
    
    @JsMethod(name = "deleteTransformFeedback")
    public native void deleteTransformFeedback(WebGLTransformFeedback feedback);
    
    @JsMethod(name = "deleteVertexArray")
    public native void deleteVertexArray(WebGLVertexArrayObject vertexArray);
    
    @JsMethod(name = "drawArraysInstanced")
    public native void drawArraysInstanced(double mode, double first, double count, double instanceCount);
    
    @JsMethod(name = "drawBuffers")
    public native void drawBuffers(double[] buffers);
    
    @JsMethod(name = "drawElementsInstanced")
    public native void drawElementsInstanced(double mode, double count, double type, double offset, double instanceCount);
    
    @JsMethod(name = "drawRangeElements")
    public native void drawRangeElements(double mode, double start, double end, double count, double type, double offset);
    
    @JsMethod(name = "endQuery")
    public native void endQuery(double target);
    
    @JsMethod(name = "endTransformFeedback")
    public native void endTransformFeedback();
    
    @JsMethod(name = "fenceSync")
    public native WebGLSync fenceSync(double condition, double flags);
    
    @JsMethod(name = "framebufferTextureLayer")
    public native void framebufferTextureLayer(double target, double attachment, WebGLTexture texture, double level, double layer);
    
    @JsMethod(name = "getActiveUniformBlockName")
    public native String getActiveUniformBlockName(WebGLProgram program, double uniformBlockIndex);
    
    @JsMethod(name = "getActiveUniformBlockParameter")
    public native Object getActiveUniformBlockParameter(WebGLProgram program, double uniformBlockIndex, double pname);
    
    @JsMethod(name = "getActiveUniforms")
    public native Object getActiveUniforms(WebGLProgram program, double[] uniformIndices, double pname);
    
    @JsMethod(name = "getBufferSubData")
    public native void getBufferSubData(double target, double srcByteOffset, ArrayBufferView dstData);
    
    @JsMethod(name = "getBufferSubData")
    public native void getBufferSubData(double target, double srcByteOffset, ArrayBufferView dstData, double dstOffset);
    
    @JsMethod(name = "getBufferSubData")
    public native void getBufferSubData(double target, double srcByteOffset, ArrayBufferView dstData, double dstOffset, double length);
    
    @JsMethod(name = "getFragDataLocation")
    public native double getFragDataLocation(WebGLProgram program, String name);
    
    @JsMethod(name = "getIndexedParameter")
    public native Object getIndexedParameter(double target, double index);
    
    @JsMethod(name = "getInternalformatParameter")
    public native Object getInternalformatParameter(double target, double internalformat, double pname);
    
    @JsMethod(name = "getQuery")
    public native Object getQuery(double target, double pname);
    
    @JsMethod(name = "getQueryParameter")
    public native Object getQueryParameter(WebGLQuery query, double pname);
    
    @JsMethod(name = "getSamplerParameter")
    public native Object getSamplerParameter(WebGLSampler sampler, double pname);
    
    @JsMethod(name = "getSyncParameter")
    public native Object getSyncParameter(WebGLSync sync, double pname);
    
    @JsMethod(name = "getTransformFeedbackVarying")
    public native WebGLActiveInfo getTransformFeedbackVarying(WebGLProgram program, double index);
    
    @JsMethod(name = "getUniformBlockIndex")
    public native double getUniformBlockIndex(WebGLProgram program, String uniformBlockName);
    
    @JsMethod(name = "getUniformIndices")
    public native double[] getUniformIndices(WebGLProgram program, String[] uniformNames);
    
    @JsMethod(name = "invalidateFramebuffer")
    public native void invalidateFramebuffer(double target, double[] attachments);
    
    @JsMethod(name = "invalidateSubFramebuffer")
    public native void invalidateSubFramebuffer(double target, double[] attachments, double x, double y, double width, double height);
    
    @JsMethod(name = "isQuery")
    public native boolean isQuery(WebGLQuery query);
    
    @JsMethod(name = "isSampler")
    public native boolean isSampler(WebGLSampler sampler);
    
    @JsMethod(name = "isSync")
    public native boolean isSync(WebGLSync sync);
    
    @JsMethod(name = "isTransformFeedback")
    public native boolean isTransformFeedback(WebGLTransformFeedback feedback);
    
    @JsMethod(name = "isVertexArray")
    public native boolean isVertexArray(WebGLVertexArrayObject vertexArray);
    
    @JsMethod(name = "pauseTransformFeedback")
    public native void pauseTransformFeedback();
    
    @JsMethod(name = "readBuffer")
    public native void readBuffer(double mode);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(double x, double y, double width, double height, double format, double type, double offset);
    
    @JsMethod(name = "readPixels")
    public native void readPixels(double x, double y, double width, double height, double format, double type, ArrayBufferView dstData, double offset);
    
    @JsMethod(name = "renderbufferStorageMultisample")
    public native void renderbufferStorageMultisample(double target, double samples, double internalformat, double width, double height);
    
    @JsMethod(name = "resumeTransformFeedback")
    public native void resumeTransformFeedback();
    
    @JsMethod(name = "samplerParameterf")
    public native void samplerParameterf(WebGLSampler sampler, double pname, float param);
    
    @JsMethod(name = "samplerParameteri")
    public native void samplerParameteri(WebGLSampler sampler, double pname, double param);
    
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
    
    @JsMethod(name = "texStorage2D")
    public native void texStorage2D(double target, double levels, double internalformat, double width, double height);
    
    @JsMethod(name = "texStorage3D")
    public native void texStorage3D(double target, double levels, double internalformat, double width, double height, double depth);
    
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
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
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
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
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
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
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
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, float[] v, double srcOffset);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, float[] v, double srcOffset, double srcLength);
    
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
    
    @JsMethod(name = "waitSync")
    public native void waitSync(WebGLSync sync, double flags, double timeout);
    
}
