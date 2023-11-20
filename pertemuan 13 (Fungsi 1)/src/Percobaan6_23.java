package src;
import java.util.Scanner;
public class Percobaan6_23 {

    public static int hitungLuas (int panjang, int lebar) {
        int Luas=panjang*lebar;
        return Luas;

    }

    public static int hitungVolume (int panjang, int lebar, int tinggi){
        int Volume=panjang*lebar*tinggi;
        return Volume;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,Vol;

        System.out.print("Masukkan Panjang: ");
        p = input.nextInt();
        System.out.print("Masukkan Lebar: ");
        l = input.nextInt();
        System.out.print("Masukkan Tinggi: ");
        t = input.nextInt();

        L = hitungLuas(p,l);
        System.out.println("Luas Persegi Panjang adalah: " +L);
        Vol = hitungVolume(p,l,t);
        System.out.println("Volume Balok adalah: " +Vol);

    }
}
