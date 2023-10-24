
package seratushari;
import java.math.BigDecimal;
public class day16 {
     public static void main(String[] args) {
         BigDecimal a,b,c,d,e,f,g;
         a = new BigDecimal("100.000000");
         b = new BigDecimal("150.000000");
         c = new BigDecimal("160.000000");
         d = new BigDecimal("170.000000");
         
         e = a.add(b).add(c).add(d).subtract(d);// (a) tmbah (b) tambah (c) tambah (d) di kurang (d)
         f = a.multiply(b).multiply(c).multiply(d);// (a) kali (b) kali (c) kali (d)
         g =( a.multiply(d)).divide(a);// (a) dikalikan dengan (d) terus di bagi dengan (a)
         System.out.println(e+"\n"+f+"\n"+g);
         
    }
    
    
}
