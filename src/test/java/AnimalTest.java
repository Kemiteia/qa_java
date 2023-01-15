import com.example.Animal;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnimalTest {

    @Test
    public void testAnimalGetFamily() {

        Animal animal = new Animal();

        String expectedAnimalGetFamily = "Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи";

        assertEquals(expectedAnimalGetFamily, animal.getFamily());

    }
}
