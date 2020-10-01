package 重载;

public class Demo3 {
    public static void main(String[] args) {
        //方法重载
        int max = max(125, 125.0);
        System.out.println(max);
    }

    public static int max(int num1, int num2) {
        int result = 0;

        if (num1 == num2) {
            System.out.println("num1==num2");
            return 0;

        }
        if (num1 > num2) {
            result = num1;

        } else {
            result = num2;
        }
        return result;
    }

    public static int max(double num1, double num2) {
        double result = 0;

        if (num1 == num2) {
            System.out.println("num1==num2");
            return 0;

        }
        if (num1 > num2) {
            result = num1;

        } else {
            result = num2;
        }
        return (int) result;

    }

    public static int max(int num1, double num2) {
        double result1 = 0;

        if (num1 == num2) {
            System.out.println("num1==num2");
            return 0;

        }
        if (num1 > num2) {
            result1 = num1;

        } else {
            result1 = num2;
        }
        return (int) result1;

    }
}
