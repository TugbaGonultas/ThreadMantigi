import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadKontrolu {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5); //5 farklý thread çalýþtýrýlabilir
        

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new AnaThread("thread" + i, 3));
            executor.execute(thread); //gelen iþleri düzene sokar. hepsini gerçekleþtþrmez
        }
        executor.shutdown();//yeni iþin alýnmasýný durdurur
        executor.awaitTermination(10, TimeUnit.SECONDS);//belirli bir süre tanýnýr
        System.out.println("Done");
    }

}
