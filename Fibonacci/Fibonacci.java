package Fibonacci; //@ author Arda Can UYSAL
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Fibonacci dizisine hoş geldiniz");
        System.out.println("Kaçıncı elemana kadar yazdırılsın?");
        double sayi = scan.nextDouble();
        int d1 = 1, d2 = 1, d3;

        System.out.println(d1 + " " + d1 + " ");
        for (int i = 2; i < sayi; i++) {
            d3 = d1 + d2;
            d1 = d2;
            d2 = d3;
            System.out.println(d3 + " ");

        }

    }

}

