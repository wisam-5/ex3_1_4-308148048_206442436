package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod1b {
    @Test
    public void testNormalDivision() {
        assertEquals("Division should work correctly", 2, WeakClass.WeakMethod1(4, 2));
    }

    @Test
    public void testAnotherNormalDivision() {
        assertEquals("Division should work correctly", 3, WeakClass.WeakMethod1(6, 2));
    }
}

