package sigma.arrays;

public class Kadanes_SubarraySum {
    public static void ArraySum3(int numbers[]){
        int CS = 0;
        int MS = Integer.MIN_VALUE;

        for(int i=0; i< numbers.length; i++){
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
        int numbers[] = {-2,-3,4,-1,-2,1,5,-3};
        ArraySum3(numbers);
    }
}