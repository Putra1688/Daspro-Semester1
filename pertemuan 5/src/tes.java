import java.util.Scanner;
public class tes {
    public static void main(String[] args) {
        Scanner owh = new Scanner(System.in);
        int i;
        //String a; (untuk mendeklarasikan nilai ternary)

        System.out.println("Coba dong inpus angka");
        i = owh.nextInt();
        String a = i < 4 ? "YOiii" : i>10 ? "oiii" : "SAlah";
        // : i > 10 ? " Oitt"
        // : "Ehehe" ;
        
        System.out.println("ini ya testnya bawha " + i + "adalah " +a);

        /*if (i<4 || i>10) {
            System.out.println("ini ya tesnya bahwa " + i + "adalah Yoiii");
        } else { System.out.println("kalau salah berarti hemmm (Oitt)");}*/
    }
}
