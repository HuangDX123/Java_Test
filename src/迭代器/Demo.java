package 迭代器;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>();
        strings.add("hello");
        strings.add("world");
        strings.add("你好，世界");

        Iterator<String> it = strings.iterator();

        while (it.hasNext()){
            System.out.println(it.next());
        }
    }


}
