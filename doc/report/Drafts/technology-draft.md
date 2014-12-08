# Technology & platform considerations #

The main goal of this project was to enable the MOA framework with privacy preserving methods in the form of *filters*.  A series of different possible technologies and platforms were "weighted" at the beginning of the project, concerning its implementation.

### Java ###
The first and most obvious option was to implement,

### R (sdcMicro) ###

Generics about:

* R
* sdcMicro package (R-Cran)

More on R:

* Rserve
* R-MPI
* JRI - rJava
* Other R/Java connectors

### Renjin ###

* sdcMicro was not available
* Marshalling and unmarshalling Java-R objects

## The final decision ##

Pure Java (re)implementation of some of the proposed SDC methods:

* Noise addition
* Multiplicative noise addition
* Microaggregation
* KNN: "fast", stream-like
* MDAV
* Open framework
* Rank swapping
* Rank shuffling

Also and not less important: **estimators**.

* Information loss
* Disclosure risk
