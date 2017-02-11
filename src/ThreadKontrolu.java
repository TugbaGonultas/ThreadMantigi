import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadKontrolu {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5); //5 farkl� thread �al��t�r�labilir
        

        for (int i = 0; i < 20; i++) {
            Thread thread = new Thread(new AnaThread("thread" + i, 3));
            executor.execute(thread); //gelen i�leri d�zene sokar. hepsini ger�ekle�t�rmez
        }
        executor.shutdown();//yeni i�in al�nmas�n� durdurur
        executor.awaitTermination(10, TimeUnit.SECONDS);//belirli bir s�re tan�n�r
        System.out.println("Done");
    }

}
