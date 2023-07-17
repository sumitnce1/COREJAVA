package Thread;

class Ticket{
	public synchronized void display(String s) {
		for(int i=0; i<5;i++) {
			System.out.println("Display method");
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			System.out.println(s);
		}
	}
}
class MyThrea extends Thread{
	Ticket t;
	String name;
	MyThrea(Ticket t, String name){
		this.name=name;
		this.t=t;
	}
	public void run() {
		t.display(name);
	}
}
public class DemoSynchronized1 {

	public static void main(String[] args) {
		Ticket t=new Ticket();
		Ticket t1=new Ticket();
		MyThrea obj1= new MyThrea(t,"Sumit");
		MyThrea obj2= new MyThrea(t1,"System");
		obj1.start();
		obj2.start();

	}

}