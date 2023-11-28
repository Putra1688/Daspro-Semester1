package src;
import java.util.Scanner;
public class Array23 {

    static Scanner input = new Scanner(System.in);
    static int [][] nilaiMhs = new int [3][3];
    static String nama[] = new String [nilaiMhs.length];

    // fungsi input data nilai mahasiswa
    public static void inputData() {
        for (int i=0;i < nilaiMhs.length; i++) {
            System.out.print("Mahasiswa ke-" +(i+1) +": ");
            nama[i] = input.next();
            for (int j=0; j<nilaiMhs[i].length; j++) {
                System.out.print("\tMinggu ke-" +(j+1) + " : " +" ") ;
                nilaiMhs[i][j] = input.nextInt(); 
            }
        }
    }    

    // fungsi untuk menampilkan seluruh nilai mahasiswa
    public static void tampilkanData() {
        for (int i=0;i < nilaiMhs.length; i++) {
            System.out.print(nama[i] +" : " );
            for (int j=0; j <nilaiMhs[i].length;j++) {
                System.out.print(nilaiMhs[i][j] + " ") ;
            }
            System.out.println();
        }
    }

    // fungsi untuk mencari nilai tertinggi
    public static int nilaiTertinggi (int [][]nilaiMhs) {
        int nilaiMax=0;
        
        for (int i=0; i < nilaiMhs.length; i++){
            for (int j=0; j<nilaiMhs[i].length; j++) {
                if (nilaiMax < nilaiMhs[i][j]) {
                    nilaiMax = nilaiMhs[i][j];
                }    
            }
        }
        return nilaiMax;
    }

    // fungsi mencari minggu ke berapa
    public static void hari(){
        int nilaiMax = nilaiTertinggi(nilaiMhs);
        for (int i=0; i < nilaiMhs.length; i++){
            for (int j=0; j<nilaiMhs[i].length; j++) {
                if (nilaiMhs[i][j] == nilaiMax){
                    System.out.println("Nilai tertinggi ditemukan di minggu ke-" + (j+1));
                }
            }
        }
    } 

    // fungsi mencari pemilik nilai
    public static void pemilikNilai() {
        int nilaiMax = nilaiTertinggi(nilaiMhs);
        for (int i=0; i < nilaiMhs.length; i++){
            for (int j=0; j<nilaiMhs[i].length; j++) {
                if (nilaiMhs[i][j] == nilaiMax) {
                    System.out.println("Nilai tertinggi diraih oleh " +nama[i]+ " pada minggu ke-" +(j+1));
                }
            }
        }
        
    }



    public static void main(String[] args) {
        inputData();
        tampilkanData();

        System.out.println();

        hari();
        pemilikNilai();
    }
}

