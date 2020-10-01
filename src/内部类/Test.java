package 内部类;

public class Test {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.out();

//        通过这个外部类来实例化内部类
        Outer.Inner inner = outer.new Inner();
        inner.in();
        inner.getID();




    }
}
