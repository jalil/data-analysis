(ns getting-data.csv
  (:use incanter.core
        incanter.io))
;;=================================
;;slurp

(slurp "data/small-sample.csv")

;;=> "Gomez,Addams,father\nMorticia,Addams,mother\nPugsley,Addams,brother\nWednesday,Addams,sister\nPubert,Addams,brother\nFester,Addams,uncle\nGrandmama,,grandmother\nThing,,hand\nLurch,,butler\nItt,,cousin\nCackle,,cousin\n"
;;
;;incanter dataset
(read-dataset "data/small-sample.csv")
