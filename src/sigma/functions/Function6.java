package sigma.functions;

import java.util.Scanner;

public class Function6 {
    public static int Factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int Binomialcoefficient(int n, int r){
        int fact_n = Factorial(n);
        int fact_r = Factorial(r);
        int fact_nmr = Factorial((n-r));
        int Binocoeff = fact_n/(fact_r*fact_nmr);
        return Binocoeff;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        int r = rd.nextInt();
        System.out.println(Binomialcoefficient(n,r));
    }

}