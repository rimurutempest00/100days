    package day87;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args) {
       LinkedList <Integer> no = new LinkedList<>();
        no.push(05);
        no.push(03);
        no.push(2003);
        no.push(2024);
        System.out.println("Sebelum melakukan penghapusan\n"+no);
        int hapus = no.pop();
        System.out.println("Setelah melakukan penghapusan\n"+hapus);
        System.out.println("Menghapus menggunakan fungsi pop hanya menyisakan elemen terakhir\nbukan menyisakan kenangan  :)");
    }
    
}
