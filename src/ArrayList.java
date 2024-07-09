import java.util.LinkedList;
import java.util.Stack;

public class ArrayList {
    public static void main(String[] args) {
       LinkedList<Integer> list=new LinkedList<>();
       // Stack<Integer> list=new Stack<>();
        list.add(1);
        list.add(2);
        System.out.println(list);
        list.remove(0);
        System.out.println(list);

    }
}
