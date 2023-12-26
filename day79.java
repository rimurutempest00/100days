package day79;
import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;

public class day79 {
    
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Durian");
        arrayList.add("Pisang");
        arrayList.add("Pepaya");
        System.out.println("Elemen pada indeks ke-1: " + arrayList.get(1));
        
        arrayList.set(2, "Buah naga");
        arrayList.remove("Apple");
        System.out.println("Ukuran ArrayList: " + arrayList.size());
        System.out.println("Apakah ArrayList kosong? " + arrayList.isEmpty());
        System.out.println("Indeks dari pisaang: " + arrayList.indexOf("Pisang"));
        System.out.println("Apakah Pepaya ada? " + arrayList.contains("Pepaya"));
        
        String[] array = arrayList.toArray(new String[0]);
        System.out.print("Array hasil konversi ArrayList: ");
        for (String buah1 : array) {
            System.out.print(buah1 + " ");
        }
        System.out.println();
        Vector<String> vector = new Vector<>(arrayList);
        Collections.sort(vector);
        System.out.print("Elemen Vector setelah diurutkan: ");
        for (String buah : vector) {
            System.out.print(buah+ " ");
        }
        System.out.println();
    }
    
}
