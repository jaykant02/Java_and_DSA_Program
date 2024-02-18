package sigma.arrays.sorting;
import java.util.Arrays;
import java.util.Collections;

public class ReverseUsingInbuiltSort {
    public static void reverseInbuiltSort(Integer arr[]){
        Arrays.sort(arr,Collections.reverseOrder());
    }
    public static void printArr(Integer arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        Integer arr[] = {3,6,2,1,8,7,4,5,3,1};
        reverseInbuiltSort(arr);
        printArr(arr);
    }
}
