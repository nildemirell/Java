import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        double para ;
        Scanner input = new Scanner(System.in);
         double kdvOran = 0.18;

        System.out.print("Tutarı girin: ");
         para = input.nextDouble();

        //kdv tutari
        double kdvTutar = para*0.18;
        System.out.println("Kdv oranı : " +kdvTutar);

        //kdv'li tutar
        double kdvliTutar = (para + kdvTutar) ;
        System.out.println("Kdvli tutar : " +kdvliTutar);


        System.out.println("**************************************");

        // Eger girilen tutar 0 ve 1000 TL arasında ise
        // KDV oranı %18 ,
        // tutar 1000 TL'den büyük ise
        // KDV oranını %8 olarak KDV tutarı hesaplayan programı yaz


        System.out.print("Tutarı girin : ");
        double tutar = input.nextDouble();

        double kdvOrani = (tutar<1000) ?0.18 : 0.8 ;
        double kdvTutari = tutar*kdvOrani;

        System.out.println("ürünün normal tutarı:"+tutar);
        System.out.println("ürünün kdv oranı : " + kdvOrani);
        System.out.println("ürünün kdvli fiyatı : " + kdvTutari);



        }
    }








