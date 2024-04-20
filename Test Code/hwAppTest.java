import org.junit.;
import static org.junit.Assert.;

public class hwAppTest {


    @Test
    public void testFullMonthNames() {
        assertEquals("January", hwApp.setMonth("January"));
        assertEquals("February", hwApp.setMonth("February"));
        assertEquals("March", hwApp.setMonth("March"));
        assertEquals("April", hwApp.setMonth("April"));
        assertEquals("May", hwApp.setMonth("May"));
        assertEquals("June", hwApp.setMonth("June"));
        assertEquals("July", hwApp.setMonth("July"));
        assertEquals("August", hwApp.setMonth("August"));
        assertEquals("September", hwApp.setMonth("September"));
        assertEquals("October", hwApp.setMonth("October"));
        assertEquals("November", hwApp.setMonth("November"));
        assertEquals("December", hwApp.setMonth("December"));
    }

 
    @Test
    public void testAbbreviatedMonthNames() {
        assertEquals("January", hwApp.setMonth("Jan"));
        assertEquals("February", hwApp.setMonth("Feb"));
        assertEquals("March", hwApp.setMonth("Mar"));
        assertEquals("April", hwApp.setMonth("Apr"));
        assertEquals("May", hwApp.setMonth("May"));
        assertEquals("June", hwApp.setMonth("Jun"));
        assertEquals("July", hwApp.setMonth("Jul"));
        assertEquals("August", hwApp.setMonth("Aug"));
        assertEquals("September", hwApp.setMonth("Sep"));
        assertEquals("October", hwApp.setMonth("Oct"));
        assertEquals("November", hwApp.setMonth("Nov"));
        assertEquals("December", hwApp.setMonth("Dec"));
    }


    @Test
    public void testNumericInputs() {
        assertEquals("January", hwApp.setMonth("1"));
        assertEquals("February", hwApp.setMonth("2"));
        assertEquals("March", hwApp.setMonth("3"));
        assertEquals("April", hwApp.setMonth("4"));
        assertEquals("May", hwApp.setMonth("5"));
        assertEquals("June", hwApp.setMonth("6"));
        assertEquals("July", hwApp.setMonth("7"));
        assertEquals("August", hwApp.setMonth("8"));
        assertEquals("September", hwApp.setMonth("9"));
        assertEquals("October", hwApp.setMonth("10"));
        assertEquals("November", hwApp.setMonth("11"));
        assertEquals("December", hwApp.setMonth("12"));
    }


    @Test
    public void testInvalidInputs() {
        assertEquals("Invalid month", hwApp.setMonth("13"));
        assertEquals("Invalid month", hwApp.setMonth("0"));
        assertEquals("Invalid month", hwApp.setMonth("Janu"));
        assertEquals("Invalid month", hwApp.setMonth("25"));
        assertEquals("Invalid month", hwApp.setMonth("Decem"));
        assertEquals("Invalid month", hwApp.setMonth("123"));
    }


    @Test
    public void testCaseSensitivityAndWhitespace() {
        assertEquals("March", hwApp.setMonth(" march "));
        assertEquals("April", hwApp.setMonth("   ApR    "));
    }


    @Test
    public void testGetMonth() {
        hwApp.setMonth("October");
        assertEquals("October", hwApp.getMonth());
        hwApp.setMonth("May");
        assertEquals("May", hwApp.getMonth());
    }
}
