package sample;

import java.util.Arrays;
import java.util.Scanner;
public class ch_sort {	
	public static void main(String[] str){
	Scanner next = new Scanner(System.in);
	System.out.println("Enter two words");
	String s2 = next.nextLine().toLowerCase();
	String[] ch = s2.split(" ");
	
	String ch1 = anagram(ch[0]);
	String ch2 = anagram(ch[1]);
	if(ch1.equals(ch2))
	{
		System.out.println("Anagram");
	}
	else System.out.println("Not AN anagram!!! :(");
	
	}



static String anagram(String str){
	char[] cha = str.toCharArray();
	Arrays.sort(cha);
	String s3 = new String(cha);
     return s3;
}
}