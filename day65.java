package day65;
import java.util.Scanner;
public class day65 {
    
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        String username = "Baharuddin";
        String password = "12345678";
        System.out.print("Masukan Username : ");
        String p = t.nextLine();
        System.out.print("Masukan Password : ");
        String l = t.nextLine();
        if(p.equalsIgnoreCase(username) && l.equalsIgnoreCase(password)){
            System.out.println("Login berhasil\nARIGATO SEMPAI :)");
        }else{
            System.out.println("Login gagal\nSILAKAN COBALAGI");
        }
    }
    
}
