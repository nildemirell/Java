import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        //  System.out.print("Lütfen bir sayı giriniz: ");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asal = true;
            for (int i = 2; i <= sayi/2; i++) {

                if (sayi % i == 0) {
                    asal = false;
                    break;
                }
            }
            if (asal) {
                System.out.println(sayi +" ");
            }

        }


    }
}
