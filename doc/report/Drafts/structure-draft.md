# Degree thesis structure

This is a draft of the thesis structure (in terms of chapters and sections). Before the main content of the thesis (i.e. the first chapter), a series of tables and pages are proposed:

* Acknowledgements
* Table of Figures
* Table of Tables
* Table of Contents
* (others)

## Preamble

* Report structure
* Appendices
* Code repositories
* Results publication

## Chapter 1 - Introduction

An introduction of the project. Basically, to contextualize the rest of the work and the document.

### Context of the project

Key concepts and environment.

**Data mining**
* Data mining
* Stream mining
 * MOA

**Privacy**
* IT & privacy
* Legal framework
* Ethics & responsibility

**Statistical Disclosure Control**
* Definition
* Methods
* SDC & Stream mining

### Project definition

Brief project definition (a further refinement is given in the *Scope* subsection of the management chapter). What is it about? Which key guidelines are we going to follow?

### The project within the FIB
* Major in Computer Science
* Researchers, stakeholders & benefits


## Chapter 2 - Project management

### Scope
* Goals of the project
* Functional requirements
* Non-functional requirements
* Limits & boundaries: open scope

### Methodology
* Agile principles & contradictions (single-person team work ¿?)
* Validation & acceptance

### Schedule
* Initial planning (September)
* Final planning
* Deviation causes & actions taken

### Resources
* Human resources
* Software
* Hardware

### Budget
* Initial estimation
* Final estimation
* Deviation causes & actions taken

## Chapter 3 - Initial considerations

### SDC state of the art
* Privacy Preserving Stream Mining
* SDC libraries
* sdcMicro

### Technology selection
* Pure Java
* Renjin
* R based development
 * JRI/rJava
 * R-MPI
 * Rserve

## Chapter 4 - Project development

Once a pure Java based development cycle has been selected:

### Design principles
* Maintainability
* Stability
* Robustness
* Code readability
* Code reuse
* Efficiency
* Extensibility

### Software architecture
* MOA architecture
* PrivacyFilter
 * AnonymizationAlgorithm
 * Estimators

### Implemented methods
**Noise addition**

**Microaggregation**

**Rank swapping**

**(others)**

### Experiments setup
* MOA
* Datasets & generators
* Hardware

### Results
* Visualization


## Chapter ? - Conclusions
* What has been done?
* Future work
