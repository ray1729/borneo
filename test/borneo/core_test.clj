(ns borneo.core-test
  (:require [clojure.test :refer :all]
            [borneo.core :as neo]
            [me.raynes.fs :as fs]))

(defn tmp-db-fixture
  [f]
  (let [tdir (fs/temp-dir "borneo.test.")]
    (try
      (neo/with-db! (str tdir) (f))
      (finally (fs/delete-dir tdir)))))

(use-fixtures :once tmp-db-fixture)

(deftest create-node
  (let [humans (neo/create-child! :humans nil)]
    (is humans)))