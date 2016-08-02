(ns soda-ash.contents.label
  (:require-macros
   [soda-ash.macros :refer [defcomp]])
  (:require
   [soda-ash.template :as t]))


(def types
  [:default])


(def opts
  {:tag     :div
   :ui?     false
   :ui-name "label"
   :types types})


(defcomp "default" opts)