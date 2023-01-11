import com.example.Feline;
import org.junit.Test;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {

    @Test
    public void felineEatMeatTest() throws Exception {

        Feline feline = new Feline();

        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.eatMeat());
    }

}
