import java.util.ArrayList;
import java.util.Iterator;
public class Iterat {
    public static void main(String[] args) {
        ArrayList<String> a1=new ArrayList<>();
        a1.add("Hello");
        a1.add("Welcome");
        System.out.println(a1);
        Iterator s1 = a1.iterator();//traverse the elements
        while(s1.hasNext()){
            System.out.println(s1.next());
        }

    }
}
//Write a Java program to iterate through all elements in a list.
