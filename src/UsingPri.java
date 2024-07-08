public class UsingPri {
   private int num;
    private String name;
    public int getnum(){
        return num;
    }
    public void setname(int a){
        num=a;
    }
    public String getname(){
        return name;
    }
    public void setname(String b){
        name=b;
    }
    public static void main(String[] args) {
        UsingPri obj1=new UsingPri();
        obj1.setname(60);
        obj1.setname("Eniya");
        System.out.println(obj1.getnum());//+"."+obj1.getname());
        System.out.println(obj1.getname());

    }
}
