
public class OncelikBelirleme {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thread1 = new Thread(new AnaThread("thread1", 2));
		Thread thread2 = new Thread(new AnaThread("thread2", 4));
		Thread thread3 = new Thread(new AnaThread("thread3", 6));
		thread3.setPriority(Thread.MAX_PRIORITY); 
		thread2.setPriority(Thread.MIN_PRIORITY);
		thread1.setPriority(Thread.MIN_PRIORITY);
		thread1.start();
		thread2.start();
		thread3.start();
	}

}
