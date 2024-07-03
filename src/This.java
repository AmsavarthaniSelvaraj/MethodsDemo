public class This {
    String myname;;

This(){
    System.out.println("Hello");
}
void display(String myname){
    this.myname=myname;
 // obj1.display=Eniya
}
    public static void main(String[] args) {
        This obj1=new This();
        obj1.display("Eniya");
        System.out.println(obj1.myname);
    }
}
