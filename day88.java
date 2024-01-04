    package day88;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args) {
       LinkedList <String> warna= new LinkedList<>();
        warna.add("Merah");
        warna.add("Kuning");
        warna.add("Hijau");
        System.out.println("elemen awal : "+warna);
        System.out.println("Setelah menggunakan fungsi peek : "+warna.peek());
        System.out.println("Setelah menggunakan fungsi peekFirst : "+warna.peekFirst());
        System.out.println("Setelah menggunakan fungsi peekLast : "+warna.peekLast());
    }
    
}
