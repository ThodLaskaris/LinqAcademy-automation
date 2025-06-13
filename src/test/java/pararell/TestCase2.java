package pararell;

import org.testng.annotations.Test;

public class TestCase2 {
    @Test(retryAnalyzer = RetryScenario.class)
    public void testStep_1() throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("Test Step 1 of Test Case 2");
    }
}