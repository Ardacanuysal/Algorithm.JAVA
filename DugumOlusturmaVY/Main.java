package DugumOlusturmaVY;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {


        Sinif A = new Sinif();   //bellekte düğüm oluşturduk

        Sinif B = new Sinif();

        Sinif C = new Sinif();

        A.sayi = 11;    //düğümlere değerlere atıyoruz
        B.sayi = 22;
        C.sayi = 33;

        A.next = B;
        B.next = C;
        C.next = null;

        Sinif temp = A ;

        while (temp !=  null) { //travers: Düğümlerin üzerinde dolaştık

            System.out.println(temp.sayi);
            temp = temp.next;
        }
    }
}
