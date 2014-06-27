package thread3;

public class SampleThread extends Thread{ //스레드 사용 1. 상속받는다.
	long sum;
	@Override
	public void run() {
		for(int i=1; i<=1_000_000_00 ; i++){
			sum+=i;
		}
	}
	
	public long getSum(){
		return sum;
	}
	
}
