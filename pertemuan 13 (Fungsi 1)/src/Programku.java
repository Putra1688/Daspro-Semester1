package src;
public class Programku {
    public static void TampilHinggaKe_i (int i){
        for (int j=1;j<=i;j++) {
            System.out.print(i);
        }
    }
    public static int Jumlah (int bil1, int bil2){
        return (bil1+bil2);
    }

    public static void TampilJumlah (int bil1, int bil2) {
        TampilHinggaKe_i(Jumlah(bil1,bil2));
    }

    public static void main (String[] args) {
        int temp = Jumlah(1,1);
        TampilJumlah (temp,5);
    }
    
}
