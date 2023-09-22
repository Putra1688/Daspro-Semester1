import java.util.Scanner;

public class HargaBayar23 {
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);
    int harga, jumlah, jmlHalaman;
    String merk;
    double dis, total, bayar, jmlDis;

    System.out.println("Masukkan Harga Barang yang Dibeli");
    harga=input.nextInt();
    System.out.println("Masukkan Jumlah Barang yang Dibeli");
    jumlah=input.nextInt();
    System.out.println("Masukkan nama merk buku");
    merk=input.next();
    System.out.println("Masukkan Jumlah Halaman Buku");
    jmlHalaman=input.nextInt();
    System.out.println("Masukkan besaran Diskon yang anda peroleh");
    dis=input.nextDouble();

    total=harga*jumlah;
    jmlDis=total*dis;
    bayar=total-jmlDis;
    System.out.println("Diskon yang anda dapatkan adalah " +jmlDis);
    System.out.println("Jumlah yang harus anda bayarkan adalah " +bayar);
    System.out.print("Buku yang anda beli adalah " +merk);
    System.out.print(" dengan jumlah halaman " +jmlHalaman);
}
}