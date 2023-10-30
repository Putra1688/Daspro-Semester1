package src;
public class ArrayBilangan23 {
    public static void main(String[] args) {
    
    // menyediakan wadah
    // deklarasi array bertipe integer dengan kapasitas 4 elemen
    int [] bil = new int [4]; //intanisasi (perlakuan berupa menentukan kapasitas 4 elemen)
    // Mengisi nilai dalam elemen array
    bil [0] = 5;
    bil [1] = 13;
    bil [2] = -7;
    bil [3] = 7;

    // int bil [] = { 5, 13, -7, 7}; ----> inisialisasi = tidak perlu deklarasi + intanisasi
    
    // Mengakses elemen array

    // Manual
    // System.out.println(bil[0]); --- System.out.print(bil[3]);
    // inisialisasi elemen array sekaligus pada saat deklarasi array
    for (int i = 0; i<4; i++) {
        System.out.println(bil[i]);
    }
    }
}

