

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(JUnitParamsRunner.class)
public class BookingSystemTest {
    public Object[] bookingHours() {
        return new Object[] {
            new Object[] { new Integer[] {1, 2, 3, 4}},
            new Object[] { new Integer[] {5,2}},
            new Object[] { new Integer[] {2,5,6,21}}
        };
    }

    @Parameters(method = "bookingHours")
    @Test
    public void shouldCheckBokkingHours(Integer[] hours) {
        BookingSystem bs = new BookingSystem();
        ArrayList<Integer> bookHours = bs.booking(hours);
        ArrayList<Integer> bookCheck = new ArrayList<Integer>();
        Collections.addAll(bookCheck, hours);
        System.out.println(bookHours);
        System.out.println(bookCheck);
        assertTrue(bookHours.equals(bookCheck));
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowException() {
        BookingSystem bs = new BookingSystem();
        bs.booking(new Integer[] {24, -12, 32});
        bs.booking(new Integer[] {12, 12, 12});
    }

}
