Vertx-Clojure-Sample
====================

Requirement
-----------

1. Install vertx

2. Install vertx-lang-clojure like this
   `vertx install io.vertx~lang-clojure~1.0.4`

3. Install clojure

4. Install proguard

Compile
-------

1. Modify Makefile to set project name, version, main class name ...

2. Copy Makefile.local from Makefile.local.example, and modify
   settings to fit your local enviornment

3. Execute `make` to compile the project.

Make module
-----------

Execute `make mod` to make the zip mod file, and check the result in
build dir. NAME-VERSION.zip is a proguarded zip mod, and
NAME-VERSION-origin.zip is unproguarded one.
