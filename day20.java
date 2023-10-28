
package seratushari;

// Deklarasi type data final 
class update{
    final int a = 100;
    final byte c = 99;
}

public class day20 {
    
    public static void main(String[] args) {
        // tinggal memanggil classnya dan variabel nya dengan cara memperbaru

        int a = 5000;
        byte c = 127;
        
        update b = new update();
        update d = new update();
        System.out.println(b.a+"\n"+d.c);
     
        
    }
    
}
