package 重写;

public class Demo02 {
    public static void main(String[] args) {
        Eating a = new Eating();
        Dog b = new Dog();
        a.eat();
        b.eat();
        b.bark();
    }

}

class Eating1 {

    public void eat1() {
        System.out.println("人会吃东西");
    }

}

class Dog1 extends Eating1 {

    @Override
    public void eat1() {
        System.out.println("狗也会吃东西");
    }

    public void bark1() {
        System.out.println("狗可以叫");
    }
}