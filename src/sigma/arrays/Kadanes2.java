package sigma.arrays;

public class Kadanes2 {
    public static void ArraySum3(int[] numbers) {
        int CS = 0;
        int MS = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            CS = CS + numbers[i];
            if (CS < 0) {
                CS = CS;
            }
            MS = Math.max(MS, CS);
            System.out.println(CS);
        }
        System.out.println("Max Sum " + MS);
    }

    public static void main(String[] args) {
        int[] numbers = {-1, -2, -3, -4, -5, -6, -7, -8, -9, -10};
        ArraySum3(numbers);
    }
}
