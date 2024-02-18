package sigma.oop;

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Anushka";
        s1.rollNo = 11;
        s1.password = "distance";
        s1.marks[0] = 95;
        s1.marks[1] = 98;
        s1.marks[2] = 96;

        Student s2 = new Student(s1);
        s2.password = "Salute";
        s1.marks[2] = 98;
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }
    }
}

class Student {
    String name;
    int rollNo;
    String password;
    int[] marks;

    /*
    Copy Constructor
    Student(Student s1){
        this.name = s1.name;
        this.rollNo = s1.rollNo;
    }

 */

    /*
    Shallow Constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;
        this.marks = s1.marks;
    }
*/

    //Deep Constructor
    Student(Student s1) {
        marks = new int[3];
        this.name = s1.name;
        this.rollNo = s1.rollNo;

        for(int i=0; i< marks.length;i++){
            this.marks[i]= marks[i];
        }
    }

    // Non Parameterized Constructors
    Student() {

        System.out.println("Non Parameterized Constructors");
    }


    /* Below are Parameterized constructors
    Student(String name) {
        this.name = name;
    }

    Student(int rollNo) {
        this.rollNo = rollNo;
    }

     */
}
