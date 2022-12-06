package NotOrtalamaHesaplama;
import java.util.Scanner;

public class NotOrtalamaHesaplama {
    public static void main(String[] args) {
       int MatN,FizikN,KimyaN,TurkceN,TarihN,MuzikN;
       Scanner inp=new Scanner(System.in);

       System.out.print("Matematik Notu Girin:");
       MatN= inp.nextInt();

       System.out.print("Türkçe Notu Giriniz:");
       TurkceN=inp.nextInt();

       System.out.print("Kimya Notu Giriniz:");
       KimyaN=inp.nextInt();

       System.out.print("Fizik Notu Girin:");
       FizikN= inp.nextInt();

       System.out.print("Tarih Notu Girin:");
       TarihN= inp.nextInt();

       System.out.print("Müzik Notu Girin:");
       MuzikN= inp.nextInt();

       double NotOrtalama;

       NotOrtalama=(MatN+TurkceN+FizikN+MuzikN+KimyaN+TarihN)/6;
       System.out.println("Not Ortalaması:"+NotOrtalama);

       boolean Sonuc= NotOrtalama>=60;
       String str = Sonuc ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
       System.out.println(str);
    }
}