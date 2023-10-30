import java.util.Scanner;
public class g_Bank23 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int jml_tabunganAwal, lama_menabung;
        double prsn_bunga=0.02;
        double bunga, jml_tabunganAkhir;

        System.out.print("Masukkan jumlah tabungan awal : ");
        jml_tabunganAwal = input.nextInt();
        System.out.print("Masukkan lama anda menabung   : ");
        lama_menabung = input.nextInt();

        bunga = jml_tabunganAwal * lama_menabung * prsn_bunga;
        jml_tabunganAkhir = bunga + jml_tabunganAwal;

        System.out.println("Bunga yang anda dapatkan adalah              : " +bunga);
        System.out.println("Jumlah tabungan akhir anda sekarang adalah   : " +jml_tabunganAkhir);
    }
}
