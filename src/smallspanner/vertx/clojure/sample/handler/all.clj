(ns smallspanner.vertx.clojure.sample.handler.all
  (:require [vertx.http :as http]))

(defn handle
  ""
  [req]
  (-> (http/server-response req {:status-code 200})
      (http/end "Hello, world")))
