package seratushari;

import java.util.Scanner;

public class day51 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = "Bahar";
        String b = "Adakah";
        
        System.out.print("Maasukan username : ");
        String username = input.nextLine();
        System.out.print("Maasukan password : ");
        String password = input.nextLine();
        if (username.equalsIgnoreCase(a) && password.equalsIgnoreCase(b)) {
            System.out.println("Loging Berhasil"); 
        }else{
            System.out.println("Login Gagal");
        }
    }
    
}
