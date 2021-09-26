package newTests;

import org.testng.annotations.Test;

public class ThirdTest {
    @Test
    public void thirdTest() {
        String user = "Arsan Sagindykov";
        String password = "12345";
        if (user.equals("Arsan Sagindykov") && password.equals("12345")) System.out.println("You passed third test");
    }
}
