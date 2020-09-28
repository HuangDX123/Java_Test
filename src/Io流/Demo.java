package Io流;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Demo {
    public static void main(String[] args) throws IOException {
        char a;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("输入q 退出");

        do {
            a = (char) br.read();
            System.out.println(a);
        }while (a != 'q');
    }
}
