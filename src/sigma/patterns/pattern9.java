package sigma.patterns;

public class pattern9 {
    public static void main(String[] args) {
        int n = 5;
        char c = 65;
        for(int i = 1; i<=n; i++){
            for(int j =1; j<=n-i+1; j++,c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
}

//right inverted half alphabet pyramid