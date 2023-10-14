import java.util.Scanner;
public class DoWhileCuti23 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int jatahCuti, jumlahHari;
    String konfirmasi;

    System.out.println("Jatah Cuti: ");
    jatahCuti = sc.nextInt();
    
    // do { statements; update;} while (kondisi);
    do { 
        System.out.println("Apakah anda ingin mengambil cuti? (y/n)");
        konfirmasi = sc.next();

        if (konfirmasi.equalsIgnoreCase("y")) {
            System.out.println("Jumlah Hari: ");
            jumlahHari = sc.nextInt();

                if (jumlahHari < jatahCuti) {
                    jatahCuti -= jumlahHari;
                    System.out.println("Sisa jatah cuti: " +jatahCuti);
                } else  {
                    System.out.println("Sisa jatah cuti anda tidak mencukupi");
                continue;
                }
        }else if (konfirmasi.equalsIgnoreCase("t")){ System.out.println("Program dihentikan"); 
        break; }
    } while (jatahCuti > 0 );
    }
}
