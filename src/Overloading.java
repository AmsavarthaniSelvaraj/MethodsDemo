public class Overloading {

    // same functions with different parameters
    void display(int a){
        System.out.println("Hello world");
    }
    void display(int a ,int b){
        System.out.println("Welcome to java");
    }
    public static void main(String[] args) {
Overloading obj1=new Overloading();
obj1.display(23,45);
    }
}
