package Scanner;

public class ForDemo04 {
    public static void main(String[] args) {
//        打印九九乘法表
        for (int j =1 ; j<= 9; j++) {
            for (int i = 1; i <= j; i++) {
                System.out.print(j + "X" + i + "=" + (j * i)+"\t");

            }
            System.out.println();
        }
    }
}
