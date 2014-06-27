package thread3;

public class SampleRunnable implements Runnable{
	private static final Object key= new Object();
	//	private static final String = "key";
//	volatile long sum; //이것만 하면 sum동기화 변수로 씀 생각해볼것
	long sum;
	@Override
	public void run() {
		for(int i=1; i<=1_000_000_0 ; i++){
//			synchronized (key) {
//				sum+=i;	
			add(i);
			}
		}
	public synchronized void add(int i){
		sum += i;
	}
	public long getSum(){
		return sum;
	}

}
