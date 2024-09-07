class Reserve1 implements Runnable{
    int available=1;
    int wanted;
    Reserve1(int i){
        wanted=i;
    }
    public void run(){
        synchronized(this){ 
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
}
public class Safe {
    public static void main(String a1[]){
        Reserve1 obj=new Reserve1(1);
        Thread t1=new Thread(obj);
        Thread t2=new Thread(obj);
        t1.setName("First Person");
        t2.setName("Second Person");
        t1.start();
        t2.start();
    }
}
