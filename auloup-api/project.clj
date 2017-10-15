(defproject auloup-api "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :min-lein-version "2.0.0"
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [ring/ring-core "1.6.2"]
                 [ring/ring-json "0.4.0"]
                 [ring/ring-defaults "0.2.1"]
                 [compojure "1.5.1"]
                 [amazonica "0.3.113"]
                 [com.fasterxml.jackson.core/jackson-core "2.6.0"]]
  :plugins [[lein-ring "0.9.7"]]
  :ring {:handler auloup-api.handler/app}
  :profiles
  {:dev {:dependencies [[javax.servlet/servlet-api "2.5"]
                        [ring/ring-mock "0.3.0"]]}})
