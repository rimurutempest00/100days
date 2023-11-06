
package seratushari;

import java.util.Scanner;

public class day29 {
    public static void main(String[] args) {
        Scanner masuk = new Scanner (System.in);
        byte kkn,input;
        kkn = 75;
        System.out.print("Masukan nilai kkn : ");
        input = masuk.nextByte();
        String hasil = input >= kkn?"Anda lulus\n\nSELAMAT ":"Tidak lulus\n\nJika kamu tidak sanggup menahan lelahnya belajar\nmaka kamu harus sanggup menahan periihnya kebodohan\nSEKIAN DAN TERIMAKSIH😊😊 ";
        System.out.println(hasil);
        
    }
    
}
