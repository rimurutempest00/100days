package seratushari;

import java.util.HashMap;
import java.util.HashSet;

public class day94 {
    public static void main(String[] args) {
        HashSet <String> rasa = new HashSet<>();
        rasa.add("Sedih :)");
        rasa.add("Bahagia");
        rasa.add("Bahagia");
        rasa.add("Bahagia");
        rasa.add("Bahagia");
        rasa.add("Bahagia");
        rasa.add("Bahagia");
        
        //duplikat tidak akan di tambahkan
        System.out.println("Ini HashSet : \n"+rasa);
        
        HashMap <Integer,String> a = new HashMap<>();
        //konsep hasmap itu dia telah menemukan yang dulunya bilang aku itu mau yang baik kayak kamu tpi yang kumau bukan diriimu : ) 
        //disini hasmap telah membuktikan klw ada yang lebih baik kenapa harus itu itu saja :(
        a.put(1 ," aku");
        a.put(2 ," dan");
        a.put(3 ," kamu");
        System.out.println("\nIni HashMap\nawal kisah : "+a);
        a.put(1 ," dia");
        System.out.println("setelah asing : "+a);
        
    }   
}
