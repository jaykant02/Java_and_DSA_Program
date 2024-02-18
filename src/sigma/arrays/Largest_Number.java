package sigma.arrays;

public class Largest_Number {
    public static int LargestNumber(int Numbers[]){
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i <Numbers.length ; i++) {
            if(largest < Numbers[i]){
                largest = Numbers[i];
            }
        }
        return largest;
    }
    public static void main(String[] args) {
        int Numbers[] = {1, 2, 6, 3, 5};
        System.out.print(LargestNumber(Numbers));
    }
}