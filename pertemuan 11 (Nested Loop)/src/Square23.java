import java.util.Scanner;
public class Square23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int N; // pbjek untuk menyimpan nilai N

        // intruksi memasukkan nilai N
        System.out.print("Masukkan nilai N: ");
        N = sc.nextInt();

        // for nested looping
        for (int iOuter=1; iOuter<=N; iOuter++) {  // Outer Loop
            System.out.print("* ");
                for (int i=0; i<=N; i++) {  // Inner Loop
                System.out.print("* ");
            }
            System.out.println();   // menambahkan baris 
        }
    }
}