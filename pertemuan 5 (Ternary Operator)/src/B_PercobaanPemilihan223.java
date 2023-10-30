import java.util.Scanner;
    public class B_PercobaanPemilihan223{
        public static void main(String[] args){
            Scanner input23 = new Scanner(System.in);

            float uas, uts, kuiz, tugas;
            System.out.println("Masukkan nilai uas: ");
                uas = input23.nextFloat();
            System.out.println("Masukkan nilai uts: ");
                uts = input23.nextFloat();
            System.out.println("Masukkan nilai kuiz: ");
                kuiz = input23.nextFloat();
            System.out.println("Masukkan nilai tugas: ");
                tugas = input23.nextFloat();

            float total = (uas*0.4f) + (uts*0.3f) + (kuiz*0.1f) + (tugas*0.1f);

            // String var = x minimal < int && int <= x maksimal ? 
            String message = 80 < total && total <= 100 ? "4:Sangat Baik(A)"
                : 73 < total && total <= 80 ? "3.5:Lebih Baik(B+)"
                : 65 < total && total <= 73 ? "3:Baik(B)"
                : 60 < total && total <= 65 ? "2.5:Lebih dari Cukup(C+)"
                : 50 < total && total <= 60 ? "2:Cukup(C)"
                : 39 < total && total <= 50 ? "1.5:Kurang(D)"
                : "Gagal";

            System.out.println("Nilai akhir = " +total + " sehingga " +message);
            }
    }
