package Faktoryell;//@ author Arda Can UYSAL
import java.util.Scanner;
public class FaktoryelHesab {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("1 den büyük tam sayı giriniz : ");
        int sayi = scan.nextInt();
        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }
        System.out.println("Faktoryel işlemi sonucunuz " + sonuc );
        }

    public static class DataStructures {

        Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {
            System.out.println("Soniçç: " +  Faktoryel(6));
        }
            public static int Faktoryel (int sayi){ //input sayisi

                if (sayi == 0 || sayi == 1 ){
                    return 1 ;
                }
                else {
                    return sayi * Faktoryel(sayi- 1);
                }
            }
        }
}




