# Issue repro

This repo demonstrates an issue with the calva editor and associated tooling
whereby an incorrect configuration of the clj-kondo linter is not reported to the user.

## How to reproduce (calva bug)

* Download this repo
* Open the repo in calva
* Notice that the `(assoc)` form in `core.clj` is not linted correctly
* Notice that there is no feedback to the developer that linting has stopped working
* Enable the correct config in `.clj-kondo/config.edn`
* Notice that the `(assoc)` form in `core.clj` is now linted correctly

## How to reproduce (clj-kondo bug)

* Download this repo
* Notice that the clj-kondo config is [incorrect](https://github.com/clj-kondo/clj-kondo/blob/master/doc/linters.md#unused-referred-var)
* Run clj-kondo: `clj -Mkondo --lint .`
* Notice that you get a stacktrace
* Uncomment the `(go)` form from `core.clj`
* Run clj-kondo
* Notice that clj-kondo runs without issue notwithstanding the incorrect config
