package src;
import java.util.Scanner;
public class Ucapan23 {
    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama Orang yang Anda ingin beri Ucapan:");
        String namaOrang = sc.nextLine();
        sc.close(); // menutup Scanner 
        return namaOrang;
    }

    public static void main (String[] args) {
        String nama = PenerimaUcapan();
        System.out.println("Thank You "+nama+"\nMay the Force be with you");
    }
}
