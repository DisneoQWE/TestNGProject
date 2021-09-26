import org.testng.annotations.Test;

public class FirstTest {
    @Test(groups = {
            "firstTest"
    })
    public void FirstTest() {
        System.out.println("First Test");
    }

    @Test
    public void FirstTest1() {
        System.out.println("First Test1");
    }

    @Test
    public void FirstTest2() {
        System.out.println("First Test2");
    }
}
