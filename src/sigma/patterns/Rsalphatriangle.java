package sigma.patterns;
import java.util.*;

public class Rsalphatriangle {
    public static void main(String[] args) {Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        int i, j;
        char c = 65;
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= i; j++,c++) {
                System.out.print(c);
            }
            System.out.println();
        }

    }
}

//right side alphabet pyramid