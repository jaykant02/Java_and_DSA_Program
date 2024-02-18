package sigma.arrays;


import java.util.Scanner;

public class Linear_Search {
    public static int LinearSearch(int numbers[], int key){
        for (int i = 0; i < numbers.length ; i++) {
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int numbers[] = {2,4,6,8,10,12,14,16};
        int key = rd.nextInt();
        int index = LinearSearch(numbers, key);
        if(index==-1){
            System.out.println("Not Found");
        }
        else{
            System.out.println("Found");
        }
        System.out.println();
    }
}
