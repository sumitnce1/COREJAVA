/* 4.A boy has his money deposited Rs10000, Rs15000 and Rs20000 in banks-Bank A, Bank B and Bank C respectively.  We have to print the money deposited by 
 * him in a particular bank.Create a class 'Bank' with a method 'getBalance' which returns 0. Make its three subclasses named
 *   'BankA', 'BankB' and 'BankC' with a method with the same name 'getBalance' which returns the amount deposited in 
 *   that particular bank.  Call the method 'getBalance' by the object of each of the three banks */
package Assignment6;

class Bank{
    public int getBalance(){
        return 0;
    }
}
class BankA extends Bank{
    int bal=10000;    
    public int getBalance(){
        return bal;
    }
}
class BankB extends Bank{
    int bal=15000;    
    public int getBalance(){
        return bal;
    }
}
class BankC extends Bank{
    int bal=20000;    
    public int getBalance(){
        return bal;
    }
}
public class MoneyDeposite4 {

	public static void main(String[] args){
		BankA ba= new BankA();
        BankB bb= new BankB();
        BankC bc= new BankC();        
        System.out.println("Money deposited BankA:" +ba.getBalance()+"Rupees" );
        System.out.println("Money deposited BankB:" +bb.getBalance()+"Rupees");
        System.out.println("Money deposited BankC:" +bc.getBalance()+"Rupees");
	}
}
