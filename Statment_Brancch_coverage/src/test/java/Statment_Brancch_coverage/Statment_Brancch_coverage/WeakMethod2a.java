package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod2a {
    @Test
    public void testDivisionByZero() {
        try {
            WeakClass.WeakMethod2(5, 0);
            fail("אמורה הייתה להיות זריקת ArithmeticException.");
        } catch (ArithmeticException e) {
            // החריג נתפס, כך שהבדיקה עוברת בהצלחה.
        }
    }
}
