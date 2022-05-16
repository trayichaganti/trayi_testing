

import org.junit.BeforeClass;
import org.junit.Test;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class SUMTest {
    public static SUM obj;

    @BeforeClass
    public static void setup() {
        obj = new SUM();
        assertNotEquals(obj, null);
    }

    @Test
    public void SumOfThree1() {
        assertEquals(9, obj.SumOfThree(3, 4, 2));
    }
}
