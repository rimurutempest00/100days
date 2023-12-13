package day66;
import java.util.Scanner;
public class day66 {
    
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);

        // Meminta pengguna untuk memasukkan nama depan dan nama belakang
        System.out.print("Masukkan nama depan: ");
        String firstName = scanner.nextLine();

        System.out.print("Masukkan nama belakang: ");
        String lastName = scanner.nextLine();

        // Menggunakan String.format() untuk menampilkan pesan sambutan
        String greeting = String.format("Halo, %s %s!", firstName, lastName);
        System.out.println(greeting);

        scanner.close();
    }
    
}
