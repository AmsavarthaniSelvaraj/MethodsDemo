
class Myclass{
   private String name;
   private int age;

     public String getname(){
        return name;
     }
     public void setname(String n){
         name=n;
     }
    public int getage(){
         return age;
}
public void setage(int a){
         age=a;
}
}
public class Encapsulation {

    public static void main(String[] args) {
     Myclass obj=new Myclass();
     obj.setname("Eniya");
     obj.setage(20);
        System.out.println(obj.getname()+" . "+obj.getage());
    }
}
