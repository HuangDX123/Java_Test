package Oop.Demo01;

public class Demo03 {

    public static void main(String[] args) {

        try {
            int add = Demo03.add(10,20);
            System.out.println(add);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
        }
    }


    public static int add(int a ,int b){
        return a+b;
    }
}
