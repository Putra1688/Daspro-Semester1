import java.util.Scanner ;
public class HitungIP23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String nama, mataKuliah, konfirmasi, indeksNilai ;
    int sks, perbaikan=0, jumlahSKS=0, jumlahMataKuliah=0;
    double totalNilai=0, hasil;

    System.out.println("Program Hitug IP");
    System.out.println("Masukkan Nama Mahasiswa: ");
    nama = sc.next();
    
        do {
        System.out.println("Nama Mata Kuliah: ");
        mataKuliah = sc.next();
        System.out.print("Masukkan Jumlah SKS: ");
        sks = sc.nextInt();
        System.out.println("Masukkan Indeks Nilai: (A, B+, B, C, C+, E, D)");
        indeksNilai = sc.next();
        System.out.println("Apakah Lanjut Input Nilai? (y/n)");
        konfirmasi = sc.next();

        jumlahMataKuliah++;
        jumlahSKS +=sks;
        
    double nilai=0;
    switch (indeksNilai.toUpperCase()) {
        case "A":
        nilai = 4.0;
        break;
        case "B+":
        nilai = 3.5;
        case "B":
        nilai = 3.0;
        case "C+":
        nilai = 2.5;
        case "C":
        nilai = 2.0;
        case "E":
        nilai = 1.0;
        case "D":
        nilai = 0.0;
    }
    totalNilai+=nilai * jumlahSKS;
    hasil = totalNilai / jumlahSKS;

    if (indeksNilai.equals("D") || indeksNilai.equals("E")) {
    perbaikan++;
    }
    } while (konfirmasi.equalsIgnoreCase("y"));

System.out.println("----------Hasil Perhitungan IP----------");
System.out.println("Nama                : " +nama);
System.out.println("Indeks Prestasi     :" +hasil) ;
System.out.println("Jumlah Mata Kuliah  : " +jumlahMataKuliah);
System.out.println("Jumlah SKS          :" +jumlahSKS);
System.out.println("Jumlah MK yang harus perbaikan/remidi:"+perbaikan);
System.out.println("----------------------------------------");

    }
}
