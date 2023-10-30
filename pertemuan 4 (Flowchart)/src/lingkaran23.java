import java.util.Scanner;
public class lingkaran23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r;
        double keliling, luas;
        double phi=3.14;

        System.out.print("Masukkan nilai jari-jari: ");
        r = sc.nextInt();

        luas = phi * r * r;
        keliling = 2 * phi * r;

        System.out.println("Luas lingkaran adalah       : " +luas);
        System.out.println("Keliling lingkaran adalah   :" +keliling);
    }
}
