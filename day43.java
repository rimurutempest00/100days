package seratushari;

import java.util.Scanner;

public class day43 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        double beratBadan,tinggiBadan,bmi;
        System.out.print("masukkan berat  badan  [ kg ]: ");
        beratBadan = i.nextDouble();
        System.out.print("masukkan tinggi badan  [ m ] : ");
        tinggiBadan = i.nextDouble();
        bmi = beratBadan/(tinggiBadan * tinggiBadan);
        System.out.printf("BMI ANDA : %.2f\n" , bmi);// %.2f  untuk double dengan 2 angka di belakan koma
        if (bmi < 18.5) {                            // %.3f  untuk double dengan 3 angka di belakan koma dst
             System.out.println("Kurang berat badan ");   
        }else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("Normal ( ideal ) ");
        }else if (bmi >= 25.0 && bmi < 30) {
            System.out.println("Kelebihan berat badan");
        }else{
            System.err.println("Kegemuukan ( obesitas )");
        }
    }
    
}
