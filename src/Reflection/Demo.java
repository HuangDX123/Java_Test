package Reflection;

public class Demo {
    public static void main(String[] args) throws ClassNotFoundException {
        Person person = new Student();
        System.out.println("这个人是：" + person.name);

//        方式一 通过对象获取
        Class<? extends Person> c1 = person.getClass();
        System.out.println(c1.hashCode());
//         方式二 forName获取
        Class<?> c2 = Class.forName("Reflection.Student");
        System.out.println(c2.hashCode());

    }
}


class Person {
    public String name;

    public Person() {
    }

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}

class Student extends Person {
    public Student() {
        this.name = "学生";

    }
}

class Teacher extends Person {
    public Teacher() {
        this.name = "老师";
    }
}