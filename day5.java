
package seratushari;

import java.util.Scanner;

public class SeratusHari {

    public static void main(String[] args) {
    Scanner masuk = new Scanner(System.in);
    /*
    mengimputkan username dan password
    */
    String username,password;
        System.out.print("Username : ");// isi dengan username saya/Saya
        username = masuk.nextLine();
        System.out.print("Password : ");// isi dengan password kamu/Kamu
        password = masuk.nextLine();
        if(username.equals("Saya") && password.equals("kamu")){
            System.out.println("Login Berhasil");//ketika kedua kondisi di atas terpenuhi
        }else{
            System.out.println("Login gagal");// ketika kondisi di atas tidak terpenuhi
            
            /*
            sekian dan terimakasih :)
            semoga bahagia yah :)
            
            
            */
        }
        
    }
    
}
