abstract class Method{
    void display(){
        System.out.println("Hello");
    }
        }
        class Function extends Method{
    void display1(){

    }
        }
        public class AbstractClass {
    public static void main(String[] args) {
Function obj1=new Function();
obj1.display();
    }
}
