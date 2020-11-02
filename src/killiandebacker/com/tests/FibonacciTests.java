package killiandebacker.com.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import killiandebacker.com.Main;
import killiandebacker.com.MyBigDecimalInt;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class FibonacciTests {
    @Test
    void fibRecurBaseCase(){
        assertEquals( 0, Main.fibRecur(1));
    }
    @Test
    void fibRecurBaseCase2(){
        assertEquals( 1, Main.fibRecur(2));
    }
    @Test
    void fibRecurTestCase(){
        assertEquals( 2, Main.fibRecur(4));
    }
    @Test
    void fibRecurTestCase2(){
        assertEquals( 21, Main.fibRecur(9));
    }

    @Test
    void fibCacheBaseCase(){
        HashMap<Long, Long> map = new HashMap<>();
        map.put(2L, 1L);
        map.put(1L, 0L);
        assertEquals( 0, Main.fibCache(1, map));
    }
    @Test
    void fibCacheBaseCase2(){
        HashMap<Long, Long> map = new HashMap<>();
        map.put(2L, 1L);
        map.put(1L, 0L);
        assertEquals( 1, Main.fibCache(2, map));
    }
    @Test
    void fibCacheTestCase(){
        HashMap<Long, Long> map = new HashMap<>();
        map.put(2L, 1L);
        map.put(1L, 0L);
        assertEquals( 2, Main.fibCache(4, map));
    }
    @Test
    void fibCacheTestCase2(){
        HashMap<Long, Long> map = new HashMap<>();
        map.put(2L, 1L);
        map.put(1L, 0L);
        assertEquals( 21, Main.fibCache(9, map));
    }

    @Test
    void fibRegularBaseCase(){
        assertEquals( 0, Main.fibRegular(1));
    }
    @Test
    void fibRegularBaseCase2(){
        assertEquals( 1, Main.fibRegular(2));
    }
    @Test
    void fibRegularTestCase(){
        assertEquals( 2, Main.fibRegular(4));
    }
    @Test
    void fibRegularTestCase2(){
        assertEquals( 21, Main.fibRegular(9));
    }

    @Test
    void fibMatrixBaseCase(){
        assertEquals( 0, Main.fibMatrix(1));
    }
    @Test
    void fibMatrixBaseCase2(){
        assertEquals( 1, Main.fibMatrix(2));
    }
    @Test
    void fibMatrixTestCase(){
        assertEquals( 2, Main.fibMatrix(4));
    }
    @Test
    void fibMatrixTestCase2(){
        assertEquals( 21, Main.fibMatrix(9));
    }

}
