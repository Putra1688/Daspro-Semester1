import java.util.Scanner;
public class LatihanIndividu2_23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String dataUser = "rangga";
        String dataPassword ="1234";
        String username,password, result;

        System.out.println("Masukkan username anda:");
        username = sc.next();
        System.out.println("Masukkan password:");
        password = sc.next();

        result = username.equals(dataUser) && password.equals(dataPassword) ? "username dan password sesuai" : "username dan password salah";
        System.out.println(result);
       if (username.equals(dataUser) && password.equals(dataPassword)) {
            System.out.println("Selamat anda berhasil login");
        }
    }
}