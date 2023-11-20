package src;
public class Terimakasih23 {
    public static void UcapanTerimakasih () {
        System.out.println("Thank you for being the best teacher in the world.\n" +
        "You inspired in me a love for learning and made me feel like I could ask anything.");
    }
        public static void main(String[] args) {
            
            // Dengan menggunakan Fungsi
            UcapanTerimakasih();
            String ucapan = "Terimakasih Pak.. Bu... semoga sehat selalu" ;
            UcapanTambahan(ucapan);
        }

        public static void UcapanTambahan(String ucapan) { // dengan parameter
            System.out.println(ucapan);
        }
    }

