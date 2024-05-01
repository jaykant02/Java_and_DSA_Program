package sigma.basics;
import java.util.*;
public class
Check_prime_no {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        if (n == 2) {
            System.out.println("Prime");
        } else {
            boolean isPrime = true;
            for (int i = 2; i <= n-1; i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if(isPrime==true){
                System.out.println("Prime");
            }
            else{
                System.out.println("Not Prime");
            }
        }
    }
}
