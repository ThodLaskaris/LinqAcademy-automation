import org.testng.annotations.Test;

public class TestCase3 {

    @Test(groups = {"pre2"})
    public void testStep1() {
        System.out.println("Test Step 1 of Test");
    }

    @Test(groups = {"pre2"})
    public void testStep2() {
        System.out.println("Test Step 2 of Test Case 3");
    }
}
