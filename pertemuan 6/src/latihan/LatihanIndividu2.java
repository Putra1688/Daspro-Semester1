import java.util.Scanner;
public class LatihanIndividu2 {
    public static void main(String[] args){
        int harga, jumlahBuku, hargaBuku, jumlahDiskon, diskonHarga, hargaAsli, hargaBayar;
        String jenisBuku;
        double diskon=0;

    Scanner ac = new Scanner(System.in);
    System.out.println("Masukkan Jenis Buku yang Anda Beli: ");
        jenisBuku = ac.nextLine();
    System.out.println("Masukkan Harga Buku yang Anda Beli");
        hargaBuku = ac.nextInt();
    System.out.println("Masukkan Jumlah Buku yang Anda Beli: ");
        jumlahBuku = ac.nextInt();

    //Pemilihan yang akan berjalan jika jenisBuku adalah kamus
    if (jenisBuku.equalsIgnoreCase("kamus")) {
        if (jumlahBuku > 2) {
            diskon = 0.10;
        } else {
            diskon = 0.2;}
            //Pemilihan yang akan berjalan jika jenisBuku adalah novel 
         } else if (jenisBuku.equalsIgnoreCase("novel")) {
            if (jumlahBuku <= 3) { 
                diskon = 0.01;
            } else {
                diskon = 0.7;
            }
            //Kondisi jika jenisBuku bukan kamus ataupun novel
    }else { 
        if (jumlahBuku > 3) diskon = 0.5;
    }

    hargaAsli = (int) (hargaBuku * jumlahBuku);
    jumlahDiskon = (int) diskon * 100;
    diskonHarga = (int) ((jumlahBuku * hargaBuku) * diskon);
    hargaBayar = hargaAsli - diskonHarga;

    System.out.println("Biaya Belanjaan anda adalah: Rp " + hargaAsli + " dengan diskon " + jumlahDiskon);
    System.out.println("Potongan Harga Sebesar: Rp " +diskonHarga);
    System.out.println("Harga yang perlu anda bayarkan adalah: Rp " + hargaBayar);
        
    
    }
}
    

