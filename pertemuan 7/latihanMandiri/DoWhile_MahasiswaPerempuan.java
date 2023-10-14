package latihanMandiri;
import java.util.Scanner;
public class DoWhile_MahasiswaPerempuan {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int jumlah=0, i = 1;
    String nama, jenisKelamin;

    // do { statements; update; } while (kondisi);
    do {
        System.out.println("Masukkan Nama Mahasiswa: ");
        nama = sc.next();
        System.out.println("Jenis Kelamin (L/P): ");
        jenisKelamin = sc.next();
        jumlah++;   
           
    } while (jumlah<4);
        System.out.println("Mahaiswa sudah di Input Semua");
    if (jenisKelamin.equalsIgnoreCase("P")) {
            System.out.println(nama);
    }
    System.out.println("\nJumlah Mahasiswa Perempuan ada " +jumlah);
}
}

