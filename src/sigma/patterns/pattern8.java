package sigma.patterns;

import java.util.Scanner;

public class pattern8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int cout=1;

        for(int i = 1; i<=n ; i++){
            for(int j = 1; j<=i ;j++){
                System.out.print(cout + " ");
                cout++;
            }
            System.out.println();
        }
    }
}

// inverted half number pyramid right side