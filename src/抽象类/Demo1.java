package 抽象类;

public class Demo1 extends Demo {


    @Override
    public void doSomething() {
        System.out.println("hello");
    }

    @Override
    public void hello() {
        super.hello();
    }

    public static void main(String[] args) {
        Demo d = new Demo() {
            @Override
            public void doSomething() {
                System.out.println("hello");
            }
        };
        d.hello();



    }
}
