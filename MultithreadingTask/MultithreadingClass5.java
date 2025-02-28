package MultithreadingTask;
//Synchronized keyword  (thread safe)

class Counter{
	private int count;
	
	public synchronized void increment() {
		count=count+1;
	}
	public int getCount() {
		return count;
	}
}
public class  MultithreadingClass5 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		Counter counter=new Counter();//instance of the class
		
		Thread tr1=new Thread(  ()->
		 {
			     for(int i=1;i<=10000;i++) {
					 counter.increment();
				}
		 });
		 tr1.start();

		 
		 Thread tr2=new Thread(  ()->
		 {
			     for(int i=1;i<=10000;i++) {
			    	 counter.increment();
				}
		 });
		 tr2.start();
		 
		 tr1.join();
		 tr2.join();
		 System.out.println(counter.getCount());
		 

	}

}
