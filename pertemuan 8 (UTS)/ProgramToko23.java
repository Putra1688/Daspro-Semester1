import java.util.Scanner;

public class ProgramToko23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Mengambil input nama pelanggan
        System.out.print("Masukkan nama pelanggan: ");
        String namaPelanggan = input.nextLine();

        // Menginisialisasi variabel untuk menyimpan data pembelian
        int totalItem = 0;
        double totalHargaSebelumDiskon = 0;
        double totalDiskon = 0;

        // Mengambil input apakah pelanggan adalah member (y/n)
        System.out.print("Apakah pelanggan adalah member (y/n)? ");
        String isMember = input.nextLine().toLowerCase();

        if (isMember.equals("y")) {
            double totalPembelianSebelumDiskon = 0;
            String lagi = "y"; // Untuk menginisialisasi loop

            while (lagi.equalsIgnoreCase("y")) {
                System.out.print("Masukkan nama produk: ");
                String produk = input.nextLine();
                System.out.print("Masukkan kuantitas produk: ");
                int kuantitas = input.nextInt();
                System.out.print("Masukkan harga satuan produk: ");
                double hargaSatuan = input.nextDouble();
                System.out.print("Masukkan diskon produk dalam persen (0 jika tidak ada): ");
                double diskon = input.nextDouble();

                // Menghitung total harga sebelum diskon untuk produk ini
                double totalHargaProduk = kuantitas * hargaSatuan;
                totalPembelianSebelumDiskon += totalHargaProduk;

                // Menghitung total diskon untuk produk ini
                double totalDiskonProduk = (totalHargaProduk * diskon) / 100;
                totalDiskon += totalDiskonProduk;

                totalItem += kuantitas;

                input.nextLine(); // Membersihkan newline

                System.out.print("Apakah ingin menambahkan produk lagi (y/n)? ");
                lagi = input.nextLine();
            }

            // Menghitung diskon berdasarkan total pembelian
            double diskonMember = (totalPembelianSebelumDiskon >= 200000) ? (totalPembelianSebelumDiskon * 0.10) : (totalPembelianSebelumDiskon * 0.05);

            // Menghitung total akhir yang harus dibayar
            double totalAkhir = totalPembelianSebelumDiskon - diskonMember;

            // Output data pembelian
            System.out.println("\nData Pembelian:");
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Tipe Pelanggan: Member");
            System.out.println("Total Item: " + totalItem);
            System.out.println("Total Harga Sebelum Diskon: " + totalPembelianSebelumDiskon);
            System.out.println("Total Diskon: " + (totalDiskon + diskonMember));
            System.out.println("Total Akhir yang Harus Dibayar: " + totalAkhir);
        } else {
            String lagi = "y"; // Untuk menginisialisasi loop

            while (lagi.equalsIgnoreCase("y")) {
                System.out.print("Masukkan nama produk: ");
                String produk = input.nextLine();
                System.out.print("Masukkan kuantitas produk: ");
                int kuantitas = input.nextInt();
                System.out.print("Masukkan harga satuan produk: ");
                double hargaSatuan = input.nextDouble();
                System.out.print("Masukkan diskon produk dalam persen (0 jika tidak ada): ");
                double diskon = input.nextDouble();

                // Menghitung total harga sebelum diskon untuk produk ini
                double totalHargaProduk = kuantitas * hargaSatuan;
                totalHargaSebelumDiskon += totalHargaProduk;

                // Menghitung total diskon untuk produk ini
                double totalDiskonProduk = (totalHargaProduk * diskon) / 100;
                totalDiskon += totalDiskonProduk;

                totalItem += kuantitas;

                input.nextLine(); // Membersihkan newline

                System.out.print("Apakah ingin menambahkan produk lagi (y/n)? ");
                lagi = input.nextLine();
            }

            // Output data pembelian
            System.out.println("\nData Pembelian:");
            System.out.println("Nama Pelanggan: " + namaPelanggan);
            System.out.println("Tipe Pelanggan: Non-Member");
            System.out.println("Total Item: " + totalItem);
            System.out.println("Total Harga Sebelum Diskon: " + totalHargaSebelumDiskon);
            System.out.println("Total Diskon: " + totalDiskon);
            System.out.println("Total Akhir yang Harus Dibayar: " + (totalHargaSebelumDiskon - totalDiskon));
        }
    }
}