import java.util.HashSet;

public class Set {
    public static void main(String[] args) {
        HashSet<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(4);
        System.out.println(set);
        set.remove(2);
        System.out.println(set);
        set.clear();
        System.out.println(set);

    }
}
