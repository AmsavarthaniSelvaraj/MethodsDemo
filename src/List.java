import java.util.LinkedList;

public class List {
    public static void main(String[] args) {
        LinkedList<String> a1=new LinkedList<String>();
        a1.add("Eniya");
        a1.add("Agalya");
        a1.add("Abirami");

        a1.addFirst("Anu");
        a1.addLast("abi");
        System.out.println(a1);

        a1.removeFirst();
        a1.removeLast();

        System.out.println(a1);

        a1.getFirst();

        System.out.println(a1.getFirst());
    }

}
