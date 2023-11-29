package seratushari;

import java.util.Scanner;

public class day52 {
    public static void data(int x,int y){
        System.out.println("Nilai x = "+x+"\nNilai y = "+y);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int y,x;
        System.out.print("Masukan nilai x = ");
        x = input.nextInt();
        System.out.print("Masukan nilai y = ");
        y = input.nextInt();
        data(x,y);
    }
    
}
