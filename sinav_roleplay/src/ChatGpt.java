public class ChatGpt extends ChatBot{
  double ucret;

    public double addButce(double soru , double sure , String user){
         this.ucret = 140.55 + soru*2.15 + sure * 0.45;
        if(user == "ogrenci"){
            ucret -= ucret*0.15;
        }
        System.out.println("Ucretiniz : " +this.ucret);
        return ucret;
    }

     public void setUcret(double ucret){
         System.out.println("Ucretiniz : " +this.ucret);

     }

}
