
package seratushari;

import java.util.Scanner;


public class NewClass {
public static void main (String [] args){
    Scanner input =new Scanner(System.in);
    int angka,angka1,hasil,a,bagi,genap,ganjil,pilih,panjang,samping;
   
    System.out.println("pilih bilangan : \n1.genap\n2.ganjil");
    System.out.print("Pilih : ");
    pilih = input.nextInt();
    System.out.println("=======================");
    if (pilih == 1) {
        System.out.println("Bilangan Genap");
        System.out.print("Mulai dari angka : ");
        angka = input.nextInt();
        System.out.print("Sampai angka     : ");
        angka1 = input.nextInt();
        System.out.print("hasi bagi dari angka : ");
        bagi = input.nextInt();
        System.out.print("jmlh angka ke samping : ");
        samping = input.nextInt();
        System.out.println("===================");
        a = angka;
        panjang = 1;
        for (int i = 1; a <= angka1; a++) {
            hasil = a % bagi ;
            if(hasil == 0 ){
                genap = a % 2;
                if(genap == 0)
                System.out.print(a+" ");
                if(panjang == samping){
                    System.out.println(" ");
                    panjang = 0;
                }
                panjang++;
            }

        }
        a++;
        System.err.println("\nSEMOGA BAHAGIA 😊😊");
    }else if(pilih == 2){
        System.out.println("Bilangan Ganjil");
        System.out.print("Mulai dari angka : ");
        angka = input.nextInt();
        System.out.print("Sampai angka     : ");
        angka1 = input.nextInt();
        System.out.print("hasi bagi dari angka : ");
        bagi = input.nextInt();
        System.out.print("jmlh angka ke samping : ");
        samping = input.nextInt();
        System.out.println("===================");
        a = angka;
        panjang = 1;
        for (int i = 1; a <= angka1; a++) {
            hasil = a % bagi ;
            if(hasil == 1 ){
                ganjil = a % 2;
                if(ganjil == 1)
                System.out.print(a+" ");
                if(panjang == samping){
                    System.out.println(" ");
                    panjang = 0;
                }
                panjang++;
            }

        }
        a++;
    System.err.println("\nSEMOGA BAHAGIA 😊😊");
    }else{
      System.out.println("INPUT SALAH!!!");
      }
    
    }
}
