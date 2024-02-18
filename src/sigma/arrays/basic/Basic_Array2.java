package sigma.arrays.basic;
// By using function
public class Basic_Array2 {
    public static void Update(int marks[], int nonchangeable){
        nonchangeable = 10;
        for (int i = 0; i <marks.length ; i++) {
            marks[i]= marks[i] + 1;
        }
    }
    public static void main(String[] args) {
        int marks[] = {95,96,97};
        int nonchangeable = 5;
        Update(marks, nonchangeable);
        System.out.println(nonchangeable); // the value remains Same

        for (int i = 0; i < marks.length ; i++) {
            System.out.println(marks[i]);
        }
        System.out.println();
    }
}
