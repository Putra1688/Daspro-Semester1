package TugasIndividu;

public class PenjumlahanRekursif {
    
    public static int hitungTotal( int x, int y){
        if (x > 0) {    // syarat kondisi perogram berjalan
            System.out.print(y);
            if (x != 1){
                System.out.print("+");
            } else {
                System.out.print( " = " ); 
            } return (x + hitungTotal(x-1, y+1)); // LIHAT INI DULU 
        } else {return x=0;}
    } 


    public static void main(String[] args) {
        System.out.print(hitungTotal(5,1)); // DEKLARASI X DAN Y MULAI DARIMANA
    }
}
