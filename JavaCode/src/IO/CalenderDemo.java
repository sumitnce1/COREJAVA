package IO;
import java.util.Date;
import java.util.Calendar;
public class CalenderDemo {

	public static void main(String[] args) {
		Date obj = new Date();
		System.out.println(obj);
		
//		System.out.println(Calendar.getInstance());
		Calendar d= Calendar.getInstance(); //create object
		
//		System.out.println(d);

//		System.out.println(d.getTime());
		System.out.println(d.get(Calendar.MONTH));
		System.out.println(d.get(Calendar.DATE));
		System.out.println(d.get(Calendar.MINUTE));
		System.out.println(d.get(Calendar.SECOND));
	}

}



