/*public class DemoTask1 {
   //function
    void greeting(){
        System.out.println("Welcome");
    }
    void message(){
        System.out.println("Hi..,");
    }

    public static void main(String[] args) {
        DemoTask1 obj1=new DemoTask1();
        obj1.greeting();
        obj1.message();// function call aagudhu
*/

        public class DemoTask1 {
            //function
            void greeting(){
                System.out.println("Welcome");
                message();  //function inside la function call panirukom
            }
            void message(){
                System.out.println("Hi..,");
            }

            public static void main(String[] args) {
                DemoTask1 obj1=new DemoTask1();
                obj1.greeting();
            }
}
