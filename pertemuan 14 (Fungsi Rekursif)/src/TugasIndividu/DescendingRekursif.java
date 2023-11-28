package TugasIndividu;

public class DescendingRekursif {
    // fungsi rekursif
    public static int DescendingRekursif(int n) {
        if (n > 0) {
            System.out.print(n+ " ");
            return (DescendingRekursif(n-1)) ;   
        } else { return n=0; } // kondisi ketika n mencapai nilai 0, yang diretrnkan n=0
    }

    // fungsi iteratif
    public static int DescendingIteratif (int n) {
        int bilangan;
        for (int i=n; i >=1; i-- ) {
            System.out.print(i+" ");
            bilangan = i-1;
        }
        return bilangan=0; // kondisi ketika n mencapai nilai 0
    }

    // fungsi main
    public static void main(String[] args) {
        System.out.println(DescendingRekursif(5));
        System.out.println(DescendingIteratif(5));
    }


}
