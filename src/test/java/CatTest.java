import com.example.Cat;
import com.example.Feline;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CatTest {

    @Test
    public void TestCatGetSound() {

        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        String expectedCatGetSound = "Мяу";

        assertEquals(expectedCatGetSound, cat.getSound());

    }
}
