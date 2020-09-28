package Oop.Demo01;


public class Demo02 {
    public static void main(String[] args) {
        //调用静态方法

        Student.say();


        //调用非静态方法

        Student student = new Student();

        student.eat();
    }
}
