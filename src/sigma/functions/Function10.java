package sigma.functions;
// Check Even Number
import java.util.Scanner;

public class Function10 {
    public static boolean isEven(int n){
        if(n%2 == 0){
            return true;
        }
        else return false;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        int n = rd.nextInt();
        System.out.println(isEven(n));
    }
}
