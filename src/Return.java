public class Return {
    int getsoap(int money){
        int soap_price=30;
        int rem=50-30;
        return rem;
    }
    public static void main(String[] args) {
        Return obj1 = new Return();
        int rem = obj1.getsoap(50);   //parameterized non void function
        System.out.println(rem);
    }}


   /* int sum(int a,int b) {
        int c = a + b;
        return c;
    }
        public static void main(String args[]){
       Return obj1=new Return();
      int sum= obj1.sum(10,20);
            System.out.println(sum);
        }
    }*/



   /* String getname() {
        return "Eniya";
    }
    public static void main(String args[]){
        Return obj1=new Return();
       String myName = obj1.getname();
        System.out.println(myName);
    }
}*/













