package sigma.basics;

import java.util.*;
public class TotalCost {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        float n1 = read.nextFloat();
        float n2 = read.nextFloat();
        float n3 = read.nextFloat();

        float gst = (n1+n2+n3)*18/100;
        float total_Price = (n1+n2+n3)+ gst;

        System.out.println(total_Price);

    }
}
