package seratushari;

import java.util.Scanner;

public class day49 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        int awal,akhir,total=0,hasil=0;
        System.out.print("Masukan angka awal  : ");
        awal = masuk.nextInt();
        System.out.print("Masukan angka akhir : ");
        akhir = masuk.nextInt();
        
        if (awal >=0 && akhir > awal  ) {
            for (int i = awal; i <= akhir; i++) {
            total = i % 2;
            if (total == 1) {
                if( i != awal){
                    System.out.print(" + ");
                }
                System.out.print(i); 
                hasil +=i;
            }         
        }
        System.out.println("\nHasil = "+hasil);
        }else{
            System.out.println("Tidak boleh memnggunakan - atau negatif\nAngka awal harus lebih rendah dari angka akhir");
        }
    }
    
}
