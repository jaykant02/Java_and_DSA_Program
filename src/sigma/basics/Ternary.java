package sigma.basics;
import java.util.*;
public class Ternary {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
         String marks = n>=33 ? "Pass" : "Fail";

        System.out.println(marks);
    }
}
