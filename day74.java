package day74;
class kendaraan{
    String merek;
    int keluaran;
    
    void tampilkaninfo(){
        System.out.println("Merek Kendaraan\t: "+merek+"\ntahun keluaran\t   : "+keluaran);
    }
}
public class day74 {
    
    public static void main(String[] args) {
        kendaraan mobil = new kendaraan();
        mobil.merek =" TOYOTA ";
        mobil.keluaran = 2024;
        mobil.tampilkaninfo();
        
    }
    
}
