package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;


public class WeakMethod1a {
    @Test
    (expected = ArithmeticException.class)
    public void testDivisionByZero() {
        WeakClass.WeakMethod1(10, 0); 
    }
}


