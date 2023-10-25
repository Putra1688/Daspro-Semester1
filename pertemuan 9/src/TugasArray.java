package src;
import java.util.Scanner;
public class TugasArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //deklarasi variabel
        int total=0, rata2=0, jumlah=0; 
        int temp=0;
        int i;

        // deklarasi int untuk menentukan kapasitas array berdasarkan inputan
        int jml_Elmn;
        System.out.println("Jumlah Data yang Dimasukkan: ");
        jml_Elmn = sc.nextInt();
        int [] Elemen = new int[jml_Elmn];

        // looping untuk memasukkan nilai Elemen
        for (i=0; i<jml_Elmn; i++) {
            System.out.println("Nilai Elemen ke-" +(i+1));
            Elemen [i] = sc.nextInt();
       
            total +=Elemen[i];      // menghitung akumulasi total data
            ++jumlah;               // menghitung banyaknya data
            rata2 = total/jumlah;   // menghitung rata-rata data
        }

        // looping Mengurutkan Data Inputan
        for (i=0; i<jml_Elmn; i++) {
            for (int j=1;j < jml_Elmn-i; j++) {
                if (Elemen[j-1] < Elemen[j]){
            //swap element
            temp = Elemen[j];
            Elemen[j] = Elemen[j-1];
            Elemen[j-1] = temp;
            }
          }
        }
    

        // Memunculkan Output
        System.out.println("\n");
        System.out.println("Data yang dimasukkan ada " +jumlah+ " data ");
        System.out.println("Total Data yang dimasukkan adalah " +total);
        System.out.println("Rata-rata data yang dimasukkan adalah " +rata2);
        System.out.println("Nilai Elemen Tertinggi adalah: " +Elemen[0]);
        System.out.println("Nilai Elemen Terendah adalah: " +Elemen[i-1]);
    }
}
