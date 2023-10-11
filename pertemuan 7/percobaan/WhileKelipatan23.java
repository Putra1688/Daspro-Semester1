import java.util.Scanner;

public class WhileKelipatan23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kelipatan, jumlah=0, counter=0;
        

        System.out.println("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        /*inisiasi
        while (kondisi) {
            statement;
        }
        update; */
        int i = 1;
        while (i <= 50) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
            i++;
        }
        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d", kelipatan, counter);
        System.out.printf("\nTotal bilangan kelipatan %d dari 1 sampai 50 adalah %d", kelipatan, jumlah);
    }
}
