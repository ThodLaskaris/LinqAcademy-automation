package pararell;

import org.testng.annotations.Test;

public class TestCase1 {

    @Test
    public void testStep_1() throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("Test Step 1 of Test Case 1");
    }
    @Test
    public void testStep_2() throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("Test Step 2 of Test Case 1");
    }
    @Test
    public void testStep_3() throws InterruptedException {
        Thread.sleep(30000);
        System.out.println("Test Step 3 of Test Case 1");
    }
}
