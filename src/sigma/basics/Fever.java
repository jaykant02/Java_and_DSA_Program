package sigma.basics;
import java.util.*;
public class Fever {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        double temp = read.nextDouble();

        if(temp>=100){
            System.out.println("Fever");
        }
        else{
            System.out.println("You don't have fever");
        }
    }
}
