package seratushari;

import java.util.Scanner;

public class day55 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        day55 objek = new day55();
        String nama;
        System.out.print("Masukan nama : ");
        nama = masuk.nextLine();
        int panjang = objek.hitung(nama);
        System.out.println("========================= \nJumlah karakter yang di inputkan : "+panjang);
    }
    public static int hitung(String kata){
        return kata.length();
    }
}
