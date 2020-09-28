package Scanner;

public class Demo05 {
    public static void main(String[] args) {
        for (int j = 1; j <= 9; j++) {

            for (int i = 1; i <= j; i++) {
                System.out.print(i + "X" + j + "=" + (j * i + "\t"));

            }
            System.out.println();
        }

    }
}
