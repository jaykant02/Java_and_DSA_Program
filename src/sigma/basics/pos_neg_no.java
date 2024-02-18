package sigma.basics;
import java.util.*;
public class pos_neg_no {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        if(num>=0){
            System.out.println("Positive");
        }
        else{
            System.out.println("Negative");
        }
    }
}
