import java.util.Scanner;
public class Pemilihan2Percobaan223 {
    public static void main(String[] args){
    Scanner input23 = new Scanner(System.in);

    float sudut1, sudut2, sudut3, totalSudut;
    System.out.println("Masukkan nilai sudut 1");
    sudut1 = input23.nextFloat();
    System.out.println("Masukkan nilai sudut 2");
    sudut2 = input23.nextFloat();
    System.out.println("Masukkan nilai sudut 3");
    sudut3 = input23.nextFloat();
    totalSudut = sudut1 + sudut2 + sudut3;

    if (totalSudut == 180) {
        if((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
            System.out.println("Segitiga tersebut adalah Segi Tiga Siku-Siku");
        }else {
            System.out.println("Segitiga tersebut bukanlah Segitiga siku-Siku");
        }
    } else
        System.out.println("Bukan Segitiga");
}
}