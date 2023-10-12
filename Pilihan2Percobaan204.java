import java.util.Scanner;
public class Pilihan2Percobaan204 {

    public static void main (String[] args) {
        Scanner input04 = new Scanner(System.in);

        int totalSudut, sudut1, sudut2, sudut3;
        System.out.print("Masukkan Sudut 1: ");
        sudut1 = input04.nextInt();
        System.out.print("Masukkan Sudut 2: ");
        sudut2 = input04.nextInt();
        System.out.print("Masukkan Sudut 3: ");
        sudut3 = input04.nextInt();

        totalSudut = sudut1 + sudut2 + sudut3;
      

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90))
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            else
                System.out.println("Segitiga tersebut adalah bukan segitiga siku-siku");
        } else
            System.out.println("Bukan Segitiga");

    }
}

    