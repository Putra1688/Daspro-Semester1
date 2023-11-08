import java.util.Scanner;
public class SegitigaAngka {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int i = 1;
        int N;

        System.out.print("Masukkan nilai N: ");
        N = input.nextInt();

        // pengecekan untuk N minimal 3
        if (N>=3) {
            // menentukan banyaknya baris
            for (i=1; i<=N; i++) {
                // memberikan ruang kosong/spasi
                for (int k=N; k>i; k--) {
                    System.out.print(" ");
                }
                // print angka
                for (int j=1; j<=i; j++ ) {
                        System.out.print(j);
                    }
                    System.out.println(); // print baris
            }
        } else { 
            System.out.println("Jumlah N kurang dari 3");
        }
    }
}
