import java.util.Scanner;
public class Davidmartinez04 {

    public static void main (String[] args) {
        Scanner input04 = new  Scanner(System.in);

        System.out.print("Masukkan jarak: ");
        int jarak = input04.nextInt();

    if (jarak <=5 )
        System.out.println("melee weapon");
    else if ((jarak < 5) || (jarak > 1000)){
        System.out.println("range weapon");
    }
        


    }
}