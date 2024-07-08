interface MultipleInt{
    abstract void Dooropen();
    abstract void Doorclose();
}
interface MultipleSort{
    abstract void Dooropen();
    abstract void Doorclose();
}

 class MultipleByte implements MultipleInt,MultipleSort {
    public void Dooropen(){
        System.out.println("Door opened");
    }
     public void Doorclose(){
         System.out.println("Door closed");
    }

     public static void main(String[] args) {
         MultipleByte obj = new MultipleByte();
         obj.Dooropen();
         obj.Doorclose();
     }}
