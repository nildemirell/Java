import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.
//Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.
//Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.
//Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

        System.out.print("Hava Sıcaklığını Giriniz : ");
        Scanner input = new Scanner(System.in);
        int sicaklik = input.nextInt();


        if(sicaklik<5){
            System.out.println("Kayak yapabilirsiniz.");
        } else if ( sicaklik >= 5 && sicaklik < 15 ) {
            System.out.println("Sinemaya gidebilirsiniz.");
            
        }else if ( sicaklik >= 15 && sicaklik <= 25 ) {
            System.out.println("Pikniğe gidebilirsiniz.");

        }
        else {
            System.out.println("Yüzmeye gidebilirsiniz.");
        }


    }
}