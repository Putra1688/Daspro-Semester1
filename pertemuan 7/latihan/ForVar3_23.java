package latihan;

import java.util.Scanner;
public class ForVar3_23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int bil, n;
    boolean stop = false;

    /*   for (inisiasi; kondisi; update) {
            statement;
    }*/
    for (n = 0; !stop; n++) {
        System.out.println("Masukkan bilangan: ");
        bil = sc.nextInt();
        System.out.println("Bilangagn yang anda masukkan adalah: " +bil);
        if (bil < n) {
            stop = true;
        }
    }System.out.println("Program berakhir");

    }
}
