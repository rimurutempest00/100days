
package seratushari;
import java.util.ArrayList;
import java.util.Vector;
public class day75 {
       public static void main(String[] args) {
           ArrayList <Object> data = new ArrayList<>();
           Vector <Object> tampung = new Vector<>();
           // nilai arraylist
           data.add("Nama\t: Baharuddin");
           data.add("Usia\t: "+21);
           data.add("Berat\t: "+55.55);;
           data.add(12 != 21);
           System.out.println("Ini adalah Arraylist\n==================");
           for(Object saya : data){
               System.out.println(saya);
           }
           // nilai vector
           System.out.println("\nIni adalah vector\n==================");
           tampung.add("Alamat\t: Campalagian");
           tampung.add("Saudara\t: "+3);
           for(Object aku : tampung){
               System.out.println(aku);
           }
       }
   }

