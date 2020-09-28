package 数据类型;

public class Demo1 {
 public static void main(String[] args) {
        //整数拓展   进制       二进制0b       十进制      八进制0         十六进制0x

        int i = 10;
        int i2 = 010;
        int i3 = 0x10; //十六进制0x 0-9 A-F 16

     System.out.println(i);
     System.out.println(i2);
     System.out.println(i3);


//     强转
     char a = '好';
     System.out.println((int)a);

     int b = 20013;
     System.out.println((char)b);


//    转义字符
    // \t 制表符
    // \n 换行
    // ......

     System.out.println("hello\nworld");

     //布尔
     boolean flag = true;
     if (false==true){
     }//新手

     if (false){
     }//老手

}
}
