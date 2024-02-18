package sigma.patterns;
import java.util.*;

public class Rightsidetriangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i, j;
        for (i = 1; i < n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("* ");
            }
                 System.out.println();
            }

        }

    }
// right side pyramid