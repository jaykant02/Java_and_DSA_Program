package sigma.strings;

import java.util.Scanner;

class Pallindrome{
    public static boolean isPallindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            int n = str.length();
            if (str.charAt(i) != str.charAt(n - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}

class Main{
    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        String str = rd.next();
        System.out.println(Pallindrome.isPallindrome(str));
    }
}
