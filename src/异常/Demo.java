package 异常;

public class Demo {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;

        try {
            System.out.println(a / b);

        } catch (Error e) {
            System.out.println("Error");
        } catch (Exception e) {
            System.out.println("Exception");
        } catch (Throwable t) {
            System.out.println("Throwable");

        }


    }


    public static void A() {
        B();

    }

    public static void B() {

        A();
    }
}


