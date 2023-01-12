package AsalSayi;

import java.util.Scanner;

public class AsalSayi {//Asal sayı bulma programı

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);//veri girisi
        System.out.println("pozitif bir tam sayı giriniz");
        long sayi = scan.nextLong();//veri tanımlanması
        int sayac = 0;

        for (int i = 2;i<sayi;i++){
            if (sayi % i ==0){
                sayac++;
                break;//sayacın 0 ı geçmesi durumunda döngüyü kırar
            }
        }
        if(sayac == 0){
            System.out.println(sayi + "Asal bir sayidir.");
        }else{
            System.out.println(sayi+" ---> "+"Asal bir Sayi değildir.");
        }
    }
}
