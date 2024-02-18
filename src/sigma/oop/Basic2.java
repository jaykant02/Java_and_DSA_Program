package sigma.oop;

public class Basic2 {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.username = "jaykant";
        myAcc.setPassword("ImDead");

    }
}
class BankAccount{
    public String username;
    private String password;

    public void setPassword(String pwd){
        password = pwd;
    }
}