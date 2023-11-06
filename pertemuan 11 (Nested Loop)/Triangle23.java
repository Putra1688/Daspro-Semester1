import java.util.Scanner;
public class Triangle23 {
    public static void main(String[] args) {
        
        int N;
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan nilai N: ");
        N = sc.nextInt();

        int i=0;
        while (i<N) {
            int j=0;
            while (j<i) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); // menambahkan baris baru
            i++;
        }
    }
}
