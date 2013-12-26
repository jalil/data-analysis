(use getting-data.json
     (:use incanter.core))
    (require '[clojure.data.json :as json])

;;
(pprint (json/read-str (slurp "data/small-sample.json")))
;[{"given_name" "Gomez", "surname" "Addams", "relation" "father"}
  ;{"given_name" "Morticia", "surname" "Addams", "relation" "mother"}
  ;{"given_name" "Pugsley", "surname" "Addams", "relation" "brother"}
  ;{"given_name" "Wednesday", "surname" "Addams", "relation" "sister"}
  ;{"given_name" "Pubert", "surname" "Addams", "relation" "brother"}
  ;{"given_name" "Fester", "surname" "Addams", "relation" "uncle"}
  ;{"given_name" "Grandmama", "surname" "", "relation" "grandmother"}
  ;{"given_name" "Thing", "surname" "", "relation" "hand"}
  ;{"given_name" "Lurch", "surname" "", "relation" "butler"}
  ;{"given_name" "Itt", "surname" "", "relation" "cousin"}
  ;{"given_name" "Cackle", "surname" "", "relation" "cousin"}]
