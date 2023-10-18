
package seratushari;

import java.util.Scanner;

public class day10 {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        long penghasilan,gaji_bersih,pajak;
        System.out.print("Penghasilan : Rp.");
        penghasilan = input.nextLong();
        if(penghasilan >= 5000000){
            System.out.println("pajak 15%");
            pajak = (15 * penghasilan)/100;
            gaji_bersih = penghasilan - pajak;
            System.out.println("gajih bersih : "+gaji_bersih+"Rp");    
        
        }else if(penghasilan >= 3000000){
            System.out.println("pajak 10% ");
            pajak = (10 * penghasilan)/100;
            gaji_bersih = penghasilan - pajak;
            System.out.println("gajih bersih : "+gaji_bersih+"Rp"); 
        }else if(penghasilan < 3000000 && penghasilan > 1000000){
            System.out.println("pajak 5%");
            pajak = (5 * penghasilan)/100;
            gaji_bersih = penghasilan - pajak;
            System.out.println("gajih bersih : "+gaji_bersih+"Rp");
            
        }else if(penghasilan >1000 || penghasilan > 500000 && penghasilan < 1000000){
            System.out.println("Anda tidak dikenakan pajak ");
            System.out.println("gajih bersih : "+penghasilan+"Rp");
        }else if(penghasilan < 1000){
            System.out.println("Anda tidak jujur :)");  
        }
      
    }
}
