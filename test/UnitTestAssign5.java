import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
public class UnitTestAssign5 {
    private Computation computation;

    @Before
    public void setUp() {
        computation = new Computation();
    }

    @Test
    public void testConvertToHexString_BasicNumbers() {
        // Test basic decimal to hex conversions
        assertEquals("0", computation.convertToHexString(0));
        assertEquals("A", computation.convertToHexString(10));
        assertEquals("F", computation.convertToHexString(15));
        assertEquals("10", computation.convertToHexString(16));
        assertEquals("FF", computation.convertToHexString(255));
    }

    @Test
    public void testConvertToHexString_LargeNumbers() {
        assertEquals("FF00FF", computation.convertToHexString(16711935));
        assertEquals("FFFFFF", computation.convertToHexString(16777215));
    }

    @Test
    public void testConvertToHexString_EdgeCases() {
        assertEquals("0", computation.convertToHexString(0));
        assertEquals("7FFFFFFF", computation.convertToHexString(Integer.MAX_VALUE));
    }


}
