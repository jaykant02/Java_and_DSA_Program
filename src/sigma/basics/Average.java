package sigma.basics;
import java.util.*;
public class Average {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float A = read.nextFloat();
        float B = read.nextFloat();
        float C = read.nextFloat();

        float average = (A+B+C)/3;

        System.out.println(average);
    }
}
