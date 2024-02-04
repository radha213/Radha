# MavenProject
The main objective of this Maven project is to test the SWAG LABS website (https://www.saucedemo.com) functionalities using BDD with Cucumber. 
## Overview
This project includes Browser Controls, Feature Files, Step Definitions, Page Objects, Utilities and Test Runner Class.
## Prerequisites
The below opensource software/tools are required and installed in the local system to create this project successfully.

•	Java

•	Maven

•	IntelliJ IDE

### Dependencies
This project’s pom.xml file should include the below dependence entries.

•	Junit

•	Cucumber Junit

•	Cucumber Java

•	Selenium Java

#### Branches

•	Main

## Getting started
The below steps are to be followed. 

1.	Created a repository on the GitHub.

2.	Clone the repository to the local machine.

3.	Created a Maven project in IntelliJ IDE

4.	Pushed to GitHub repository.

5.	Edit pom.xml present in the local machine to include all the dependencies (see the Dependencies section of this file). 

6.	Create a BDD framework folder structure.

## Project Structure
The project structure contains the below:

•	src/test/java 
Contains Cucumber Feature files, Step Definitions, Page Objects, Utilities and the Test Runner Class packages/Classes and code for the project execution.

•	src/test/target/pom.xml 
includes all the project dependencies.

## Package Files
•	Using Gherkin syntax, the BDD Scenarios are defined under the location src/test/java/features. 

•	Each feature file contains a corresponding step definition located at src/test/java/StepDefinitions. 

•	Page Objects present in the src/test/java/pageObjects links to the website locater.

## Running Tests
The project can be tested using mvn test in the IntelliJ terminal console. The project can also be tested using Test Runner Class src/test/java.
## Reporting
Cucumber uses the Pretty plugin that produces more verbose output which contains information about the test scenarios and the outcome (Passed or Failed) and stores it in an HTML file. To view these Cucumber HTML reports navigate to html:target/cucumber after executing the tests.
## Usage
The below steps are followed to set up the project and evaluate it after creating the Project BDD framework structure.
Step 1: Create a feature.file using Gherkin syntax (Given, When, And, Then) for the BDD scenarios.

Step 2: Create a Cucumber Junit Test Runner Class

Step 3: Create a Web Connector Class to initialise the browser.

Step 4: Create Constantutils Class to add the constants.

Step 5: Create Cucumber Hooks

Step 6: Implement a mechanism to run the tests in headed mode in the Web Connector Class

Step 7: Run the Test Runner Class
