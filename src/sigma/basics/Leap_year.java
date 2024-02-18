package sigma.basics;
import java.util.*;
public class Leap_year {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int year = read.nextInt();

        if (year % 4 == 0) {

            if (year % 100 != 0) {
                System.out.println("Leap Year");
            } else if (year % 400 == 0) {
                System.out.println("Leap Year");
            }
            else{
                System.out.println("Not a Leap Year");
            }
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
