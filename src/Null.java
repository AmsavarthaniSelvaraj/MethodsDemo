import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Null {
    public static void main(String[] args) {
        int arr[]=null;
        int a=1;
        try{
            System.out.println(arr[1]);
        }
        catch(ArithmeticException e){  //also use or '|' operator
            System.out.println("Arithmetic occured");
        }
        catch(NullPointerException e){
            System.out.println("Null point occured");
        }
        File file = new File("abc.text");
        try {
            FileInputStream obj = new FileInputStream(file);
        }
        catch(FileNotFoundException e){
            System.out.println("Not found");
        }
        System.out.println(a);
        System.out.println("Hello");

        Scanner input=new Scanner(System.in);
        int number= input.nextInt();
        System.out.println(input);


    }
}
