 (defproject getting-data "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.5.1"]
                 ;;incanter
                 [incanter/incanter-core "1.4.1"]
                 [incanter/incanter-io "1.4.1"]

                 ;;json
                 [org.clojure/data.json "0.2.3"]

                  ;;excel
                 [incanter/incanter-excel "1.4.1"]

                 ;;jdbc database
                 [org.clojure/java.jdbc "0.2.3"]
                 [org.xerial/sqlite-jdbc "3.7.2"]

                 ;;enlive
                 [enlive "1.0.1"]
                 ]
  )

