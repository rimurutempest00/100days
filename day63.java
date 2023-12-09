package day63;
import java.util.Scanner;
public class day63 {
    
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String nama = "Baharuddin";
        System.out.print("Masukan nama pengguna : ");
        String pengguna = masuk.nextLine();
        if(pengguna.equals(nama)){
            System.out.println("Berhasil");
        }else{
            System.out.println("Gagal");
        }
    }
    
}
