package OOP.ATM;

public class Hesap {
    private String kullanıcı_adı;
    private String parola;
    private int bakiye;

    public Hesap(String kullanıcı_adı,String parola,int bakiye){
        this.kullanıcı_adı = kullanıcı_adı;
        this.parola = parola;
        this.bakiye = bakiye;
    }

    public void setKullanıcı_adı(String kullanıcı_adı) {
        this.kullanıcı_adı = kullanıcı_adı;
    }
    public String getKullanıcı_adı(){
        return kullanıcı_adı;
    }
    public void setParola(String parola){
        this.parola = parola;
    }
    public String getParola(){
        return parola;
    }
    public void setBakiye(int bakiye){
        this.bakiye=bakiye;
    }
    public int getBakiye(){
        return bakiye;
    }
    public void paraYatır(int tutar){
        bakiye +=tutar;
        System.out.println("Your New Balance : "+bakiye);
    }
    public void paraÇekme(int tutar){
        if((bakiye - tutar) < 0){
            System.out.println("You Don't Have Enough Balance...");
        }
        else{
            bakiye -= tutar;
            System.out.println("Your New Balance : "+bakiye);
        }
    }
}
