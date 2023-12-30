package day84;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args) {
       LinkedList <String> buah = new LinkedList<>();
        buah.add("Mangga");
        buah.add("Durian");
        buah.add("pepaya");
        buah.add("Nanas");
        System.out.println("Sebelum di lakukan perubahan");
        for(String b : buah){
            System.out.println(b);
        }
        buah.set(2,"Buah naga");
        System.out.println("Setelah mengalami perubahan : )");
        for(String c : buah){
            System.out.println(c);
        }
    }
    
}
