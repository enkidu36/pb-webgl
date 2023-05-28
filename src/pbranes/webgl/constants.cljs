
(ns pbranes.webgl.constants
  (:refer-clojure :exclude [float byte int short keep repeat replace ]))

;; Standard WebGL 1 Contants

;; Clearing buffers
(def DEPTH-BUFFER-BIT	0x00000100) 
(def STENCI-BUFFER-BIT	0x00000400) 
(def COLOR-BUFFER-BIT	0x00004000) 

;; Rendering primitives
(def POINTS	0x0000) 
(def LINES	0x0001) 
(def LINE-LOOP	0x0002) 
(def LINE-STRIP	0x0003) 
(def TRIANGLES	0x0004) 
(def TRIANGLE-STRIP	0x0005) 
(def TRIANGLE-FAN	0x0006)

;; Blending modes
(def ZERO 0)
(def ONE 1)
(def SRC-COLOR 0x0300)
(def ONE-MINUS-SRC-COLOR 0x0301)
(def SRC-ALPA 0x0302)
(def ONE-MINUS-SRC-ALPHA 0x0303)
(def DST-ALPA 0x0304)
(def ONE-MINUS-DST-ALPHA 0x0305)
(def DST-COLOR 0x0306)
(def ONE-MINUS-DST-COLOR 0x0307)
(def SRC-ALPHA-SATURATE 0x0308)
(def CONSTANT-COLOR 0x8001)
(def ONE-MINUS-CONSTANT-COLOR 0x8002)
(def CONSTANT-ALPHA 0x8003)
(def ONE-MINUS-CONSTANT-ALPHA 0x8004)

;; Blending equations
(def FUNC-ADD 0x8005)
(def FUNC-SUBTRACT 0x800A)
(def FUNC-REVERSE-SUBTRACT 0x800B)

;; Getting GL parameter information
(def BLEND-EQUATION 0x8009)
(def BLEND-EQUATION-RGB 0x8009)
(def BLEAD-EQUATION-ALPHA 0x883D)
(def BLEND-DST-RGB 0x80C8)
(def BLEND-SRC-RGB 0x80C9)
(def BLEND-DST-ALPHA 0x80CA)
(def BLEND-SRC-ALPHA 0x80CB)
(def BLEND-COLOR 0x8005)
(def ARRAY-BUFFER-BINDING 0x8894)
(def ELEMENT-ARRAY-BUFFER-BINDING 0x8895)
(def LINE-WIDTH 0x0B21)
(def ALIASED-POINT-SIZE-RANGE 0x846D)
(def ALIASED-LINE-WIDTH-RANGE 0x846E)
(def CULL-FACE-MODE 0x0B45)
(def FRONT-FACE 0x0B46)
(def DEPTH-RANGE 0x0B70)
(def DEPTH-WRITEMASK 0x0B72)
(def DEPTH-CLEAR-VALUE 0x0B73)
(def DEPTH-FUNC 0x0B74)
(def STENCIL-CLEAR-VALUE 0x0B91)
(def STENCIL-FUNC 0x0B92)
(def STENCIL-FAIL 0x0B94)
(def STENCIL-PASS-DEPTH-FAIL 0x0B95)
(def STENCIL-PASS-DEPTH-PASS 0x0B96)
(def STENCIL-REF 0x0B97)
(def STENCIL-VALUE-MASK 0x0B93)
(def STENCIL-WRITEMASK 0x0B98)
(def STENCIL-BACK-FUNC 0x8800)
(def STENCIL-BACK-FAIL 0x8801)
(def STENCIL-BACK-PASS-DEPTH-FAIL 0x8802)
(def STENCIL-BACK-PASS-DEPTH-PASS 0x8803)
(def STENCIL-BACK-REF 0x8CA3)
(def STENCIL-BACK-VALUE-MASK 0x8CA4)
(def STENCIL-BACK-WRITEMASK 0x8CA5)
(def VIEWPORT 0x0BA2)
(def SCISSOR-BOX 0x0C10)
(def COLOR-CLEAR-VALUE 0x0C22)
(def COLOR-WRITEMASK 0xC23)
(def UNPACK-ALIGNMENT 0x0CF5)
(def PACK-ALIGNMENT 0x0D0F)
(def MAX-TEXTURE-SIZE 0x0D33)
(def MAX-VIEWPORT-DIMS 0x0D3A)
(def SUBPIXEL-BITS 0x0D50)
(def RED-BITS 0x0D52)
(def GREEN-BITS 0x0D53)
(def BLUE-BITS 0x0D54)
(def ALPHA-BITS 0x0D55)
(def DEPTH-BITS 0x0D56)
(def STENCIL-BITS 0x0D57)
(def POLYGON-OFFSET-UNITS 0x2A00)
(def POLYGON-OFFSET-FACTOR 0x8038)
(def TEXTURE-BINDING-2D 0x8069)
(def SAMPLER-BUFFERS 0x8069)
(def SAMPLES 0x80A9)
(def SAMPLE-COVERAGE-VALUE 0x80AA)
(def SAMPLE-COVERAGE-INVERT 0x80AB)
(def COMPRESSED-TEXTURE-FORMATS 0x86A3)
(def VENDOR 0x1F00)
(def RENDERER 0x1F01)
(def VERSION 0x1F02)
(def IMPLEMENTATION-COLOR-READ-TYPE 0x8B9A)
(def IMPLEMENTATION-COLOR-READ-FORMAT 0x8B9B)
(def BROWSER-DEFAULT-WEBGL 0x9244)

