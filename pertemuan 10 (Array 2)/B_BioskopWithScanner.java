import java.util.Scanner;
public class B_BioskopWithScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] [] penonton = new String [4][2];
        // deklarasi variabel untuk menyimpan inputan
        String nama, next;
        int kolom, baris, opsi;
        boolean exit = true;

        do {
        // menampilkan opsi menu yang ditawarkan
        System.out.println("=== BIOSKOP ===");
        System.out.println("1. Input data Penonton");
        System.out.println("2. Tampilkan data Penonton");
        System.out.println("3. Exit");
        System.out.println("===============");
            // program setiap menu
            System.out.print("Pilih Opsi: ");
            opsi = sc.nextInt();
            
            switch (opsi) {
                case 1:
                    while (true) {
                        System.out.print("Masukkan nama: ");
                        nama = sc.next();
                        System.out.print("Masukkan baris: ");
                        baris = sc.nextInt();
                        System.out.print("Masukkan kolom: ");
                        kolom = sc.nextInt();
                        sc.nextLine();

                        if (baris<=4 && kolom<=2) {
                            if (penonton[baris-1][kolom-1]== null) {
                                penonton [baris-1][kolom-1] = nama;
                            } else {System.out.println("Kursi sudah terisi");}
                        } else {System.out.println("Kursi tidak tersedia");}

                        System.out.print("Input penonton lainnya? (y/n): ");
                        next = sc.nextLine();
                        if (next.equalsIgnoreCase("n")) {
                            break;
                            }
                    }
                    break;
                case 2:
                    for (int i = 0; i < penonton.length; i++) {
                        for (int j = 0; j < penonton[0].length; j++) {
                            if (penonton[i][j] == null) {
                                penonton[i][j] = "***";
                            }
                        }
                    }
                    for (int i=0; i<penonton.length; i++) {
                        System.out.println("Penonotn pada baris ke-" +(i+1)+ " : " +String.join(", ",penonton[i]));
                    }
                    break;
                case 3:
                exit = false;
                break;
                default:
                    System.out.println("Invalid. Coba Lagi!");
            }

            
            
        } while (exit == true);

    }
}
