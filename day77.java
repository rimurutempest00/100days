package day77;
import java.util.ArrayList;
import java.util.Vector;
public class day76 {
    
    public static void main(String[] args) {
        ArrayList < String > text= new ArrayList <String>();
        text.add("Hallo semua");
        text.add("Apa kabar?");
        for(String  i: text){
            System.out.println(i);
        }
        Vector < String> kabar=new Vector<String>();
        kabar.add("Aku baik baik saja");
        kabar.add("kamu bagaimana apakah kamu baik² saja?");
        for(String a : kabar){
            System.out.println(a);
            
        }
    }
    
}
