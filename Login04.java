import java.util.Scanner;
public class Login04 {

    public static void main (String[] args) {
        Scanner input04 = new  Scanner(System.in);

        String username, password;

        System.out.print("Masukkan username: ");
        username = input04.nextLine();
        System.out.println("Masukkan password: ");
        password = input04.nextLine();

        if (username.equals("pengguna") && password.equals("admin")) {
            System.out.println("Selamat Anda Bisa Masuk");
        
        } else
        System.out.println("Username atau Password salah");
        
    }
}