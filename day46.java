package seratushari;
import java.util.Arrays;
public class penjumlahanNilaiArrayday46 {
    public static void hasil(int [] array , String message){
        System.out.println(message + " = "+Arrays.toString(array));
    }
    // untuk  melakukan penjumlahan di dalam array kiita ubaha dlu ke string
    public static void main(String[] args) {
        int [] angka = {1,2,3,4,5,6,7};
        int [] angka1 = {2,3,4,5,6,7,8};
        for (int i = 0; i < angka.length; i++) {
            angka [i]= angka[i] + angka1[i];
        }
       hasil(angka , "hasil ");
    }
}    

