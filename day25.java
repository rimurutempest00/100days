
package seratushari;

public class day25 {
    public static void main(String[] args) {
        int aangka1 = 55, angka2 = 50, angka3 = 60;

        boolean perbandingan = aangka1 > angka2, persamaan = angka2 == angka2;
        boolean hasil = perbandingan && persamaan || angka3 > aangka1, hasil2 =  angka2 > angka3, hasil3 = angka2 == angka3;
        System.out.println(hasil+"\n"+hasil2+"\n"+hasil3);
    }
}
