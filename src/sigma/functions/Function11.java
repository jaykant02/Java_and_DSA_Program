package sigma.functions;

import java.util.Scanner;

public class Function11 {
    public static int SumofInt(int n){
        int sum = 0;
        while(n > 0){
            int lastdigit = n % 10;
            sum = sum + lastdigit;
            n = n / 10;
        }
        System.out.println("sum of Integer is " + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        SumofInt(n);
    }
}
