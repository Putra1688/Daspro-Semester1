public class Percobaan1_23 {

    // fungsi rekursif
    public static int faktorialRekursif(int n) {
        if (n==0) {
                return (1); // ketika mencapai 0 maka rumusnya menjadi 1 * 0
        } else { 
            return ( n*faktorialRekursif(n-1)) ; 
        }
    }

    // fungsi iteratif
    public static int faktorialIteratif (int n) {
        int faktor = 1;
        for (int i=n; i >=1; i-- ) {
            faktor = faktor * i;
        }
        return faktor;
    }

    // fungsi main
    public static void main(String[] args) {
        System.out.println(faktorialRekursif(5));
        System.out.println(faktorialIteratif(5));
    }

}
