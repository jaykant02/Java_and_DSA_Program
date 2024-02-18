package sigma.patterns;
import java.util.*;

public class pattern4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i , j;
         for(i=1; i<=n; i++){
            for(j=1;j<=n;j++){
                System.out.print("* ");
            }
             System.out.println();
        }

    }
}

// Square pattern