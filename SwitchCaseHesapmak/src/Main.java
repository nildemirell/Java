import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //switch case ile hesap makinesi
        double a,b,sonuc;
        Scanner input = new Scanner(System.in);

        System.out.print("İlk sayıyı girin : ");
        a = input.nextInt();
        System.out.print("İkinci sayıyı girin : ");
        b = input.nextInt();
        System.out.print("İşlemi Girin : ");
        char islem = input.next().charAt(0);

        switch (islem) {
            case '+':
                sonuc = a + b;
                System.out.println("Toplam: " + sonuc);
                break;

            case '-':
                sonuc = a - b;
                System.out.println("Fark: " + sonuc);
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Bölen 0dan farklı olmalıdır !");
                } else {
                    sonuc = a / b;
                    System.out.println("Bölüm :  " + sonuc);
                }
                break;
            case '*':
                sonuc = a * b;
                System.out.println("Çarpım :  " + sonuc);
                break;
        }
    }
}
