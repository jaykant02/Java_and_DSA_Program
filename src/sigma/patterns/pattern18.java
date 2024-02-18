package sigma.patterns;
import java.util.Scanner;

public class pattern18{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i;
        int j;
        for(i = 1; i <= N; ++i) {
            for(j = 1; j <= N - i; ++j) {
                System.out.print("\t");
            }

            for(j = i; j <= 2 * i - 1; ++j) {
                System.out.print("" + j + "\t");
            }

            for(j = 2 * i - 2; j >= i; --j) {
                System.out.print("" + j + "\t");
            }

            System.out.println();
        }

        for(i = N - 1; i >= 1; --i) {
            for(j = 1; j <= N - i; ++j) {
                System.out.print("\t");
            }

            for(j = i; j <= 2 * i - 1; ++j) {
                System.out.print("" + j + "\t");
            }

            for(j = 2 * i - 2; j >= i; --j) {
                System.out.print("" + j + "\t");
            }

            System.out.println();
        }

        sc.close();
    }
}
// number diamond