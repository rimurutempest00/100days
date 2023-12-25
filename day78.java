package seratushari;
import java.util.ArrayList;
import java.util.Vector;

public class day78 {
    public static void main(String[] args) {
        ArrayList<Mahasiswa> saya = new ArrayList<>();
        saya.add(new Mahasiswa("Baharuddin",21));
        System.out.println("Data Mahasiswa dari ArrayList:");
        for (Mahasiswa mahasiswa : saya) {
            System.out.println("Nama\t: " + mahasiswa.getNama() + "\nUsia\t: " + mahasiswa.getUsia());
        }
        System.out.println();
        Vector<Mahasiswa> vector= new Vector<>();
        vector.add(new Mahasiswa("Rimuru ",21));
        System.out.println("Data Mahasiswa dari Vector:");
        for (Mahasiswa data : vector) {
            System.out.println("Nama\t: " + data.getNama() + "\nUsia\t: " + data.getUsia());
        }
    }
}
class Mahasiswa {
    private String nama;
        private int usia;
  
    public Mahasiswa(String nama, int usia) {
        this.nama = nama;
        this.usia = usia;
    }
    public String getNama() {
        return nama;
    }
    public int getUsia() {
        return usia;
    }
    }
