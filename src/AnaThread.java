
public class AnaThread implements Runnable{
	private int son;
	private String ad;
	
	public AnaThread(String ad, int son){
		this.ad = ad;
		this.son = son;
	}

	public void run() {
		// TODO Auto-generated method stub
		for (int i=0; i<son; i++)
			System.out.println(ad+ ":"+ i);
	}
}
