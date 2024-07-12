import java.util.ArrayList;
public class SetArray {
    public static void main(String[] args) {
        ArrayList<String> s1=new ArrayList<>();
        s1.add("123");
        s1.add("456");
        s1.add("789");
        System.out.println(s1);
        s1.set(1,"101");
        System.out.println(s1);


    }
}
//Write a Java program to create a set of integers, add some elements, and print the set.