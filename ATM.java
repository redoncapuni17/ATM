package OOP.ATM;

import java.util.Scanner;

public class ATM {
    public void çalış(Hesap hesap){

        LogIn login = new LogIn();

        Scanner scanner = new Scanner(System.in);
        System.out.println("       --WELCOME--");
        System.out.println("--------------------------");
        System.out.println("User LogIn\n");

        int giriş_hakkı = 3;

        while(true){
            if(login.login(hesap)){
                System.out.println("Login Successful...");
                break;
            }
            else{
                System.out.println("Login Failed...");
                giriş_hakkı -= 1;
                System.out.println("Kalan Giriş Hakkı : "+giriş_hakkı);
            }
            if(giriş_hakkı == 0){
                System.out.println("Giriş Hakkınız Bitti...");
                return;
            }
        }
        System.out.println("----------------------------");
        String işlemler = """
                1.View Balance
                2.Deposit
                3.Withdraw money
                Press 0 to Exit
                """;
        System.out.println(işlemler);

        while (true){
            System.out.print("Select Transaction : ");
            String işlem = scanner.nextLine();

            if(işlem.equals("0")){
                break;
            }
            else if(işlem.equals("1")){
                System.out.println("Your balance : "+hesap.getBakiye());
            }
            else if(işlem.equals("2")){
                System.out.print("The amount you want to deposit : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraYatır(tutar);
            }
            else if(işlem.equals("3")){
                System.out.print("The amount you want to withdraw : ");
                int tutar = scanner.nextInt();
                scanner.nextLine();
                hesap.paraÇekme(tutar);
            }
            else{
                System.out.println("Invalid Transaction...");
            }
        }


    }
}
