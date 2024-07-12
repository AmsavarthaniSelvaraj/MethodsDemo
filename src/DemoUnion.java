import java.util.HashSet;

public class DemoUnion {
    public static void main(String[] args) {
        HashSet<Integer> set1=new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        HashSet<Integer> set2=new HashSet<>();
        set2.add(4);
        set2.add(5);
        set2.add(3);

        System.out.println(set1);
        System.out.println(set2);

        HashSet<Integer> UnionSet=new HashSet<>(set1);
        UnionSet.addAll(set2);

        System.out.println(UnionSet);


    }
}
//4.Write a Java program to remove duplicates from a list using a set.