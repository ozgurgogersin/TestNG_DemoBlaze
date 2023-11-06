# DemoBlazeProject - Automated Testing with TestNG

Welcome to the **DemoBlazeProject**, an automated testing project using **TestNG** for web application testing. This project demonstrates key features of TestNG, including cross-browser testing, the use of listeners, and more.

## Key Features

### 1. Cross-Browser Testing

I use TestNG's parameterization feature to execute tests on different browsers like Edge, Firefox, and Chrome. This ensures that our web application is compatible with multiple browsers.

### 2. Listeners

I implemented TestNG listeners to enhance our test automation framework:

- **ScreenshotListener**: This custom listener plays a crucial role in capturing screenshots during test failures. When a test case fails, the **ScreenshotListener** automatically captures a screenshot of the browser's current state. This feature greatly aids in error analysis, debugging, and reporting.

   - The screenshot capture process includes:
     1. When a test case fails, the listener is triggered.
     2. It uses the **TakesScreenshot** interface to capture a screenshot of the WebDriver's current state.
     3. The captured screenshot is saved as a file.
     4. The filename includes the test method's name and a timestamp to ensure uniqueness.
     5. The screenshot file is saved in a designated directory for easy access and reference.

### 3. Data-Driven Testing

I utilize TestNG's data provider feature for data-driven testing. Test data is passed to test methods through parameters, allowing us to test various scenarios with the same test logic.

### 4. Page Object Model

I've organized the project using the **Page Object Model (POM)** design pattern. This separates the page elements from the test logic, making the code more maintainable.

### 5. Assertion Handling

I use TestNG's assertion mechanisms to verify expected outcomes in our tests. This helps us validate the functionality of the web application.

### 6. Error Handling

Proper error handling and exception management ensure that our tests are robust and reliable, even in the presence of unexpected events.

### 7. Enhanced Reporting with Extent Reports

- I've integrated **Extent Reports** into the project to provide detailed and professional reports of test executions.
- Extent Reports include tester information, job description, environment details, and browser information to provide context and traceability for test results.
- Each test case now logs tester name and email along with its status (pass, fail, or skip) in the Extent Report.
- Extent Reports enhance the visibility and comprehensibility of test results, aiding in analysis and debugging.

## Author

- **Tester Name**: Özgür Gögersin
- **Tester Email**: ozgurgogersin@gmail.com
