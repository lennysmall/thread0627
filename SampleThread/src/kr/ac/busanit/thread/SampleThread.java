package kr.ac.busanit.thread;

public class SampleThread extends Thread{ //스레드 사용 1. 상속받는다.
	@Override
	public void run() {
		for(int i=0; i<30 ; i++){
			System.out.println(Thread.currentThread().getName()+" : "+i);
			try {
				Thread.sleep(1000); //1초
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
			
		}
		
	}
}