;; Buffers
(def STATIC-DRAW 0x88E4)
(def STREAM-DRAW 0x88E0)
(def DYNAMIC-DRAW 0x88E8)
(def ARRAY-BUFFER 0x8892)
(def ELEMENT-ARRAY-BUFFER 0x8893)
(def BUFFER-SIZE 0x8764)
(def BUFFER-USAGE 0x8765)
(def CURRENT-VERTEX-ATTRIB 0x8626)
(def VERTEX-ATTRIB-ARRAY-ENABLED 0x8622)
(def VERTEX-ARRAY-SIZE 0x8623)
(def VERTEX-ARRAY-STRIDE 0x8624)
(def VERTEX-ARRAY-TYPE 0x8625)
(def VERTEX-ARRAY-NORMALIZED 0x886A)
(def VERTEX-ARRAY-POINTER 0x8645)
(def VERTEX-ARRAY-BUFFER-BINDING 0x889F)

;; Culling
(def CULL-FACE 0x0B44)
(def FRONT 0x0404)
(def BACK 0x0405)
(def FRONT-AND-BACK 0x0408)

;; Enabling and disabling
(def BLEND 0x0BE2)
(def DEPTH-TEST 0x0B71)
(def DITHER 0x0BD0)
(def POLYGON-OFFSET-FILL 0x8037)
(def SAMPLE-ALPHA-COVERAGE 0x809E)
(def SAMPLE-COVERAGE 0x80A0)
(def SCISSOR-TEST 0x0C11)
(def STENCIL-TEST 0x0B90)

;; Errors
(def NO-ERROR 0)
(def INVALID-ENUM 0x0500)
(def INVALID-VALUE 0x0501)
(def INVALID-OPERATION 0x0502)
(def OUT-OF-MEMORY 0x0505)
(def CONTEXT-LOST-WEBGL 0x9242)

;; Front face directions
(def CW 0x0900)
(def CCW 0x0901)

;; Hints
(def DONT-CARE 0x1100)
(def FASTEST 0x1101)
(def NICEST 0x1102)
(def GENERATE-MIP-MAP-HINT 0x8192)

;; Data types
(def BYTE 0x1400)
(def UNSIGNED-BYTE 0x1401)
(def SHORT 0x1402)
(def UNSIGNED-SHORT 0x1403)
(def INT 0x1404)
(def UNSIGNED-INT 0x1405)
(def FLOAT 0x1406)

