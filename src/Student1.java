public class Student1 {
        int marks;
        String name;

        Student1(int a,String b){
            marks=a;
            name=b;
        }

        public static void main(String[] args) {
            Student1 obj1=new Student1(55,"Eniya");//argument pass value initialize
           Student1 obj2=new Student1(79,"Agalya");
            System.out.println(obj1.marks);
            System.out.println(obj2.name);


        }
    }

