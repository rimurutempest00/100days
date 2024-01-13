package day97;

public class Main {
    
    public static void main(String[] args) {
        int angka,penjumlah,alahasil;
        angka = 21;
        penjumlah = 19;
        alahasil = Jumlah (angka,penjumlah);
        System.out.println("hasil dari penjumlahan \n"+angka+" + "+penjumlah+" = "+alahasil);
        
    }
    public static int Jumlah(int x,int y){
        int hasil = x + y;
        return hasil;
    }
    
}
