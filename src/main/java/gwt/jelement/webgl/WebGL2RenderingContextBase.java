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
import gwt.jelement.core.JsObject;
import gwt.jelement.core.Uint32Array;
import gwt.jelement.html.HTMLCanvasElement;
import gwt.jelement.html.HTMLImageElement;
import gwt.jelement.html.HTMLVideoElement;
import gwt.jelement.html.ImageData;
import gwt.jelement.imagebitmap.ImageBitmap;
import gwt.jelement.offscreencanvas.OffscreenCanvas;
import elemental2.promise.Promise;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;
import jsinterop.base.Js;

@JsType(namespace = JsPackage.GLOBAL, name="WebGL2RenderingContextBase", isNative = true)
public class WebGL2RenderingContextBase extends JsObject{
    public static double READ_BUFFER; /* 0x0C02 */
    public static double UNPACK_ROW_LENGTH; /* 0x0CF2 */
    public static double UNPACK_SKIP_ROWS; /* 0x0CF3 */
    public static double UNPACK_SKIP_PIXELS; /* 0x0CF4 */
    public static double PACK_ROW_LENGTH; /* 0x0D02 */
    public static double PACK_SKIP_ROWS; /* 0x0D03 */
    public static double PACK_SKIP_PIXELS; /* 0x0D04 */
    public static double COLOR; /* 0x1800 */
    public static double DEPTH; /* 0x1801 */
    public static double STENCIL; /* 0x1802 */
    public static double RED; /* 0x1903 */
    public static double RGB8; /* 0x8051 */
    public static double RGBA8; /* 0x8058 */
    public static double RGB10_A2; /* 0x8059 */
    public static double TEXTURE_BINDING_3D; /* 0x806A */
    public static double UNPACK_SKIP_IMAGES; /* 0x806D */
    public static double UNPACK_IMAGE_HEIGHT; /* 0x806E */
    public static double TEXTURE_3D; /* 0x806F */
    public static double TEXTURE_WRAP_R; /* 0x8072 */
    public static double MAX_3D_TEXTURE_SIZE; /* 0x8073 */
    public static double UNSIGNED_INT_2_10_10_10_REV; /* 0x8368 */
    public static double MAX_ELEMENTS_VERTICES; /* 0x80E8 */
    public static double MAX_ELEMENTS_INDICES; /* 0x80E9 */
    public static double TEXTURE_MIN_LOD; /* 0x813A */
    public static double TEXTURE_MAX_LOD; /* 0x813B */
    public static double TEXTURE_BASE_LEVEL; /* 0x813C */
    public static double TEXTURE_MAX_LEVEL; /* 0x813D */
    public static double MIN; /* 0x8007 */
    public static double MAX; /* 0x8008 */
    public static double DEPTH_COMPONENT24; /* 0x81A6 */
    public static double MAX_TEXTURE_LOD_BIAS; /* 0x84FD */
    public static double TEXTURE_COMPARE_MODE; /* 0x884C */
    public static double TEXTURE_COMPARE_FUNC; /* 0x884D */
    public static double CURRENT_QUERY; /* 0x8865 */
    public static double QUERY_RESULT; /* 0x8866 */
    public static double QUERY_RESULT_AVAILABLE; /* 0x8867 */
    public static double STREAM_READ; /* 0x88E1 */
    public static double STREAM_COPY; /* 0x88E2 */
    public static double STATIC_READ; /* 0x88E5 */
    public static double STATIC_COPY; /* 0x88E6 */
    public static double DYNAMIC_READ; /* 0x88E9 */
    public static double DYNAMIC_COPY; /* 0x88EA */
    public static double MAX_DRAW_BUFFERS; /* 0x8824 */
    public static double DRAW_BUFFER0; /* 0x8825 */
    public static double DRAW_BUFFER1; /* 0x8826 */
    public static double DRAW_BUFFER2; /* 0x8827 */
    public static double DRAW_BUFFER3; /* 0x8828 */
    public static double DRAW_BUFFER4; /* 0x8829 */
    public static double DRAW_BUFFER5; /* 0x882A */
    public static double DRAW_BUFFER6; /* 0x882B */
    public static double DRAW_BUFFER7; /* 0x882C */
    public static double DRAW_BUFFER8; /* 0x882D */
    public static double DRAW_BUFFER9; /* 0x882E */
    public static double DRAW_BUFFER10; /* 0x882F */
    public static double DRAW_BUFFER11; /* 0x8830 */
    public static double DRAW_BUFFER12; /* 0x8831 */
    public static double DRAW_BUFFER13; /* 0x8832 */
    public static double DRAW_BUFFER14; /* 0x8833 */
    public static double DRAW_BUFFER15; /* 0x8834 */
    public static double MAX_FRAGMENT_UNIFORM_COMPONENTS; /* 0x8B49 */
    public static double MAX_VERTEX_UNIFORM_COMPONENTS; /* 0x8B4A */
    public static double SAMPLER_3D; /* 0x8B5F */
    public static double SAMPLER_2D_SHADOW; /* 0x8B62 */
    public static double FRAGMENT_SHADER_DERIVATIVE_HINT; /* 0x8B8B */
    public static double PIXEL_PACK_BUFFER; /* 0x88EB */
    public static double PIXEL_UNPACK_BUFFER; /* 0x88EC */
    public static double PIXEL_PACK_BUFFER_BINDING; /* 0x88ED */
    public static double PIXEL_UNPACK_BUFFER_BINDING; /* 0x88EF */
    public static double FLOAT_MAT2x3; /* 0x8B65 */
    public static double FLOAT_MAT2x4; /* 0x8B66 */
    public static double FLOAT_MAT3x2; /* 0x8B67 */
    public static double FLOAT_MAT3x4; /* 0x8B68 */
    public static double FLOAT_MAT4x2; /* 0x8B69 */
    public static double FLOAT_MAT4x3; /* 0x8B6A */
    public static double SRGB; /* 0x8C40 */
    public static double SRGB8; /* 0x8C41 */
    public static double SRGB8_ALPHA8; /* 0x8C43 */
    public static double COMPARE_REF_TO_TEXTURE; /* 0x884E */
    public static double RGBA32F; /* 0x8814 */
    public static double RGB32F; /* 0x8815 */
    public static double RGBA16F; /* 0x881A */
    public static double RGB16F; /* 0x881B */
    public static double VERTEX_ATTRIB_ARRAY_INTEGER; /* 0x88FD */
    public static double MAX_ARRAY_TEXTURE_LAYERS; /* 0x88FF */
    public static double MIN_PROGRAM_TEXEL_OFFSET; /* 0x8904 */
    public static double MAX_PROGRAM_TEXEL_OFFSET; /* 0x8905 */
    public static double MAX_VARYING_COMPONENTS; /* 0x8B4B */
    public static double TEXTURE_2D_ARRAY; /* 0x8C1A */
    public static double TEXTURE_BINDING_2D_ARRAY; /* 0x8C1D */
    public static double R11F_G11F_B10F; /* 0x8C3A */
    public static double UNSIGNED_INT_10F_11F_11F_REV; /* 0x8C3B */
    public static double RGB9_E5; /* 0x8C3D */
    public static double UNSIGNED_INT_5_9_9_9_REV; /* 0x8C3E */
    public static double TRANSFORM_FEEDBACK_BUFFER_MODE; /* 0x8C7F */
    public static double MAX_TRANSFORM_FEEDBACK_SEPARATE_COMPONENTS; /* 0x8C80 */
    public static double TRANSFORM_FEEDBACK_VARYINGS; /* 0x8C83 */
    public static double TRANSFORM_FEEDBACK_BUFFER_START; /* 0x8C84 */
    public static double TRANSFORM_FEEDBACK_BUFFER_SIZE; /* 0x8C85 */
    public static double TRANSFORM_FEEDBACK_PRIMITIVES_WRITTEN; /* 0x8C88 */
    public static double RASTERIZER_DISCARD; /* 0x8C89 */
    public static double MAX_TRANSFORM_FEEDBACK_INTERLEAVED_COMPONENTS; /* 0x8C8A */
    public static double MAX_TRANSFORM_FEEDBACK_SEPARATE_ATTRIBS; /* 0x8C8B */
    public static double INTERLEAVED_ATTRIBS; /* 0x8C8C */
    public static double SEPARATE_ATTRIBS; /* 0x8C8D */
    public static double TRANSFORM_FEEDBACK_BUFFER; /* 0x8C8E */
    public static double TRANSFORM_FEEDBACK_BUFFER_BINDING; /* 0x8C8F */
    public static double RGBA32UI; /* 0x8D70 */
    public static double RGB32UI; /* 0x8D71 */
    public static double RGBA16UI; /* 0x8D76 */
    public static double RGB16UI; /* 0x8D77 */
    public static double RGBA8UI; /* 0x8D7C */
    public static double RGB8UI; /* 0x8D7D */
    public static double RGBA32I; /* 0x8D82 */
    public static double RGB32I; /* 0x8D83 */
    public static double RGBA16I; /* 0x8D88 */
    public static double RGB16I; /* 0x8D89 */
    public static double RGBA8I; /* 0x8D8E */
    public static double RGB8I; /* 0x8D8F */
    public static double RED_INTEGER; /* 0x8D94 */
    public static double RGB_INTEGER; /* 0x8D98 */
    public static double RGBA_INTEGER; /* 0x8D99 */
    public static double SAMPLER_2D_ARRAY; /* 0x8DC1 */
    public static double SAMPLER_2D_ARRAY_SHADOW; /* 0x8DC4 */
    public static double SAMPLER_CUBE_SHADOW; /* 0x8DC5 */
    public static double UNSIGNED_INT_VEC2; /* 0x8DC6 */
    public static double UNSIGNED_INT_VEC3; /* 0x8DC7 */
    public static double UNSIGNED_INT_VEC4; /* 0x8DC8 */
    public static double INT_SAMPLER_2D; /* 0x8DCA */
    public static double INT_SAMPLER_3D; /* 0x8DCB */
    public static double INT_SAMPLER_CUBE; /* 0x8DCC */
    public static double INT_SAMPLER_2D_ARRAY; /* 0x8DCF */
    public static double UNSIGNED_INT_SAMPLER_2D; /* 0x8DD2 */
    public static double UNSIGNED_INT_SAMPLER_3D; /* 0x8DD3 */
    public static double UNSIGNED_INT_SAMPLER_CUBE; /* 0x8DD4 */
    public static double UNSIGNED_INT_SAMPLER_2D_ARRAY; /* 0x8DD7 */
    public static double DEPTH_COMPONENT32F; /* 0x8CAC */
    public static double DEPTH32F_STENCIL8; /* 0x8CAD */
    public static double FLOAT_32_UNSIGNED_INT_24_8_REV; /* 0x8DAD */
    public static double FRAMEBUFFER_ATTACHMENT_COLOR_ENCODING; /* 0x8210 */
    public static double FRAMEBUFFER_ATTACHMENT_COMPONENT_TYPE; /* 0x8211 */
    public static double FRAMEBUFFER_ATTACHMENT_RED_SIZE; /* 0x8212 */
    public static double FRAMEBUFFER_ATTACHMENT_GREEN_SIZE; /* 0x8213 */
    public static double FRAMEBUFFER_ATTACHMENT_BLUE_SIZE; /* 0x8214 */
    public static double FRAMEBUFFER_ATTACHMENT_ALPHA_SIZE; /* 0x8215 */
    public static double FRAMEBUFFER_ATTACHMENT_DEPTH_SIZE; /* 0x8216 */
    public static double FRAMEBUFFER_ATTACHMENT_STENCIL_SIZE; /* 0x8217 */
    public static double FRAMEBUFFER_DEFAULT; /* 0x8218 */
    public static double UNSIGNED_INT_24_8; /* 0x84FA */
    public static double DEPTH24_STENCIL8; /* 0x88F0 */
    public static double UNSIGNED_NORMALIZED; /* 0x8C17 */
    public static double DRAW_FRAMEBUFFER_BINDING; /* 0x8CA6 */
    public static double READ_FRAMEBUFFER; /* 0x8CA8 */
    public static double DRAW_FRAMEBUFFER; /* 0x8CA9 */
    public static double READ_FRAMEBUFFER_BINDING; /* 0x8CAA */
    public static double RENDERBUFFER_SAMPLES; /* 0x8CAB */
    public static double FRAMEBUFFER_ATTACHMENT_TEXTURE_LAYER; /* 0x8CD4 */
    public static double MAX_COLOR_ATTACHMENTS; /* 0x8CDF */
    public static double COLOR_ATTACHMENT1; /* 0x8CE1 */
    public static double COLOR_ATTACHMENT2; /* 0x8CE2 */
    public static double COLOR_ATTACHMENT3; /* 0x8CE3 */
    public static double COLOR_ATTACHMENT4; /* 0x8CE4 */
    public static double COLOR_ATTACHMENT5; /* 0x8CE5 */
    public static double COLOR_ATTACHMENT6; /* 0x8CE6 */
    public static double COLOR_ATTACHMENT7; /* 0x8CE7 */
    public static double COLOR_ATTACHMENT8; /* 0x8CE8 */
    public static double COLOR_ATTACHMENT9; /* 0x8CE9 */
    public static double COLOR_ATTACHMENT10; /* 0x8CEA */
    public static double COLOR_ATTACHMENT11; /* 0x8CEB */
    public static double COLOR_ATTACHMENT12; /* 0x8CEC */
    public static double COLOR_ATTACHMENT13; /* 0x8CED */
    public static double COLOR_ATTACHMENT14; /* 0x8CEE */
    public static double COLOR_ATTACHMENT15; /* 0x8CEF */
    public static double FRAMEBUFFER_INCOMPLETE_MULTISAMPLE; /* 0x8D56 */
    public static double MAX_SAMPLES; /* 0x8D57 */
    public static double HALF_FLOAT; /* 0x140B */
    public static double RG; /* 0x8227 */
    public static double RG_INTEGER; /* 0x8228 */
    public static double R8; /* 0x8229 */
    public static double RG8; /* 0x822B */
    public static double R16F; /* 0x822D */
    public static double R32F; /* 0x822E */
    public static double RG16F; /* 0x822F */
    public static double RG32F; /* 0x8230 */
    public static double R8I; /* 0x8231 */
    public static double R8UI; /* 0x8232 */
    public static double R16I; /* 0x8233 */
    public static double R16UI; /* 0x8234 */
    public static double R32I; /* 0x8235 */
    public static double R32UI; /* 0x8236 */
    public static double RG8I; /* 0x8237 */
    public static double RG8UI; /* 0x8238 */
    public static double RG16I; /* 0x8239 */
    public static double RG16UI; /* 0x823A */
    public static double RG32I; /* 0x823B */
    public static double RG32UI; /* 0x823C */
    public static double VERTEX_ARRAY_BINDING; /* 0x85B5 */
    public static double R8_SNORM; /* 0x8F94 */
    public static double RG8_SNORM; /* 0x8F95 */
    public static double RGB8_SNORM; /* 0x8F96 */
    public static double RGBA8_SNORM; /* 0x8F97 */
    public static double SIGNED_NORMALIZED; /* 0x8F9C */
    public static double COPY_READ_BUFFER; /* 0x8F36 */
    public static double COPY_WRITE_BUFFER; /* 0x8F37 */
    public static double COPY_READ_BUFFER_BINDING; /* 0x8F36 */
    public static double COPY_WRITE_BUFFER_BINDING; /* 0x8F37 */
    public static double UNIFORM_BUFFER; /* 0x8A11 */
    public static double UNIFORM_BUFFER_BINDING; /* 0x8A28 */
    public static double UNIFORM_BUFFER_START; /* 0x8A29 */
    public static double UNIFORM_BUFFER_SIZE; /* 0x8A2A */
    public static double MAX_VERTEX_UNIFORM_BLOCKS; /* 0x8A2B */
    public static double MAX_FRAGMENT_UNIFORM_BLOCKS; /* 0x8A2D */
    public static double MAX_COMBINED_UNIFORM_BLOCKS; /* 0x8A2E */
    public static double MAX_UNIFORM_BUFFER_BINDINGS; /* 0x8A2F */
    public static double MAX_UNIFORM_BLOCK_SIZE; /* 0x8A30 */
    public static double MAX_COMBINED_VERTEX_UNIFORM_COMPONENTS; /* 0x8A31 */
    public static double MAX_COMBINED_FRAGMENT_UNIFORM_COMPONENTS; /* 0x8A33 */
    public static double UNIFORM_BUFFER_OFFSET_ALIGNMENT; /* 0x8A34 */
    public static double ACTIVE_UNIFORM_BLOCKS; /* 0x8A36 */
    public static double UNIFORM_TYPE; /* 0x8A37 */
    public static double UNIFORM_SIZE; /* 0x8A38 */
    public static double UNIFORM_BLOCK_INDEX; /* 0x8A3A */
    public static double UNIFORM_OFFSET; /* 0x8A3B */
    public static double UNIFORM_ARRAY_STRIDE; /* 0x8A3C */
    public static double UNIFORM_MATRIX_STRIDE; /* 0x8A3D */
    public static double UNIFORM_IS_ROW_MAJOR; /* 0x8A3E */
    public static double UNIFORM_BLOCK_BINDING; /* 0x8A3F */
    public static double UNIFORM_BLOCK_DATA_SIZE; /* 0x8A40 */
    public static double UNIFORM_BLOCK_ACTIVE_UNIFORMS; /* 0x8A42 */
    public static double UNIFORM_BLOCK_ACTIVE_UNIFORM_INDICES; /* 0x8A43 */
    public static double UNIFORM_BLOCK_REFERENCED_BY_VERTEX_SHADER; /* 0x8A44 */
    public static double UNIFORM_BLOCK_REFERENCED_BY_FRAGMENT_SHADER; /* 0x8A46 */
    public static double INVALID_INDEX; /* 0xFFFFFFFF */
    public static double MAX_VERTEX_OUTPUT_COMPONENTS; /* 0x9122 */
    public static double MAX_FRAGMENT_INPUT_COMPONENTS; /* 0x9125 */
    public static double MAX_SERVER_WAIT_TIMEOUT; /* 0x9111 */
    public static double OBJECT_TYPE; /* 0x9112 */
    public static double SYNC_CONDITION; /* 0x9113 */
    public static double SYNC_STATUS; /* 0x9114 */
    public static double SYNC_FLAGS; /* 0x9115 */
    public static double SYNC_FENCE; /* 0x9116 */
    public static double SYNC_GPU_COMMANDS_COMPLETE; /* 0x9117 */
    public static double UNSIGNALED; /* 0x9118 */
    public static double SIGNALED; /* 0x9119 */
    public static double ALREADY_SIGNALED; /* 0x911A */
    public static double TIMEOUT_EXPIRED; /* 0x911B */
    public static double CONDITION_SATISFIED; /* 0x911C */
    public static double WAIT_FAILED; /* 0x911D */
    public static double SYNC_FLUSH_COMMANDS_BIT; /* 0x00000001 */
    public static double VERTEX_ATTRIB_ARRAY_DIVISOR; /* 0x88FE */
    public static double ANY_SAMPLES_PASSED; /* 0x8C2F */
    public static double ANY_SAMPLES_PASSED_CONSERVATIVE; /* 0x8D6A */
    public static double SAMPLER_BINDING; /* 0x8919 */
    public static double RGB10_A2UI; /* 0x906F */
    public static double INT_2_10_10_10_REV; /* 0x8D9F */
    public static double TRANSFORM_FEEDBACK; /* 0x8E22 */
    public static double TRANSFORM_FEEDBACK_PAUSED; /* 0x8E23 */
    public static double TRANSFORM_FEEDBACK_ACTIVE; /* 0x8E24 */
    public static double TRANSFORM_FEEDBACK_BINDING; /* 0x8E25 */
    public static double TEXTURE_IMMUTABLE_FORMAT; /* 0x912F */
    public static double MAX_ELEMENT_INDEX; /* 0x8D6B */
    public static double TEXTURE_IMMUTABLE_LEVELS; /* 0x82DF */
    public static double TIMEOUT_IGNORED; /* -1 */
    public static double MAX_CLIENT_WAIT_TIMEOUT_WEBGL; /* 0x9247 */
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
    
