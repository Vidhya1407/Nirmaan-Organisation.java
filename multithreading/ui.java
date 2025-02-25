package multithreading;

public class ui {

	public static void main(String[] args) {
		example e=new example() {
    		public void loop() {
    			for(int i=1;i<=10;i++) {
    				System.out.println("Loop "+i);
    			}
    		}
    	};
    	e.loop();
		

	}

}
