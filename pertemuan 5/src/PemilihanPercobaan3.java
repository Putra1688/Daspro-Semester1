import java.util.Scanner;
public class PemilihanPercobaan3 {
    public static void main(String[] args){
        Scanner input23 = new Scanner(System.in);
        double angka1, angka2, hasil;
        char operator;
        
        System.out.println("Kalkulator");
        //System.out.print("Masukkan angka pertama: ");
        angka1 = input23.nextDouble();
        operator = input23.next().charAt(0);
        //System.out.print("Masukkan angka kedua: ");
        angka2 = input23.nextDouble();
        //System.out.print("Masukkan operator (+ - / *): ");
        // operator = input23.next().charAt(0);

        switch (operator){
            case '+' :
            hasil = angka1 + angka2;
            System.out.println(angka1 + "+" + angka2 + "=" + hasil);
            break;
             case '-' :
            hasil = angka1 - angka2;
            System.out.println(angka1 + "-" + angka2 + "=" + hasil);
            break;
             case '*' :
            hasil = angka1 * angka2;
            System.out.println(angka1 + "*" + angka2 + "=" + hasil);
            break;
             case '/' :
            hasil = angka1 / angka2;
            System.out.println(angka1 + "/" + angka2 + "=" + hasil);
            break;
        }
    }
}

