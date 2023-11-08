import java.util.Scanner;
public class SegitigaBintang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai N: ");
        int N = input.nextInt();

        if (N>=5) {
            for (int i=N; i>=1; i--) {
                for (int j=1; j<=N-i;j++) {
                    System.out.print("o");
                }
                for (int j =1; j<=i;j++) {
                    System.out.print("*");
                }
                System.out.println("");
            } 
        } else {
            System.out.println("N kurang dari 5");
        }
        System.out.println("\n");
    }
}
