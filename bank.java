package sample;
import java.util.Scanner; 
class basicAccount{
	String name;
	float balance,interest,minBal=10000;
	basicAccount(){
		System.out.println("Welcome Mrinalini");
	}
	
	
}
class sbAcc extends basicAccount{
	sbAcc(int bal,String nam){
		balance = bal;
		name = nam;
	}
	void checkBal1(){
		if(balance<minBal){
			System.out.println("low balance!! ");
			balance = balance - ((10*minBal)/100);
			System.out.println(name+" ur savings account balance is Rs."+balance);
		}
		else{
			balance = balance + ((6*balance)/100);
			System.out.println(" ur savings account balance is Rs."+balance);
		}
	}
}
class salAcc extends basicAccount{
	salAcc(int bal,String nam){
		balance = bal;
		name = nam;
	}
	void checkBal2(){
		
			balance = balance + ((5*balance)/100);
			System.out.println( " ur salary account balance is Rs."+balance);
		
	}
}
class currAcc extends basicAccount{
	currAcc(int bal,String nam){
		balance = bal;
		name = nam;
	}
	void checkBal3(){
		if(balance<minBal){
			System.out.println(" ");
			balance = balance - ((15*minBal)/100);
			System.out.println(" ur current account balance is Rs."+balance);
		}
		else{
			balance = balance + ((7*balance)/100);
			System.out.println(" ur current account balance is Rs."+balance);
		}
	}
}

public class bank {
	public static void main(String[] str){
	Scanner sc = new Scanner(System.in);
	System.out.println("enter your 4-digit pin:");
	System.out.println("enter your balance and name:");
	int balance = sc.nextInt();
	String s = sc.next();
	System.out.println("Press 1 for savings account details,2 for salary account details,3 for current account details");
	int bb = sc.nextInt();
	switch(bb){
	case 1:{sbAcc sa = new sbAcc(balance,s);
	           sa.checkBal1();
	           break;
	          }
	
	case 2:{salAcc sal = new salAcc(balance,s);
			sal.checkBal2();
			break;}
	case 3: {currAcc ca = new currAcc(balance,s);
			ca.checkBal3();
			break;}
	default: System.out.println("wrong choice. select a valid one");
	}
	sc.close();
	
	
	
}
}
