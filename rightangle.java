package sample;

import java.util.Scanner;

public class rightangle {
public static void main(String[] args){
	int a,b,c;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the angles a,b,c:");
	a = sc.nextInt();
	b = sc.nextInt();
	c = sc.nextInt();
	if(b == 90 && a+c == 90 || a == 90 && b+c == 90 ||c == 90 && a+b == 90){
		System.out.println("Right angled triangle");
	}
	else 
	System.out.println("Not a right angle triangle"); 		
	sc.close();
}
}
