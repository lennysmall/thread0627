package thread4;
//스레드 종료방법 권장식
public class SampleRunnableTest {
	public static void main(String[] args) {
		Thread th = new Thread(new SampleRunnable());
		
		System.out.println(th.getState().name());
		int cnt=0;
		th.start();
		System.out.println(th.getState().name());
		
		while(!th.getState().name().equals("TERMINATED")){
			cnt++;
			if(cnt<50)th.interrupt();
			System.out.println(th.getState().name());
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
		System.out.println(th.getState().name());
	}
}
