public class UsingPub {
    int num;
    char grade='A';
    String name="Eniya";
    double percentage=9.88;
    UsingPub(int a){
        num=a;
    }
    public static void main(String[] args) {
        UsingPub obj1=new UsingPub(10);
        obj1.name="Agalya";
        System.out.println(obj1.num);
        System.out.println(obj1.name);
        System.out.println(obj1.grade);
        System.out.println(obj1.percentage);

    }
}
