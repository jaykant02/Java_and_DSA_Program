package sigma.arrays.basic;

import java.util.Scanner;

public class Basic_Array1 {
    public static void main(String[] args) {
        int marks[] = new int[50];
        Scanner rd = new Scanner(System.in);

         marks[0] = rd.nextInt(); // Input
         marks[1] = rd.nextInt();

        marks[1]= marks[1] + 1; // Update

        System.out.println("marks at zero index :"+ marks[0]);// Output
        System.out.println("marks at one th index :"+ marks[1]);// Updated
        System.out.println("Length of an Array :" + marks.length); // Length of an Array
    }
}
