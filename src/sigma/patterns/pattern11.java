package sigma.patterns;

import java.util.Scanner;

public class pattern11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i, j;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++ ) {
                int sum = i+j;
                if((sum)%2==0){
                    System.out.print("1 ");}
                    else{
                        System.out.print("0 ");
                    }
                }
            System.out.println();
            }
        }
    }

// right side 1010 number pattern