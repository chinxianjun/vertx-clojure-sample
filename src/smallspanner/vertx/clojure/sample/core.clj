(ns smallspanner.vertx.clojure.sample.core
  (:require [vertx.embed :as embed]
            [vertx.http :as http]
            [vertx.http.route :as route]
            [smallspanner.vertx.clojure.sample.handler.all :as allhandler])
  (:gen-class
   :name smallspanner.vertx.clojure.sample.core
   :extends org.vertx.java.platform.Verticle))

(defn -start-void
  ""
  [this]
  (do
    (embed/set-vertx! (.getVertx this)) ;; do NOT forget this line
    (-> (http/server)
        (http/on-request
         (-> (route/all "/" allhandler/handle)))
      (http/listen 8080 "localhost"))))
