
package seratushari;

import java.util.Scanner;

public class day11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(">>>>>>>>>>>>>>>>>KALKULATOR SEDERHANA<<<<<<<<<<<<<<<<<<< ");
        double angka1,angka2,hasil = 0;
        System.out.print("Angka pertama : ");
        angka1 = input.nextDouble();
        System.out.print("Angka kedua   : ");
        angka2 = input.nextDouble();
        System.out.println("Operator ( +,-,x,/ )");
        System.out.print("Pilih \t: ");
        String operator = input.next();
        
        switch(operator){
            case "+":
                hasil = angka1 + angka2;
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                System.out.println(angka1 +" "+operator+" "+angka2+" = "+hasil);
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                break;
            case "-":
                hasil = angka1 - angka2;
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                System.out.println(angka1 +" "+operator+" "+angka2+" = "+hasil);
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                break;
            case "x":
                hasil = angka1 * angka2;
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                System.out.println(angka1 +" "+operator+" "+angka2+" = "+hasil);
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                break;
            case "/":
                if(angka2 !=0){
                    hasil = angka1 / angka2;
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                System.out.println(angka1 +" "+operator+" "+angka2+" = "+hasil);
                System.out.println("<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>");
                }else{
                    System.out.println("Pembagian dengan nol tidak diperbolehkan");
                }
                break;
            default:
                System.out.println("Operator tidak valid!!!!");
                break;    
               
        }
        
        
        
    }
    
}
