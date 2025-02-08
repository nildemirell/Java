public class Digiturk extends Platform {


    public double addfiyat(double sure, double abonman) {

        if (sure >= abonman * 0.11 && sure <= abonman * 0.20) {

            double ucret = 150;
        } else if (sure >= abonman * 0.21 && sure <= abonman * 0.50) {

            ucret = 350 + 350 * 0.13;
        }
        return ucret;
    }

    public void gostertutar() {

        System.out.println("Ucret : " + ucret);

    }
}

