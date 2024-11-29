import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Taksimetre Programı
        //Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
        //
        //Taksimetre KM başına 2.20 TL tutmaktadır.
        //Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        //Taksimetre açılış ücreti 10 TL'dir.


        Scanner input = new Scanner(System.in);

        System.out.print("Gidilen km'yi girin: ");
       double km = input.nextDouble();
    
       double tutar = (km <= 20 ) ? 20 : km*2.20 + 10  ;

        System.out.println(" Ödenecek tutar : " + tutar);









        }
    }
