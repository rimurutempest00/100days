package seratushari;

import java.util.Scanner;


public class day42 {
    public static void nama(){
        Scanner i = new Scanner(System.in);
        
        int p,l,hasil;
        System.out.print("Masukan panjang : ");
        p = i.nextInt();
        System.out.print("Masukan Lebar   : ");
        l = i.nextInt();
        hasil = p*l;
        System.out.println(p + " x "+l+" = "+hasil);
      
    }
    public static void main(String[] args) {
        
        nama();
        System.err.println("SEMOGA BAHAGIA DAN SEHAT SELALU");
        
    }
}
