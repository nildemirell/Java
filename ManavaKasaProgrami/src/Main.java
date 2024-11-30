import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Manav Kasa Programı
        //Java ile kullanıcıların manavdan almış oldukları ürünlerin kilogram değerlerine göre
        // toplam tutarını ekrana yazdıran programı yazın.
        //
        //Meyveler ve KG Fiyatları
        //
        //Armut : 2,14 TL
        //Elma : 3,67 TL
        //Domates : 1,11 TL
        //Muz: 0,95 TL
        //Patlıcan : 5,00 TL
        //Örnek Çıktı;
        //
        //Armut Kaç Kilo ? :0
        //Elma Kaç Kilo ? :1
        //Domates Kaç Kilo ? :1
        //Muz Kaç Kilo ? :2
        //Patlıcan Kaç Kilo ? :3
        //Toplam Tutar : 21.68 TL


        Scanner input = new Scanner(System.in);
        System.out.println("****** MEYVE SEBZE FİYATLARI *****");
        System.out.println("Armut kg fiyatı : 2,14 TL");
        System.out.println("Elma kg fiyatı : 3,67 TL");
        System.out.println("Domates kg fiyatı : 1,11 TL");
        System.out.println("Muz kg fiyatı : 0,95 TL");
        System.out.println("Patlıcan kg fiyatı : 5,00 TL");

        System.out.println("*****TUTAR*******");

        System.out.print("Armut kilosu girin : ");
        double armut = input.nextDouble();
        System.out.print("Elma kilosu girin : ");
        double elma = input.nextDouble();
        System.out.print("Domates kilosu girin : ");
        double domates = input.nextDouble();
        System.out.print("Muz kilosu girin : ");
        double muz = input.nextDouble();
        System.out.print("Patlıcan kilosu girin : ");
        double patlican = input.nextDouble();

        double armutFiyat = armut*2.14;
        double elmaFiyat = elma*3.67;
        double domatesFiyat = domates*1.11;
        double muzFiyat = muz*0.95;
        double patlicanFiyat = patlican*5.00;

       double tutar = armutFiyat+elmaFiyat+domatesFiyat+muzFiyat+patlicanFiyat ;
        System.out.println("Toplam Tutar : " + tutar);














        }
    }
