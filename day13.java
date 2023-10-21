package com.mycompany.mavenproject1;
import java.util.Scanner;
public class Mavenproject1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("|---------------------------|");
        System.out.println("|      OPERATOR TERNARY     |");
        System.out.println("|---------------------------|");
        System.out.println("=============================");
        System.out.print("Masukan Nilai : ");
        int nilai = input.nextInt();
        System.out.println("=============================");
        int kkm = 75;
        String Hasil = nilai >=kkm?"lulus":"tidak lulus";
        System.out.println("nilai : " +nilai);
        System.out.println("Kamu di nyatakan "+Hasil);
        System.out.println("|---------------------------|");
        System.out.println("|           SELAMAT         |");
        System.out.println("|---------------------------|");
       
        
    }
}
