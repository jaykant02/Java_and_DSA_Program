package sigma.arrays;

public class Kadanes_SubarraySum {
    public static void ArraySum3(int[] numbers){
        int CS = 0;
        int MS = Integer.MIN_VALUE;

        for(int i=1; i< numbers.length; i++){
            CS = CS + numbers[i];
            if(CS<0){
                CS=0;
            }
            MS =Math.max(MS,CS);
            System.out.println(CS);
        }
        System.out.println("Max Sum " + MS);
    }

    public static void main(String[] args) {
        int[] numbers = {1,-2,3,-4};
        ArraySum3(numbers);
    }
}