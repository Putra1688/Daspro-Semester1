import java.util.Scanner;
public class Percobaan2_23 {
    
    // fungsi hitung Pangkat
    public static int hitungPangkat(int x, int y) {
        
        if (y==0) {
            return(1); // ketika y mencapai 0 maka nilai returnya bernilai 1
        } else { 
            System.out.print(x);
            // modifikasi
            if (y !=1 ){
            System.out.print("x");
        } else { System.out.print("x1 = ");}
            return ( x * hitungPangkat( x, y-1)); 
        }
    }

    // fungsi main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        int bilangan, pangkat;

        System.out.print("Bilangan yang ingin dihitung: ");
        bilangan = sc.nextInt();
        System.out.print("Pangkat: ");
        pangkat = sc.nextInt();

        System.out.println(hitungPangkat(bilangan, pangkat));
    }
}
