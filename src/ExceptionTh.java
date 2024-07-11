public class ExceptionTh {
    void checkage(int age){
        if(age<18){
            throw new ArithmeticException("Access denied");
        } else {
            System.out.println("Access granted");
        }}
          public static void main(String args[]){
        ExceptionTh obj = new ExceptionTh();
            obj.checkage(17);
        }
    }

