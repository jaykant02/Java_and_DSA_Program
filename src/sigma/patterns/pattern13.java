package sigma.patterns;

public class pattern13 {
    public static void main(String[] args) {
        int n = 7;
        int row_no = 1;
        int mspace = 1;
        int cstar = n / 2;

        while(row_no <= n) {
            for(int left = 1; left <= cstar; ++left) {
                System.out.print("* ");
            }

            for(int space = 1; space <= mspace; ++space) {
                System.out.print("  ");
            }

            for(int right = 1; right <= cstar; ++right) {
                System.out.print("* ");
            }

            if (row_no < n / 2 + 1) {
                mspace += 2;
                --cstar;
            } else {
                mspace -= 2;
                ++cstar;
            }

            ++row_no;
            System.out.println();
        }

    }
}

//pyramid square