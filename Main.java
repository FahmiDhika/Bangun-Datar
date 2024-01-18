import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Silahkan Memasukkan Bangun Datar (Kapital Perkata) : ");
        String bd = input.nextLine();
        
        switch (bd) {
            case "Persegi":
                Persegi per = new Persegi();
                
                System.out.println("Rumus Persegi --> Luas : s * s");
                System.out.println("\t \t   Keliling : 4 * l");
                System.out.print("s : ");
                double persegi = input.nextDouble();
                
                per.s = persegi;
                per.Luas();
                per.Keliling();
                break;
                
            case "Persegi Panjang":
                PersegiPanjang perpan = new PersegiPanjang();
                
                System.out.println("Rumus Persegi Panjang --> Luas : p * l");
                System.out.println("\t \t \t   Keliling : (2 * p) + (2 * l)");
                System.out.print("p : ");
                double p = input.nextDouble();
                System.out.print("l : ");
                double l = input.nextDouble();
                
                perpan.p = p;
                perpan.l = l;
                perpan.Luas();
                perpan.Keliling();
                break;
                
            case "Lingkaran" :
                Lingkaran ling = new Lingkaran();
                
                System.out.println("Rumus Lingkaran --> Luas : PI * r * r");
                System.out.println("\t \t     Keliling : PI * d");
                System.out.print("r : ");
                double r = input.nextDouble();
                System.out.print("d : ");
                double d = input.nextDouble();
                
                ling.r = r;
                ling.d = r;
                ling.Luas();
                ling.Keliling();
                break;
                
            case "Segitiga":
                Segitiga tiga = new Segitiga();
                
                System.out.println("Rumus Segitiga --> Luas : a * t * 1/2");
                System.out.println("\t \t \t Keliling : a + t + c");
                System.out.print("a : ");
                double a = input.nextDouble();
                System.out.print("t : ");
                double t = input.nextDouble();
                System.out.print("c : ");
                double c = input.nextDouble();
                
                tiga.a = a;
                tiga.t = t;
                tiga.c = c;
                tiga.Luas();
                tiga.Keliling();
                break;
            
            default:
                System.out.println("Rumus Belum Ditambahan / Tidak Ada Rumus");
        }
    }
}
