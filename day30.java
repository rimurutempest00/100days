package seratushari;
import java.util.Scanner;
public class day30 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        double angka1, angka2, hasil=0;
        String operator;

        System.out.println("Aplikasi Kalkulator Sederhana");
        
        System.out.print("Masukkan angka pertama: ");
        angka1 = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        operator = input.next();

        System.out.print("Masukkan angka kedua: ");
        angka2 = input.nextDouble();

        switch (operator) {
            case "+":
                hasil = angka1 + angka2;
                break;

            case "-":
                hasil = angka1 - angka2;
                break;

            case"*":
                hasil = angka1 * angka2;
                break;

            case "/":
                if (angka2 != 0) {
                    hasil = angka1 / angka2;
                } else {
                    System.out.println("Pembagian dengan nol tidak diperbolehkan!");
                }
                break;

            default:
                System.out.println("Operator tidak valid!");
                break;
        }
        
        System.out.println(angka1 + " " + operator + " " + angka2 + " = " + hasil);
    }
}
 
