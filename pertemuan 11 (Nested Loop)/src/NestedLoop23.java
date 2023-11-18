import java.util.Scanner;
public class NestedLoop23 {
    public static void main(String[] args) {
        
        // Mengisi array dan menampilkannya
        Scanner scanner = new Scanner(System.in);
        double [][] temps = new double[2][3];
        String [] nama = new String [2];
        // mengisikan nilai array
        for (int i=0;i < temps.length; i++) {
            System.out.println("Kota ke-" +i);
            nama[i] = scanner.next();
            for (int j=0; j<temps[0].length; j++) {
                System.out.print("\tHari ke-" +(j+1) + " : ") ;
                temps[i][j] = scanner.nextDouble(); 
            }
            System.out.println();
        }

        // menampilkan kota dan menghitung jumlah isinya
        for (int i=0;i < temps.length; i++) {
            System.out.println(nama[i]);
            double jumlah_temp = 0;
            // menampilkan isi array dan menghitung total akumulasi isinya
            for (int j=0; j <temps[0].length;j++) {
                System.out.print(temps[i][j] + " ") ;
                jumlah_temp += temps[i][j];
            }
            double rata2_temp = jumlah_temp / temps[i].length;
            System.out.println("Rata-rata adalah : " +rata2_temp);
        }
    }
}
