package sigma.functions;

public class Decimal_to_Binary {
    public static void DecimalToBinary(int num){
        int myNum = num;
        int pow = 0;
        int binNum = 0;
         while(num > 0){
             int rem = num % 2;
             binNum = binNum + (rem * (int)Math.pow(10, pow));
             pow++;

             num=num/2;
         }
        System.out.println("Decimal to Binary is " + myNum + " = " + binNum);
    }

    public static void main(String[] args) {
        DecimalToBinary(5);
    }
}
