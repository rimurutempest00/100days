    package day84;
import java.util.LinkedList;
public class Main {
    
    public static void main(String[] args) {
       LinkedList <String> gtau = new LinkedList<>();
        gtau.add("Anime");
        gtau.add("Waifu");
        gtau.add("Mahiru");
        gtau.add("Rimuru");
        String cari = gtau.contains("Dia")?"Dia tidak bahagia bersamamu":"tidak di temukan sebab dia sudah bahagia bersama orang lain dari 5 tahun yang lalu :)";
        System.out.println(" org : kamu cari dia?\nMe : iyah kenapa?\nFakta yang harus di terima :\n"+cari);
    }
    
}
