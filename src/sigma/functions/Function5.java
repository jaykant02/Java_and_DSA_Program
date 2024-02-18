package sigma.functions;
// Factorial Using Functions
import java.util.Scanner;

public class Function5 {
    public static int Factorial(int num){
        int fact = 1;

        for(int i=1; i<=num; i++){
            fact = fact * i;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int num = rd.nextInt();
        System.out.println(Factorial(num));
    }
}
