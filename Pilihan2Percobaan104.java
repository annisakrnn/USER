import java.util.Scanner;
public class Pilihan2Percobaan104 {

    public static void main (String[] args) {
         int Tahun;
        Scanner input04 = new Scanner(System.in);
        System.out.print("Tahun=");
        
        System.out.print("Masukkan Tahun : ");
        Tahun = input04.nextInt();

        if((Tahun %100 != 0 ) && (Tahun %4==0)){
            System.out.println(Tahun+ "Tahun Kabisat");
                
        } else
            System.out.println(Tahun+"Bukan Tahun Kabisat");



    }
}