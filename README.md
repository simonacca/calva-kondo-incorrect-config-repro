# Issue repro

This repo demonstrates an issue with the calva editor and associated tooling
whereby an incorrect configuration of the clj-kondo linter is not reported to the user.

## How to reproduce

* Download this repo
* Open the repo in calva
* Notice that the `(assoc)` form in `core.clj` is not linted correctly
* Notice that there is no feedback to the developer that linting has stopped working
* Enable the correct config in `.clj-kondo/config.edn`
* Notice that the `(assoc)` form in `core.clj` is now linted correctly
