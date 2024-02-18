package sigma.oop;

public class Basic1 {
    public static void main(String[] args) {
        Pen p1 = new Pen(); // created a Pen object called p1
       // p1.setColor("Blue");
        p1.color = "Yellow";
        System.out.println(p1.color);
        p1.setTip(4);
        System.out.println(p1.tip);
    }
}

class Pen{
    String color; // attributes
    int tip;    // attributes

    void setColor(String newColor){     //function
        color = newColor;
    }

    void setTip(int newTip){      //functions
        tip = newTip;
    }
}
