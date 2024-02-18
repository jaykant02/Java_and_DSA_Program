package sigma.basics;
import java.util.*;
public class while1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int number = 1;
        while(number<=n){
            System.out.print(number + " ");
            number++;
        }
    }
}
