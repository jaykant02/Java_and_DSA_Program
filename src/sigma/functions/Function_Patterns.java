package sigma.functions;

import java.util.Scanner;

public class Function_Patterns {
    public static void HollowRectangle(int row, int col){
        for (int i = 1; i <=row ; i++) {
            for (int j = 1; j <=col ; j++) {
                if(i==1 || i==row || j==1 || j==col){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void InverhalfPyr(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j<=n-i+1; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    public static void FloydTriangle(int num){
        int no = 1;
        for (int i = 1; i <= num ; i++) {
            for (int j = 1; j <=i ; j++) {
                System.out.print(no + " ");
                no++;
            }
            System.out.println();
        }
    }
    public static void ZeroOneTriangle(int n){
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if((i+j) % 2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    public static void rhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void HollowRhombus(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=n; j++){
                if(i==1 || i==n || j==1 || j==n){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void Diamond(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n; i>=1; i--){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
       // int row = rd.nextInt();
        //int col = rd.nextInt();
        int n = rd.nextInt();
        //int num = rd.nextInt();
       // HollowRectangle(row, col);
       // InverhalfPyr(n);
       // FloydTriangle(num);
       // ZeroOneTriangle(n);
       // rhombus(n);
        // HollowRhombus(n);
        Diamond(n);
    }
}