;; Pixel formats
(def DEPTH-COMPONENT 0x1902)
(def ALPHA 0x1906)
(def RGB 0x1907)
(def RGBA 0x1908)
(def LUMINANCE 0x1909)
(def LUMINANCE-ALPHA 0x190A)

;; Pixel types
(def UNSIGNED-SHORT-4-4-4-4 0x8033)
(def UNSIGNED-SHORT-5-5-5-1 0x8034)
(def UNSIGNED-SHORT-5-6-5 0x8363)

;; Shaders
(def FRAGMENT-SHADER 0x8B30)
(def VERTEX-SHADER 0x8B31)
(def COMPILE-STATUS 0x8B81)
(def DELETE-STATUS 0x8B80)
(def LINK-STATUS 0x8B82)
(def VALIDATE-STATUS 0x8B83)
(def ATTACHED-SHADERS 0x8B85)
(def ACTIVE-ATTRIBUTES 0x8B89)
(def ACTIVE-UNIFORMS 0x8B86)
(def MAX-VERTEX-ATTRIBS 0x8869)
(def MAX-VARYING-VECTORS 0x8DFC)
(def MAX-COMBINED-TEXTURE-IMAGE-UNITS 0x8B4D)
(def MAX-VERTEX-TEXTURE-IMAGE-UNITS 0x8B4C)
(def MAX-TEXTURE-IMAGE-UNITS 0x8872)
(def MAX-FRAGMENT-UNIFORM-VECTORS 0x8DFD)
(def SHADER-TYPE 0x8B4F)
(def SHADDING-LANGUAGE-VERSION 0x8B8C)

;; Depth or stencil tests
(def NEVER 0x0200)
(def LESS 0x0201)
(def EQUAL 0x0202)
(def LEQUAL 0x0203)
(def GREATER 0x0204)
(def NOTEQUAL 0x0205)
(def GEQUAL 0x0206)
(def ALWAYS 0x0207)

;; Stencil actions
(def KEEP 0x1E00)
(def REPLACE 0x1E01)
(def INCR 0x1E02)
(def DECR 0x1E03)
(def INVERT 0x150A)
(def INCR-WRAP 0x8507)
(def DECR-WRAP 0x8508)

;; Textures
(def NEAREST 0x2600)
(def LINEAR 0x2601)
(def NEAREST-MIPMAP-NEAREST 0x2700)
(def LINEAR-MIPMAP-NEAREST 0x2701)
(def NEAREST-MIPMAP-LINEAR 0x2702)
(def LINEAR-MIPMAP-LINEAR 0x2703)
(def TEXTURE-MAG-FILTER 0x2800)
(def TEXTURE-MIN-FILTER 0x2801)
(def TEXTURE-WRAP-S 0x2802)
(def TEXTURE-WRAP-T 0x2803)
(def TEXTURE-2D 0x0DE1)
(def TEXTURE 0x1702)
(def TEXTURE-CUBE-MAP 0x8513)
(def TEXTURE-BINDING-CUBE-MAP 0x8514)
(def TEXTURE-CUBE-MAP-POSITIVE-X 0x8515)
(def TEXTURE-CUBE-MAP-NEGATIVE-X 0x8516)
(def TEXTURE-CUBE-MAP-POSITIVE-Y 0x8517)
(def TEXTURE-CUBE-MAP-NEGATIVE-Y 0x8518)
(def TEXTURE-CUBE-MAP-POSITIVE-Z 0x8519)
(def TEXTURE-CUBE-MAP-NEGATIVE-Z 0x851A)
(def MAX-CUBE-MAP-TEXTURE-SIZE 0x851C)
;; (def TEXTURE0 - 31 0x84C0 - 0x84DF) ;; TODO
(def ACTIVE-TEXTURE 0x84E0)
(def REPEAT 0x2901)
(def CLAMP-TO-EDGE 0x812F)
(def MIRRORED-REPEAT 0x8370)

