import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetKittensTest {

    @Test
    public void TestFelineGetKittens() {

        Feline feline = new Feline();

        int expectedKittensCount = 1;

        assertEquals(expectedKittensCount, feline.getKittens());

    }

}
