import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {

        int[] arr = {9,5,6,3,2,1,4};
        bubbleSort(arr);
        System.out.println("bubble sort 1: " +Arrays.toString(arr));


        int[] arr2 = {9,5,6,3,2,1,4,10};
        bubbleSort2(arr2);
        System.out.println("bubble sort 2: " + Arrays.toString(arr2));
    }

    static void bubbleSort(int[] array){

        for (int i = 0; i < array.length -1; i++) {
            for (int j = 0; j < array.length - i -1; j++) {
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

    }

    public static void bubbleSort2(int[] arr) {
        boolean sorted = false;
        int temp;
        while(!sorted) {
            sorted = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    sorted = false;
                }
            }
        }
    }


}
