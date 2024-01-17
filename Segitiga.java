public class Segitiga extends BangunDatar{
    double a, t, c;
    
    @Override
    double Luas(){
        double luasS = a * t * 1/2;
        System.out.println("Luas Bangun Datar Segitiga : " + luasS);
        return luasS;
    }
    
    @Override
    double Keliling(){
        double kelilingS = a + t + c;
        System.out.println("Kelilign Bangun Datar : " + kelilingS);
        return kelilingS;
    }
}
