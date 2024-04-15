import java.util.Scanner;
public class Main {
    static int isPrime(int sayi, int sinir) {
//sinir  sayının kaca bölüneceğini ifade eder.
        if (sayi < 2) { //sayi 2 den kücükse sayı asal değildir.
            return 0;
        }
        if (sinir == 1) { //sinir her fonk kendini çağırdığında 1 azalacktır,1 e kadar geldiğinde bölecek hiçbir şey bulamadığı için sayı asaldır.
            return 1;
        }
        if (sayi % sinir == 0) { //sayi sinira bölünüyorsa sayı asal değildir.
            return 0;
        }
        return isPrime(sayi, sinir - 1);
    }

    public static void main(String[] args) {
        //sayıyı en büyük ölen sayının yarısı olacağı için "sinir/2"
        Scanner inp = new Scanner(System.in);
        int a,b;
        System.out.println("Sayiyi giriniz : ");
        a = inp.nextInt();
        System.out.println("Sinir değerini giriniz : ");
        b = inp.nextInt();
        int result=isPrime(a,b);
        if (result == 0)
            System.out.println(a+ " sayisi ASAL DEĞİLDİR!!!");
        if (result == 1)
            System.out.println(a+ " sayisi ASALDIR!!!");


    }
}