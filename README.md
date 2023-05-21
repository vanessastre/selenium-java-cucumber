# 👩🏻‍💻 selenium-java-cucumber project
 
This project provides a simple and basic implementation of a Selenium Java test automation framework. 
<br>

## 🔑Key components

**Page Object Model Design Pattern:**
- Implementation of the Page Object pattern for improved test maintainability and reusability.
- Separate page classes for each web page, encapsulating their elements and actions.

**Cucumber Integration:**
- Integration of Cucumber, a behavior-driven development (BDD) tool, for test scenario definition.
- Executing test scenarios written in Gherkin syntax.

**TestNG Testing Framework:**
- Utilization of TestNG as the testing framework for executing test cases and managing test dependencies.
- Support for potential parallel test execution, data-driven testing, and test configuration.

**Maven Build:**
- Integration with Maven to simplify project setup and dependency management through pom.xml.

**Cucumber HTML Test Report:**
- Generation of a detailed HTML report for test execution results.
- Provides comprehensive information on test status, executed scenarios, steps, and any failure details.
- Allows easy analysis and identification of test failures.

## Project structure

### 📁/features
- signin.feature: Contains scenarios related to the sign-in functionality.
- signup.feature: Contains scenarios related to the sign-up functionality.

### 📁/steps
- signinsteps.java: Defines step definitions for the sign-in feature scenarios.
- signupsteps.java: Defines step definitions for the sign-up feature scenarios.

### 📁/pages
- BasePage.java: Represents the base page object with common functionalities for all page objects.
- HomePage.java: Represents the home page object.
- SignInPage.java: Represents the sign-in page object.
- SignUpPage.java: Represents the sign-up page object.

### 📁/utils
- runner: Contains the Cucumber runner class to execute the tests.
- driver: Contains the web driver.
<br>

## How to Run
To run the tests, execute the following command:
```
mvn test -Dcucumber.options="@tagname"
```
Replace @tagname with the desired tag or tags to specify which scenarios to run. For example, @signIn or @signUp.
<br>

## 📊Report
Once the test execution is complete, you can access the test report by following these steps:

1. Navigate to the project's target folder.
2. Open the ```cucumber-report.html``` file.

The test report provides a summary of the test execution results, including the overall status (pass/fail) and detailed information about each scenario and step. 