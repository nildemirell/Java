import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //Harmonik seri kuralı : 1 + (1/2) + (1/3) + (1/4) + (1/n)

        Scanner input = new Scanner(System.in);
        int sayi;

        System.out.print("Sayıyı giriniz : ");
        sayi = input.nextInt();
        double sayac = 0 ;
        for (double i = 1; i <= sayi; i++) {

            sayac = sayac + (1/i);

        }

        System.out.println(sayac);
    }
}
