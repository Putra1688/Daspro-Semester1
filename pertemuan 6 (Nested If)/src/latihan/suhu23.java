import java.util.Scanner;
public class suhu23 {
    public static void main(String[] args){
        int suhu;
        String hujan;
    
    Scanner sc23 = new Scanner(System.in);
    Scanner sc232 = new Scanner(System.in);
    System.out.println("Masukkan suhu: ");
    suhu = sc23.nextInt();
    System.out.println("Apakah cuaca sedang Hujan? (ya/tidak)");
    hujan = sc232.nextLine();

    if (suhu > 27) {
            System.out.println("Silahkan Memakai Dress");
        if (hujan.equals("ya")){
            System.out.println("Sebaiknya Membawa Payung");
        } else {
            System.out.println("Sebaiknya Memakai Sunscreen");
        }
    } else {
        System.out.println("Silahkan Memakai Celana Panjang");
    }

    }
    }

