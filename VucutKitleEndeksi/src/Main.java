import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Vücut Kitle İndeksi Hesaplama
        //Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
        // Aşağıdaki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.

        //Formül
        //Kilo (kg) / Boy(m) * Boy(m)

        //Çıktısı
        //Lütfen boyunuzu (metre cinsinde) giriniz : 1,72
        //Lütfen kilonuzu giriniz : 105
        //Vücut Kitle İndeksiniz : 35.49215792320173


        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen boyunuzu (metre cinsinden) giriniz : ");
        float boy = input.nextFloat();

        System.out.print("Lütfen kilonuzu giriniz : ");
        float kilo = input.nextFloat();

        float indeks = kilo/(boy*boy);

        System.out.print("Vücut kitle indeksiniz : "+indeks);









        }
    }
