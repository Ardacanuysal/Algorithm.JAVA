package DiziToplama1;

import java.util.Scanner;

public class DiziToplama {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Boyutu giriniz : ");
        int n = scan.nextInt();
        int benimDizi[] = new int[n];
        double toplam = 0;
        for (int i = 0; i < benimDizi.length; i++) {
            n=scan.nextInt();
            benimDizi[i]=n;
        }
        for (int i = 0; i < benimDizi.length; i++) {
            toplam += benimDizi[i];
        }
        System.out.println("sonuc: " + toplam);
    }

}
