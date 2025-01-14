import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float mat, fizik, turkce, kimya, muzik, toplam = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz : ");
        mat = input.nextFloat();
        if (0 <= mat && mat <= 100) toplam += mat;
        System.out.print("Fizik notunuzu giriniz : ");
        fizik = input.nextFloat();
        if (0 <= fizik && fizik <= 100) toplam += fizik;
        System.out.print("turkce notunuzu giriniz : ");
        turkce = input.nextFloat();
        if (0 <= turkce && turkce <= 100) toplam += turkce;
        System.out.print("Kimya notunuzu giriniz : ");
        kimya = input.nextFloat();
        if (0 <= kimya && kimya <= 100) toplam += kimya;
        System.out.print("Muzik notunuzu giriniz : ");
        muzik = input.nextFloat();
        if (0 <= muzik && muzik <= 100) toplam += muzik;
        double ort = toplam / 5;
        if (ort < 55) {

            System.out.println("Kaldınız");
        } else {
            System.out.println("Geçtiniz");
        }
    }
}

