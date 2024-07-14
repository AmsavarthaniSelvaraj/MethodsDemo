import java.util.HashMap;

class Product{
    int id;
    String name;

Product(int id,String name){
    this.id=id;
    this.name=name;
}
public String toString(){
    return id + " : " + name;
}}

public class TaskHM2 {
    public static void main(String[] args) {
        HashMap <Integer,Product> map1=new HashMap<>();
        map1.put(101,new Product(101,"Laptop"));
        map1.put(102,new Product(102,"Mouse"));
        map1.put(103,new Product(103,"Keyboard"));
        System.out.println(map1);

        Integer productID=102;
        boolean found=map1.containsKey(productID);
        if(found){
            System.out.println("Exist in Hashmap" + " : " +productID);
        } else
        {
            System.out.println(" Not Exist in Hashmap" + " : " +productID);

        }

        map1.remove(103);
        System.out.println(map1);
    }
}



