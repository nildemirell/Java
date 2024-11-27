import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        
        double a,b,c ;

        Scanner inp = new Scanner(System.in);

        System.out.print("Birinci dik kenar uzunluğunu girin : ");
        a = inp.nextDouble();

        System.out.print("İkinci dik kenar uzunluğunu girin : ");
        b = inp.nextDouble();

        //karekök almak için sınıf tanımlanır : Math.sqrt
        c = Math.sqrt((a*a)+(b*b));

        System.out.println("Hipotenüs uzunluğu : " +c);


        System.out.println("******************");

      // ücgende alan bulma

        // Formül
        //Üç𝑔𝑒𝑛𝑖𝑛 ç𝑒𝑣𝑟𝑒𝑠𝑖 = 2𝑢
        //
        //𝑢 = (a+b+c) / 2
        //
        //Alan * Alan = 𝑢 * (𝑢 − 𝑎)* (𝑢 − 𝑏) * (𝑢 − 𝑐)

        double d,e,f,cevre,alan ;

        System.out.print("Birinci kenar uzunluğunu girin: ");
        d = inp.nextDouble();

        System.out.print("İkinci kenar uzunluğunu girin: ");
        e= inp.nextDouble();

        System.out.print("Üçüncü kenar uzunluğunu girin: ");
        f = inp.nextDouble();

        cevre = d+e+f ;
        double formul = cevre/2 ;
        alan = Math.sqrt(formul*(formul-d)*(formul - e)*(formul-f));
        System.out.println("Cevre = " + cevre);
        System.out.println("Alan = " +alan);



        }
    }
