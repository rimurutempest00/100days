
package seratushari;

public class day26 {
    public static void main(String[] args) {
        byte angka, angka1,angka2,angka3;
        angka = 20;
        angka1 = 35;
        angka2 = 40;
        angka3 = 50;
        
        if ((angka > angka1 && angka3 > angka2) ||( angka1 < angka2 && angka < angka1 ) ) {
            System.out.println("benar");   
        }else{
            System.out.println("Salah");
        }
        // (angka > angka1 && angka3 > angka2) salah satu nilainya bernilai false
        // ( angka1 < angka2 && angka < angka1 ) dua duanya bernilai true
        // (angka > angka1 && angka3 > angka2) ||( angka1 < angka2 && angka < angka1 )
        // menggunakan || = atau
        // jadi ketika salah satunya bernilai true maka hasilnya true
    }
    
}
