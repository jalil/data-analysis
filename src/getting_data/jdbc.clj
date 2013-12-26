(use '[clojure.java.jdbc :exclude (resultset-seq)]
             'incanter.core)


(defn load-table-data
  "This loads the data from a database"
  [db table-name]
  (let [sql (str "SELECT * FROM "
                 table-name ";")]
    (with-connect db
      (with-query-resulst rs [sql]
        (to-dataset (doall rs))))))


(def db {:subprotocol "sqlite"
         :subname "data/small-sample.sqlite"
         :classname "org.sqlite.JDBC"})

  (load-table-data db 'people)
   ;[:relation :surname :given_name]
   ;["father" "Addams" "Gomez"]
   ;["mother" "Addams" "Morticia"]
   ;["brother" "Addams" "Pugsley"]

