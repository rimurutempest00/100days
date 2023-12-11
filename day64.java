package seratushari;

import java.util.Scanner;

public class day64 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Masukan tinggi segi tiga : ");
        int tinggi = input.nextInt();
        input.close();
        for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi+1 ; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");
            }
            System.out.println("");
        }
         for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi +1; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
          for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi ; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = -1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
         for (int i = 1; i <= tinggi; i++) {
            for (int j = tinggi -1; j >=i; j--) {
                System.out.print(" ");
            }
            for (int k = -2; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println("");
        }  
        for (int i = 0; i <tinggi; i++) {
            for (int j = 0; j < tinggi; j++) {
                System.out.print(" ");
            }
            for (int l = 0; l < tinggi; l++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        System.out.println("SEMOGA BAHAGIA :)");
    }
    
}
