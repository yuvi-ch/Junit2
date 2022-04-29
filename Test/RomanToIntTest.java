import RomanToInteger.RomanToInt;
import org.junit.*;
import static org.junit.Assert.*;

    public class RomanToIntTest {
        private final RomanToInt x = new RomanToInt();

        //-------------------------------------------------------------------
        @Test
        public void test1(){

            var actualResult = x.romanToInt("III");

            assertEquals(3,actualResult);

        }
}
