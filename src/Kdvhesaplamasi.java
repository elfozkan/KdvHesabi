import java.util.Scanner;

public class Kdvhesaplamasi {
    public static void main(String[] args) {
        double a,b,c, kdv18=0.18, kdv8=0.8;
        // Girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18 , tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan program.
        Scanner sayi = new Scanner(System.in);
        System.out.print("Lütfen kdv hesabi için bir sayi giriniz: ");
        a = sayi.nextDouble();
        c = a>0&&a<1000? a*kdv18 : a*kdv8;
        b = a+c;

        System.out.println("KDV'siz Fiyat: "+a);
        System.out.println("KDV'li Fiyat: "+b);
        System.out.println("KDV tutari: "+c);

    }
}
