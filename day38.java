package seratushari;

import java.util.Scanner;

public class day38 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        String cari;
        int count = 0;
         String [] buah = {
             "mangga",
             "apel",
             "pepaya",
             "nanas",
             "tomat",
             "semangka",
             "jambu",
             "durian",
             "jeruk",
             "durian musangkin",
             "langsat",
             "salak",
             "hatii"
             
         };
         for (int i = 0; i < buah.length; i++) {
             System.out.println((i+1)+". "+buah[i]);
            
        }
         System.out.print("cari buah : ");
         cari = masuk.nextLine();
         System.out.println("===========================");
         for (int i = 0; i < buah.length; i++) {
             if (cari.equalsIgnoreCase(buah[i])) {
                 System.out.println("nomor "+(i+1)+" ada buah "+buah[i]);
                 count++;
             }
            
        }
         if (count == 0) {
             System.err.println("data tidak di temukan");
            
        }
    }
}
        
    
