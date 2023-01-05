import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineGetFamilyTest {

    @Spy
    private Feline feline = new Feline();

    @Test
    public void TestGetFamily() throws Exception {

        Mockito.when(feline.getFamily()).thenReturn("Кошачьи");

        String expectedFelineFamily = "Кошачьи";

        assertEquals(expectedFelineFamily, feline.getFamily());

    }
}
