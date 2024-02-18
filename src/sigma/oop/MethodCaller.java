package sigma.oop;

class MethodCaller {
    public static void sleep() {
        System.out.println("Jaykant");
    }

    public void eat() {
        System.out.println("yadav");
        eat();// this is called method call itself.
        // ye hum direct call karenge but infinte loop me chal jayega or stack overflow ho jayega
    }
}

class Main {
    public static void main(String[] args) {
        //ye static wale ko aise call karte hai
        MethodCaller.sleep();
        // ye Non Static me aise call kiya jata hai object or constructor ban kar
        MethodCaller methodCaller = new MethodCaller();
        methodCaller.eat();
    }
}