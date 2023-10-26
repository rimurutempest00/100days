
package seratushari;

public class day18 {
    public static void main(String[] args) {
        /*
        konversi type data primitif ke String
        kata kuncinya ada di .toString
        */
        int nilai = 100;
        short angka = 250;
        long angka1 = 560;
        byte angka2 = 127;
        float angka3 = 60.5f;
        double angka4 = 100.000;
        String c = Short.toString(angka)+"\t<-- ini Shor"+"\n"+Integer.toString(nilai)+"\t<-- ini Integer"+"\n"+Long.toString(angka1)+"\t<-- ini Long"+"\n"+Byte.toString(angka2)+"\t<-- ini Byte";
        String d = Float.toString(angka3)+"\t<-- ini Float"+"\n"+Double.toString(angka4)+"\t<-- ini Double";
        System.out.println(c+"\n"+d +"\n\n\b   SELAMAT MALAM : )\n");
        
        
    }
    
}
