package src;
import java.util.Scanner;
public class ArrayRataNilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // inisialisasi array dasar bertipe integer dan double
        int Mhs;
        int jml_lulus=0, jml_tdklulus=0;
        double total=0;
        double rata2=0;
        double rata2lulus=0, rata2tdklulus=0;

        System.out.println("Masukkan jumlah Mahasiswa: ");
        Mhs = sc.nextInt();

        // menentukan kapasitas berdasarkan input 
        int [] nilaiMhs = new int[Mhs];
        for (int i=0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-" +(i+1) + " : ");
            nilaiMhs [i]= sc.nextInt();
        }
        for (int i=0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i]>70) {
            rata2lulus += nilaiMhs[i];
            jml_lulus++;
        } else {
            rata2tdklulus += nilaiMhs[i];
            jml_tdklulus++;
         }
    }
        
        System.out.println("Rata-rata Nilai Lulus      : " +rata2lulus/jml_lulus);
        System.out.println("Rata-rata Nilai Tidak Lulus: " +rata2tdklulus/jml_tdklulus);
        
    }
}
