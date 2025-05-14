# BDD-Test-Automation-Framework-Selenium-Java-TestNG

## 📌 Project Overview

This is a scalable and modular test automation framework built using **Selenium WebDriver**, **Java**, **TestNG**, and **Cucumber (BDD)**. It implements the **Page Object Model (POM)** design pattern and supports **data-driven testing** using Excel/CSV files. Designed for Web UI automation and easy integration with CI/CD pipelines.

---

## 📁 Project Structure

```
|-- src
|   |-- main
|   |   |-- java
|   |   |   |-- pages           # Page classes (POM)
|   |   |   |-- utils           # Utility classes (e.g., Excel reader, config loader)
|   |   |   |   |-- hooks       # Cucumber Hooks (Before/After)
|   |-- test
|   |   |-- java
|   |   |   |-- stepdefinitions # Step definitions for Cucumber
|   |   |   |-- runners         # TestNG runner classes
|-- resources
|   |-- features               # Cucumber feature files
|   |-- testdata               # Excel or CSV test data files
|   |-- config.properties      # Configuration settings
|-- pom.xml
```

---

## 🔧 Prerequisites

* Java 11 or higher
* Maven
* TestNG
* IDE (IntelliJ IDEA, Eclipse, etc.)

---

## 🚀 How to Run

### 1. Clone the Repository

```bash
git clone https://github.com/yourusername/BDD-Test-Automation-Framework-Selenium-Java-TestNG.git
cd BDD-Test-Automation-Framework-Selenium-Java-TestNG
```

### 2. Configure `config.properties`

```
browser=chrome
baseUrl=https://example.com
excelPath=src/resources/testdata/LoginData.xlsx
```

### 3. Run with Maven

```bash
mvn clean test
```

### 4. Run Specific Feature File (Optional)

Update runner class to point to the desired `.feature` file.

---

## 🧪 Sample Feature File

```gherkin
Feature: Login Functionality

  Scenario Outline: Invalid Login Attempts
    Given User is on login page
    When User enters username "<username>" and password "<password>"
    Then User should see error message "<message>"

    Examples:
      | username    | password | message                     |
      | invalidUser | wrong123 | Invalid username or password |
      |             | pass123  | Username is required         |
```

---

## 🧰 Tools & Libraries

* Selenium WebDriver
* TestNG
* Cucumber JVM
* Apache POI (Excel)
* OpenCSV (optional)
* Maven

---

## 📈 Reporting

* TestNG default reports are generated under `test-output`.
* Extend with ExtentReports or Allure for detailed reporting (optional).

---

## 📬 Contribution

Pull requests are welcome. For major changes, open an issue first to discuss what you would like to change.

---

## 📄 License

[MIT](https://choosealicense.com/licenses/mit/)

---

## 🙋‍♂️ Questions?

Feel free to raise an issue or ping me on GitHub.

---

Happy Testing! 🧪✨
