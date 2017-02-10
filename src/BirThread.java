
public class BirThread {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new AnaThread("thread1", 4));
		Thread thread2 = new Thread(new AnaThread("thread2", 5));
		 thread1.start();
		 thread2.start();
	}

}
