package sigma.patterns;
import java.util.Scanner;
public class pattern19{
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int N = sc.nextInt();
            boolean num = false;
            int a = 0;
            int b = 1;

            for(int i = 0; i < N; ++i) {
                for(int j = 0; j <= i; ++j) {
                    System.out.print("" + a + "   ");
                    int sum = a + b;
                    a = b;
                    b = sum;
                }

                System.out.println();
            }

        }
    }

    // fibonacchi pattern