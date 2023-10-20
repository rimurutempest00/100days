
package seratushari;

import java.util.Scanner;

public class day12 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner(System.in);
        double pai,mtk,bindo,fisika,ddp,psti,pkn,pancasila,total=0,hasil;
        System.out.print("Nilai PAi         : ");
        pai = masuk.nextDouble();
        System.out.print("Nilai MTK         : ");
        mtk = masuk.nextDouble();
        System.out.print("Nilai Bindo       : ");
        bindo = masuk.nextDouble();
        System.out.print("Nilai Fisika      : ");
        fisika = masuk.nextDouble();
        System.out.print("Nilai Ddp         : ");
        ddp = masuk.nextDouble();
        System.out.print("Nilai Psti        : ");
        psti = masuk.nextDouble();
        System.out.print("Nilai Pkn         : ");
        pkn = masuk.nextDouble();
        System.out.print("Nilai Pancasila   : ");
        pancasila = masuk.nextDouble();
        total = pai+mtk+bindo+fisika+ddp+psti+pkn+pancasila+total;
        hasil = total/8;
        char predikat;
        if(hasil >=90){
            predikat = 'A';
            System.out.println("rata rata"+hasil+"\npredikat : "+predikat);
        }else if(hasil >= 80){
            predikat = 'B';
           System.out.println("rata rata"+hasil+"\npredikat : "+predikat);
        }else if(hasil >= 70){
            predikat = 'C';
            System.out.println("rata rata"+hasil+"\npredikat : "+predikat);
        }else if(hasil >= 60){
            predikat = 'D';
            System.out.println("rata rata"+hasil+"\npredikat : "+predikat);
        }else if(hasil < 60){
            predikat = 'E';
            System.out.println("rata rata"+hasil+"\npredikat : "+predikat);
        }else{
            System.out.println("eror!!!!");
        }
        
    }
    
}
