public class Lingkaran extends BangunDatar{
    double r, d;
    
    @Override
    double Luas(){
        double luasL = Math.PI * r * r;
        System.out.println("Luas Bangun Datar Lingkaran : " + luasL);
        return luasL;
    }
    
    @Override
    double Keliling(){
        double kelilingL = Math.PI * d;
        System.out.println("Keliling Bangun Datar Lingkaran : " + kelilingL);
        return kelilingL;
    }
}
