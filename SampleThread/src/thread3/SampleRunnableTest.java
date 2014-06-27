package thread3;

public class SampleRunnableTest {
	public static void main(String[] args) {
		SampleRunnable r = new SampleRunnable();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		Thread th3 = new Thread(r);
		
		th1.start();
		th2.start();
		th3.start();
		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
				
		System.out.println(r.getSum());
	}
}
