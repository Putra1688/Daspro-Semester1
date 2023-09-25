import java.util.Scanner;
public class PemilihanPercobaan123 {
    public static void main(String[] args){
        Scanner input23 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input23.nextInt();

        String total = angka % 2 == 0 ? "Bilangan genap" : "Bilangan ganjil";
        System.out.println( angka + " adalah " +total);
        System.out.println("Selamat anda berhasil");
    }
}