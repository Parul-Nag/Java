class TestMultiPriority extends Thread{
	public void run(){
	System.out.println("Running thread name is: "+ Thread.currentThread().getName());
	System.out.println("Running Thread Priority is "+ Thread.currentThread().getPriority());
 }
	public static void main(String args[]){
	TestMultiPriority m1=new TestMultiPriority();
	TestMultiPriority m2=new TestMultiPriority();
	m1.setPriority(Thread.MIN_PRIORITY);
	m2.setPriority(Thread.MAX_PRIORITY);
	m2.start();
	m1.start();
 }
}