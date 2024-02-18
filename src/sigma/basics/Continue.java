package sigma.basics;
import java.util.*;
public class Continue {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        do{
            int n = read.nextInt();
            if(n%10==0){
                continue;
            }
            System.out.println(n);
        }while(true);
    }
}
