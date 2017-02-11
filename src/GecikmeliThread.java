import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class GecikmeliThread {

	/**
	 * @param args
	 */
	public static void main(String[] args)  throws InterruptedException {
        ScheduledExecutorService pool = Executors.newScheduledThreadPool(5);
        AnaThread worker = new AnaThread("Thread 1", 3);
        pool.schedule(worker, 5, TimeUnit.SECONDS); //gecikmeli baþladý
        Thread.sleep(20000); 
        pool.shutdown();
    }

}
