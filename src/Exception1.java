public class Exception1 {
    public static void main(String[] args) {
        int a=12;
        int b=0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException E){
            System.out.println("b is 0");
        }

        finally{
            System.out.println("final block");
        }
        System.out.println("Hello");
    }
}
