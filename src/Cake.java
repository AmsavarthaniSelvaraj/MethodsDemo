 class Cake extends Thread {
public void run(){
    System.out.println("Mixing Ingredient for cake"+Cake.currentThread()+getId());
    System.out.println("Baking cake"+Cake.currentThread()+getId());
    System.out.println("Decorating cake"+Cake.currentThread()+getId());
}}
class ThreadBaking{
    public static void main(String[] args) {
        int cakeCount=4;
        for(int i=0;i<cakeCount;i++){
        Cake a1=new Cake();
        a1.start();
    }
}}

