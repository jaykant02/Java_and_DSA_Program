package sigma.basics;
import java.util.*;
public class Table {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();

        for(int i = 1 ; i<= 10 ; i++){
            System.out.println(num + "*" + i +"=" + num*i);
        }
    }
}
