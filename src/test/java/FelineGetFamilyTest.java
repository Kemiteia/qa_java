import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FelineGetFamilyTest {

    @Test
    public void testGetFamily() {

        String expectedFelineFamily = "Кошачьи";

        Feline feline = new Feline();

        assertEquals(expectedFelineFamily, feline.getFamily());

    }
}
