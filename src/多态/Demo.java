package 多态;

public class Demo {
    public static void main(String[] args) {
        Students s = new Students();
        s.eat();
        s.work();
        Teacher t = new Teacher();
        t.eat();
        t.work();


    }
}

abstract class Person {
    abstract void eat();

}

class Students extends Person {
    public Students() {
        System.out.println("---我是学生---");
    }

    @Override
    void eat() {
        System.out.println("学生吃营养早餐");
    }

    public void work() {
        System.out.println("学生学习");
    }
}

class Teacher extends Person {
    public Teacher() {
        System.out.println("---我是老师---");
    }

    @Override
    void eat() {
        System.out.println("老师吃工作餐");
    }

    public void work() {
        System.out.println("老师教学生知识");
    }
}
