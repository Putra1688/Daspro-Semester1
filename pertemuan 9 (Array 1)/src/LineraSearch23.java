package src;
import java.util.Scanner;
public class LineraSearch23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // menentukan kapasitas array
        int arrayInt;
        System.out.print("Masukkan jumlah Elemen array: ");
        arrayInt = input.nextInt();

        int [] nilai_Elmn = new int[arrayInt];

        // looping untuk menentukan isi array 
        for (int i=0; i<arrayInt; i++) {
            System.out.print("Masukkan elemen array ke-" +i+ " : ");
            nilai_Elmn [i] = input.nextInt();
        }

        // menentukan nilai key
        int key;
        System.out.print("Masukkan key yang ingin dicari: ");
        key = input.nextInt();
        
        // looping untuk mencari key dalam urutan indeks array
        int hasil=0;
        for (int i=0; i<arrayInt; i++) {
            if (nilai_Elmn [i] == key) {
                hasil=i;
                break;
            }  
    
        // intruksi print menampilkan output 
        if (nilai_Elmn [i] == key) {
             System.out.print("Key ada dalam array pada posisi indeks ke-" +hasil);
        } else { 
            System.out.println("Key tidak ditemukan!!!");
            System.exit(0);
        }
    }
    }
}
