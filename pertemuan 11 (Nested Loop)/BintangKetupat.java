
public class BintangKetupat{
    public static void main(String[] args) {

        int atas = 5; // panjang atas belah ketupat

        for (int a = 1; a < atas; a++) {
            // Loop pertama untuk mengatur jumlah spasi
            for (int c = 1; c <= atas - a; c++) {
                System.out.print(" ");
            }

            // Loop kedua untuk mencetak bintang
            for (int b = 1; b <= 2 * a - 1; b++) {
                System.out.print("*");
            }

            // Pindah ke baris berikutnya
            System.out.println();
        }


        int bawah = 5; // panjang bawah belah ketupat

        for (int i = bawah; i >= 1; i--) {
            for (int j = bawah; j > i; j--) {
                System.out.print(" "); // membuat spasi untuk menggeser pola ke kanan
            }
            for (int k = 1; k <= i * 2 - 1; k++) {
                System.out.print("*"); // membuat bintang
            }
            System.out.println(); // Pindah ke baris berikutnya
        }
    }
}






