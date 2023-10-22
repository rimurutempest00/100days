package seratushari;

import java.util.Scanner;

public class day14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        menghiatung jumlah rata rata dengan menggunakan metode input dan perulangan 
        
        */
        int jumlah,nilai,total =0;
        double rata_rata;
        char predikat;
        System.out.print("jumlah matkul : ");
        jumlah = input.nextInt();
        System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Nilai matkul ke- "+i+" : ");
            nilai = input.nextInt();
            total += nilai;
        }
        
           rata_rata = total/jumlah;
           System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           System.out.println("Total niali  : "+total);
           System.out.println("rata rata    : "+rata_rata);
           if(rata_rata >= 95){
               predikat = 'A';
               System.out.println("Predikat     : "+predikat+"+");
               System.out.println("LULUS");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else if(rata_rata >=90){
               predikat = 'A';
               System.out.println("Predikat     : "+predikat+"-");
               System.out.println("LULUS");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else if(rata_rata >=85){
               predikat = 'B';
               System.out.println("Predikat     : "+predikat+"+");
               System.out.println("LULUS");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else if(rata_rata >=80){
               predikat = 'B';
               System.out.println("Predikat     : "+predikat+"-");
               System.out.println("LULUS");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else if(rata_rata >=75){
               predikat = 'C';
               System.out.println("Predikat     : "+predikat+"+");
               System.out.println("LULUS");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else if(rata_rata >=70){
               predikat = 'C';
               System.out.println("Predikat     : "+predikat+"-");
               System.out.println("LULUS");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else if(rata_rata >= 60){
               predikat = 'D';
               System.out.println("Predikat     : "+predikat);
               System.out.println("Mengulang Tahun Depan :)");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else if(rata_rata < 60){
               predikat = 'E';
               System.out.println("Predikat     : "+predikat);
               System.out.println("Mengulang Tahun Depan :)");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }else{
               System.out.println("Mengulang Tahun Depan :)");
               System.out.println("<<<<<<<<<<<<<>>>>>>>>>>>>>");
           }
    }
    
}
