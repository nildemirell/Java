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
        double cevre,alan1;
        System.out.print("Dairenin yarıçapını giriniz : ");
        int yaricap = input.nextInt();

        cevre = 2*pi*yaricap;
        alan1 = pi*yaricap*yaricap;
        System.out.println("Dairenin çevresi : "+ cevre);
        System.out.println("Dairenin alanı : " + alan1);

        //Ödev
        //Yarıçapı r, merkez açısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
        //
        //𝜋 sayısını = 3.14 alınız.
        //
        //Formül : (𝜋 * (r*r) * 𝛼) / 360


         int r , alfa;
         double alan2;
        System.out.print("Yarıcap değeri girin : ");
        r = input.nextInt();
        System.out.print("Merkez açı derecesini girin : ");
        alfa = input.nextInt();

        alan2 = ( pi *( r * r )* alfa) / 360 ;

        System.out.println("Daire diliminin alanı : "+ alan2);






        }
    }
