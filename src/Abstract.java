abstract class Door{
    abstract void opendoor();
   void closedoor(){
        System.out.println("Door closed");
    }
}
class Window extends Door{
    void closedoor(){
        System.out.println("Door closed-1");
    }
    void opendoor(){
        System.out.println("Door opened");
    }
}
class Window1 extends Door {
    void opendoor(){
        System.out.println("Door opened-1");
    }
}
public class Abstract{
    public static void main(String[] args) {
        Window obj1=new Window();
        obj1.closedoor();
        obj1.opendoor();

        Window1 obj2=new Window1();
        obj2.closedoor();
        obj2.opendoor();


    }
}





