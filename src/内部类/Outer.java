package 内部类;

public class Outer {
    private int id = 10;

    public void out() {
        System.out.println("这是外部类的方法");
    }

    public class Inner {
        public void in() {
            System.out.println("这是内部类方法");
        }
        public void getID(){
            System.out.println(id);
        }
    }
}