;; Uniform types
(def FLOAT-VEC2 0x8B50)
(def FLOAT-VEC3 0x8B51)
(def FLOAT-VEC4 0x8B52)
(def INT-VEC2 0x8B53)
(def INT-VEC3 0x8B54)
(def INT-VEC4 0x8B55)
(def BOOL 0x8B56)
(def BOOL-VEC2 0x8B57)
(def BOOL-VEC3 0x8B58)
(def BOOL-VEC4 0x8B59)
(def FLOAT-MAT2 0x8B5A)
(def FLOAT-MAT3 0x8B5B)
(def FLOAT-MAT4 0x8B5C)
(def SAMPLER-CUBE 0x8B60)

;; Shader precision-specified types
(def LOW-FLOAT 0x8DF0)
(def MEDIUM-FLOAT 0x8DF1)
(def HIGH-FLOAT 0x8DF2)
(def LOW-INT 0x8DF3)
(def MEDIUM-INT 0x8DF4)
(def HIGH-INT 0x8DF5)

;; Framebuffers and renderbuffers
(def FRAMEBUFFER 0x8D40)
(def RENDERERBUFFER 0x8D41)
(def RGBA4 0x8056)
(def RGB5-A1)
(def RGBA565 0x8D62)
(def DEPTH-COMPONENT16 0x81A5)
(def STENCIL-INDEX8 0x84F9)
(def RENDERERBUFFER-WIDTH 0x8D42)
(def RENDERERBUFFER-HEIGHT 0X8d43)
(def RENDERERBUFFER-INTERNAL-FORMAT 0x8D44)
(def RENDERERBUFFER-RED-SIZE 0x8D50)
(def RENDERERBUFFER-GREEN-SIZE 0x8D51)
(def RENDERERBUFFER-BLUE-SIZE 0x8D52)
(def RENDERERBUFFER-ALPHA-SIZE 0x8D53)
(def RENDERERBUFFER-DEPTH-SIZE 0x8D54)
(def RENDERERBUFFER-STENCIL-SIZE 0x8D55)
(def FRAMEBUFFER-ATTACHMENT-OBJECT-TYPE 0x8CD0)
(def FRAMEBUFFER-ATTACHMENT-OBJECT-NAME 0x8CD1)
(def FRAMEBUFFER-ATTACHEMENT-TEXUTURE-LEVEL 0x8CD2)
(def FRAMEBUFFER-ATTACHEMENT-TEXUTURE-CUBE-MAP-FACE 0x8CD3)
(def COLOR-ATTACHMENT0 0x8CE0)
(def DEPTH-ATTACHMENT 0x8D00)
(def STENCIL-ATTACHMENT 0x8D20)
(def DEPTH-STENCIL-ATTACHMENT 0x821A)
(def NONE 0)
(def FRAMEBUFFER-COMPLETE 0x8CD5)
(def FRAMEBUFFER-INCOMPLETE-ATTACHEMENT 0x8CD6)
(def FRAMEBUFFER-INCOMPLETE-MISSING-ATTACHMENT 0x8CD7)
(def FRAMEBUFFER-INCOMPLETE-DIMENSIONS 0x8CD9)
(def FRAMEBUFFER-UNSUPPORTED 0x8CDD)
(def FRAMEBUFFER-BINDING 0x8CA6)
(def RENDERERBUFFER-BINDING 0x8CA7)
(def MAX-RENDERBUFFER-SIZE 0x84E8)
(def INVALID-FRAMEBUFFER-OPERATION 0x0506)

;;Pixel storage modes
(def UNPACK-FLIP-Y-WEBGL 0x9240)
(def UNPACK-PREMULTIPLY-ALPHA-WEBGL 0x9241)
(def UNPACK-COLORSPACE-CONVERSION-WEBGL 0x9243)

;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Additional constants defined WebGL 2
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;

