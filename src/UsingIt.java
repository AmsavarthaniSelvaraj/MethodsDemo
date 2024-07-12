import java.util.ArrayList;
import java.util.Iterator;

public class UsingIt {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        arr.add("Eniya");
        arr.add("Agalya");
        System.out.println(arr);

        Iterator s1 = arr.iterator();

        while (s1.hasNext()) {
            System.out.println(s1.next());
        }
    }
}

