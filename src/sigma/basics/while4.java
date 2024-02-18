package sigma.basics;
import java.util.*;
public class while4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int number;
        int choice;
        int evensum = 0;
        int oddsum = 0;

        do{
            System.out.print("Enter the Number :");
             number = read.nextInt();

            if(number%2==0){
                evensum += number;
            }
            else{
                oddsum += number;
            }
            System.out.print("want to continue choice yes  1 if no then 0 ");
             choice =read.nextInt();

        }while(choice==1);
        System.out.println("evensum : "+ evensum);
        System.out.println("oddsum : "+ oddsum);
    }
}
