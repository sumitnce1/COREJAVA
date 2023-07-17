package Thread;

class MyTh1 extends Thread{
	public void run() {
		try {
			for(int i=0;i<10; i++) {
				System.out.println("Child Thread");
				Thread.sleep(2000);
			}
		} catch (InterruptedException e) {
			System.out.println("Got Interupeted");
		}
	}
}
public class DemoThread5 {

	public static void main(String[] args) {
		MyTh1 obj =new MyTh1();
		obj.start();
//		obj.interrupt();
		System.out.println("Main Method");
	}
}
