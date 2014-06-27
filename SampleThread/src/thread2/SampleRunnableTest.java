package thread2;

public class SampleRunnableTest {
	public static void main(String[] args) {
		Runnable r = new SampleRunnable();
		Thread th1 = new Thread(r);
		Thread th2 = new Thread(r);
		Thread th3 = new Thread(r);
		
		th1.start();
		th2.start();
		th3.start();
	}
}
