package src;
import java.util.Scanner;
public class Kubus23 {

    // menghitung volume
    public static int hitungVolume (int sisi) {
        int Volume = sisi * sisi * sisi;
        return Volume;
    }

    // menghitung luas permukaan
    public static int hitungLuas (int sisi) {
        int luasPermukaan = 6 * sisi * sisi;
        return luasPermukaan;
    }

    // menampilkan hasil perhitungan
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s;
        System.out.print("Masukkan panjang sisi: ");
        s = sc.nextInt();
        int volume = hitungVolume(s);
        System.out.println("Volume Kubus adalah: " +volume);

        System.out.println();

        int luas = hitungLuas(s);
        System.out.println("Luas Permukaannya adalah: " +luas);

    }
}
