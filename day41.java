package seratushari;

import java.util.Scanner;

public class day41 {
    public static void main(String[] args) {
        Scanner yee = new Scanner(System.in);
        int angka, hasil;
        System.out.print("Masukkan angka : ");
        angka = yee.nextInt();
        hasil = angka % 2;
        if (hasil == 0 || hasil == -0) {
            System.out.println(angka + " Bilangan genap"); 
        }else if(hasil == 1 || hasil == -1){
            System.out.println(angka + " Bilangan ganjil");
        }
        
    }
    
}
