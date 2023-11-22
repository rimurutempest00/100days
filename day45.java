package seratushari;
import java.util.Arrays;
public class arraytostringandCopyDay45 {
    
    public static void printarray(int [] dataArray){
        System.out.println("Array = "+Arrays.toString(dataArray));
    }
    public static void main(String[] args) {
     int [] angka = {1,2,3,4,5,6,7};  
        System.out.println("\nPweubahan Array ke string \n========================");
        printarray(angka);
        
        System.out.println("\nmengcopy array \n========================");
        int [] angka2 = new int [angka.length];
        printarray(angka);
        printarray(angka2);
        System.out.println("\nmengcopy dengan loop\n=======================");
        for (int i = 0; i < angka.length; i++) {
            angka2[i] = angka [i];   
        }
        printarray(angka);
        printarray(angka2);
        
        System.out.println("\nmencopy dengan copyof\n======================");
        int [] angka3 = Arrays.copyOf(angka, 4);
        printarray(angka);
        printarray(angka3); 
     }
    }
    

