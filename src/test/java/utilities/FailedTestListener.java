package utilities;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FailedTestListener implements IInvokedMethodListener {

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // Do nothing before invocation
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        if (!testResult.isSuccess()) {
            saveFailedTest(method, testResult);
        }
    }

    private void saveFailedTest(IInvokedMethod method, ITestResult testResult) {
        String testName = method.getTestMethod().getMethodName();
        String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
        String directoryPath = "failedTests/" + testName + "_" + timestamp;

        try {
            File directory = new File(directoryPath);
            if (directory.mkdirs()) {
                String fileName = directoryPath + "/failedTest.txt";
                FileWriter writer = new FileWriter(fileName);
                writer.write("Test Method: " + testName + "\n");
                writer.write("Exception: " + testResult.getThrowable().toString());
                writer.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
