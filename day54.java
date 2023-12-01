package seratushari;

import java.util.Scanner;

public class day54 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        int angka,angka1;
        System.out.print("masukan angka : ");
        angka = masuk.nextInt();
        System.out.print("masukan angka : ");
        angka1 = masuk.nextInt();
        System.out.println("Operator penjumlahan \n"+ angka +" + "+angka1+" = "+akhir(angka, angka1, angka));
        
    }
    public static int akhir( int angka, int angka1 , int hasil){
    hasil = angka + angka1;
    return (hasil);
    }
}
