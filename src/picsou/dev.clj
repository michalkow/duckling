(ns picsou.dev
  (:require [midje.repl :as repl]))

(defn dev [] (repl/autotest))