;; Getting GL parameter information 
(def READ-BUFFER 0x0C02)
(def UNPACK-ROW-LENGTH 0x0CF2)
(def UNPACK-SKIP-ROWS 0x0CF3)
(def UNPACK-SKIP-PIXELS 0x0CF4)
(def PACK-ROW-LENGTH 0x0D02)
(def PACK-SKIP-ROWS 0x0D03)
(def PACK-SKIP-PIXELS 0x0D04)
(def TEXTURE-BINDING-3D 0x806A)
(def UNPACK-SKIP-IMAGES 0x806D)
(def UNPACK-IMAGE-HEIGHT 0x806E)
(def MAX-3D-TEXTURE-SIZE 0x8073)
(def MAX-ELEMENTS-VERTICES 0x80E8)
(def MAX-ELEMENTS-INDICES 0x80E9)
(def MAX-TEXTURE-LOD-BIA 0x84FD)
(def MAX-FRAGMENT-UNIFORM-COMPONENTS 0x8B49)
(def MAX-VERTEX-UNIFORM-COMPONENTS 0x8B4A)
(def MAX-ARRAY-TEXTURE-LAYERS 0x88FF)
(def MIN-PROGRAM-TEXEL-OFFSET 0x8904)
(def MAX-VARYING-COMPONENTS 0x8B4B)
(def FRAGMENT-SHADER-DERIVATIVE-HINT 0x8B8B)
(def RASTERIZER-DISCARD 0x8C89)
(def VERTEX-ARRAY-BINDING 0x85B5)
(def MAX-VERTEX-OUTPUT-COMPONENTS 0x9122)
(def MAX-FRAGMENT-INPUT-COMPONENTS 0x9125)
(def MAX-SERVER-WAIT-TIMEOUT 0x9111)
(def MAX-ELEMENT-INDEX 0x8D6B)

;; Textures 
(def RED 0x1903)
(def RGB8 0x8051)
(def RGBA8 0x8058)
(def RGB10-A2 0x8059)
(def TEXTURE-3D 0x806F)
(def TEXTURE-WRAP-r 0x8072)
(def TEXTURE-MIN-LOD 0x813A)
(def TEXTURE-MAX-LOD 0x813B)
(def TEXTURE-BASE-LEVEL 0x813C)
(def TEXTURE-MAX-LEVEL 0x813D)
(def TEXTURE-COMPARE-MODE 0x884C)
(def TEXTURE-COMPARE-FUNC 0x884D)
(def SRGB 0x8C40)
(def SRGB8 0x8C41)
(def SRGB8-ALPHA8 0x8C43)
(def COMPARE-REF-TO-TEXTURE 0x884E)
(def RGBA32F 0x8814)
(def RGB32F 0x8815)
(def RGBA16F 0x881A)
(def RGB16F 0x881B)
(def TEXTURE-2D-ARRAY 0x8C1A)
(def TEXTURE-BINDING-2D-ARRAY 0x8C1D)
(def R11F-G11F-B10F 0x8C3A)
(def RGB9-E5 0x8C3D)
(def RGB32UI 0x8D70)
(def RGBA16UI 0x8D71)
(def RGB16UI 0x8D76)
(def RGBA8UI 0x8D7C)
(def RGB8UI 0x8D7D)
(def RGBA32I 0x8D82)
(def RGB32I 0x8D83)
(def RGBA16I 0x8D88)
(def RGB16I 0x8D89)
(def RGBA8I 0x8D8E)
(def RGBI 0x8D8F)
(def RED-INTEGER 0x8D94)
(def RGB-INTEGER 0x8d98)
(def RGBA-INTEGER 0x8D99)
(def R8 0x8229)
(def RG8 0x822B)
(def R16F 0x822D)
(def R32F 0x822F)
(def RG16F 0x822F)
(def RG32F 0x8230)
(def R8I 0x8231)
(def R8UI 0x8232)
(def R16I 0x8233)
(def R16UI 0x8234)
(def R32I 0x8235)
(def R32UI 0x8236)
(def RG8I 0x8237)
(def RG8UI 0x8238)
(def RG16I 0x8239)
(def RG16UI 0x823A)
(def RG32I 0x823B)
(def RG32UI 0x823C)
(def R8-SNORM 0x8F94)
(def RG8-SNORM 0x8F95)
(def RGB8-SNORM 0x8F96)
(def RGBA-SNORM 0x8F97)
(def RGB10-A2UI 0x906F)
(def TEXTURE-IMMUTABLE-FORMAT 0x912F)
(def TEXTURE-IMMUTABLE-LEVELS 0x82DF)

