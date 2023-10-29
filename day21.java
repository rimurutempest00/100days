package seratushari;

import java.util.Scanner;

public class day21 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String nama,alamat,ttl,noHp,jenis;
        byte umur,jarak,Jumlah;
      
        System.out.println("---Masukan Bio Data Anda---");
        System.out.print("Nama\t\t : ");
        nama = masuk.nextLine();
        System.out.print("Jenis Kelamin\t : ");
        jenis = masuk.nextLine();
        System.out.print("Alamat\t\t : ");
        alamat = masuk.nextLine();
        System.out.print("TTL\t\t : ");
        ttl = masuk.nextLine();
        System.out.print("Umur\t\t : ");
        umur = masuk.nextByte();
        System.out.print("Jarak ke Kampus\t : ");
        jarak = masuk.nextByte();
        System.out.print("Jumlah Saudara\t : ");
        Jumlah = masuk.nextByte();
        System.out.print("No Hp\t\t : ");
        noHp = masuk.next();
        
        
        System.out.println("==========================");
        System.out.println("--Data Mahasiswa--"+"\nNama\t\t : "+nama+"\nJenis Kelamin\t : "+jenis+"\nAlamat\t\t : "+alamat+"\nTTL\t\t : "+ttl+"\nUmur\t\t : "+umur+"\nJarak Ke Kampus\t : "+jarak+"\nJumlah Saudara\t : "+Jumlah+"\nNo Hp\t\t : "+noHp);
        
    }
    
}
