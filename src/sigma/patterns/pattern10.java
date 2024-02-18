package sigma.patterns;

import java.util.Scanner;

public class pattern10 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i, j;
        int c = 1;

        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(c + " ");
                c++;
            }
            System.out.println();
        }
    }
}

// right pyramid number increase every line
//  1
//  23
//  456
//  78910