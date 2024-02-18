package sigma.oop;

public class Getters_Setters {
    public static void main(String[] args) {
        Pen2 p1 = new Pen2();
        p1.setColor("Red");
        System.out.println(p1.getColor());

        p1.setTip(6);
        System.out.println(p1.getTip());
    }
}
class Pen2{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }

    void setColor(String newColor){
        this.color = newColor;
    }

    void setTip(int newTip){
        this.tip = newTip;
    }
}
