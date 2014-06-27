package thread4;

public class SampleRunnable implements Runnable{
	@Override
	public void run() {
		int i=0;
		
		while(!Thread.currentThread().isInterrupted()){
			i++;
			System.out.println(i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				//인터렙트는 대기나 슬립상태에서만 발생
				System.out.println("인터렙트 요청에 의하여 종료");
				break;
			}
		}
}
}