package seratushari;
import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class day96 {
    public static void main(String[] args) {
        JFrame judul = new JFrame("Data diri");
        Button klik = new Button ("Klik  saya");
        klik.setBounds(150, 200, 80, 30);
        
        klik.addActionListener( new ActionListener(){
            public void actionPerformed( ActionEvent e){
               String nama,alamat,nim;
               byte umur;
               nama = "Baharuddin";
               alamat = "Campalagian";
               nim = "D0223305";
               umur = 21;
                System.out.println("Nama\t: "+nama+"\nUmur\t: "+umur+" th"+"\nAlamat\t: "+alamat+"\nNim\t: "+nim);
            }
        });
        judul.setSize(400,500);
        judul.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        judul.setLocationRelativeTo(null);
        judul.setLayout(null);
        judul.setVisible(true);
        judul.add(klik);
    }
}
