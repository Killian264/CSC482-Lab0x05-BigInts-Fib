package killiandebacker.com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import killiandebacker.com.MyBigDecimalInt;
import org.junit.jupiter.api.Test;

public class MyBigDecimalIntAdditionTests {

    @Test
    void additionEmptyStrings(){
        MyBigDecimalInt a = new MyBigDecimalInt("");
        MyBigDecimalInt b = new MyBigDecimalInt("");

        MyBigDecimalInt c = a.plus(b);

        assertEquals( "", c.value());
    }

    @Test
    void additionEmptyString(){
        MyBigDecimalInt a = new MyBigDecimalInt("");
        MyBigDecimalInt b = new MyBigDecimalInt("111");

        MyBigDecimalInt c = a.plus(b);

        assertEquals("111", c.value());
    }

    @Test
    void additionEqualLengths(){
        MyBigDecimalInt a = new MyBigDecimalInt("111");
        MyBigDecimalInt b = new MyBigDecimalInt("111");

        MyBigDecimalInt c = a.plus(b);

        assertEquals("222", c.value());
    }

    @Test
    void additionAGreaterLengths(){
        MyBigDecimalInt a = new MyBigDecimalInt("11111");
        MyBigDecimalInt b = new MyBigDecimalInt("111");

        MyBigDecimalInt c = a.plus(b);

        assertEquals("11222", c.value());
    }

    @Test
    void additionBGreaterLengths(){
        MyBigDecimalInt a = new MyBigDecimalInt("111");
        MyBigDecimalInt b = new MyBigDecimalInt("11111");

        MyBigDecimalInt c = a.plus(b);

        assertEquals("11222", c.value());
    }

    @Test
    void additionEqualLengthCarryOver(){
        MyBigDecimalInt a = new MyBigDecimalInt("911");
        MyBigDecimalInt b = new MyBigDecimalInt("911");

        MyBigDecimalInt c = a.plus(b);

        assertEquals("1822", c.value());
    }

    @Test
    void additionAGreaterCarryOver(){
        MyBigDecimalInt a = new MyBigDecimalInt("999999999999999999999");
        MyBigDecimalInt b = new MyBigDecimalInt("1");

        MyBigDecimalInt c = a.plus(b);

        assertEquals("1000000000000000000000", c.value());
    }

    @Test
    void additionVeryLargeNumberCarryOver(){
        MyBigDecimalInt a = new MyBigDecimalInt("189134958102935801923580913258091235809123580912358091235");
        MyBigDecimalInt b = new MyBigDecimalInt("9324123598349081092358091283509123591023570912325091235097123250871239047123590120329058120357138571203045");

        MyBigDecimalInt c = a.plus(b);

        assertEquals("9324123598349081092358091283509123591023570912325280370055226186673162628036848211564867243938050929294280", c.value());
    }
}
