package sigma.patterns;
import java.util.*;

public class pattern16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int i;
        int j;
        for(i = 1; i <= N; ++i) {
            for(j = 0; j < N - i; ++j) {
                System.out.print("    ");
            }

            for(j = i; j >= 1; --j) {
                System.out.print("" + j + " ");
            }

            for(j = 0; j < i - 1; ++j) {
                System.out.print("    ");
            }

            for(j = 1; j <= i; ++j) {
                if (j != N) {
                    System.out.print("" + j + " ");
                }
            }

            System.out.println();
        }

        for(i = N - 1; i >= 1; --i) {
            for(j = 0; j < N - i; ++j) {
                System.out.print("    ");
            }

            for(j = i; j >= 1; --j) {
                System.out.print("" + j + " ");
            }

            for(j = 0; j < i - 1; ++j) {
                System.out.print("    ");
            }

            for(j = 1; j <= i; ++j) {
                if (j != N) {
                    System.out.print("" + j + " ");
                }
            }

            System.out.println();
        }
    }
}

// hollow diamond number