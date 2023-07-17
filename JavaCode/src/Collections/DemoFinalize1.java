package Collections;

public class DemoFinalize1 {

	public static void main(String[] args) {
		DemoFinalize1 obj =new DemoFinalize1();
		
//		String str=new String();
		obj.finalize();
		obj.finalize();
		obj=null;
		
//		str=null;
		System.gc();
		System.out.println("Main method");		
	}
	public void finalize(){
		System.out.println("Method Called");
	}

}
