package sigma.basics;
import java.util.*;
public class do_while {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        do{
            System.out.println("Enter your Number");
            int n = read.nextInt();
            if(n%10==0) {
                break;
            }
            System.out.println(n);
        }while(true);
        System.out.println("I'm Out of Loop");
    }
}
