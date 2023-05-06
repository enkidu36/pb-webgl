(ns pbranes.webgl.constants
  (:refer-clojure :exclude [float byte int short keep repeat replace ]))

;; Standard WebGL 1 Contants

;; Clearing buffers
;; Constants passe to clear buffer masks
(def DEPTH-BUFFER-BIT	0x00000100) ;; Passed to clear to clear the current depth buffer.
(def STENCIL-BUFFER-BIT	0x00000400) ;; Passed to clear to clear the current stencil buffer.
(def COLOR-BUFFER-BIT	0x00004000) ;; Passed to clear to clear the current color buffer.


;; Rendering primitives
;; Constants passed to WebGLRenderingContext.drawElements() or WebGLRenderingContext.drawArrays() to specify what kind of primitive to render.
(Def POINTS	0x0000) ;; Passed to drawElements or drawArrays to draw single points.
(def LINES	0x0001) ;; Passed to drawElements or drawArrays to draw lines. Each vertex connects to the one after it.
(def LINE-LOOP	0x0002) ;; Passed to drawElements or drawArrays to draw lines. Each set of two vertices is treated as a separate line segment.
(def LINE-STRIP	0x0003) ;; Passed to drawElements or drawArrays to draw a connected group of line segments from the first vertex to the last.
(def TRIANGLES	0x0004) ;; Passed to drawElements or drawArrays to draw triangles. Each set of three vertices creates a separate triangle.
(def TRIANGLE-STRIP	0x0005) ;; Passed to drawElements or drawArrays to draw a connected group of triangles.
(def TRIANGLE-FAN	0x0006) ;; Passed to drawElements or drawArrays to draw a connected group of triangles. Each vertex connects to the previous and the first vertex in the fan.

;; Blending modes
;; Constants passed to webGLRenderingContext.blendFun(). or
;; WebGLRenderingContext.blendFuncSeparate(). to specify the blending mode (for both, RGB and alpha, or seperately).
(def ZERO 0) ;;  Passed to blendFunc or blendFuncSeparate to turn off a component.

;; Getting GL parameter information
;; Constants passed to WebGLRenderingContext.getParameter () to specify what information to return.
(def COLOR-CLEAR-VALUE 0x0C22)

;; Buffers
(def STATIC-DRAW 0x88E4)
(def STREAM-DRAW 0x88E0)
(def DYNAMIC-DRAW 0x88E8)
(def ARRAY-BUFFER 0x8892)
(def ELEMENT-ARRAY-BUFFER 0x8893)
(def BUFFER-SIZE 0x8764)
(def BUFFER-USAGE 0x8765)
