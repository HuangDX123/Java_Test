package 反射;

import java.lang.reflect.Field;

public class Demo {
    public static void main(String[] args) throws NoSuchFieldException,IllegalAccessException {
//        Class c1  = Class.forName("www.huang.反射.User");
//        Field field = c1.getDeclaredField("name");

        Object u = new User("小明",00,5);

        Class c = u.getClass();

        Field f = c.getDeclaredField("name");

        System.out.println(f);


    }


}

class User {
    private String name;
    private int id;
    private int age;

    public User() {

    }

    public User(String name, int id, int age) {
        this.name = name;
        this.id = id;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int id){
        this.id = id;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }
}

