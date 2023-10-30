public class A_Bioskop23 {
    public static void main(String[] args) {

        // Deklarasi variabel array
        String [][] penonton = new String[4][2]; // kapasitas 4 elemen dengan 2 kolom
        // inisialisasi nilai variabel
        penonton [0] [0] = "Amin";
        penonton [0] [1] = "Bela";
        penonton [1] [0] = "Candra";
        penonton [1] [1] = "Dela";
        penonton [2] [0] = "Eka";
        penonton [2] [1] = "Farhan";
        penonton [3] [0] = "Gisel";
        penonton [3] [1] = "Hana";

        // menampilkan nilai menggunakan foreach loop
        System.out.println(penonton.length);
        for (String [] barisPenonton : penonton){
            System.out.println("Panjang Baris: " +barisPenonton.length);
        }
        // menampilkan nama penonton setiap baris menggunakan for loop
        System.out.println("=== Nama Penonton Setiap baris ===");
        for (int i=0; i<penonton.length;i++) {
             System.out.println("Penonotn pada baris ke-" +(i+1)+ " : " +String.join(", ",penonton[i]));
        }

        // System.out.printf("%s \t %s\n", penonton[0][0], penonton [0][1]);
        // System.out.printf("%s \t %s\n", penonton[1][0], penonton [1][1]);
        // System.out.printf("%s \t %s\n", penonton[2][0], penonton [2][1]);
        // System.out.printf("%s \t %s\n", penonton[3][0], penonton [3][1]);

        // // program tambahan
        // System.out.println(penonton.length);
        // System.out.println(penonton[0].length);
        // System.out.println(penonton[1].length);
        // System.out.println(penonton[2].length);
        // System.out.println(penonton[3].length);
    }
}
