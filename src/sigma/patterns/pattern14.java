package sigma.patterns;

public class pattern14 {
    public static void main(String[] args) {
        int n = 7;
        int row_no = 1;
        int cspace = n / 2;
        int cstar = 1;

        while(row_no <= n) {
            for(int space = 1; space <= cspace; ++space) {
                System.out.print("  ");
            }

            for(int star = 1; star <= cstar; ++star) {
                System.out.print("* ");
            }

            if (row_no < n / 2 + 1) {
                cstar += 2;
                --cspace;
            } else {
                cstar -= 2;
                ++cspace;
            }

            ++row_no;
            System.out.println();
        }

    }
}

// diamond pattern