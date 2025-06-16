package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class extentManager {
    public static ExtentReports getReportObject() {
        ExtentSparkReporter reporter = new ExtentSparkReporter("reports/extentReport.html");
        reporter.config().setReportName("GitHub UI Test Report");
        reporter.config().setDocumentTitle("GitHub QA Assignment");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Sanjay Gudipudi");
        return extent;
    }

}
