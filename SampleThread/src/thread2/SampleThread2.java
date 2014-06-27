package thread2;

public class SampleThread2 extends Thread{ //스레드 사용 1. 상속받는다.
	static int sum;	//객체가 많이 만들어져도 변수가 하나만 존재함,  변수하나로 여러개가 접근
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
