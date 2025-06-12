import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase2 {

    @Test(groups = {"pre1"})
    public void testStep_1precondition_1() {
        System.out.println("Precondition 1 of Test Case 2");
    }

    @Test(groups = {"pre1"})
    public void testStep_1precondition_2() {
        System.out.println("Precondition 2 of Test Case 2");
        Assert.assertTrue(Boolean.FALSE);
    }

    @Test(dependsOnMethods = {"testStep_1"})
    public void testStep_1precondition_3() {
        System.out.println("Precondition 3 of Test Case 2");
    }

    @Test(alwaysRun = true, dependsOnGroups = {"pre1"}, priority = 1)
    public void testStep_1() {
        System.out.println("Test Step 1 of Test Case 2");
    }

    @Test(priority = 2)
    public void testStep_2() {
        System.out.println("Test Step 2 of Test Case 2");
    }

    @Test(priority = 3, dataProvider = "dataProvider")
    public void testStep_3(String myString ) {
        System.out.println(myString);
    }

    @DataProvider(name = "dataProvider")
    public Object[][] createData() {
        return new Object[][]{
                {"Test Step 3 execution 1"},
                {"Test Step 3 exectuin 2"}
        };
    }
}
