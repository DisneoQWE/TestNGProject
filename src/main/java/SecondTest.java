import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.stream.Stream;

public class SecondTest {
    @Test
    public void SecondTest() {
        Stream<String> accounts = Stream.of("Arsan", "Infotecs", "Edward");
        System.out.println("Accaounts with name Arsan is " + accounts.filter((account)->account.contains("Arsan")).count());
    }
}
