package seratushari;

import java.util.Scanner;

public class day36 {
    public static void main(String[] args) {
        String pilih;
        int a,b;
        do {            
            Scanner l = new Scanner(System.in);
            System.out.print("Masukan nilai awal  : ");
            a = l.nextInt();
            System.out.print("Masukan nilai akhir : ");
            b = l.nextInt();
            
            for (int i = a; i < b; i++) {
                System.out.println(i);
                
            }
            
            System.out.println("Ulang program atau ulang KIsah kamu dengan dia ");
            System.out.println("Jika ulang program ketik ya \nJika ulang kisah kamu ketik ulang");
            System.out.print("Pilih : ");
            pilih = l.next();
        } while (pilih.equalsIgnoreCase("ya"));
        System.err.println("SUDAH TAK BISA KARNA DIA TELAH BAHAGIA BERSAMA ORANG LAIN :)\nMOHON BERSABAR :(");
    }
}
