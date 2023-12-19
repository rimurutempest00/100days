package seratushari;

import java.util.Scanner;

public class day69 {
    public static void main(String[] args) {
        Scanner i = new Scanner(System.in);
        System.out.println("mendeteksi kata palindrome atau bukan");
        System.out.print("masukan kata : ");
        String kata = i.nextLine();
        if(palindrome(kata)){
            System.out.println(","+kata+" <-- ini adalah palindrome");
        }else{
            System.out.println(","+kata+" <-- ini bukan palindrome");
        }
        }
    public static boolean palindrome (String sama){
        return sama.equals(new StringBuilder (sama).reverse().toString());
    }
    }
 

