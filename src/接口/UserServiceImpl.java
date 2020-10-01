package 接口;

public class UserServiceImpl implements UserService,TimeService{
    @Override
    public void add(String name) {
        System.out.println("增加员工");

    }

    @Override
    public void delete(String name) {
        System.out.println("删除员工");

    }

    @Override
    public void update(String name) {
        System.out.println("更改员工");
    }

    @Override
    public void query(String name) {
        System.out.println("查询员工");
    }

    @Override
    public int age(int age) {
        System.out.println("年龄是："+ age);
        return 0;
    }

    @Override
    public void timer() {
        System.out.println("计时器");
    }

    public static void main(String[] args) {
        UserServiceImpl u = new UserServiceImpl();
        u.add("张三");
        u.delete("王五");
        u.update("李四");
        u.query("张飞");
        u.age(100);
        u.timer();


    }
}
