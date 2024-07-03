public class DefaultConstructor {
    int marks;
    String name;

    public static void main(String[] args) {
        DefaultConstructor obj1=new DefaultConstructor();
        System.out.println(obj1.marks);   // constructor not created
        System.out.println(obj1.name);    // automatically call default constructor

    }
}
