// Sum on first N natural number
package sigma.basics;
import java.util.*;
public class while2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int range = read.nextInt();
        int sum = 0;
        int i = 1;

        while(i<=range){
            sum += i;
            i++;
        }
        System.out.println("sum : " + sum);

    }
}
