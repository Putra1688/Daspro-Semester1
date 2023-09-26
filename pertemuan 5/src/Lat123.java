import java.util.Scanner;
public class Lat123{
    public static void main(String[] args){
        Scanner sc23 = new Scanner(System.in);

        System.out.println("Masukkan suhu : ");
        int suhu = sc23.nextInt();

        if (suhu<16) {
            System.out.println("Silahkan menggunakan jaket");
        }
        if (suhu<20) {
            System.out.println("Silahkan pakai baju tebal");
        }
        else {
            System.out.println("Silahkan pakai topi");
        }
    }
}