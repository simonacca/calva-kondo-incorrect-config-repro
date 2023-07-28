(ns core
  (:require [clojure.core.async :refer [go]]))


; would expect this to be linted with `invalid-arity`
(assoc)