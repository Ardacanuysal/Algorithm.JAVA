package Faktoryell;//@ author Arda Can UYSAL
import java.util.Scanner;
public class FaktoryelHesab {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 den büyük tam sayı giriniz :");
        long sayi = scan.nextLong();
        long sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println("Faktoryel işlemi sonucunuz " + sonuc );
        }

    }




