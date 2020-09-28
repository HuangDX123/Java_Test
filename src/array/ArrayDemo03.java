package array;

public class ArrayDemo03 {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6};

        for (int array :arrays){
            System.out.print(array);
        }



    }




//    打印数组元素
    public static void printArray(int[] arrays){
        for (int i = 0;i <arrays.length; i++ ) {
            System.out.println(arrays[i] + "");
        }
    }

}
