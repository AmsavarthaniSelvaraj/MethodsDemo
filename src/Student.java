/*public class Student {
    int marks;
    String name;

    Student(int a){
        System.out.println(a);
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Student obj1=new Student(10); //argument pass

    }
}*/

public class Student {
    int marks;
    String name;
       //Constructor overloading
    Student(){
        System.out.println("Hi");
    }
    Student(int a){
        System.out.println(a);
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Student obj1=new Student(10); //argument pass
        //Student obj2=new Student(); // no argument pass

    }
}

