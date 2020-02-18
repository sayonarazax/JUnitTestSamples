import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.*;

public class HashMapTest {
    public static HashMap<String, String> map;

    @Before
    public void setMap() {
        map = new HashMap<>();
    }

    @Test
    public void shouldPutandGet() {
        map.put("a", "b");
        assertEquals("b", map.get("a"));
    }

    @Test
    public void shouldReplace() {
        map.put("a", "b");
        map.put("a", "c");
        assertNotEquals("b", map.get("a"));
    }

    @Test
    public void shouldClear() {
        map.put("a", "b");
        map.clear();
        assertTrue(map.isEmpty());
    }

    @Test
    public void isKeyNull() {
        map.put(null, "b");
        assertTrue(map.containsKey(null));
    }
}
