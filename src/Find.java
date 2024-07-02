import java.util.Scanner;

public class Find {
    void addoreven(int num) {
        if (num % 2 == 0) {
            System.out.println("Even number");
        } else {
            System.out.println("Odd number");
        }
    }
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number:");
            int number = scan.nextInt();
            Find obj1 = new Find();
            obj1.addoreven(number);

    }
}
