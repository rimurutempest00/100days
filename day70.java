package seratushari;
public class day70 {
    public String nama,nim;
    public int umur;
    public String namaSaya(){
        return nama;
    }
    public void namaku(String nama){
        this.nama = nama;
    }
     public String nimSaya(){
        return nim;
    }
    public void nimku(String nim){
        this.nim = nim;
    }
     public int umurSaya(){
        return umur;
    }
    public void umurku(int umur){
        this.umur = umur;
    }
    public static void main(String[] args) {
        day70 a = new day70();
        a.namaku("Baharuddin");
        a.nimku("D0223305");
        a.umurku(21);
        System.out.println("Nama\t: "+a.namaSaya()+"\nNim\t: "+a.nimSaya()+"\nUmur\t: "+a.umurSaya());
        
    }
  
}
