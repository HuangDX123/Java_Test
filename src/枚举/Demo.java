package 枚举;

enum Color {
    RED, GREEN, BLUE;

}

public class Demo {
    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);

        System.out.println("=================================");

        for (Color colors : Color.values()) {
            System.out.println(colors);
        }

        System.out.println("=================================");

//        switch 中使用枚举类

        Color myVar = Color.BLUE;

        switch (myVar) {
            case RED:
                System.out.println("这是红色");
                break;
            case BLUE:
                System.out.println("这是蓝色");
                break;
            case GREEN:
                System.out.println("这是绿色");
                break;
        }


    }
}
