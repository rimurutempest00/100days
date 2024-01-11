package seratushari;
import java.awt.Frame;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class day95 {
    public static void main(String[] args) {
        Frame saya = new Frame("Buku Saya");
        Button klik = new Button ("Klik  saya");
        klik.setBounds(150, 200, 80, 30);
        
        klik.addActionListener( new ActionListener(){
            public void actionPerformed( ActionEvent e){
                System.err.println("ARIGATO :)");
            }
        });
         saya.add(klik);
         saya.setSize(400,400);
         saya.setLayout(null);
         saya.setVisible(true);
         
        
    }
 
}
