import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        int mat,fizik,kimya;
        double Ortalama;
        Scanner input = new Scanner(System.in);

        System.out.println("Mat Notu Giriniz: ");
        mat = input.nextInt();

        if(mat>100 || mat<0){
            System.out.println("0-100 Değer Aralığında Bir Not Giriniz: ");
        }
        else {

        }

        System.out.println("Fizik Notu Giriniz: ");
        fizik = input.nextInt();

        if(fizik>100 || fizik<0){
            System.out.println("0-100 Değer Aralığında Bir Not Giriniz: ");
        }
        else {

        }

        System.out.println("Kimya Notu Giriniz: ");
        kimya = input.nextInt();

        if(kimya>100 || kimya<0){
            System.out.println("0-100 Değer Aralığında Bir Not Giriniz: ");
        }
        else {

        }

        Ortalama = (mat+fizik+kimya)/3;

        if (Ortalama>55){
            System.out.println("Tebrikler Sınıfı Geçtiniz: ");
            System.out.println("Ortalamanız: "+Ortalama);
        }
        else {
            System.out.println("Kaldınız: ");
            System.out.println("Ortlamanız: "+Ortalama);
        }


    }
}

