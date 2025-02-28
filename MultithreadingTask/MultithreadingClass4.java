package MultithreadingTask;
/*
 * join()--Waits for this thread to terminate
 * isAlive()--Checks currently executes or not,return boolean
 * getState()
 */
public class MultithreadingClass4 {

	public static void main(String[] args) throws InterruptedException {
//thread obj 1		
		Thread tr1=new Thread(  ()->//directly inserts the process
		 {
			     for(int i=1;i<=10;i++) {
					 System.out.println("Hi ");
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
		 },"First thread");//we can add the threadname hera also
		
		 System.out.println("Thread 1 state is "+tr1.getState());

		 tr1.start();
		 System.out.println("Thread 1 state is "+tr1.getState());
		 
	     try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}
//thread obj 2
		 Thread tr2=new Thread(  ()->//directly inserts the process
		 {
			     for(int i=1;i<=10;i++) {
					 System.out.println("Hello");
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
		 });
		 tr2.start();
		 
		 
		 System.out.println("Thread 1 execution : "+tr1.isAlive());//check the status alive or not 
		 
		 tr1.join();
		 
		 System.out.println("Thread 1 state is "+tr1.getState());

		 tr2.join();//Waits for this thread to terminate
		 
		 System.out.println("Good Morning...");

		 
		 System.out.println("Thread 1 execution : "+tr1.isAlive());
		 
		 System.out.println("Default Thread 1 name= "+tr1.getName());
		 System.out.println("Default Thread 2 name= "+tr2.getName());
		 
		 tr1.setName("Namma thread");
		 System.out.println("after setting Thread 1 name= "+tr1.getName());
         
		 System.out.println ("Thread 1 priority : "+tr1.getPriority());


	
	

	}

}
