package seratushari;
import java.util.LinkedList;
import java.util.Queue;
public class day93 {
    public static void main(String[] args) {
        Queue <String> a = new LinkedList<>();
        a.add("aku");
        a.add("kamu");
        System.out.println("awal kisah : "+a);
        a.offer("dia");
        System.out.println("Setelah dia hadir : "+a);
        a.poll();
        System.out.println("Setelah kamu suka dia : "+a);
        a.remove("dia");
        System.out.println("dan pada akirnya yang tersisa hanya : "+a);
        System.out.println("\nSEKIAN DAN TERIMAKASIH :)\n");
    }
}
