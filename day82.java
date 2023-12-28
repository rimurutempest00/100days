package day82;
import java.util.LinkedList;
public class day82 {
    
    public static void main(String[] args) {
        LinkedList <String> dia = new LinkedList <>();
        dia.add("Semoga Kamu bahagia bersamanya :)");
        if(dia.isEmpty()){//mengecek apakah si parianel ruanh ini memlili niali atau tidak
            System.out.print("Kosong");//ini akan di tampilkan ketila variabel riang tidak memiliki nilai
        }else{
            System.out.print("tidak Kosong \nada nilai "+dia);//di tampilkan ketika varianel memiki nilai contohnya ruang("Semoga Kamu bahagia bersamanya :)")
        }
    }
    
}
