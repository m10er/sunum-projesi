package utilities;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class RetryListener extends TestListenerAdapter implements IRetryAnalyzer {
    private int retryCount = 0;
    private static final int maxRetryCount = 1;

    @Override
    public boolean retry(ITestResult result) {
        if (retryCount < maxRetryCount) {
            retryCount++;
            return true;
        }
        return false;
    }

    @Override
    public void onTestFailure(ITestResult result) {
        if (retry(result)) {
            result.setStatus(ITestResult.FAILURE);
        } else {
            result.setStatus(ITestResult.FAILURE);
        }
    }
}
