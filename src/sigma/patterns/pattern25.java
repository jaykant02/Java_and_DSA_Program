package sigma.patterns;

public class pattern25 {
    public static void main(String[] args) {
        int n = 5;
        int row_no = 1;
        int cstar = 1;
        int cspace = n - 1;
        char c = 97;

        while(row_no <= n) {
            for(int space = 1; space <= cspace; ++space) {
                System.out.print("  ");
            }

            for(int star = 1; star <= cstar; ++star) {
                System.out.print(c + " ");
                c++;
            }

            ++row_no;
            --cspace;
            cstar += 2;
            System.out.println();
        }
    }
}

// pyramid abcd