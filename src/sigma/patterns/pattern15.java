package sigma.patterns;
import java.util.*;

public class pattern15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i <= n; ++i) {
            int j;
            for(j = 1; j <= n - i; ++j) {
                System.out.print(" ");
            }

            for(j = 1; j <= n; ++j) {
                if (i != 1 && i != n && j != 1 && j != n) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }

            System.out.println();
        }

    }
}

// right tilted hollow rohmbus