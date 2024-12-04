import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // faktöriyel hesaplama

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();
        int fakt = 1 ;

        for (int i = 1; i <= sayi; i++) {
             fakt = i * fakt ;
        }
        System.out.println("Girdiğiniz sayının faktöriyeli : "+fakt);
    }
}
