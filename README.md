# DemoBlazeProject - Automated Testing with TestNG

Welcome to the DemoBlazeProject, an automated testing project using TestNG for web application testing. This project demonstrates key features of TestNG, including cross-browser testing and the use of listeners.

## Key Features

### 1. Cross-Browser Testing
I use TestNG's parameterization feature to execute tests on different browsers (like Edge, Firefox and Chrome). This ensures our web application is compatible with multiple browsers.

### 2. Listeners
I implemented TestNG listeners to enhance our test automation framework:

**ScreenshotListener**: This custom listener plays a crucial role in capturing screenshots during test failures. When a test case fails, the `ScreenshotListener` automatically captures a screenshot of the browser's current state. This feature greatly aids in error analysis, debugging, and reporting.

The screenshot capture process is as follows:
- When a test case fails, the listener is triggered.
- It uses the `TakesScreenshot` interface to capture a screenshot of the WebDriver's current state.
- The captured screenshot is saved as a file.
- The filename includes the test method's name and a timestamp to ensure uniqueness.
- The screenshot file is saved in a designated directory for easy access and reference.

### 3. Data-Driven Testing
I utilize TestNG's data provider feature for data-driven testing. Test data is passed to test methods through parameters, allowing us to test various scenarios with the same test logic.

### 4. Page Object Model
I've organized project using the Page Object Model (POM) design pattern. This separates the page elements from the test logic, making the code more maintainable.

### 5. Assertion Handling
I use TestNG's assertion mechanisms to verify expected outcomes in our tests. This helps us validate the functionality of the web application.

### 6. Error Handling
Proper error handling and exception management ensure that our tests are robust and reliable, even in the presence of unexpected events.
