    package day84;
import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan bilangan bulat positif: ");
        int n = input.nextInt();

        int hasil = jumlah(n);
        System.out.println("Jumlah bilangan dari 1 sampai " + n + " adalah: " + hasil);
    }

    public static int jumlah(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + jumlah(n - 1);
        }
    }
    
}
