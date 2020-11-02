package killiandebacker.com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import killiandebacker.com.MyBigDecimalInt;
import org.junit.jupiter.api.Test;

public class MyBigDecimalIntSubtractTests {

    // No
//    @Test
//    void subtractionEmptyStrings(){
//        MyBigDecimalInt a = new MyBigDecimalInt("");
//        MyBigDecimalInt b = new MyBigDecimalInt("");
//
//        MyBigDecimalInt c = a.minus(b);
//
//        assertEquals( "", c.value);
//    }

    @Test
    void subtractionEqualLengths(){
        MyBigDecimalInt a = new MyBigDecimalInt("111");
        MyBigDecimalInt b = new MyBigDecimalInt("111");

        MyBigDecimalInt c = a.minus(b);

        assertEquals("0", c.value());
    }

    @Test
    void subtractionAGreaterLengths(){
        MyBigDecimalInt a = new MyBigDecimalInt("11111");
        MyBigDecimalInt b = new MyBigDecimalInt("111");

        MyBigDecimalInt c = a.minus(b);

        assertEquals("11000", c.value());
    }

    @Test
    void subtractionEqualLengthCarryOver(){
        MyBigDecimalInt a = new MyBigDecimalInt("911");
        MyBigDecimalInt b = new MyBigDecimalInt("9");

        MyBigDecimalInt c = a.minus(b);

        assertEquals("902", c.value());
    }

    @Test
    void subtractionAGreaterCarryOver(){
        MyBigDecimalInt a = new MyBigDecimalInt("100000000000000");
        MyBigDecimalInt b = new MyBigDecimalInt("1");

        MyBigDecimalInt c = a.minus(b);

        assertEquals("99999999999999", c.value());
    }

//    @Test
//    void additionVeryLargeNumberCarryOver(){
//        MyBigDecimalInt a = new MyBigDecimalInt("189134958102935801923580913258091235809123580912358091235");
//        MyBigDecimalInt b = new MyBigDecimalInt("9324123598349081092358091283509123591023570912325091235097123250871239047123590120329058120357138571203045");
//
//        MyBigDecimalInt c = a.minus(b);
//
//        assertEquals("9324123598349081092358091283509123591023570912325280370055226186673162628036848211564867243938050929294280", c.value);
//    }
}
