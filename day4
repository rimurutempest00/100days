
package day4;

import java.util.Scanner;


public class Day4 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double pilih,porsi,harga = 0,diskon,total;
        System.out.println("|----------MENU--------|");
        System.out.println("|==>1.Bakso            |\n|==>2.Mie              |\n|==>3.Bakwan           |\n|----------------------|");
        System.out.print("Pilih : ");
        pilih = input.nextDouble();
        System.out.print("Porsi : ");
        porsi = input.nextDouble();
        if(pilih == 1){
            System.out.println("Bakso ");
            System.out.println("15000Rp/porsi");
            if(porsi >= 3 ){
                harga = 15000;
                System.out.println("Diskon 15%");
                diskon = 15*(harga * porsi )/100;
                total = (harga * porsi) - diskon;
                System.out.println("Total bayar : "+total);
            }else{
                total= porsi*15000 ;
                System.out.println("Total bayar : " + total);
                System.out.println("Min 3 porsi untuk mendapatkan diskon");
            }
        }else if(pilih == 2){
            System.out.println("Mie ");
            System.out.println("10000Rp/porsi");
            if(porsi >= 5 ){
                harga = 10000;
                System.out.println("Diskon 15%");
                diskon = 15*(harga * porsi )/100;
                total = (harga * porsi) - diskon;
                System.out.println("Total bayar : "+total);
            }else{
                total= porsi*10000 ;
                System.out.println("Total bayar : " + total);
                System.out.println("Min 5 porsi untuk mendapatkan diskon");
            }
        }else if(pilih == 3){
            System.out.println("Bakwan ");
            System.out.println("1000Rp/porsi");
            if(porsi >= 50 ){
                harga = 1000;
                System.out.println("Diskon 15%");
                diskon = 15*(harga * porsi )/100;
                total = (harga * porsi) - diskon;
                System.out.println("Total bayar : "+total);
            }else{
                total= porsi*1000 ;
                System.out.println("Total bayar : " + total);
                System.out.println("Min 50 porsi untuk mendapatkan diskon");
                } 
        }else{
            System.out.println("PILIHAN TIDAK TERSEDIAH :)");
        }   
    }
    
}
