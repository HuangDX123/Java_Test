package Reflection;


//反射
public class Demo01 extends Object{
    public static void main(String[] args) throws ClassNotFoundException {
        Class c1 = Class.forName("Reflection.User");

//        System.out.println(c1);
        System.out.println(c1.getName());


//        Object o = new Object();
//        o.getClass();
//        System.out.println(o);

    }

}

//实体类 pojo entity
class User {
    private String name = "小米";
    private int id;
    private int age;

    private User() {

    }

    public User(String name, int id, int age) {
        this.name = name;
        this.age = age;
        this.id = id;

    }

    public String GetName() {
        return name;
    }

    public void SetName(String name) {
        this.name = name;
    }

    public int GetId() {
        return id;
    }
    
    public void SetId(int id){
        this.id = id;
    }
    
    public int GetAge(){
        return age;
    }
    
    public void  SetAge(int age){
        this.age = age;
    }
}
