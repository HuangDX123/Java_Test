package 集合;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Demo {

    @Test
    public void test1() {
        List list = new ArrayList();
        list.add(123);
        list.add(43);
        list.add(765);
        list.add(765);
        list.add(765);
        list.add(-97);
        list.add(0);

        System.out.println(list);
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        list.add(1);
        list.add(4);
        list.add(7);
        list.add(-1);
        list.add(0);

        List dest = Arrays.asList(new Object[list.size()]);

        //输出数组元素的个数
        System.out.println(dest.size());//list.size();
        Collections.copy(dest,list);

        System.out.println(dest);

        //返回的list1即为线程安全的List
        List list1 = Collections.synchronizedList(list);


    }
}
