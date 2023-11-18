package src;
import java.util.Scanner;
public class ArrayNilai23 {
    public static void main(String[] args) {
        // mengisi nilai dari kapasitas array yang sudah ditentuksan
        Scanner sc = new Scanner(System.in);
        // deklarasi array bertipe integer dengan kapasitas 10 elemen
        int [] nilaiAkhir = new int[4];

    // struktur perulangan untuk menerima input array
    for (int i=0; i< nilaiAkhir.length; i++) {
        System.out.println("Masukkan nilai akhir ke-" +i +" : ");
        nilaiAkhir [i] = sc.nextInt();
        }
        System.out.println("\n");
        // struktur perulngan untuk menampilkan isi array
        for (int i=0; i<nilaiAkhir.length; i++) {
        System.out.println("Nilai akhir ke-" +i +"adalah " +nilaiAkhir[i]); 
        // modifikasi untu menentukan kelulusan (nilai>70)
        if (nilaiAkhir[i]>70) {
            System.out.println("Lulus!");
        } else { System.out.println("Tidak Lulus!");}
        
    }
    
}
}