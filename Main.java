package OOP.ATM;

public class Main {
    public static void main(String[] args){
        ATM atm = new ATM();

        Hesap hesap = new Hesap("Redon Çapuni","123",5000);
        atm.çalış(hesap);
        System.out.println("Exiting the program...");
    }
}
