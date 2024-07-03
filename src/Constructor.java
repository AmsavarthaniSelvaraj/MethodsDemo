public class Constructor {
    int marks;
    String name;

    Constructor(){
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        Constructor obj1=new Constructor();
        Constructor onb2=new Constructor();

        System.out.println(obj1.marks);
        System.out.println(obj1.marks);

    }


}
