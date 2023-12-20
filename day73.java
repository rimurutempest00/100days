package day73;

public class day73 {
    private String jenis;
    
    public day73 (String jenis){
        this.jenis = jenis;
        
    }
    public void jenisBuah(){
        System.out.println("Ini adalah : "+jenis);
    }
    class banyak{
        private int jumlah;
        public banyak(int jumlah){
            this.jumlah = jumlah;
        }
    
    public void total(){
        System.out.println("Banyak buah "+jumlah+" Berjenis "+jenis);
    }
    }
    public static void main(String[] args) {
        day73 ada = new day73("Apel");
        ada.jenisBuah();
        day73.banyak buah = ada.new banyak(20);
        buah.total();
    }
    
}
