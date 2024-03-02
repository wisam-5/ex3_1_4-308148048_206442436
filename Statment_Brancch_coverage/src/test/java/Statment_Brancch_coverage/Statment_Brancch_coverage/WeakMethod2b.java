package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod2b {
    @Test
    public void testWithAddition() {
        assertEquals(16, WeakClass.WeakMethod2(6, 10)); 
    }

    @Test
    public void testWithoutDivisionByZero() {
        assertEquals(2, WeakClass.WeakMethod2(4, 2)); 
    }
}
