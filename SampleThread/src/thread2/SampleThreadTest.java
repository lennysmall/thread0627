package thread2;

public class SampleThreadTest {
	public static void main(String[] args) {
		SampleThread2 th1 = new SampleThread2();
		SampleThread2 th2 = new SampleThread2();
		SampleThread2 th3 = new SampleThread2();
		
		th1.start();
//		th1.run(); //런은 이거끝나야 밑에꺼 실행을 동시에 시킴. 메인 혼자다 잡음. 단일 스레드기능
		th2.start();
		th3.start();
	}
}
