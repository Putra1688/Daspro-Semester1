package TugasIndividu;
import java.util.Scanner;
public class B_Fibonacci {
    
    public static int marmutFibonacci (int n) {
        
        // hanya ada 1 pasang marmut di bulan ke 1 dan 2
        if ( n ==1 || n ==2) {
            return 1;
        } else {
            // rekursif menghitung jumlah marmut
            return marmutFibonacci (n-1) + marmutFibonacci (n-2); 
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Jumlah marmut bulan ke-: ");
        int bulan = sc.nextInt();

        System.out.println("Terhitung berjumlah = "+marmutFibonacci(bulan));
    }
}
