
package seratushari;

import java.util.Scanner;

public class day7 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String username,password;
        System.out.println("Username : ");
        username = input.next();
        System.out.println("Password : ");
        password = input.next();
        
        if(username.equals("unsulbar") && password.equals("mhs")){
            System.out.println("Login Berhasil ");
        }else{
            System.out.println(" Login gagal :)");
        }
        
        
        
     
    }
}
