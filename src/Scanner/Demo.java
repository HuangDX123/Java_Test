package Scanner;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用next方法接收");

        if (scanner.hasNext()){

            String str =scanner.next();
            System.out.println("输入的是：" + str);

        }
        scanner.close();
    }
}
