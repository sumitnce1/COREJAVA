package Thread;

class MyThread extends Thread{
	public void start(int r) {
		System.out.println(r);
	}
	public void run() {
		System.out.println("Run Method");
	}
	

}
public class DemoThread1 {

	public static void main(String[] args) {
		MyThread obj=new MyThread();
		obj.start(87);
	}

}
