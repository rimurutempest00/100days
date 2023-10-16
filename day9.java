
package com.mycompany._mayprojeck;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        String menu;
        double pilihan,harga,jumlah,diskon,total;
        System.out.println("|---------------------------------------------------|");
        System.out.println("|                                                   |");
        System.out.println("|                   TOKOH ONLINE                    |");
        System.out.println("|       |---------------MENU-------------|          |");
        System.out.println("|       | 1.Baju                         |          |");
        System.out.println("|       | 2.Celana                       |          |");
        System.out.println("|       | 3.Sepatu                       |          |");
        System.out.println("|       |--------------------------------|          |");
        System.out.println("|                 beli 2 atau lebih                 |");
        System.out.println("|                   dapat diskon                    |");
        System.out.println("|                                                   |");
        System.out.println("|---------------------------------------------------|");
        System.out.print("Pilih : ");
        pilihan = input.nextInt();
        if(pilihan == 1){
        System.out.print("Jumlah : ");
        jumlah = input.nextDouble();
            menu = "Baju";
            harga = 50000;
            if(jumlah >= 2){
                System.out.println("dapat diskon 15%");
                diskon= 15*(harga * jumlah)/100;
                total = (jumlah * harga) - diskon;
                System.out.println("=================================");
                System.out.println("Barang yang di pesan : ");
                System.out.println(menu+" - Rp. " + harga+"/Barang");
                System.out.println("=================================");
                System.out.println("Total Bayar : "+ total);
            }else if(jumlah <2){
                System.out.println(harga);
                System.out.println("tidak diskon ");
                System.out.println("=================================");
                System.out.println("Barang yang di pesan : ");
                System.out.println(menu+" - Rp. " + harga+"/Barang");
                System.out.println("=================================");
                System.out.println("Total Bayar : "+ harga);
            }   
        }else if (pilihan ==2){
            System.out.print("Jumlah : ");
            jumlah = input.nextDouble();
            menu ="Celana";
            harga = 40000;
            if(jumlah >= 2){
                System.out.println("dapat diskon 15%");
                diskon= 15*(harga * jumlah)/100;
                total = (jumlah * harga) - diskon;
                System.out.println("=================================");
                System.out.println("Barang yang di pesan : ");
                System.out.println(menu+" - Rp. " + harga+"/Barang");
                System.out.println("=================================");
                System.out.println("Total Bayar : "+ total);
            }else if(jumlah <2){
                System.out.println(harga);
                System.out.println("tidak diskon ");
                System.out.println("=================================");
                System.out.println("Barang yang di pesan : ");
                System.out.println(menu+" - Rp. " + harga+"/Barang");
                System.out.println("=================================");
                System.out.println("Total Bayar : "+ harga);
            }      
        }else if (pilihan ==3){
            System.out.print("Jumlah : ");
            jumlah = input.nextDouble();
            menu ="Sepatu";
            harga = 80000;
             if(jumlah >= 2){
                System.out.println("dapat diskon 15%");
                diskon= 15*(harga * jumlah)/100;
                total = (jumlah * harga) - diskon;
                System.out.println("=================================");
                System.out.println("Barang yang di pesan : ");
                System.out.println(menu+" - Rp. " + harga+"/Barang");
                System.out.println("=================================");
                System.out.println("Total Bayar : "+ total);
            }else if(jumlah <2){
                System.out.println(harga);
                System.out.println("tidak diskon ");
                System.out.println("=================================");
                System.out.println("Barang yang di pesan : ");
                System.out.println(menu+" - Rp. " + harga+"/Barang");
                System.out.println("=================================");
                System.out.println("Total Bayar : "+ harga);
            }   
        }else{
            System.out.println("MENU TIDAK TERSEDIA!!!!");
        }
       
        }
    }
        
   
                
           
        
        
    

