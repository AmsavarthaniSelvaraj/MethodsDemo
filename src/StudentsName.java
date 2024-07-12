import java.util.ArrayList;
import java.util.Iterator;


public class StudentsName {
    public static void main(String[] args) {
        ArrayList<String> s1=new ArrayList<>();
        s1.add("Anu");
        s1.add("Abi");
        s1.add("Ram");
        s1.add("Mani");
        s1.add("Raj");
        System.out.println(s1);
        s1.get(2);
        System.out.println(s1.get(2));
        s1.set(3,"Renu");
        System.out.println(s1);
        s1.remove(1);
        System.out.println(s1);

        String nameToCheck="Mani";
        boolean found = s1.contains(nameToCheck);
        System.out.println(s1);
        if(found){
            System.out.println(nameToCheck+"Student name is present in this list");
        } else
        {
            System.out.println(nameToCheck+"Not present");
        }
        Iterator a1=s1.iterator();

        while (a1.hasNext()){
            System.out.println(a1.next());
        }
        System.out.println(s1.size());
        s1.clear();
        System.out.println(s1);

        System.out.println("list after clearing:"+s1);
        System.out.println("size after clearing:"+s1.size());
    }

    }

