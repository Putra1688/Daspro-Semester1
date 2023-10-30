import java.util.Scanner;
public class Transaksi{
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);

        int berat_barang, jarak;
        double tarifDasar =10000, tarifDasarKg =1000, tarifDasarKm =2000, biaya_berat, biaya_jarak, biaya_total;

        System.out.println ("Masukkan berat barang anda");
        berat_barang = input.nextInt();
        System.out.println ("Masukkan jarak pengiriman");
        jarak = input.nextInt();

        if(berat_barang <= 5){
            if (jarak <= 100){
                biaya_berat = 0;
                biaya_jarak = 0;
            } else {
                biaya_berat = 0;
                biaya_jarak = biaya_jarak=(jarak-100)*tarifDasarKm;
            }
        } else {
            if (jarak <= 100){
                biaya_berat=(berat_barang-5)*tarifDasarKg;
                biaya_jarak = 0;
            } else {
                biaya_berat=(berat_barang-5)*tarifDasarKg;
                biaya_jarak = biaya_jarak=(jarak-100)*tarifDasarKm;
            }
        biaya_total = tarifDasar+biaya_berat+biaya_jarak;
        System.out.println("estimasi biaya pengiman: " +biaya_total);
        }

    }
}