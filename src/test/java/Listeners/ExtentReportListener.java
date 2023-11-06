package Listeners;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import java.io.IOException;
public class ExtentReportListener implements ITestListener {
    private ExtentReports extent;
    private ExtentTest test;


    @Override
    public void onStart(ITestContext context) {
        extent = new ExtentReports();
        ExtentSparkReporter htmlReporter = new ExtentSparkReporter("test-output/ExtentReport.html");
        try {
            htmlReporter.loadXMLConfig("src/test/resources/extent-config.xml");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        extent.attachReporter(htmlReporter);
    }

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.pass("Test passed: " + result.getName());
        addTesterInfo(result.getTestContext());
    }

    @Override
    public void onTestFailure(ITestResult result) {
        test.fail("Test failed: " + result.getName());
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip("Test skipped: " + result.getName());
    }

    @Override
    public void onFinish(ITestContext context) {
        ExtentSparkReporter reporter=new ExtentSparkReporter("test-output/ExtentReport.html");
        reporter.config().setReportName("Demo Test Report");
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester Name","Özgür Gögersin");
        extent.setSystemInfo("Job Description","Freelance SDET");
        extent.setSystemInfo("Environment", "Windows 10");
        extent.setSystemInfo("Browser", "Edge,Firefox and Chrome");
        extent.flush();
    }
    private void addTesterInfo(ITestContext context) {
        test.log(Status.INFO, "Tester Name: " + context.getCurrentXmlTest().getParameter("Tester Name"));
        test.log(Status.INFO, "Tester Email: " + context.getCurrentXmlTest().getParameter("Tester Email"));
    }
}
