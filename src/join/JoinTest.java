package join;

/**
 * Description: 现在有T1、T2、T3三个线程，你怎样保证T2在T1执行完后执行，T3在T2执行完后执行？
 * 
 * @author ZZB
 * @created 2014-5-27 上午11:33:44
 */
public class JoinTest {

	public static void main(String[] args) throws InterruptedException {

		Thread t1 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("t1:" + i);
				}
			}
		});
		Thread t2 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("t2:" + i);
				}
			}
		});
		Thread t3 = new Thread(new Runnable() {

			@Override
			public void run() {
				for (int i = 0; i < 30; i++) {
					System.out.println("t3:" + i);
				}
			}
		});
		
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
	}

}
