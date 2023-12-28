package day81;
import java.util.LinkedList;
public class day81 {
    
    public static void main(String[] args) {
        LinkedList<String> number = new LinkedList<>();
        number.add("Satu");
        number.add("Dua");
        number.add("Tiga");
        number.add("Empat");
        number.add("Lima");
        System.out.println("LinkedList awal: " + number);
        number.remove("Tiga");
        System.out.println("Setelah menghapus 'Tiga': " + number);
        number.remove(1);
        System.out.println("Setelah menghapus elemen ke-1: " + number);
        number.removeFirst();
        System.out.println("Setelah menghapus elemen pertama: " + number);
        number.removeLast();
        System.out.println("Setelah menghapus elemen terakhir: " + number);
    }
    
}
