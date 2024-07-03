
class Friend1{
    int money=50000;
    String book="Story";
}

class Friend2 extends Friend1 {

}
public class Inheritance {
    public static void main(String[] args) {
       Friend2 obj1=new Friend2();
        System.out.println(obj1.money);
        System.out.println(obj1.book);
    }
}
