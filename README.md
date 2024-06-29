# Amazon-Assessment-Framework
The Automation Framework is a powerful and flexible automation solution built using Selenium, Cucumber, and TestNG. It follows the Singleton design pattern for efficient WebDriver management and integrates Allure as a comprehensive reporting tool.


```
## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Installation](#installation)
- [Usage](#usage)
- [Test Execution](#test-execution)
- [Reporting](#reporting)
- [Contributing](#contributing)
- [License](#license)

## Introduction

The Automation Framework is designed to automate web testing using Selenium, Cucumber, and TestNG. It provides a structured and modular approach to writing automated tests, allowing for easy maintenance and scalability.

## Features

- Integration of Selenium WebDriver for browser automation
- Integration with Cucumber for behavior-driven development (BDD) style testing
- TestNG for test execution and management
- Singleton design pattern for efficient and centralized management of WebDriver instances
- Allure for comprehensive and visually appealing test reports

## Prerequisites

Before using the Automation Framework, ensure that the following software is installed:

- Java Development Kit (JDK) 11 or higher: [Download JDK](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
- Maven: [Download Maven](https://maven.apache.org/download.cgi)

## Installation

1. Clone the repository:

   ```bash
   git clone https://github.com/your-username/your-repository.git
   ```

2. Navigate to the project root directory:

   ```bash
   cd your-repository
   ```

3. Install project dependencies using Maven:

   ```bash
   mvn clean install
   ```

## Usage

The Automation Framework provides a set of sample tests . You can use these samples as a reference to write your own feature files and step definitions.

1. Create your feature files using the Gherkin syntax and place them in the `src/test/test` directory.

2. Implement the step definitions for your feature files in the `src/test/java/stepdefinitions` package.

3. Utilize the Singleton design pattern for WebDriver management by using the `WebDriverSingleton.getDriver()` method to access the WebDriver instance.



## Test Execution

To execute the tests, you can use the provided TestNG XML files located in the `src/tests` directory. These XML files allow you to configure the test suites and define the specific feature files or scenarios to be executed.

You can run the tests using Maven:

```bash
mvn clean test -DsuiteXmlFile=regressionSuite.xml
```


## Reporting

The Automation Framework is integrated with Allure for generating comprehensive and visually appealing test reports. After test execution, the Allure report will be generated in the `target/allure-report` directory.

To view the report, you can use the following Maven command:

```bash
mvn allure:serve
```

This command will start a local web server and open the Allure report in your default web browser.

## Contributing

Contributions to the Automation Framework are welcome! If you encounter any issues or have suggestions for improvements, please create an issue or submit a pull request.

1. Fork the repository.
2. Create a new branch for your feature/bug fix.
3. Make your changes and commit them.
4. Push your changes to your forked repository.
5. Submit a pull request to the main repository.


I hope this README file template helps you create a comprehensive and informative documentation for your automation framework!