;; Pixel types
(def UNSIGNED-INT-2-10-10-10-REV 0x8368)
(def UNSIGNED-INT-10F-11F-11F-REV 0x8C3B)
(def UNSIGNED-INT-5-9-9-9-REV 0x8C3E)
(def FLOAT-32-UNSIGNED-INT-24-8-REV 0x8DAD)
(def UNSIGNED-INT-24-8-REV 0x84FA)
(def HALF-FLOAT 0x140B)
(def RG 0x8227)
(def RG-INTEGER 0x8228)
(def INT-2-10-10-10-REV 0x8D9F)

;; Queries
(def CURRENT-QUERY 0x8865)
(def QUERY-RESULT 0x8866)
(def QUERY-RESULT-AVAILABLE 0x8867)
(def ANY-SAMPLES-PASSED 0x8C2F)
(def ANY-SAMPLES-PASSED-CONSERVATIVE 0x8D6A)

;; Draw buffers
(def MAX-DRAW-BUFFERS 0x8824)
(def DRAW-BUFFER0 0x8825)
(def DRAW-BUFFER1 0x8826)
(def DRAW-BUFFER2 0x8827)
(def DRAW-BUFFER3 0x8828)
(def DRAW-BUFFER4 0x8829)
(def DRAW-BUFFER5 0x882A)
(def DRAW-BUFFER6 0x882B)
(def DRAW-BUFFER7 0x882C)
(def DRAW-BUFFER8 0x882D)
(def DRAW-BUFFER9 0x882E)
(def DRAW-BUFFER10 0x882F)
(def DRAW-BUFFER11 0x8830)
(def DRAW-BUFFER12 0x8831)
(def DRAW-BUFFER13 0x8832)
(def DRAW-BUFFER14 0x8833)
(def DRAW-BUFFER15 0x8834)
(def MAX-COLOR-ATTACHMENTS 0x8CDF)
(def COLOR-ATTACHMENT1 0x8CE1)
(def COLOR-ATTACHMENT2 0x8CE2)
(def COLOR-ATTACHMENT3 0x8CE3)
(def COLOR-ATTACHMENT4 0x8CE4)
(def COLOR-ATTACHMENT5 0x8CE5)
(def COLOR-ATTACHMENT6 0x8CE6)
(def COLOR-ATTACHMENT7 0x8CE7)
(def COLOR-ATTACHMENT8 0x8CE8)
(def COLOR-ATTACHMENT9 0x8CE9)
(def COLOR-ATTACHMENT10 0x8CEA)
(def COLOR-ATTACHMENT11 0x8CEB)
(def COLOR-ATTACHMENT12 0x8CEC)
(def COLOR-ATTACHMENT13 0x8CED)
(def COLOR-ATTACHMENT14 0x8CEE)
(def COLOR-ATTACHMENT15 0x8CEF)

;; Samplers
(def SAMPLER-3D 0x8B5F)
(def SAMPLER-2D-SHADOW 0x8B62)
(def SAMPLER-2D-ARRAY 0x8DC1)
(def SAMPLER-CUBE-SHADOW 0x8DC5)
(def INT-SAMPLER-2D 0x8DCA)
(def INT-SAMPLER-3D 0x8DCB)
(def INT-SAMPLER-CUBE 0x8DCC)
(def UNSIGNED-INT-SAMPLER-2D 0x8DD2)
(def UNSIGNED-INT-SAMPLER-3D 0x8DD3)
(def UNSIGNED-INT-SAMPLER-CUBE 0x8DD4)
(def UNSIGNED-INT-SAMPLER-2D-ARRAY 0x8DD7)
(def MAX-SAMPLES 0x8D57)
(def SAMPLER-BINDING 0x8919)

