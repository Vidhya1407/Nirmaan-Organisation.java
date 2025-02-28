package MultithreadingTask;

//We know  Runnable interface is a FunctionalInterface.So, we can go with LambdaExpression-->
public class MultithreadingClass3 {

	public static void main(String[] args) {
	//USING RUNNABLE REFERENCE	
		//We can't create runnable object.But, able to create obj Reference.
		Runnable object=()->{
		//defaultely overrides the run() fron Runnable interface.
				for(int i=1;i<=10;i++) {
					System.out.println("Runnable Ref  "+i);
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
		 };
		 //create object for thread ,which is invoking the run() method.
		 Thread threadObject=new Thread(object);//passing the object to runnable interface
		 threadObject.start();
		 
		 try {Thread.sleep(500);} catch (InterruptedException e) {e.printStackTrace();}

			
	//USING THREAD CLASS OBJECT
		 Thread tr1=new Thread(  ()->//directly inserts the process
		 {
			     for(int i=1;i<=10;i++) {
					 System.out.println("Thread class loop "+i);
					try {Thread.sleep(1000);} catch (InterruptedException e) {e.printStackTrace();}
				}
		 });
		 tr1.start();
	}
}
