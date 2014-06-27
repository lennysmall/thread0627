package thread3;

public class SampleThreadTest {
	public static void main(String[] args) {
		SampleThread th1 = new SampleThread();
		SampleThread th2 = new SampleThread();
		SampleThread th3 = new SampleThread();

		th1.start();
		//		th1.run(); //런은 이거끝나야 밑에꺼 실행을 동시에 시킴. 메인 혼자다 잡음. 단일 스레드기능
		th2.start();
		th3.start();

		try {
			th1.join();
			th2.join();
			th3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		long result = th1.getSum()+th2.getSum()+th3.getSum();
		System.out.println(result);
	}
}
