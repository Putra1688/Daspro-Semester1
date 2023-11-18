public class Sorting23 {
    public static void main(String[] args) {
        String[][] atlit = {
                { "vira", "Adit", "Farhan", "Ahmad", "Septian" }, // badminton
                { "Vara", "Naufal", "Dinda", "Angga", "Cindy" }, // tenisMeja
                { "Luthfi", "Kia", "Dika", "Sony", "Tio" }, // basket
                { "Rahman", "Innama", "Reika", "Esa", "Taufik" } // voli
        };

        String[] cabor = { "Badminton", "Tenis Meja", "Basket", "Bola Voly" };

        for (int i = 0; i < atlit.length; i++) {
            //mengurutkan atlit
            for (int j = 0; j < atlit[i].length - 1; j++) {
                for (int k = 0; k < atlit[i].length - 1 - j; k++) {
                    if (atlit[i][k].compareTo(atlit[i][k + 1]) > 0) {
                        // untuk ngurutin
                        String temp = atlit[i][k];
                        atlit[i][k] = atlit[i][k + 1];
                        atlit[i][k + 1] = temp;
                    }
                }
            }
        }

        for (int i = 0; i < atlit.length; i++) { // perulangan untuk menampilkan cabornya
            System.out.println(cabor[i] + ":");
            for (int j = 0; j < atlit[i].length; j++) { // perulangan untuk menampilkan nama dan cabor
                System.out.println("Atlit " + cabor[i] + " ke-" + (j + 1) + " adalah " + atlit[i][j]);
            }
            System.out.println();
        }
    }
}