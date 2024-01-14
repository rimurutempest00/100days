package seratushari;
public class day98 {
    String nama;
    int  umur;
    String alamat;
    public day98(String nama,int umur,String alamat){
    this.nama = nama;
    this.umur = umur;
    this.alamat = alamat;
    }
    public void tampil(){
        System.out.println("Nama\t: "+nama);
        System.out.println("Umur\t: "+umur);
        System.out.println("Alamat\t: "+alamat);
    }
    public static void main(String[] args) {
        day98 nama = new day98("Bahar",21,"Campalaggian");
        nama.tampil();
    }
}
