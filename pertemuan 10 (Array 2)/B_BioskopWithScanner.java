import java.util.Scanner;
public class B_BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] [] penonton = new String [4][2];
        // deklarasi variabel untuk menyimpan inputan
        String nama, next;
        int kolom, baris;

        while (true) {
            System.out.print("Masukkan nama: ");
            nama = sc.nextLine();
            System.out.print("Masukkan baris: ");
            baris = sc.nextInt();
            System.out.print("Masukkan kolom: ");
            kolom = sc.nextInt();
            sc.nextLine();

            penonton[baris-1][kolom-1] = nama;
            System.out.print("Input penonton lainnya? (y/n): ");
            next = sc.nextLine();

            if (next.equalsIgnoreCase("n")) {
                break;
            }
        }
    }
}
