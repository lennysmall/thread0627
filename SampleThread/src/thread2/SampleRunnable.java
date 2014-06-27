package thread2;

public class SampleRunnable implements Runnable{
	int sum;
	@Override
	public void run() {
		for(int i=1; i<=10 ; i++){
			sum+=i;
			System.out.println(Thread.currentThread().getName()+" : "+i+"까지의 합은 :"+ sum);
			try {
				Thread.sleep(1000); //1초
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
			
		}
	}

}
