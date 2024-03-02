package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod4a {
    @Test
    public void testFirstBranch() {
        assertEquals(25, WeakClass.WeakMethod4(15, 2)); // עובר דרך הענף הראשון
    }

    @Test
    public void testSecondBranch() {
        assertEquals(2,WeakClass.WeakMethod4(7, 2)); // עובר דרך הענף השני
    }

    @Test
    public void testThirdBranch() {
        assertEquals(2,WeakClass.WeakMethod4(4, 2)); // עובר דרך הענף השלישי אך לא מחלק באפס
    }
}
