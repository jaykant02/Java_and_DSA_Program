package sigma.functions;

import java.util.Scanner;

public class Function9 {
    public static float Averageof(float a, float b, float c){
        float Average = (a + b +c)/3;
        System.out.println(Average);
        return Average;
    }

    public static void main(String[] args) {
        Scanner rd = new Scanner(System.in);
        float a = rd.nextFloat();
        float b = rd.nextFloat();
        float c = rd.nextFloat();
        Averageof(a,b,c);
    }
}
