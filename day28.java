
package seratushari;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
    Scanner input  = new Scanner(System.in);
        System.out.print("Masukan umur : ");
        byte umur = input.nextByte();
        if (umur < 12 ) {
            System.out.println("Anak anak");    
        }else if (umur < 18) {
            System.out.println("Fase remaja");  
        }else if (umur < 25 ) {
            System.out.println("Remaja ");
        }else if (umur < 50 ) {
            System.out.println("Anda sudah dewasa "); 
        }else if (umur >= 50) {
            System.out.println("Sudah tua ");
        }
        System.err.println("TERIMAKASIH UNTUK SEMUANYA :)"); 
    }
}
