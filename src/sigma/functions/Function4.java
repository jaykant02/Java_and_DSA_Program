package sigma.functions;

import java.util.Scanner;

public class Function4 {
    public static int Product(int a, int b){
    int prod = a * b;
    return prod;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int a = rd.nextInt();
        int b = rd.nextInt();
        int prod = Product(a, b);
        System.out.println("Product is :"+ prod);
    }
}
