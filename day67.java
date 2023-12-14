package ay67;

public class day67 {
    
    public static void main(String[] args) {
         // StringBuffer deleteCharAt()
        StringBuffer baru = new StringBuffer("Terimaksasih : )");
        System.out.println("Sebelum : " + baru);
        baru.deleteCharAt(7);
        System.out.println("sesudah : " + baru);

        // StringBuilder deleteCharAt(
        StringBuilder aku = new StringBuilder("Ariygato :),");
        System.out.println("Sebelum: " + aku);
        aku.deleteCharAt(3);
        System.out.println("Setelah : " + aku);
    }
    
}
