import java.util.Scanner;
public class Star23 {
    public static void main(String[] args) {
        
        // Review Perulangan yang Lalu
        Scanner sc = new Scanner(System.in);

        int N; // pbjek untuk menyimpan nilai N

        // intruksi memasukkan nilai N
        System.out.print("Masukkan nilai N: ");
        N = sc.nextInt();

        // for looping
        for (int i=1; i<=N; i--) {
            System.out.print("* ");
        }

    }
}