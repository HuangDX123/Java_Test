package 重载;

public class Demo2 {
    public static void main(String[] args) {
        int max = max(20, 20);
        System.out.println(max);
    }

    public static int max(int num1, int num2) {


        if (num1 == num2) {
            System.out.println("num1==num2");
            return 0;

        }
        if (num1 > num2) {
            return num1;

        } else {
            return num2;
        }

    }
}
