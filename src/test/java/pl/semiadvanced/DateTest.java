package pl.semiadvanced;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Created by RENT on 2017-01-03.
 */
public class DateTest {

    @Test
    public void constructor_shouldFillFields() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;

        //when
        Date testDate = new Date(year, month, day);

        //then
        assertEquals(testDate.getYear(), 2016);
        assertEquals(testDate.getMonth(), 11);
        assertEquals(testDate.getDay(), 10);


    }

    //test dla wielu zmiennych
//    @Test
//    public void constructor_shouldFillFields2() {
//        // given
//        int[][] data = new int[][]{{2016, 10, 1}, {2010, 1, 1}, {3000, 12, 20}};
//
//        for (int[] testCase : data) {
//            Date date = new Date(testCase[0], testCase[1], testCase[2]);
//
//            assertEquals(date.getYear(), testCase[0]);
//            assertEquals(date.getMonth(), testCase[1]);
//            assertEquals(date.getDay(), testCase[2]);
//        }
//
//    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_negativeYear() {
        //given
        int year = -1;
        int month = 11;
        int day = 10;

        //when
        Date testDate = new Date(year, month, day);

    }

    @Test(expected = IllegalArgumentException.class)
    public void constructor_monthWithinRange()

    {
        int[][] data = new int[][]{{2016, 0, 1}, {2010, 13, 1}};

        for (int[] testCase : data) {
            Date date = new Date(testCase[0], testCase[1], testCase[2]);
            assertTrue(date.getMonth() > 0 && date.getMonth() < 13);
        }


    }

    @Test
    public void addYear_one() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addYear();

        //then
        assertEquals(testDate.getYear(), 2017);


    }

    @Test
    public void addYear_twice() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addYear();
        testDate.addYear();

        //then
        assertEquals(2018, testDate.getYear());


    }

    @Test
    public void addYears_zero() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addYears(0);

        //then
        assertEquals(2016, testDate.getYear());
        System.out.println("addYears_zero " + testDate.getYear() + "-" + testDate.getMonth() + "-" + testDate.getDay());
    }

    @Test
    public void addYears_five() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addYears(5);

        //then
        assertEquals(2021, testDate.getYear());
        System.out.println(testDate.getYear() + "-" + testDate.getMonth() + "-" + testDate.getDay());
    }


    @Test
    public void addYears_negative() {

        //given
        int year = 2016;
        int month = 11;
        int day = 10;
        int x = -1;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addYears(x);
        System.out.println(testDate.getYear() + "-" + testDate.getMonth() + "-" + testDate.getDay());

        //then
        assertEquals(2016, testDate.getYear());
    }
    @Test
    public void addMonths_negative() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;
        int x = -1;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addMonths(x);
        System.out.println("addMonths_negative " + testDate.getYear() + "-" + testDate.getMonth() + "-" + testDate.getDay());

        //then
        assertEquals(11,testDate.getMonth());
    }
    @Test
    public void addMonths_one() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;
        int x = 1;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addMonths(x);
        System.out.println("addMonths_one " + testDate.getYear() + "-" + testDate.getMonth() + "-" + testDate.getDay());

        //then
        assertEquals(12,testDate.getMonth());
    }

    @Test
    public void addMonths_thirteen() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;
        int x = 13;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addMonths(x);
        System.out.println("addMonths_thirteen " + testDate.getYear() + "-" + testDate.getMonth() + "-" + testDate.getDay());

        //then
        assertEquals(12,testDate.getMonth());
        assertEquals(2017,testDate.getYear());
    }
    @Test
    public void addMonths_twentyThree() {
        //given
        int year = 2016;
        int month = 11;
        int day = 10;
        int x = 23;

        //when
        Date testDate = new Date(year, month, day);
        testDate.addMonths(x);
        System.out.println("addMonths_twentyThree " + testDate.getYear() + "-" + testDate.getMonth() + "-" + testDate.getDay());

        //then
        assertEquals(10, testDate.getMonth());
        assertEquals(2018, testDate.getYear());
    }

}
