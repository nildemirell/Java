import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //scanner sınıfını tanımladık
      Scanner input = new Scanner(System.in);

       int fizik,kimya,matematik,turkce ;

        System.out.print("Matematik notunu girin:");
        matematik = input.nextInt();

        System.out.print("Fizik notunu girin:");
        fizik = input.nextInt();

        System.out.print("Kimya notunu girin:");
        kimya = input.nextInt();

        System.out.print("Türkçe notunu girin:");
        turkce = input.nextInt();

       double ort = (fizik + kimya + matematik+turkce) / 4.0  ;
        System.out.println("Ortalamanız = " + ort);

        System.out.println(ort<=60 ? "Sınıfta kaldın." : "Sınıfı geçtin.");







        }
    }
