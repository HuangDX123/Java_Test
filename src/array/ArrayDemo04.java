package array;

public class ArrayDemo04 {
    public static void main(String[] args) {
        int[][] array = {{1, 2}, {2, 2}, {3, 2}};

        for (int i = 0; i < array.length; i++) {
            System.out.println();
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]);
            }
        }
    }

}
