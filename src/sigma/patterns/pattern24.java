package sigma.patterns;

public class pattern24 {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int c =1;
        for(int i = 1; i<=n ; i++){
            for(int j =1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++,c++){
                System.out.print(c);

            }
            System.out.println();
        }
    }
}

// left side number pyramid