import java.util.Scanner;
public class Gaji23 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int jml_Masuk, jml_tdkMasuk, total_Gaji;
        int gaji=40000, potGaji=25000;

        System.out.print("Masukan jumlah hari masuk kerja           : ");
        jml_Masuk = input.nextInt();
        System.out.print("Masukkan jumlah hari tidak masuk kerja  : ");
        jml_tdkMasuk = input.nextInt();

        total_Gaji = (jml_Masuk*gaji) + (jml_tdkMasuk*potGaji);
        System.out.println("Total gaji yang anda dapatkan adalah: " +total_Gaji);
    }
}
