package string;

public class DisNum{
	void disData(int n){
        System.out.println("Integer Data Type: "+n);
    }
	void disData(long n){
        System.out.println("Long Data Type: "+n);
    }
	void disData(float n){
        System.out.println("Float Data Type: "+n);
    }
	void disData(double n){
        System.out.println("Double Data Type: "+n);
    }
	void disData(char ch){
        System.out.println("Character Data Type: "+ch);
    }
	void disData(String str){
        System.out.println("String Data Type: "+str);
    }

	public static void main(String[] args){
		DisNum obj = new DisNum();	
		obj.disData(50);
		obj.disData(50L);
		obj.disData(70.0f);
		obj.disData(70.0);
		obj.disData('S');
		obj.disData("SUMIT KUMAR");
		
	}
}
