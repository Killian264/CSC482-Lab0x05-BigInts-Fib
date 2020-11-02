package killiandebacker.com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import killiandebacker.com.Main;
import killiandebacker.com.MyBigDecimalInt;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class FibonacciTestsMyBigDecimalInt {
    @Test
    void fibRecurBaseCase(){
        MyBigDecimalInt a = new MyBigDecimalInt("1");

        MyBigDecimalInt res = Main.fibRecur2(a);

        assertEquals( "0", res.value);
    }
    @Test
    void fibRecurBaseCase2(){
        MyBigDecimalInt a = new MyBigDecimalInt("2");

        MyBigDecimalInt res = Main.fibRecur2(a);

        assertEquals( "1", res.value);
    }
    @Test
    void fibRecurTestCase(){
        MyBigDecimalInt a = new MyBigDecimalInt("4");

        MyBigDecimalInt res = Main.fibRecur2(a);

        assertEquals( "2", res.value);
    }
    @Test
    void fibRecurTestCase2(){
        MyBigDecimalInt a = new MyBigDecimalInt("9");

        MyBigDecimalInt res = Main.fibRecur2(a);

        assertEquals( "21", res.value);
    }

    @Test
    void fibCacheBaseCase(){
        HashMap<String, MyBigDecimalInt> map = new HashMap<>();
        map.put("2", new MyBigDecimalInt("1"));
        map.put("1", new MyBigDecimalInt("0"));
        assertEquals( "0", Main.fibCache2(new MyBigDecimalInt("1"), map).value);
    }
    @Test
    void fibCacheBaseCase2(){
        HashMap<String, MyBigDecimalInt> map = new HashMap<>();
        map.put("2", new MyBigDecimalInt("1"));
        map.put("1", new MyBigDecimalInt("0"));
        assertEquals( "1", Main.fibCache2(new MyBigDecimalInt("2"), map).value);
    }
    @Test
    void fibCacheTestCase(){
        HashMap<String, MyBigDecimalInt> map = new HashMap<>();
        map.put("2", new MyBigDecimalInt("1"));
        map.put("1", new MyBigDecimalInt("0"));
        assertEquals( "2", Main.fibCache2(new MyBigDecimalInt("4"), map).value);
    }
    @Test
    void fibCacheTestCase2(){
        HashMap<String, MyBigDecimalInt> map = new HashMap<>();
        map.put("2", new MyBigDecimalInt("1"));
        map.put("1", new MyBigDecimalInt("0"));
        assertEquals( "21", Main.fibCache2(new MyBigDecimalInt("9"), map).value);
    }

    @Test
    void fibRegularBaseCase(){
        assertEquals( "0", Main.fibRegular2(new MyBigDecimalInt("1")).value);
    }
    @Test
    void fibRegularBaseCase2(){
        assertEquals( "1", Main.fibRegular2(new MyBigDecimalInt("2")).value);
    }
    @Test
    void fibRegularTestCase(){
        assertEquals( "2", Main.fibRegular2(new MyBigDecimalInt("4")).value);
    }
    @Test
    void fibRegularTestCase2(){
        assertEquals( "21", Main.fibRegular2(new MyBigDecimalInt("9")).value);
    }

    @Test
    void fibMatrixBaseCase(){
    assertEquals( "0", Main.fibMatrix2(new MyBigDecimalInt("1")).value);
}
    @Test
    void fibMatrixBaseCase2(){
        assertEquals( "1", Main.fibMatrix2(new MyBigDecimalInt("2")).value);
    }
    @Test
    void fibMatrixTestCase(){
        assertEquals( "2", Main.fibMatrix2(new MyBigDecimalInt("4")).value);
    }
    @Test
    void fibMatrixTestCase2(){
        assertEquals( "21", Main.fibMatrix2(new MyBigDecimalInt("9")).value);
    }

}