;; Buffers
(def PIXEL-PACK-BUFFER 0x88EB)
(def PIXEL-UNPACK-BUFFER 0x88EC)
(def PIXEL-PACK-BUFFER-BINDING 0x88ED)
(def PIXEL-UNPACK-BINDING 0x88EF)
(def COPY-READ-BUFFER 0x8F36)
(def COPY-WRITE-BUFFER 0x8F37)
(def COPY-READ-BUFFER-BINDING 0x8F36)
(def COPY-WRITE-BUFFER-BINDING 0x8F37)

;; Data types
(def FLOAT-MAT2x3 0x8B65)
(def FLOAT-MAT2x4 0x8B66)
(def FLOAT-MAT3x2 0x8B67)
(def FLOAT-MAT3x4 0x8B68)
(def FLOAT-MAT4x2 0x8B69)
(def FLOAT-MAT4x3 0x8B6A)
(def UNSIGNED-INT-VEC2 0x8DC6)
(def UNSIGNED-INT-VEC3 0x8DC7)
(def UNSIGNED-INT-VEC4 0x8DC8)
(def UNSIGNED-NORMALIZED 0x8C17)
(def SIGNED-NORMALIZED 0x8F9C)

;; Vertex attributes
(def VERTEX-ATTRIB-ARRAY-INTEGER 0x88FD)
(def VERTEX-ATTRIB-ARRAY-DIVISOR 0x88FE)

;;Transform feedback
(def TRANSFORM-FEEDBACK-BUFFER-MODE 0x8C7F)
(def MAX-TRANSFORM-FEEDBACK-SERPARATE-COMPONENTS 0x8C80)
(def TRANSFORM-FEEDBACK-VARYINGS 0x8C83)
(def TRANSFORM-FEEDBACK-BUFFER-START 0x8C84)
(def TRANSFORM-FEEDBACK-BUFFER-SIZE 0x8C85)
(def TRANSFORM-FEEDBACK-PRIMITIVES-WRITTEN 0x8C88)
(def MAX-TRANSFORM-FEEDBACK-INTERLEAVED-COMPONENTS 0x8C8A)
(def MAX-TRANSFORM-FEEDBACK-SEPARATE-ATTRIBs 0x8C8B)
(def INTERLEAVED-ATTRIBS 0x8C8C)
(def SEPARATE-ATTRIBS 0x8C8D)
(def TRANSFORM-FEEDBACK-BUFFER 0x8C8E)
(def TRANSFORM-FEEDBACK-BUFFER-BINDING 0x8C8F)
(def TRANSFORM-FEEDBACK 0x8E22)
(def TRANSFORM-FEEDBACK-PAUSED 0x8E23)
(def TRANSFORM-FEEDBACK-ACTIVE 0x8E24)
(def TRANSFORM-FEEDBACK-BINDING 0x8E25)

;; Framebuffers and renderbuffers
(def FRAMEBUFFER-ATTACHEMENT-COLOR-ENCODING 0x8210)
(def FRAMEBUFFER-ATTACHMENT-COMPONENT-TYPE 0x8211)
(def FRAMEBUFFER-ATTACHEMENT-RED-SIZE 0x8212)
(def FRAMEBUFFER-ATTACHEMENT-GREEN-SIZE 0x8213)
(def FRAMEBUFFER-ATTACHEMENT-BLUE-SIZE 0x8214)
(def FRAMEBUFFER-ATTACHEMENT-ALPHA-SIZE 0x8215)
(def FRAMEBUFFER-ATTACHEMENT-DEPTH-SIZE 0x8216)
(def FRAMEBUFFER-ATTACHEMENT-STENCIL-SIZE 0x8217)
(def FRAMEBUFFER-DEFAULT 0x8218)
(def DEPTH-STENCIL 0x84F9)
(def DEPTH-STENCIL8 0x88F0)
(def DRAW-FRAMEBUFFER-BINDING 0x8CA6)
(def READ-FRAMEBUFFER 0x8CA8)
(def READ-FRAMEBUFFER-BINDING 0x8CAA)
(def RENDERBUFFER-SAMPLES 0x8CAB)
(def FRAMEBUFFER-ATTACHEMENT-TEXTURE-LAYER 0x8CD4)
(def FRAMEBUFFER-INCOMPLETE-MULTISAMPLE 0x8D56)

