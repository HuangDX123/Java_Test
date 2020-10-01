package 内部类;

public class Demo2 {
    public static void main(String[] args) {
        new Apple().eat();

        new UserService() {

            @Override
            public void hello() {
                System.out.println("a");
            }
        };

    }
}


class Apple {
    public void eat() {
        System.out.println("1");
    }
}

interface UserService {
    void hello();
}