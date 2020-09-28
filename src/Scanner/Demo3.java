package Scanner;

import java.util.Scanner;

public class Demo3 {
    public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("请输入：");

            //键盘接收数据
            int i= 0;
            float f = 0.0f;


            if (scanner.hasNextInt()){
                i = scanner.nextInt();
                System.out.println("整数"+ i);
            }else {
                System.out.println("不是整数类型");
            }

            if (scanner.hasNextFloat()){
                f = scanner.nextFloat();
                System.out.println("浮点类型类型"+f);
            }else {
                System.out.println("不是浮点类型类型");
            }
            scanner.close();




    }
}
