import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestCase4 {
    @BeforeClass
    public void beforeClass() {
        System.out.println("Before class Test Case 4");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("After class Test Case 4");
    }

    @Test
    public void testStep1() {
        System.out.println("Test Step 1 of Test Case 4");
    }
}
