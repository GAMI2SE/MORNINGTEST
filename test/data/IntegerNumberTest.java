package data;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Psycher
 */
public class IntegerNumberTest {

    IntegerNumber testcase1, testcase2;

    public IntegerNumberTest() {
    }

    @Before
    public void setUp() {
        testcase1 = new IntegerNumber(631);
        testcase2 = new IntegerNumber(4);
    }

    @After
    public void tearDown() {
        testcase1 = null;
        testcase2 = null;
    }

    /**
     * Test of isPrimeNumber method, of class IntegerNumber.
     */
    @Test
    public void testIsPrimeNumber() {        
        boolean result1 = testcase1.isPrimeNumber();
        boolean result2 = testcase2.isPrimeNumber();

        assertTrue(result1);
        assertFalse(result2);
    }

}
