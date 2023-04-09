(ns webgl.constants
  (:refer-clojure :exclude [float byte int short keep repeat replace ]))

;; Standard WebGL 1 Contants

;; Clearing buffers
;; Constants passe to clear buffer masks
(def DEPTH-BUFFER-BIT	0x00000100) ;; Passed to clear to clear the current depth buffer.
(def STENCIL-BUFFER-BIT	0x00000400) ;; Passed to clear to clear the current stencil buffer.
(def COLOR-BUFFER-BIT	0x00004000) ;; Passed to clear to clear the current color buffer.


;; Getting GL parameter information
;; Constants passed to WebGLRenderingContext.getParameter () to specify what information to return.
(def COLOR-CLEAR-VALUE 0x0C22)