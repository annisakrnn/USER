import java.util.Scanner;
public class Pilihan2Percobaan104 {

    public static void main (String[] args) {
        Scanner input04 = new Scanner(System.in);
        
        int Tahun;

        System.out.print("Masukkan Tahun : ");
        Tahun = input04.nextInt();

        if ((Tahun % 4 ) == 0) {
            if ((Tahun % 100) == 0) {
                 if ((Tahun % 400) == 0) {
                System.out.println("Tahun Kabisat");

                 }else
                System.out.println("Bukan Tahun Kabisat");
            }else
                System.out.println("Tahun Kabisat");
        }else
            System.out.println("Bukan Tahun Kabisat");

            }

    }
