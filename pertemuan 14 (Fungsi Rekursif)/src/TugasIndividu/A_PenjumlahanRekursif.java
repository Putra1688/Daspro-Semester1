package TugasIndividu;
import java.util.Scanner;
public class A_PenjumlahanRekursif {
    
    // FUNGSI ITERATIF
    public static int hitungTotal( int n){
        int total=0;
        for (int i=1; i<=n; i++) {
        System.out.print(i);
        if (i != n){
                System.out.print("+");
            } else {
                System.out.print( " = " ); 
            } 
            total +=i;
        }   return total;    
    }
    
    // FUNGSI REKURSIF
        // if (x > 0) {    // syarat kondisi perogram berjalan
        //     System.out.print(y);
        //     if (x != 1){
        //         System.out.print("+");
        //     } else {
        //         System.out.print( " = " ); 
        //     } return (x + hitungTotal(x-1, y+1)); // LIHAT INI DULU 
        // } else {return x=0;}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;
        System.out.print("hitung sampai bilangan ke-: ");
        bilangan = sc.nextInt();
        System.out.print(hitungTotal(bilangan)); // DEKLARASI X DAN Y MULAI DARIMANA
    }
}
