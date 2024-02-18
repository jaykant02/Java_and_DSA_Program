package sigma.patterns;

import java.util.Scanner;

public class Character_pattern {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        char ch = 'A';
        int n = read.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
