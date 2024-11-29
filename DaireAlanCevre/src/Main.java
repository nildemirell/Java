import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Dairenin Alanını ve Çevresini Hesaplayan Program
        //Java ile yarı çapını kullanıcıdan aldığınız dairenin alanını ve çevresini hesaplayan programı yazın.
        //
        //Alan Formülü : π * r * r;
        //
        //Çevre Formülü : 2 * π * r;


        Scanner input = new Scanner(System.in);
        double pi = 3.14;
        double cevre,alan;
        System.out.print("Dairenin yarıçapını giriniz : ");
        int yaricap = input.nextInt();

        cevre = 2*pi*yaricap;
        alan = pi*yaricap*yaricap;
        System.out.println("Dairenin çevresi : "+ cevre);
        System.out.println("Dairenin alanı : " + alan);


        }
    }
