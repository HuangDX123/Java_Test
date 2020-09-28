package 类型转换;

public class Demo {
    public static void main(String[] args) {
    int a = 128;
    double b = a;

    //强制转换    （ 类型 ）变量名      高到底
    //自动转换     底到高

        System.out.println(a);
        System.out.println(b);
        /*
        注意点
        不能对布尔类型转换
        不能把对象类型转换为不相干的类型
        在吧高容量转换到低容量的时候要强制转换
        转换的时候可能存才内存溢出或者精度问题

         */

        System.out.println("===========================");
        System.out.println((int)23.7); //23
        System.out.println((int)-45.89f); //-45



    } }

