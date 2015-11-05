import junit.framework.TestCase;

import static org.junit.Assert.*;


public class mMTest extends TestCase {

    @org.junit.Test(timeout = 1000)
    public void testName() throws Exception {
        mM test = new mM();
        assertEquals("my naMe is AhMed", test.charToString(test.mM("My name is Ahmed")));
    }
}