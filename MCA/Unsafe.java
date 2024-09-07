class Reserve implements Runnable{
    int available=1;
    int wanted;
    Reserve(int i){
        wanted=i;
    }
    public void run(){
        System.out.println("Available Births= "+available);
        if(available>=wanted){
            String name=Thread.currentThread().getName();
            System.out.println(wanted+" Births reserved for "+name);
            try{
                Thread.sleep(1500);
                available=available-wanted;
            }
            catch(InterruptedException ex){

            }
        }
        else
            System.out.println("Sorry, No Births available");
    }
}
public class Unsafe {
    public static void main(String a1[]){
        Reserve obj=new Reserve(1);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
