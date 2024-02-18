package sigma.patterns;
import java.util.Scanner;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();

        for(int line=0; line<=n; line++){
            for(int Star=1; Star<=line; Star++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
