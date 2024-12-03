import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //negatif bir değer girilene kadar kullanıcıdan girişleri kabul eden
        // ve girilen değerlerden tek sayıları toplayıp ekrana basan programı yazıyoruz.


        Scanner input = new Scanner(System.in);
      /*  int sayi1;
        int sayac = 0;

        do {
            System.out.print("Sayı giriniz : ");
            sayi1  = input.nextInt();
            if (sayi1 % 2 != 0 && sayi1>0)  {
                sayac = sayi1+ sayac;
            }
        }
        while (sayi1 >= 0);
        System.out.println("Girilen sayılardan tek olanların toplamı : " + sayac);
*/

        // Ödev
        //Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden ve
        // girilen değerlerden 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.

        int sayi2;
        int sayac2= 0;
        do {
            System.out.print("Bir sayı girin : ");
            sayi2 = input.nextInt();

            if(sayi2%4 == 0){

                sayac2 = sayac2 + sayi2;
            }

        } while(sayi2%2 == 0 );

        System.out.println("4 ve 4ün katı olanların toplamı : " + sayac2);









    }
}