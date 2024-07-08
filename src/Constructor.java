public class Constructor {
   /* int marks=56;
    String name="E";*/
   int marks;
    String name;

    Constructor(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Constructor obj1=new Constructor();
        Constructor obj2=new Constructor();

        System.out.println(obj1.marks);
        System.out.println(obj1.name);

    }


}
