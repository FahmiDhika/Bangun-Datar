public class PersegiPanjang extends BangunDatar {
    double p, l;
    
    @Override
    double Luas(){
        double luasPP = p * l;
        System.out.println("Luas Bangun Datar Persegi Panjang : " + luasPP);
        return luasPP;
    }
    
    @Override
    double Keliling(){
        double kelilingPP = (2 * p) + (2 * l);
        System.out.println("Keliling Bangun Datar Persegi Panjang : " + kelilingPP);
        return kelilingPP;
    }
}
