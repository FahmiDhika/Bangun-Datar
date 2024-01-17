public class Persegi extends BangunDatar {
    
    double s;
    
    @Override
    double Luas(){
        double luasP = s * s;
        System.out.println("Luas Dari Bangun Datar Persegi : " + luasP);
        return luasP;
    }
    
    @Override
    double Keliling(){
        double kelilingP = 4 * s;
        System.out.println("Keliling Dari Bangun Datar Persegi : " + kelilingP);
        return kelilingP;
    }
}
