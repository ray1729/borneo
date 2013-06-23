(defproject org.clojars.ray1729/borneo "0.3.1-SNAPSHOT" 
  :description "Clojure wrapper for Neo4j, a graph database."
  :dependencies [[org.clojure/clojure "1.5.1"]
                 [org.neo4j/neo4j "1.9"]]
  :profiles {:dev {:dependencies [[me.raynes/fs "1.4.5"]]}}
  :autodoc {:copyright "Copyright (C) 2011, Jozef Wagner. All rights reserved."
            :web-src-dir "http://github.com/wagjo/borneo/blob/"
            :web-home "http://wagjo.github.com/borneo/"})
