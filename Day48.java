package day48;

import java.util.Scanner;

public class Day48 {

   
    public static void main(String[] args) {
        Scanner out = new Scanner(System.in);
        System.out.print("masukkan nilai : ");
        int nilai = out.nextInt();
        for (int i = 0; i < nilai; i++) {
               for (int j = 0; j < nilai; j++) {
                   System.out.print(" *");
            }
            System.out.println(""); 
        }
    }
    
}
