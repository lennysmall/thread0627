package kr.ac.busanit.thread;

public class SampleRunnable implements Runnable{

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
