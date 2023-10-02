import java.util.Scanner;
public class LatihanIndividu1 {
    public static void main(String[] args){
        Scanner input23 = new Scanner(System.in);
        int bil1, bil2, bil3; 

        System.out.println("Masukkan Bilangan pertama: ");
        bil1 = input23.nextInt();
        System.out.println("Masukkan Bilangan kedua: ");
        bil2 = input23.nextInt();
        System.out.println("Masukkan Bilangan ketiga: ");
        bil3 = input23.nextInt();

        if (bil1 > bil2) {
            if (bil1 > 3)
                System.out.println("Bilangan terbesar adalah " + bil1);
            else 
                System.out.println("Bilangan tebesar adalah " + bil3);
        } else if (bil2 > bil3) {
                System.out.println("Bilangan terbesar adalah " + bil2);
        }else {
                System.out.println("Bilangan terbesar adalah " + bil3);

        }
    }
}