package 异常;

public class Demo2 {
    public static void main(String[] args) {

        int a = 1;

        int b = 0;

        try {

            if (b == 0) {
                throw new ArithmeticException();
            }

            
            System.out.println(a / b);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally");
        }

    }


}
