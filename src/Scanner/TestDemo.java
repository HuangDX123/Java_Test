package Scanner;

public class TestDemo {
    //用while 循环或for循环输出1-100能被五整除的数并且每行输出三个
    public static void main(String[] args) {
        int newline = 0;


        for (int i = 1; i <= 1000; i++) {

            if (i % 5 == 0) {
                System.out.print(i +"\t");
                newline++;
            }
            if (i % (5 * 3) == 0) {
                System.out.println();
            }
        }
        System.out.println("一共输出了：" + newline + "次");

    }

}
