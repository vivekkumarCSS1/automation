# LinkedIn Automation Testing

## Project Overview
This project focuses on automating LinkedIn login page functionality using Selenium WebDriver and Java. It follows the Page Object Model (POM) design pattern to create reusable, maintainable, and structured automation tests.

## Technologies Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- ChromeDriver

## Features
- Automated login page validation
- Positive and negative login test scenarios
- Reusable page classes and utility methods
- Explicit waits for reliable element interactions
- TestNG assertions for validating expected results
- Smoke and regression test organization

## Project Structure
```text
automation/
├── src/
│   └── test/
│       └── java/
│           ├── base/
│           ├── pages/
│           ├── tests/
│           └── utilities/
├── pom.xml
├── testng.xml
└── README.md
```

## Prerequisites
- Java JDK
- Eclipse IDE
- Maven
- Google Chrome
- Git

## How to Run
1. Clone or download this repository.
2. Import the project into Eclipse as a Maven project.
3. Update Maven dependencies.
4. Configure the required test credentials securely through environment variables, if running authenticated tests.
5. Run the TestNG test class or `testng.xml`.

## Test Scenarios
- Login page visibility
- Empty input validation
- Invalid credentials validation
- Boundary-value testing, according to the application's requirements
- Smoke and regression test execution

## Security Note
Do not store real passwords, access tokens, or personal credentials in the source code or repository. Use authorized test accounts and follow the application's terms and security requirements.

## Author
Vivek Kumar

## Disclaimer
This project is intended for educational and automation-testing practice. It is not affiliated with or endorsed by LinkedIn.
