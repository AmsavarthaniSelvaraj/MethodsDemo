public class Recursion {
    public static void main(String[] args) {
      natural(10);
    }
    public static void natural(int n){
        //base case
    if(n==1){
        System.out.println(1);
    } else {
        //recursive case
        System.out.println(n);
        natural(n-1);
    }
}}
