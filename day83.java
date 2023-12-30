package seratushari;

import java.util.LinkedList;

public class day83 {
    public static void main(String[] args) {
        LinkedList <String> dataBuah = new LinkedList <>();
        dataBuah.add("mangga");
        dataBuah.add("apel");
        dataBuah.add("durian");
        dataBuah.add("semangka");
        int jumlah = dataBuah.size();//untuk mengetahui jumlah index yang ada didalam LinkedList
        System.out.println("jumlah index di dalam LinkedList : "+jumlah+"\n\nYang terdiri dari : ");
        for (String nam : dataBuah) {
            System.out.println(nam);    
            }
        }
    }
