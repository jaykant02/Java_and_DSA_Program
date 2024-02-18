package sigma.functions;

public class Function_Overloadiing_Datatypes {
    public static int sum(int a, int b){
        return a+b;
    }

    public static float sum(float a, float b){
        return a+b;
    }

    public static void main(String[] args) {
        System.out.println(sum(3,23));
        System.out.println(sum (5.66f, 6.48f));
    }
}
