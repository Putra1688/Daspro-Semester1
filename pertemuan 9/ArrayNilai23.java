import java.util.Scanner;
public class ArrayNilai23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //deklarasi array bertipe integer
        int [] nilaiAkhir = new int[10];

        //struktur perulangan untuk menerima input array
        for (int i=0; i<10; i++) {
            System.out.println("Masukkan nilai akhir ke-" +i +" : ");
            nilaiAkhir [i] = sc.nextInt();
        }
        System.out.println("\n");
        for (int i=0; i<10; i++) {
            System.out.println("Nilai akhir ke-" +i +"adalah" +nilaiAkhir[i]);
            

         }
    }
    
}
