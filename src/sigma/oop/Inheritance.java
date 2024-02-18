package sigma.oop;

public class Inheritance {
    public static void main(String[] args) {
        Fish Dolfins = new Fish();
        Dolfins.eat();
        Dolfins.breathe();

    }
}
//Base Class
class Animal{
    String color;

    
    void eat(){
        System.out.println("Eats");
    }
    void breathe(){
        System.out.println("Breathes");
    }
}

class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in Water");
    }
}
