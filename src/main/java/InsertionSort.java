import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {7,5,3,9,1,2,4};
        insertionSort(arr);

        System.out.println(Arrays.toString(arr));
    }



    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            int j = i - 1;
            while(j >= 0 && current < array[j]) {
                array[j+1] = array[j];
                j--;
            }
      // at this point we've exited, so j is either -1
     // or it's at the first element where current >= a[j]
            array[j+1] = current;
        }
    }
}
