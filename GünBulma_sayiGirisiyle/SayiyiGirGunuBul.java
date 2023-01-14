package GünBulma_sayiGirisiyle;//@ author Arda Can UYSAL
import java.util.Scanner;
public class SayiyiGirGunuBul {
    public static void main(String[] args) {
        Scanner Scann = new Scanner(System.in);
        String hafta[] = {"pts", "salı", "car", "per", "cuma", "cmts", "pzr"};
        System.out.println("bir sayi gir");
        int sayi =Scann.nextInt();
        System.out.println("gün : " + hafta[sayi-1]);
    }
}
