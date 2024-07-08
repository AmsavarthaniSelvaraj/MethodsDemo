interface UsingInt{
    abstract void Dooropen();
    abstract void Doorclose();
        }
        class Interface implements UsingInt {
    public void Dooropen(){
        System.out.println("Door opened");
    }
public void Doorclose(){
    System.out.println("Door closed");
}

     public static void main(String[] args) {
         Interface obj=new Interface();
         obj.Dooropen();
         obj.Doorclose();
     }
}
