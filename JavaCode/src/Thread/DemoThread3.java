package Thread;
class MyThread1 extends Thread{
public void run() {
	for(int i=0; i<=10;i++) {
		System.out.println("Thread1");
		Thread.yield();
	}
   }
}
public class DemoThread3 {

	public static void main(String[] args) {
		MyThread1 obj =new MyThread1();
//		obj.setPriority(5);
//		System.out.println(obj.getPriority());
		obj.start();
		for(int i=0; i<=10; i++) {
			System.out.println("Main method");
		}
	}
}
