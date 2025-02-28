package MultithreadingTask;
/*Multithreading-Individual unit of a process
 * Why? for doing multiple sub process at a time and completely utilizing the CPU.
 * Implementing MultiThreading in Java
 *    1.using Thread Class
 *    2.using Runnable Interface
 */
class class1 extends Thread{
	public void run() {                //override
		for(int i=1;i<=5;i++) {
			System.out.println("First Loop"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}

class class2 extends Thread{
	public void run() {               //override
		for(int i=1;i<=5;i++) {
			System.out.println("Second Loop"+i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}


public class MultiThreadingClass1 {

	public static void main(String[] args) {
		class1 obj1=new class1();
		class2 obj2=new class2();
		
		obj1.run();   //this object calls entire loop to exist directly
	    obj2.run();   //this object starts exist when the first object finishing the process of execution
	    
	    //for both operation running simultaneously, we call START() method,which is seraching to executes its own run()
	    System.out.println();
	    obj1.start();
	    try {Thread.sleep(500);} catch (Exception e) {e.printStackTrace();}//it waits for second process to start
	    obj2.start();
	
	
	}

}
