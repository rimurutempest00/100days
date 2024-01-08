package seratushari;

import java.util.Stack;

public class day92 {
    public static void main(String[] args) {
    Stack <String> buah = new Stack <>();
    buah.push("anggur");
    buah.push("semangka");
    buah.push("semangka");
    buah.push("apel");
    buah.push("durian");
    System.out.println("elemen awal sebelum melakukan perubahan\n"+buah);
    //fungsi pop menghapus dan dan mengembalikan elemen paling atas sedangkan di stack elemen paling atas itu adaah yanng paling bawa 
    // contoh di atas elemen paling atas ituu anggur dan elemen akhir itu durian tpi disini kita menggunakan fungsi Stack jadi di balik
    System.out.println("elemen setelah menggunakan fungsi pop : "+buah.pop());
    //fungsi peek itu mengembalikan hanya melihat elemen paling atas tampa menghapus berbeda dengan pop dia menghapus  dan mengembalikan
    //elemen paling atas jadi yang akan tampil itu apel krn durian telah di hapus menggunakan fungsi pop pada variabel buah
    System.out.println("elemen setelah menggunakan fungsi peek : "+buah.peek());
    //fungsi empty itu mengecek apakah sebuah vaiabel ini memliki nilai atau elemen apa tidak jika variabelnya bernilai null makan nilai nya true jika berisi maka niilainya false
    System.out.println("apakah elemen dalam variabel  buah itu kosong : "+buah.empty());
    //fngsi search itu mencari elemen di sebuah variabel jika menemukan seesuatu yang di cari maka yang tambil itu jumlahnya
    //jika elemen yang di cari tidak ada maka nilainya di kembalikan ke -1
    System.out.println("apakah buah semangka ada? : "+buah.search("semangka"));
    }
}
