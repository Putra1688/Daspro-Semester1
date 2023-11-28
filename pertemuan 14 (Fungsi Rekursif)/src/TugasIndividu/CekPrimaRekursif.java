package TugasIndividu;
import java.util.Scanner;
public class CekPrimaRekursif {
    
    public static boolean cekPrimaRekursif (int n, int i) {
        // default boolean adalah false

        // menghentikan rekursif ketika nilai i mendekati n (n-i)
        if (i == n-1 ) {
            return true;
        }

        // menjalankan rekursif selama n habis dibagi i
        if (n % i == 0) {
            return false;
        }

        // update an untuk i nya nambah/lebih besar
        return cekPrimaRekursif(n, i+1);
    }

    public static void main(String[] args) {
        int bilangan;
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan bilangan: ");
        bilangan = sc.nextInt();

        if (cekPrimaRekursif(bilangan, 2)){ // 2 adalah inisialisasi bahwa i mulai dari angka 2
            System.out.println(bilangan+ " adalah bilangan prima");
        } else { System.out.println(bilangan+ " bukan bilangan prima");}
    }
}
