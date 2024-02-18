package sigma.patterns;
import java.util.*;

public class pattern17{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 2 * n - 3;

        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = 1; j <= i; ++j) {
                System.out.print("" + j + "\t");
            }

            for(j = 1; j <= a; ++j) {
                System.out.print(" \t");
            }

            a -= 2;

            for(int k = i; k >= 1; --k) {
                if (k != n) {
                    System.out.print("" + k + "\t");
                }
            }

            System.out.println();
        }
    }
}

// Mountain number pattern