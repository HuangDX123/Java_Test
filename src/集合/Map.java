package 集合;


import org.junit.Test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Map {
    @Test
    public void test() {
        java.util.Map map = new HashMap();
        map.put("AA", 123);
        map.put(45, 1234);
        map.put("BB", 56);

        //遍历所有的key集：keySet()
        Set set = map.keySet();
        Iterator iterator = set.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
