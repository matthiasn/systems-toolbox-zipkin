(defproject matthiasn/systems-toolbox-zipkin "0.6.3"
  :description "FIXME: write description"
  :url "https://github.com/matthiasn/systems-toolbox-zipkin"
  :license {:name "Eclipse Public License"
            :url  "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[io.zipkin.brave/brave "4.4.0"]
                 [io.zipkin.reporter/zipkin-reporter "1.0.0"]
                 [io.zipkin.reporter/zipkin-sender-okhttp3 "1.0.0"]]
  :profiles {:dev {:dependencies [[org.clojure/clojure "1.9.0-alpha17"]]}})
