package 数组;

import java.util.Arrays;
import java.util.Collections;

public class Demo {
    public static void main(String[] args) {
        int[] arr = {10, 5, 47, 54, 2};
        Integer[] arr1 = {10, 897, 899, 88, 44};

//        test(arr1);
//        System.out.println(Arrays.toString(arr1));

        Arrays.sort(arr);
        Arrays.sort(arr1, Collections.reverseOrder());

        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+ " ");

        }
        System.out.println();
        for (int a : arr1){
            System.out.print(a+ " ");

        }
    }

//    private static void test(int[] arr) {
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int t = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = t;
//            }
//
//        }
//        for (int i = 0; i < arr.length - 1 - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int t = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = t;
//            }
//
//        }
//        for (int i = 0; i < arr.length - 1 - 1 - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int t = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = t;
//            }
//
//        }
//        for (int i = 0; i < arr.length - 1 - 1 - 1 - 1; i++) {
//            if (arr[i] > arr[i + 1]) {
//                int t = arr[i];
//                arr[i] = arr[i + 1];
//                arr[i + 1] = t;
//            }
//
//        }
//    }

}
