package sigma.functions;

import java.util.Scanner;

public class Function3 {
    public static void swap(int a, int b){
        int temp = a;
        a=b;
        b=temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+ b);
        return;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a = rd.nextInt();
        int b = rd.nextInt();
        swap(a,b);
    }
}
