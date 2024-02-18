package sigma.patterns;

import java.util.Scanner;

public class hollow_rectangle {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n= read.nextInt();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n+n; j++){
                if(i==1 || i==n || j==1 || j==n+n){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
