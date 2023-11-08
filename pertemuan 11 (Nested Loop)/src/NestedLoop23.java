import java.util.Scanner;
public class NestedLoop23 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        double [][] temps = new double[5][7];

        for (int i=0;i < temps.length; i++) {
            System.out.println("Kota ke-" +i);
            for (int j=0; j<temps[0].length; j++) {
                System.out.print("Hari ke-" +(j+1) + " : ") ;
                temps[i][j] = scanner.nextDouble(); 
            }
            System.out.println();
        }

        for (int i=0;i < temps.length; i++) {
            System.out.println("Kota ke-" +i);
            double jumlah_temp = 0;
            for (int j=0; j <temps[0].length;j++) {
                System.out.print(temps[i][j] + " ") ;
                jumlah_temp += temps[i][j];
            }
            double rata2_temp = jumlah_temp / temps[i].length;
            System.out.println("Rata-rata adalah : " +rata2_temp);
        }
    }
}
