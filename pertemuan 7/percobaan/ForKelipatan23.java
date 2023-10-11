import java.util.Scanner;
public class ForKelipatan23 {
        public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah=0, counter=0;
        double average=0;

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

    //  for (inisialisasi; kondisi; update) { statement1; statement2;}
        for ( int i = 1; i <=50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i; //menghitung akumulasi dari banyaknya nilai
                counter++; //menghitung banyaknya nilai
                average = jumlah / counter; //menghitung rata-rata
            }
        }
        
    System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d", kelipatan, counter);
    System.out.printf("\nTotal bilangan kelipatan %d dari 1 sampai 50 adalah %d", kelipatan, jumlah);
    System.out.printf("\nJumlah rata-rata adalah: %f", average);
    }
}
