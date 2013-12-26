(use 'incanter.core
             'clojure.xml
     '[clojure.zip :exclude [next replace remove]])


((defn load-xml-data [xml-file first-data next-data]
   "load xml data"
   (let [data-map (fn [node]
                    [:tag node) (first (:content  node))])]
  (->>
     ;; parse XML file 
    (parse xml-file)
    xml-zip
    ;; walk it to extract the data nodes
    first-data
    (iterate next-data)
    (take-while #(not (nil? %)))
    (map children)
    ;; conevert into seq or maps
    (map #(mapcat data-map %))
    (map #(apply array-map %))
    ;; convert into a incanter dataset
    to-dataset)))

 (load-xml-data "data/small-sample.xml" down right)
       ;[:given-name :surname :relation]
       ;["Gomez" "Addams" "father"]
       ;["Morticia" "Addams" "mother"]
       ;["Pugsley" "Addams" "brother"]
