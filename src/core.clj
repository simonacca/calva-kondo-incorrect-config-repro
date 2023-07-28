(ns core
  (:require [clojure.core.async :refer [go]]))


; would expect this to be linted with `invalid-arity`
(assoc)

; try uncommenting this form while keeping the incorrect clj-kondo config.
; you will find that clj-kondo starts working again (i.e. the `assoc` form gets linted)
#_(go)