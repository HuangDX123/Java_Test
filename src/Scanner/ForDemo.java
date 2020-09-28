package Scanner;

public class ForDemo {

    public static void main(String[] args) {
        int oddsum = 0;
        int evenSun = 0;
        for (int i = 0; i < 100; i++) {
            if (i % 2 != 0) {
                oddsum += 1;
            } else {
                evenSun += 1;
            }


        }
        System.out.println("奇数和" + oddsum);
        System.out.println("偶数和" + evenSun);

    }
}
