import java.util.Scanner;
public class revHitungIP{
    public static void main(String[] args) {
        // struktur Scanner untuk melakukan proses input
        Scanner sc = new Scanner(System.in);
        
        // deklarasi variabel (peyimpanan tempat)
        String nama, matkul,indeks, confirm;
        int sks;
        int jml_matkul=0, jml_remidi=0, jml_sks=0; // assigment
        double nilai=0, ipk=0;

        System.out.println("=== Program Hitung IP ===");
        System.out.print("Masukkan Nama:");
            nama = sc.nextLine();

        do {
            System.out.print("Nama Matakuliah: ");
                matkul = sc.nextLine();
            System.out.print("Masukkan Nilai (A,B+,B,C+,C,D,E): ");
                indeks = sc.next();
            System.out.print("Masukkan jumlah SKS: ");
                sks = sc.nextInt();
                sc.nextLine();

            // menghitung nilai IP
            switch (indeks) {
                case "A":
                    nilai = 4.0;
                    break;
                case "B+":
                    nilai = 3.5;
                    break;
                case "B":
                    nilai = 3.0;
                    break;
                case "C+":
                    nilai = 2.5;
                    break;
                case "C":
                    nilai = 2.0;
                    break;
                case "D":
                    nilai = 1.0;
                    break;
                case "E":
                    nilai = 0;     
                default:
                    System.out.println("Indeks nilai tidakvalid"); 
            }

            jml_matkul++;       // menghitung total matkul
            jml_sks+= sks;    // menghitung akumulasi sks
            
        // menghitung jumlah remidi
        if (indeks.equalsIgnoreCase("D") || (indeks.equalsIgnoreCase("E")) ) {
            jml_remidi++;
        }
            ipk += nilai * sks;
            // syarat pengulangan
            System.out.print("Apakah lanjut mengisi nila (y/n): ");
                confirm = sc.nextLine();
        } while (confirm.equalsIgnoreCase("y"));

        // Menghitung IPK
        if (jml_matkul > 0) {
            ipk /=jml_sks;
        } else {
            ipk = 0;
        }
           
        // Menampilkan Hasil
        System.out.println("======= Hasil Perhitungan IP =======");
        System.out.println("Nama                : " +nama);
        System.out.println("Indeks Prestasi     :" +ipk) ;
        System.out.println("Jumlah Mata Kuliah  : " +jml_matkul);
        System.out.println("Jumlah SKS          :" +jml_sks);
        System.out.println("Jumlah MK yang harus perbaikan/remidi:"+jml_remidi);
    }
}
