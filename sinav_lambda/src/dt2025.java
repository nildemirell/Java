public class dt2025 implements deeptechh{

    String projeId;
    String projeAd;
    double projeButce;

    public dt2025(String projeId , String projeAd , double projeButce){
        this.projeId = projeId;
        this.projeAd = projeAd;
        this.projeButce=projeButce;
    }

   public double setbutceEkle(double tutar){
        projeButce += tutar ;
      return projeButce;
    }

   public void operations()
   {
       Runnable projedegerleri = () ->

           System.out.println("Proje ID : " + projeId);
           System.out.println("Proje Adı : " + projeAd);
           System.out.println("Proje Butcesi : " + projeButce);
       projedegerleri.run();
    }
}
