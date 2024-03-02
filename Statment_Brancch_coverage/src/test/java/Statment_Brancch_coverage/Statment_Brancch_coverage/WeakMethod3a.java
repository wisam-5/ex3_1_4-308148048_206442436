package Statment_Brancch_coverage.Statment_Brancch_coverage;

import org.junit.Test;
import static org.junit.Assert.*;

public class WeakMethod3a {
    @Test
    public void testFirstBranch() {
        assertEquals(2, WeakClass.WeakMethod3(4, 2)); // עובר דרך הענף הראשון
    }

    // לא מבצעים בדיקה של הענף השלישי שבו יש חלוקה באפס
}
