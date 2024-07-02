public class Laptop {
    String name=" ";
    int price=0;
    int ram=0;


public static void main(String args[]) {
    Laptop lap1=new Laptop();
    lap1.name="lenovo";
    lap1.price=40000;
    lap1.ram=2;

    System.out.println(lap1.name);

    Laptop lap2=new Laptop();
    lap2.name="Hp";
    lap2.price=45000;
    lap2.ram=3;

    System.out.println(lap2.ram);

    Laptop lap3=new Laptop();
   // lap3.name="Dell";
    //lap3.price=55000;
    //lap3.ram=4;

    System.out.println(lap3.price);
}}
