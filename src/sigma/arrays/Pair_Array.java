package sigma.arrays;

public class Pair_Array {
    public static void Pair(int num[]){
        int Tp = 0; //Total no of Pairs
        for(int i=0; i< num.length; i++){
            int Current = num[i];
            for (int j = i+1; j < num.length; j++) {
                System.out.print("("+Current+","+num[j]+")");
                Tp++;
            }
            System.out.println();
        }
        System.out.println("Total Pairs is : "+ Tp);
    }

    public static void main(String[] args) {
        int num[] = {2,4,6,8,10};
        Pair(num);
    }
}
