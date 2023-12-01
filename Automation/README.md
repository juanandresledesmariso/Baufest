<h1 align="center"> BAUFEST </h1> <br>

<p align="center">
  This is a challenge proposed by Baufest.

  Authr: Juan Andrés Ledesma
  Date: Dec, 2023
</p>


## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Requirements](#requirements)


## Introduction

Se realizaron soluciones de dos features (Store, PetStore), en las cuales se prueba el correcto funcionamiento de funcionalidades dadas


## Features

Under the src/test/resources you will find the following tests:

* Features-PetStore
* Features-Stores


## Requirements
The application can be run locally, the requirements for each setup are listed below.


### Local
* [Selenium](https://www.selenium.dev/downloads/)
* [JavaSE-18](https://www.oracle.com/java/technologies/javase/jdk18-archive-downloads.html)
* [Postman](https://www.postman.com/downloads/)
* [Maven Dependencies](https://maven.apache.org/download.cgi) Cucumber Java | Cucumber JUnit | JUnit | Selenium Java




## WEB
In the web feature, three features has been tested

Execution: 
You must Run the TestRunner.java file in order to user JUnit to create the reports. This java can be found in the path: Baufest/BaufestCucumber/src/test/java/StepDefinitions

## API
In the WebServices, three endpoints has been tested

Execution: Import the PotStore collection into Postman, and once the collection is displayeable in the software, you can run it.

Obs: The endpoints contains assertions to validate the response of each request.


## Reports
The reports provided by Cucumber can be fund under the following path: Baufest/BaufestCucumber/target/cucumber-reports

Obs: There are reports from the last run as example, there can be found in the following paths:

WebService: Baufest/BaufestCucumber/src/test/resources/Features-PetStore/PetStore.Results.json

Web: Baufest/BaufestCucumber/target/cucumber-reports/Cucumber.html

