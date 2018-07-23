package sample;
import java.util.Scanner;
public class spyNumber {
	public static void main(String[] args){
	int num,rem,sum=0,prod=1;
	Scanner sc = new Scanner(System.in);
	System.out.println("enter a number:");
	num = sc.nextInt();
	int dum = num;
	//int c=0;
	while(dum>0){
		rem = dum % 10;
		sum = sum+rem;
		prod = prod*rem;
		dum = dum/10;
		
	}
	if(sum==prod){
		System.out.println("SPY NUMBERRR!!");
	}
	else
		System.out.println("not a spy number :( ");
	
	System.out.println("enter another number:");
	int num2 = sc.nextInt();
	int sq = num2*num2;
	int dum2= num2;
	int rm,c=0;
	while(dum2>0){
		//rm = dum2 % 10;
		//sum = sum+rem;
		//prod = prod*rem;
		c++;
		dum2 = dum2/10;
		
		
	}
	//System.out.println((int)Math.pow(10, c));
	rm = sq%(int)Math.pow(10, c);
	if(rm==num2) System.out.println("automorphic!!!");
	else System.out.println("not automorphic");
}
}
