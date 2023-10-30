import java.util.Scanner;
public class B_WhileGaji23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    int jumlahKaryawan, jumlahJamLembur;
    double gajiLembur=0, totalGajiLembur=0;
    String jabatan;

    System.out.println("Masukkan Jumlah Karyawan: ");
    jumlahKaryawan = scan.nextInt();

    int i = 0;
    while (i < jumlahKaryawan)  {
        System.out.println("Pilihan Jabatan - Direktur, Manager, Karyawan");
        System.out.println("Masukkan jabatan Karyawan ke-" + (i+1) + " : ");
        jabatan = scan.next();
        System.out.println("Masukkan Jumlah jam Lembur");
        jumlahJamLembur = scan.nextInt();
       
        i++;
        if (jabatan.equalsIgnoreCase("direktur")) {
            continue;
        } else  if (jabatan.equalsIgnoreCase("Manager")) {
            gajiLembur = jumlahJamLembur * 100000;
        } else if (jabatan.equalsIgnoreCase("Karyawan")) {
            gajiLembur = jumlahJamLembur * 75000;
        } else { System.out.println("Jabatan Invalid");
        i--;
        continue;}
        totalGajiLembur += gajiLembur;
    }

    System.out.println("Total Gaji Lembur: " +totalGajiLembur);
    }
}
