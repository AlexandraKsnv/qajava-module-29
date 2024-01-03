import org.junit.Test;

import static org.testng.Assert.assertTrue;
import static org.testng.Assert.assertFalse;

public class PersonTest {

    @Test
    public void isTeenager_age_minus_1() {
        boolean result = Person.isTeenager(-1);
        assertFalse(result);
    }

    @Test
    public void isTeenager_age_19() {
        boolean result = Person.isTeenager(19);
        assertTrue(result);
    }

    @Test
    public void isTeenager_age_15() {
        boolean result = Person.isTeenager(15);
        assertTrue(result);
    }

    @Test
    public void isTeenager_age_1() {
        boolean result = Person.isTeenager(1);
        assertFalse(result);
    }

    @Test
    public void isTeenager_age_13() {
        boolean result = Person.isTeenager(13);
        assertTrue(result);
    }

    @Test
    public void isTeenager_age_55() {
        boolean result = Person.isTeenager(55);
        assertFalse(result);
    }
    @Test
    public void isTeenager_age_0() {
        boolean result = Person.isTeenager(0);
        assertFalse(result);
    }


}
