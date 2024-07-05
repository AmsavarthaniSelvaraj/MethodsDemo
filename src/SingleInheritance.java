//single inheritance
/*class Animal{
    void A1(){
        System.out.println("This is Animal");//super class
    }
}

class Human extends Animal{
    void H1(){
        System.out.println("This is Human");//Derived class
    }
}
public class SingleInheritance {
    public static void main(String[] args) {
        Human obj1=new Human();
        obj1.H1();
        obj1.A1();
    }
}*/

//Multilevel inheritance
class Animal{
    void A1(){
        System.out.println("This is Animal");//super class
    }
}

class Human extends Animal{
    void H1(){
        System.out.println("This is Human");//Derived class
    }
}
class Insects extends Human{
    void I1(){
        System.out.println("This is Insects");
    }
}


public class SingleInheritance {
    public static void main(String[] args) {
        Insects obj1=new Insects();
        obj1.H1();
        obj1.A1();
        obj1.I1();
    }}