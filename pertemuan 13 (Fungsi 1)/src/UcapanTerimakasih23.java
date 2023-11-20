package src;
import java.util.Scanner;
public class UcapanTerimakasih23 {

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama Orang yang Anda ingin beri Ucapan:");
        String namaOrang = sc.nextLine();
        
        return namaOrang;
    }
    
    public static void UcapanTerimakasih () {
        String nama = PenerimaUcapan();
        System.out.println("Thank You "+nama+" for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask anything.");
    }

    public static void main(String[] args) {
        UcapanTerimakasih();
        System.out.println(); // memberikan space line antara UcapanTerimakasih dan UcapanTambahan
        UcapanTambahan();
        
    }

    public static String UcapanTambahan(){
        Scanner newSc = new Scanner(System.in);
        System.out.println("Tuliskan ucapan tambahan yang ingin disampaikan kepada penerima ucapan ");
        String ucapan_tambahan = newSc.nextLine();
        return ucapan_tambahan;
    }
}
