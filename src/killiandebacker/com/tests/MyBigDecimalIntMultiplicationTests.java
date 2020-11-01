package killiandebacker.com.tests;

import killiandebacker.com.MyBigDecimalInt;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MyBigDecimalIntMultiplicationTests {
    @Test
    void multiplicationEmptyStrings(){
        MyBigDecimalInt a = new MyBigDecimalInt("");
        MyBigDecimalInt b = new MyBigDecimalInt("");

        MyBigDecimalInt c = a.times(b);

        assertEquals("", c.value);
    }

    @Test
    void multiplicationStringsEqualLength(){
        MyBigDecimalInt a = new MyBigDecimalInt("9");
        MyBigDecimalInt b = new MyBigDecimalInt("9");

        MyBigDecimalInt c = a.times(b);

        assertEquals("81", c.value);
    }

    @Test
    void multiplicationAStringLarger(){
        MyBigDecimalInt a = new MyBigDecimalInt("999");
        MyBigDecimalInt b = new MyBigDecimalInt("9");

        MyBigDecimalInt c = a.times(b);

        assertEquals("8991", c.value);
    }

    @Test
    void multiplicationBStringLarger(){
        MyBigDecimalInt a = new MyBigDecimalInt("9");
        MyBigDecimalInt b = new MyBigDecimalInt("999");

        MyBigDecimalInt c = a.times(b);

        assertEquals("8991", c.value);
    }

    @Test
    void multiplicationLargeStringValues(){
        MyBigDecimalInt a = new MyBigDecimalInt("1234567890123456789087345091702349862390485774508174350917460813509174796587475981730591740659817435908173059");
        MyBigDecimalInt b = new MyBigDecimalInt("98765432109876543210893475029384790237459028367923487692834769082374692873469022");

        MyBigDecimalInt c = a.times(b);

        assertEquals("121932631137021795233476111417691303046561496442808248680312595627603318607413518194594368143839412636932319529936043213889100245919007045141425176779921281654292798862237459082431651478298", c.value);
    }
}
