import java.util.Scanner;
public class PemilihanPercobaan204 {

    public static void main (String[] args) {

    
        Scanner input04 = new Scanner(System.in);

        System.out.print("Nilai uas   : ");
        float uas = input04.nextFloat();
        System.out.print("Nilai uts   : ");
        float uts = input04.nextFloat();
        System.out.print("Nilai kuis  : ");
        float kuis = input04.nextFloat();
        System.out.print("Nilai tugas : ");
        float tugas = input04.nextFloat();

        float total = (uas * 0.4F) + (uts * 0.3F) + (kuis * 0.1F) + (tugas * 0.2F);

        String kualifikasi = (total > 80 && total <= 100) ? "Sangat Baik" : (total > 73 && total <= 80) ? "Lebih dari Baik" :
        (total > 65 && total <= 73) ? "Baik" : (total > 60 && total <=65) ? "Lebih dari Cukup" : (total > 50 && total <= 60) ? "Cukup" :
        (total > 39 && total <= 50) ? "Kurang" : "Gagal" ;

        float nilaisetara = (total > 80 && total <= 100) ? 4 : (total > 73 && total <= 80) ? 3.5F :
        (total > 65 && total <= 73) ? 3 : (total > 60 && total <=65) ? 2.5F : (total > 50 && total <= 60) ? 2 :
        (total > 39 && total <= 50) ? 1 : 0 ;

        String nilaihuruf = (total > 80 && total <= 100) ? "A" : (total > 73 && total <= 80) ? "B+" :
        (total > 65 && total <= 73) ? "B" : (total > 60 && total <=65) ? "C+" : (total > 50 && total <= 60) ? "C" :
        (total > 39 && total <= 50) ? "D" : "E" ;

        System.out.println("Nilqi akhir = " + total + ", Nilai Huruf: " + nilaihuruf + ", Setara: " + nilaisetara + ", Kualifikasi: " + kualifikasi);
    }
}