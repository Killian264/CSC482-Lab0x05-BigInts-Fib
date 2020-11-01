package killiandebacker.com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import killiandebacker.com.MyBigDecimalInt;
import org.junit.jupiter.api.Test;

public class MyBigDecimalIntGreaterThanTests {

    @Test
    void greaterThanEmptyStrings(){
        MyBigDecimalInt a = new MyBigDecimalInt("");
        MyBigDecimalInt b = new MyBigDecimalInt("");

        assertEquals(false, a.greaterThan(b));
    }

    @Test
    void greatherThanEmptyString(){
        MyBigDecimalInt a = new MyBigDecimalInt("111");
        MyBigDecimalInt b = new MyBigDecimalInt("");

        assertEquals(true, a.greaterThan(b));
    }

    @Test
    void greaterThanEqualStrings(){
        MyBigDecimalInt a = new MyBigDecimalInt("111");
        MyBigDecimalInt b = new MyBigDecimalInt("111");

        assertEquals(false, a.greaterThan(b));
    }

    @Test
    void greaterThanALarger(){
        MyBigDecimalInt a = new MyBigDecimalInt("1111");
        MyBigDecimalInt b = new MyBigDecimalInt("111");

        assertEquals(true, a.greaterThan(b));
    }

    @Test
    void greaterThanBLarger(){
        MyBigDecimalInt a = new MyBigDecimalInt("111");
        MyBigDecimalInt b = new MyBigDecimalInt("1111");

        assertEquals(false, a.greaterThan(b));
    }

    @Test
    void greaterThanALarger2(){
        MyBigDecimalInt a = new MyBigDecimalInt("1112");
        MyBigDecimalInt b = new MyBigDecimalInt("1111");

        assertEquals(true, a.greaterThan(b));
    }

}
