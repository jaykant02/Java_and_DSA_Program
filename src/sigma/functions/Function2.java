package sigma.functions;

import java.util.Scanner;

public class Function2 {
    public static int CalculateSum(int num1, int num2){
        int sum = num1 + num2;
        System.out.println("Sum is :"+ sum );
        return sum;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num1 = rd.nextInt();
        int num2 = rd.nextInt();
        CalculateSum(num1, num2);
    }
}
