import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class LionTest {

    @Mock
    Feline feline;

    @Test
    public void TestCountLionIsOne() throws Exception {

        Lion lion = new Lion("Самец", feline);

        Mockito.when(feline.getKittens()).thenReturn(1);

        int expectedLionCount = 1;

        assertEquals(expectedLionCount, lion.getKittens());

    }
}
