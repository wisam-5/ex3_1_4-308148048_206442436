package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod4b {
    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        WeakClass.WeakMethod4(5, 0); // עובר דרך הענף השלישי ומחלק באפס
    }
}

