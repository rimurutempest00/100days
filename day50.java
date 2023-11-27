package seratushari;

import java.util.Scanner;

public class day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int jmlh,pilih;
        char karakter=0;
        
        System.out.println("PILIH : \n1.MENENTUKAN KARAKTER YANG AKAN DI BACA\n2.MENGETAHUI JUMLAH KARAKTER YANG DI BACA");
        System.out.print("Pilih : ");
        pilih = input.nextInt();
        if (pilih == 1) {
            System.out.println("MENENTUKAN KARAKTER YANG AKAN DI BACA");
            System.out.print("Masukkan jumlah karakter yang akan dibaca: ");
            jmlh = input.nextInt();

        System.out.println("Masukkan " + jmlh + " karakter:");
        for (int i = 0; i < jmlh; i++) {
             karakter = input.next().charAt(0);
             System.out.println("Karakter yang dibaca: " + karakter);
        }

            input.close();

            
        }else if(pilih == 2){
            System.out.println("MENGETAHUI JUMLAH KARAKTER YANG DI BACA"); 
             System.out.println("Masukkan karakter-karakter (tekan titik '.' untuk berhenti):");
             while (true) {
                karakter = input.next().charAt(0);

            if (karakter == '.')
                break;

            System.out.println("Karakter yang dibaca: " + karakter);
            }

                input.close();

            }
        }
    }
    

