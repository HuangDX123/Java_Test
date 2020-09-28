package Scanner;

import java.util.Scanner;

public class Deno2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("使用NextLine输入一个字符");


        String str = scanner.nextLine();

        System.out.println("您输入的字符是"+ str);


        scanner.close();
    }
}
