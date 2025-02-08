public enum kayak {

    //önce değerleri tanımla

    kar(0.21),
    taslik(0.34),
    toprak(0.47) ;

    private final double fs ;

    kayak (double fs){
        this.fs = fs;
    }

    public double hesapla(double m , double alpha){

        double inmekuvveti = ( m * 9.18 * Math.sin(Math.toRadians(alpha))) - this.fs ;

        System.out.println("Sürtünme = " + inmekuvveti);
        return inmekuvveti;
    }





}
