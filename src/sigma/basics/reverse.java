package sigma.basics;
import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        while(n>0){
            int lastdigit= n%10; // ye last digit ko as remainder return karwa deta hai
            System.out.print(lastdigit);
            n=n/10; //ye last digit ko remove kar deta hai
        }
    }
}
