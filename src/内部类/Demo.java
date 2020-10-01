package 内部类;

public class Demo {

//    局部内部类
    public void method() {
        class Inner {
            public void id() {
                System.out.println(1);
            }
        }
    }
}
