(use getting-data.xls
     (:use incanter.core
           incanter.excel ))


(pprint (read-xls "data/small-sample-header.xls"))
{:column-names ["given-name" "surname" "relation"],
:rows
({"relation" "father", "surname" "Addams", "given-name" "Gomez"}
   {"relation" "mother", "surname" "Addams", "given-name" "Morticia"}
   {"relation" "brother", "surname" "Addams", "given-name" "Pugsley"}
   {"relation" "sister", "surname" "Addams", "given-name" "Wednesday"}
   {"relation" "brother", "surname" "Addams", "given-name" "Pubert"}
   {"relation" "uncle", "surname" "Addams", "given-name" "Fester"}
   {"relation" "grandmother", "surname" nil, "given-name" "Grandmama"}
   {"relation" "hand", "surname" nil, "given-name" "Thing"}
   {"relation" "butler", "surname" nil, "given-name" "Lurch"}
   {"relation" "cousin", "surname" nil, "given-name" "Itt"}
   {"relation" "cousin", "surname" nil, "given-name" "Cackle"})}
