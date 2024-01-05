    package day84;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args) {
       LinkedList <String> warna= new LinkedList<>();
        warna.add("green");
        warna.add("grey");
        warna.add("pantablack");
        System.out.println("elemen awal : "+warna);
        System.out.println("Setelah menggunakan fungsi poll: "+warna.poll());
        System.out.println("Setelah menggunakan fungsi pollFirst : "+warna.pollFirst());
        System.out.println("Setelah menggunakan fungsi pollLast : "+warna.pollLast());
    }
    
}
