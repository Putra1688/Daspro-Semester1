package src;

public class LineraSearch23 {
    public static void main(String[] args) {

        // deklarasi variabel array dengan nilai elemen yang sudah ditentukan
        int [] arrayInt = {34, 18, 26,48, 72, 20, 56, 63} ;
        int key = 20;
        int hasil=0;
        
        // looping untuk mencari key dalam urutan indeks array
        for (int i=0; i<arrayInt.length; i++) {
            if (arrayInt [i] == key) {
                hasil=i;
                break;
            }
        }

        // intruksi print menampilkan output 
        System.out.println("\n");
        System.out.println("Key ada dalam array pada posisi indeks ke-" +hasil);
        System.out.println(" ");
    }
}
