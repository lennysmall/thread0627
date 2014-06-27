package thread2;

public class SampleThread extends Thread{ //스레드 사용 1. 상속받는다.
	int sum;
	@Override
	public void run() {
		for(int i=1; i<=10 ; i++){
			sum+=i;
			
			System.out.println(Thread.currentThread().getName()+" : "+i+"까지합은: "+ sum);
					
			try {
				Thread.sleep(1000); //1초
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			} 
			
		}
		
	}
}
