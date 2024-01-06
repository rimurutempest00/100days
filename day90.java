    package day90;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args) {
       LinkedList <String> warna= new LinkedList<>();
        warna.add("green");
        warna.add("grey");
        warna.add("pantablack");
        System.out.println("elemen awal : "+warna);
        System.out.println("Setelah menggunakan fungsi remove: "+warna.remove());
        System.out.println("Setelah menggunakan fungsi removeFirst : "+warna.removeFirst());
        System.out.println("Setelah menggunakan fungsi removeLast : "+warna.removeLast());
    }
    
}
