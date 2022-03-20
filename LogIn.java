package OOP.ATM;

import java.util.Scanner;

public class LogIn {
    public boolean login(Hesap hesap){
        Scanner scanner = new Scanner(System.in);
        String kullanıcı_adı;
        String parola;

        System.out.print("Enter the name : ");
        kullanıcı_adı = scanner.nextLine();
        System.out.print("Password : ");
        parola = scanner.nextLine();

        if(hesap.getKullanıcı_adı().equals(kullanıcı_adı) && hesap.getParola().equals(parola)){
            return true;
        }
        else{
            return false;
        }

    }
}
