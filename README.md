# weatherman-clj

A Clojure project/app to fetch and display weather info from openweathermap.

## Installation

This is a standard Clojure project built with __lein__. You would need an API Key from [http://openweathermap.org/](http://openweathermap.org/) and put it in resources/app_config.edn

## Usage

You can either do -

    $ lein run "Berlin"

Or create the uberjar and run -

    $ java -jar weatherman-clj-0.1.0-standalone.jar "Berlin"

## License

Copyright © 2015 Rocky Jaiswal

Distributed under the Eclipse Public License either version 1.0 or (at
your option) any later version.