    @JsConstructor
    public WebGL2RenderingContextBase(){
        super();
    }
    
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
    public native void blendColor(double red, double green, double blue, double alpha);
    
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
    public native void clearBufferfi(double buffer, double drawbuffer, double depth, double stencil);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, Float32Array value);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, double[] value);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, Float32Array value, double srcOffset);
    
    @JsMethod(name = "clearBufferfv")
    public native void clearBufferfv(double buffer, double drawbuffer, double[] value, double srcOffset);
    
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
    public native void clearColor(double red, double green, double blue, double alpha);
    
    @JsMethod(name = "clearDepth")
    public native void clearDepth(double depth);
    
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
    public native void depthRange(double zNear, double zFar);
    
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
    public native void lineWidth(double width);
    
    @JsMethod(name = "linkProgram")
    public native void linkProgram(WebGLProgram program);
    
    @JsMethod(name = "pauseTransformFeedback")
    public native void pauseTransformFeedback();
    
    @JsMethod(name = "pixelStorei")
    public native void pixelStorei(double pname, double param);
    
    @JsMethod(name = "polygonOffset")
    public native void polygonOffset(double factor, double units);
    
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
    public native void sampleCoverage(double value, boolean invert);
    
    @JsMethod(name = "samplerParameterf")
    public native void samplerParameterf(WebGLSampler sampler, double pname, double param);
    
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
    public native void texParameterf(double target, double pname, double param);
    
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
    public native void uniform1f(WebGLUniformLocation location, double x);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform1fv")
    public native void uniform1fv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
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
    public native void uniform2f(WebGLUniformLocation location, double x, double y);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform2fv")
    public native void uniform2fv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
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
    public native void uniform3f(WebGLUniformLocation location, double x, double y, double z);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform3fv")
    public native void uniform3fv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
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
    public native void uniform4f(WebGLUniformLocation location, double x, double y, double z, double w);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, double[] v);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v, double srcOffset);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, double[] v, double srcOffset);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, Float32Array v, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniform4fv")
    public native void uniform4fv(WebGLUniformLocation location, double[] v, double srcOffset, double srcLength);
    
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
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, double[] array);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, double[] array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2fv")
    public native void uniformMatrix2fv(WebGLUniformLocation location, boolean transpose, double[] array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, double[] value);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x3fv")
    public native void uniformMatrix2x3fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, double[] value);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix2x4fv")
    public native void uniformMatrix2x4fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, double[] array);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, double[] array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3fv")
    public native void uniformMatrix3fv(WebGLUniformLocation location, boolean transpose, double[] array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, double[] value);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x2fv")
    public native void uniformMatrix3x2fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, double[] value);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix3x4fv")
    public native void uniformMatrix3x4fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, double[] array);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, double[] array, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, Float32Array array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4fv")
    public native void uniformMatrix4fv(WebGLUniformLocation location, boolean transpose, double[] array, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, double[] value);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x2fv")
    public native void uniformMatrix4x2fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, double[] value);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, Float32Array value, double srcOffset, double srcLength);
    
    @JsMethod(name = "uniformMatrix4x3fv")
    public native void uniformMatrix4x3fv(WebGLUniformLocation location, boolean transpose, double[] value, double srcOffset, double srcLength);
    
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
    
    @JsMethod(name = "vertexAttrib2f")
    public native void vertexAttrib2f(double indx, double x, double y);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib2fv")
    public native void vertexAttrib2fv(double indx, double[] values);
    
    @JsMethod(name = "vertexAttrib3f")
    public native void vertexAttrib3f(double indx, double x, double y, double z);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib3fv")
    public native void vertexAttrib3fv(double indx, double[] values);
    
    @JsMethod(name = "vertexAttrib4f")
    public native void vertexAttrib4f(double indx, double x, double y, double z, double w);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(double indx, Float32Array values);
    
    @JsMethod(name = "vertexAttrib4fv")
    public native void vertexAttrib4fv(double indx, double[] values);
    
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
