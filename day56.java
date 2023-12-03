package seratushari;

import java.util.Scanner;

public class day56 {
    public static void main(String[] args) {
        Scanner inpu = new Scanner(System.in);
        int angka,angka2;
        System.out.println("operator penjumlahan\n ");
        System.out.print("Masukan nilai pertama : ");
        angka = inpu.nextInt();
        System.out.print("Masukan nilai kedua   : ");
        angka2 = inpu.nextInt();
        System.out.println("\n"+angka +" + "+angka2+"  = "+hasilakhir(angka,angka2)+"\n\nSEMOGA BAHAGIA : )");
        
    }
    public static Integer hasilakhir (int a , int b){
        int hasil = a + b;
        return (hasil);
    }
}
