import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        //Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun,
        // eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip,
        // şifreler aynı ise ekrana "Şifre oluşturulamadı,
        // lütfen başka şifre giriniz." sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.


        Scanner input = new Scanner(System.in);

        String kullaniciadi, sifre, yenisifre;
        int secenek;

        System.out.print("Kullanıcı Adını Giriniz : ");
        kullaniciadi = input.nextLine();

        System.out.print("Şifre Girin : ");
        sifre = input.nextLine();


        if (kullaniciadi.equals("nildemirel") && sifre.equals("nil123")) {

            System.out.println("Giriş yapıldı.");

        } else {

            System.out.println("Hatalı şifre ! Şifreyi sıfırlamak ister misiniz ? ");

            System.out.println("1-Evet");
            System.out.println("2-Hayır");
            secenek = input.nextInt();
            input.nextLine();
            if (secenek == 1) {

                System.out.print("Yeni Şifreyi Girin : ");
                yenisifre = input.nextLine();

                if (yenisifre.equals(sifre)) {
                    System.out.println("Şifre oluşturulamadı ! Başka Şifre giriniz.");
                }
                else{
                    System.out.println("Şifre Oluşturuldu .");
                    sifre = yenisifre;

                }
            }

           else {
                System.out.println("Şifre sıfırlama işlemi iptal edildi.");
            }

        }
    }
}
