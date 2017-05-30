(defproject matthiasn/systems-toolbox-zipkin "0.6.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[io.zipkin.brave/brave "4.3.3"]
                 [io.zipkin.reporter/zipkin-reporter "0.10.0"]
                 [io.zipkin.reporter/zipkin-sender-okhttp3 "0.10.0"]]
  :profiles {:dev {:dependencies   [[org.clojure/clojure "1.9.0-alpha17"]]}})
