import java.util.Scanner;
public class LatihanIndividu1_23 {
    public static void main(String[] args){
        Scanner as = new Scanner(System.in);

    int jarakMusuh;
    String jenisSenjata;
    
    System.out.println("Masukkan Jarak Musuh");
    jarakMusuh = as.nextInt();

    jenisSenjata = jarakMusuh <= 5 ? "Range " : "Melee ";
    System.out.println("Your Weapon is: " +jenisSenjata + "because it is" +jarakMusuh +"m");

    }
}