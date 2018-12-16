(ns hello.handler.example
  (:require [compojure.core :refer :all]
            [hiccup.page :refer [html5 include-css include-js]]
            [integrant.core :as ig]))

(defmethod ig/init-key :hello.handler/example [_ options]
  (context "/example" []
    (GET "/" []
      (html5
        [:head
         [:meta {:name "viewport" :content "width=device-width, initial-scale=1, shrink-to-fit=no"}]
         [:title "Example page"]
         (include-css "https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css")
         (include-js
           "https://code.jquery.com/jquery-3.3.1.slim.min.js"
           "https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
           "https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js")
         [:body
          [:div.container-fluid
           [:div.jumbotron.text-center
            [:h1.jumbotron-heading "Example hiccup!"]]]]]))))
