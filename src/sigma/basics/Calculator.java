package sigma.basics;
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter a : ");
        int a = read.nextInt();
        System.out.println("Enter b : ");
        int b = read.nextInt();
        System.out.println("Enter ch : ");
        char ch = read.next().charAt(0);

        switch(ch){
            case '+' : System.out.println(a + b);
                        break;
            case '-' : System.out.println(a - b);
                        break;
            case '*' : System.out.println(a * b);
                        break;
            case '/' : System.out.println(a / b);
                        break;
            case '%' : System.out.println(a % b);
                        break;
            default:
                System.out.println("Wrong Operator");

        }
    }
}
