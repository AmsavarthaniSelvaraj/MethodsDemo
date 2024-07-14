import java.util.HashMap;

public class TaskHM3 {
    public static void main(String[] args) {
        HashMap<String,Double> map2=new HashMap<>();
        map2.put("Alice",85.5);
        map2.put("Bob",90.0);
        map2.put("Charlie",75.5);
        map2.put("David",88.0);
        System.out.println(map2);

        String studentName="Charlie";
        boolean found=map2.containsKey(studentName);
        if(found){
            System.out.println("Student name is present" + "  ; " + studentName);
        } else
        {
            System.out.println("Student name is Not present" + "  ; " + studentName);

        }

        map2.remove("Bob");
        System.out.println(map2);
    }
}




/*Write a Java program to manage a HashMap of student grades, where each student's name (string) is the key and their grade (double) is the value.

Create a HashMap to store student names as keys and grades as values.
Add the following entries to the HashMap:
Name "Alice", Grade 85.5
Name "Bob", Grade 90.0
Name "Charlie", Grade 75.5
Name "David", Grade 88.0
Print all entries (Name and Grade) in the HashMap.
Check if the HashMap contains a student named "Charlie".
Remove the student named "Bob" from the HashMap.
Print all entries in the HashMap after removal.*/








