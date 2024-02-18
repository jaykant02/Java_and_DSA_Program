package sigma.arrays;

import java.util.Scanner;

public class Bruteforce_SubarraySum {
    public static void Arraysum(int[] numbers) {
        int currentsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currentsum = 0;
                for (int k = start; k <= end; k++) {
                    currentsum = numbers[i];
                }
                System.out.println(currentsum);
                if (maxsum < currentsum) {
                    maxsum = currentsum;
                }
            }
            System.out.println("maxsum = " + maxsum);
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int[] numbers = {2, 4, 6, 8, 10};
        Arraysum(numbers);
    }
}
