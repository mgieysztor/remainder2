package pl.semiadvanced;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @org.junit.Test

    public void remainder_isNotNull() {
        //given
        //instrukcje przygotowujące
        int amount = 380;

        //when
        //wykonanie testowanych instrukcji
        List<Integer> remainder = App.remainder(380);

        //then
        //sprawdzenie poprawności
        assertTrue(remainder != null);
//        assertFalse(remainder.isEmpty()); //przyjmij, że to co podajemy jest false
//        assertTrue(remainder.size() > 0);
    }

    @org.junit.Test
    public void remainder_isCorrectFor100() {
        //given
        //instrukcje przygotowujące
        int amount = 100;

        //when
        //wykonanie testowanych instrukcji
        List<Integer> remainder = App.remainder(amount);

        //then
        //sprawdzenie poprawności
        assertTrue(remainder.size() == 1);    //asercje równoważne
        assertEquals(1, remainder.size());
        assertTrue(remainder.get(0) == 100);
        assertEquals(remainder.get(0), Integer.valueOf(100));

    }

    @org.junit.Test
    public void remainder_isCorrectFor380() {
        //given
        //instrukcje przygotowujące
        int amount = 380;

        //when
        //wykonanie testowanych instrukcji
        List<Integer> remainder = App.remainder(amount);

        //then
        //sprawdzenie poprawności
        assertEquals(5, remainder.size());
        assertEquals(remainder.get(0), Integer.valueOf(200));
        assertEquals(remainder.get(1), Integer.valueOf(100));
        assertEquals(remainder.get(2), Integer.valueOf(50));
        assertEquals(remainder.get(3), Integer.valueOf(20));
        assertEquals(remainder.get(4), Integer.valueOf(10));
    }

    @org.junit.Test
    public void remainder_isCorrectFor1109() {
        //given
        //instrukcje przygotowujące
        int amount = 1109;

        //when
        //wykonanie testowanych instrukcji
        List<Integer> remainder = App.remainder(amount);

        //then
        //sprawdzenie poprawności
        assertEquals(9, remainder.size());
        assertEquals(remainder.get(0), Integer.valueOf(200));
        assertEquals(remainder.get(1), Integer.valueOf(200));
        assertEquals(remainder.get(2), Integer.valueOf(200));
        assertEquals(remainder.get(3), Integer.valueOf(200));
        assertEquals(remainder.get(4), Integer.valueOf(200));
        assertEquals(remainder.get(5), Integer.valueOf(100));
        assertEquals(remainder.get(6), Integer.valueOf(5));
        assertEquals(remainder.get(7), Integer.valueOf(2));
        assertEquals(remainder.get(8), Integer.valueOf(2));
    }

    @org.junit.Test(expected = IllegalArgumentException.class)
    public void remainder_shouldThrowExceptionForNegativeNumber() {
        // given
        int amount = -1;

        // when
        List<Integer> remainder = App.remainder(amount);
    }

    @org.junit.Test
    public void remainder_for0()

    {
        //given
        int amount = 0;

        //when
        List<Integer> remainder = App.remainder(amount);

        //then
        assertTrue(remainder.size()==0);
    }
}
