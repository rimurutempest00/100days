package seratushari;
public class day40 {
    //prosedur
    
    public static void data_diri(){//metod tampa parameter
        String nama,alamat,status,noWa;
        byte  umur;
        nama = "Baharuddin";
        alamat = "Polewali mandar";
        status = "Mahasiswa";
        noWa = "082192445687";
        umur = 20;
        System.out.println("Nama\t : "+nama+"\nUmur\t : "+umur+" th"+"\nAlamat\t : "+alamat+"\nStatus\t : "+status+"\nnoWa\t : "+noWa);
    }
    public static void main(String[] args) {
       data_diri();//untuk menampilkan data yang berada dalam prosedur
        System.err.println("\n\tSEMOGA BAHAGIA");
    }
    
}
