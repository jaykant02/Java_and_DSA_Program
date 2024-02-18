package sigma.functions;

import java.util.Scanner;
// check prime number by optimised method math.sqrt
public class Function7 {
    public static boolean isPrime(int n){
        if(n==2){
            return true;
        }
        for(int i=2; i<=Math.sqrt(n); i++){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        System.out.println(isPrime(n));
    }
}
