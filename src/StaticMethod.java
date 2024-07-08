
class Father{
    char gender='M';
    static void print(){  // using static for access without creation of object
        System.out.println("Male");
    }}
    class Daughter extends Father{
        char gender='F';
        void display(){
           // System.out.println("Female");
        }
    }
    public class StaticMethod{
        public static void main(String[] args) {
       Daughter obj = new Daughter();
            System.out.println(obj.gender);
      Father.print();
    }
}
