package seratushari;
public class day62 {
    public static void main(String[] args) {
        String nama ="Nama\t:Baharuddin-umur\t:21th-Alamat\t:Campalagian-Status\t:Mahasiswa-SEMOGA BAHAGIA ";
        String [] split = nama.split("-");
        for (String data : split) {
            System.out.println(data);
            
        }
    }
}
