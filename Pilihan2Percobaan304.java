import java.util.Scanner;
public class Pilihan2Percobaan304 {

    public static void main (String[] args) {
        Scanner input04 = new Scanner(System.in);

        String kategori;
        Int penghasilan, gajiBersih;
        double pajak = 0;

        System.out.println("Masukkan Kategori : ");
        kategori = noAbsen.nextInt();
        System.out.println("Masukkan Besarnya Penghasilan : ");
        penghasilan = noAbsen.nextInt();

        if (kategori.equalsIgnoreCase("pekerja")) {
            if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else
                pajak = 0.2;
            gajiBersih = (int) (penghasilan - (pajak * penghasilan));
            System.out.println("Penghasil Bersih : " + gajiBersih);
        } else
            System.out.println("Masukan Kategori Salah");
}
}