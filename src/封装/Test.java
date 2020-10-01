package 封装;

public class Test {
    public static void main(String[] args) {
        Person person = new Person();
        person.sex = "男";

        person.setAge(11);
        person.setName("小明");
        System.out.println("姓名：" + person.getName());
        System.out.println("年龄：" + person.getAge());
        System.out.println("性别：" + person.sex);
    }
}