;; Uniforms
(def UNIFORM-BUFFER 0x8A11)
(def UNIFORM-BUFFER-BINDING 0x8A28)
(def UNIFORM-BUFFER-START 0x8A29)
(def UNIFORM-BUFFER-SIZE 0x8A2A)
(def MAX-VERTEX-UNIFORM-BLOCKS 0x8A2B)
(def MAX-FRAGMENT-UNIFORM-BLOCKS 0x8A2D)
(def MAX-COMBINED-UNIFORM-BLOCKS 0x8A2E)
(def MAX-UNIFORM-BUFFER-BINDINGS 0x8A2F)
(def MAX-UNIFORM-BLOCK-SIZE 0x8A30)
(def MAX-COMBINED-VERTEX-UNIFORM-COMPONENTS 0x8A31)
(def MAX-COMBINED-FRAGMENT-UNIFORM-COMPONENTS 0x8A33)
(def ACTIVE-UNIFORM-BLOCKS 0x8A36)
(def UNIFORM-TYPE 0x8A37)
(def UNIFORM-SIZE 0x8A38)
(def UNIFORM-BLOCK-INDEX 0x8A3A)
(def UNIFORM-OFFSET 0x8A3B)
(def UNIFORM-ARRAY-STRIDE 0x8A3C)
(def UNIFORM-MATRIX-STRIDE 0x8A3D)
(def UNIFORM-IS-ROW-MAJOR 0x8A3E)
(def UNIFORM-BLOCK-BINDING 0x8A3F)
(def UNIFORM-BLOCK-DATA-SIZE 0x8A40)
(def UNIFORM-BLOCK-ACTIVE-UNIFORMS 0x8A42)
(def UNIFORM-BLOCK-ACTIVE-UNIFORM-INDICES 0x8A44)
(def UNIFORM-REFERENCED-BY-VERTEX-SHADER 0x8A44)
(def UNIFORM-REFERENCED-BY-FRAGMENT-SHADER 0x8A46)

;; Syn objects
(def OBJECT-TYPE 0x9112)
(def SYNC-CONDITION 0x9113)
(def SYNC-STATUS 0x9114)
(def SYNC-FLAGS 0x9115)
(def SYNC-FENCE 0x9116)
(def SYNC-GPU-COMMANDS-COMPLETE 0x9117)
(def UNSIGNALED 0x9118)
(def SIGNALED 0x9119)
(def ALREADY-SIGNALED 0x911A)
(def TIMEOUT-EXPIRED 0x911B)
(def CONDITION-SATISFIED 0x911C)
(def WAIT-FAILED 0x911D)
(def SYNC-FLUSH-COMMANDS-BIT 0x00000001)

;; Miscellaneous constants
(def COLOR 0x1800)
(def DEPTH 0x1801)
(def STENCIL 0x1802)
(def MIN 0x1807)
(def MAX 0x1808)
(def DEPTH-COMPONENT24 0x81A6)
(def STREAM-READ 0x88E1)
(def STREAM-COPY 0x88E2)
(def STATIC-READ 0x88E5)
(def STATIC-COPY 0x88E6)
(def DYNAMIC-READ 0x88E9)
(def DYNAMIC-COPY 0x88EA)
(def DEPTH-COMPONENT32F 0x8CAC)
(def DEPTH32F-STENCIL8 0x8CAD)
(def INVALID-INDEX 0xFFFFFFFF)
(def TIMEOUT-IGNORED -1)
(def MAX-CLIENT-WAIT-TIMEOUT-WEBGL 0x9247)


;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; Constants defined in WebGL extensions
;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;;
;; TODO
