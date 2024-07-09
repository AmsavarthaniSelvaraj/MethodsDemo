import java.util.HashSet;
import java.util.Iterator;

public class Hash {
    public static void main(String[] args) {
        HashSet<Integer>s1=new HashSet<>();
        s1.add(1);
        s1.add(2);
        s1.add(1);
       System.out.println(s1);
        s1.remove(2);
        System.out.println(s1);

    }
}
