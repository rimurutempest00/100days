package seratushari;

import java.util.Scanner;

public class day44 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        int jumlah,total=0,nilai;
        System.out.print("Masukan jumlah matkul : ");
        jumlah = i.nextInt();
        double rata_rata;
        char grade;
        for (int j = 1; j <= jumlah; j++) {
            System.out.print("Nilai matkul ke - "+j+" : ");
             nilai = i.nextInt();
             total +=nilai;
        }
        rata_rata = total/jumlah;
        System.out.println("=========================");
        System.out.println("jumlah rata-rata nilai : "+rata_rata);
        System.out.println("=========================");
        if (rata_rata >=90 && rata_rata <= 100) {
            grade ='A';
            System.out.println("Grade : "+grade);
        }else if (rata_rata >=80 && rata_rata < 90) {
            grade ='B';
            System.out.println("Grade : "+grade);
        }else if (rata_rata >=70 && rata_rata < 80) {
            grade ='C';
            System.out.println("Grade : "+grade);
        }else if (rata_rata >=60 && rata_rata < 70) {
            grade ='D';
            System.out.println("Grade : "+grade);
        }else {
            grade ='E';
            System.out.println("Grade : "+grade);
        }
    }
}
