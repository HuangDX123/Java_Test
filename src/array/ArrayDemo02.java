package array;

public class ArrayDemo02 {

    public static void main(String[] args) {
        int[] arrays = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arrays.length; i++) {
            System.out.print(" ");
            System.out.print(arrays[i]);

        }
        System.out.println();
        int sum = 0;
        for (int i = 0; i < arrays.length; i++) {
            sum += arrays[i];
        }

        System.out.println("sum=" + sum);
        int max = arrays[0];

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] > max) {
                max = arrays[i];
            }

        }

        System.out.println("max=" + max);

    }
}
