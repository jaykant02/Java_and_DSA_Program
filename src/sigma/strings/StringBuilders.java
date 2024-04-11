
package sigma.strings;

public class StringBuilders {
    public static void main(String args[]) {
        StringBuilder sb = new StringBuilder("hello");
        for (char ch = 'A'; ch <= 'Z'; ch++) {
            sb.append(ch);
        }
        System.out.println(sb);
    }
}
