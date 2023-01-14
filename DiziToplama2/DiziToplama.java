package DiziToplama2;//@ author Arda Can UYSAL

public class DiziToplama {
    public static void main(String[] args) {
        double b=0;
        for (double i = 1; i < 100;) {
            double a = (i)/(i+2);
            i += 2;
            b +=a;
            System.out.println(a);
        }
        System.out.println(b);
    }
}

