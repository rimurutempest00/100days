package seratushari;
import java.util.Arrays;
public class day47 {
    
    public static void main(String[] args) {
        System.out.println("Soal 1 membuat nama hewan denhan minimal 10 index");
        String [] hewan ={"kelinci","kucinh ","tupai ","harimau","singa","kambing","sapi","panda","beruang","buaya"};
        for(int i =0 ; i < hewan.length; i++){
            System.out.println("indeks ke -> "+i +" = "+hewan[i]);
        }
        System.out.println("\nsoal ke 2 menjumlahkan array");
        int [] angka = {1,3,5,7,9,11,13,15,17,19};
        System.out.println("Array pertama "+Arrays.toString(angka));
        
        int [] angka1 = {3,5,7,9,15,17,21,25,23,27};
        System.out.println("Array ke dua "+Arrays.toString(angka1)+"\n--------------------------------------------------+");
        for (int i = 0; i < angka.length; i++) {
            angka [i]= angka[i] + angka1[i];
        }
        System.out.println("hasil penjumlahan = "+Arrays.toString(angka)+"\n");
        
        int [] kawai = {1,3,5,7,9,11,13,15,17,19};
        System.out.println("angka ganjil dalam array \n"+Arrays.toString(kawai));
        int jumlah = 0;
        for (int i = 0; i < kawai.length; i++) {
            jumlah += kawai[i];
        }
        System.out.println("hasil jumlah nilai dalam array = "+jumlah);   
   }
}
