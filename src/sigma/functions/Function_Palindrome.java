package sigma.functions;

import java.util.Scanner;

public class Function_Palindrome {
    public static int reverseNumber(int n) {
        int reverse_n = 0;
        while(n > 0){
            int lastdigit = n %10;
            reverse_n = (reverse_n*10) + lastdigit;
            n = n /10;
        }
        return reverse_n;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        int Reverse_N = reverseNumber(n);
        System.out.print(Reverse_N);
        if(n == Reverse_N){
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }
    }
}