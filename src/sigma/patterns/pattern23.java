package sigma.patterns;

public class pattern23 {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        char c = 65;
        for(int i = 1; i<=n ; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(c);
                c++;
            }
            System.out.println();
        }
    }
}

// left side Alphbet pyramid