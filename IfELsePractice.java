import java.util.Scanner;

public class SinifiGectinKaldin {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik;

        Scanner input = new Scanner(System.in);
        System.out.print("Matematik Notunuzu Giriniz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuzu Giriniz : ");
        fizik = input.nextInt();

        System.out.print("Türkçe Notunuzu Giriniz : ");
        turkce = input.nextInt();

        System.out.print("Kimya Notunuzu Giriniz : ");
        kimya = input.nextInt();

        System.out.print("Müzik Notunuzu Giriniz : ");
        muzik = input.nextInt();

        double average = (mat + fizik + muzik + kimya + turkce) / 5;

        if (average <= 55) {
            System.out.println("Sınıfta Kaldın!");
            System.out.println("Ortalama : " + average);

        }
        else {
            System.out.println("Tebrikler! Sınıfı Geçtiniz!");
            System.out.println("Ortalamanız : " + average);

        }
    }
}
