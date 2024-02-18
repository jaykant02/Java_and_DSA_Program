package sigma.patterns;

public class pattern20 {
    public static void main(String[] args) {
        int n = 5;
        int row_no = 1;
        int cstar = n;
        int cspace = 0;

        while(row_no <= 2 * n - 1) {
            for(int space = 1; space <= cspace; ++space) {
                System.out.print("  ");
            }

            for(int star = 1; star <= cstar; ++star) {
                System.out.print("* ");
            }

            if (row_no < n) {
                cspace += 2;
                --cstar;
            } else {
                cspace -= 2;
                ++cstar;
            }

            ++row_no;
            System.out.println();
        }
    }
}

// arrow right sided