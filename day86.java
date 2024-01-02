package seratushari;

import java.util.LinkedList;
import java.util.Scanner;

public class day86 {
    public static void main(String[] args) {
        LinkedList < Integer > angka = new LinkedList <>();
        angka.offer(40);
        angka.offer(50);
        angka.offer(60);
        angka.offer(70);
        System.out.println("angka ori\n"+angka);
        Scanner i = new Scanner (System.in);
        System.out.print("\ningin menambahkan angka berapa di depan angka 40 : ");
        int a = i.nextInt();
        angka.offerFirst(a);
      //offerFirst digunakan untuk menambahkan elemen di awal
        System.out.println("Setelah melakuka perubahan\n"+angka);
        System.out.print("\ningin menambahkan angka berapa setelah angka 70 : ");
        a = i.nextInt();
        angka.offerLast(a);
      //offerLast digunakan untuk menambahkan elemen di akhir mirip dengan offer
        System.out.println("setelah melakukan perubahan\n"+angka);
        System.out.println("\nCukup angka saya yang melakukan perrubahan\nSikap kamu jangan :)");
    }
}
