package sigma.arrays.sorting;
import java.util.Arrays;

public class InbuiltSort {
    public static void inbuiltSort(int arr[]){
        Arrays.sort(arr);
    }
    public static void printArr(int arr[]){
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[] = {3,6,2,1,8,7,4,5,3,1};
        inbuiltSort(arr);
        printArr(arr);
    }
}
