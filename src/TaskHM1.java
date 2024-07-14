import java.util.HashMap;

public class TaskHM1 {
    public static void main(String[] args) {
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Alice");
        map.put(2,"Bob");
        map.put(3,"David");
        map.put(4,"Charlie");
        System.out.println(map);

        Integer studentID=2;
        boolean found=map.containsKey(studentID);
        if(found){
            System.out.println(studentID + " : " + "Having Student ID");
        } else
        {
            System.out.println(studentID + "  : " + "Not Having");
        }

        map.remove(3);
        System.out.println(map);


    }
}

