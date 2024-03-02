package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod3b {
    @Test
    public void testFirstBranch() {
        assertEquals(22, WeakClass.WeakMethod3(12, 2)); // עובר דרך הענף הראשון
    }

    @Test
    public void testSecondBranch() {
        assertEquals(11, WeakClass.WeakMethod3(6, 2)); // עובר דרך הענף השני
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        WeakClass.WeakMethod3(4, 0); // עובר דרך הענף השלישי שמחזיר תקלת חלוקה באפס
    }
}
