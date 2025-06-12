import org.testng.Assert;
import org.testng.annotations.*;

public class TestCase1 {

    @BeforeClass
    public void beforeClass_1() {
        System.out.println("Before Class 1 of Test Case 1");
    }

    @BeforeClass(dependsOnMethods = {"beforeClass_1"}) // εκτελειται η beforeclass1 μετα η 2 και μετα η 10
    public void beforeClass_2() {
        System.out.println("Before Class 2 of Test Case 1");
         Assert.assertTrue(Boolean.FALSE);

    }

    @BeforeClass(enabled = false)
    public void beforeClass_10() {
        System.out.println("Before Class 10 of test Case 1");
    }

    @AfterClass
    public void afterClass_1() {
        System.out.println("After Class 1 of Test Case 1");
    }

    @BeforeMethod
    public void beforeMethod_1() {
        System.out.println("Before Method 1 of Test Case 1");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod_1() {
        System.out.println("After Method 1 of Test Case 1");
    }

    @Test
    public void testStep_1() {
        System.out.println("This is Test Step 1 of Test Case 1");
    }

    @Test
    public void testStep_2() {
        System.out.println("This is Test Step 2 of Test Case 1");
    }

    @Test(alwaysRun = true)
    public void testStep_10() {
        System.out.println("This is  Test Step 10 of Test Case 1");

    }
}
