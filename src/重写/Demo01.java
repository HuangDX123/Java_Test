package 重写;

public class Demo01 {
    public static void main(String[] args) {
        Eating a = new Eating();
        Dog b = new Dog();
        a.eat();
        b.eat();
        b.bark();
    }

}

class Eating {

    public void eat() {
        System.out.println("人会吃东西");
    }

}

class Dog extends Eating {

    @Override
    public void eat() {
        System.out.println("狗也会吃东西");
    }

    public void bark() {
        System.out.println("狗可以叫");
    }
}