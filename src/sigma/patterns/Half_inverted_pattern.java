package sigma.patterns;

import java.util.Scanner;

public class Half_inverted_pattern {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=n-i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
