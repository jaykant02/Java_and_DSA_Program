package sigma.functions;

import java.util.Scanner;

public class Function_Overloading_parameter {
    public static int sum(int a, int b){
        return a+b;
    }

    public static int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a = rd.nextInt();
        int b = rd.nextInt();
        int c = rd.nextInt();
        System.out.println(sum(a,b));
        System.out.println(sum(a,b,c));
    }
}
